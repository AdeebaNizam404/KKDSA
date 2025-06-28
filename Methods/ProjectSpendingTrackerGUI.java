package Methods;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// Class to represent an expense
class Expense {
    private String description;
    private double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("Description: %s, Amount: %.2f", description, amount);
    }
}

// Main class for the GUI and functionality
public class ProjectSpendingTrackerGUI extends JFrame {
    private ArrayList<Expense> expenses;  // List to store expenses
    private double spendingLimit;         // Spending limit
    private JTextArea textArea;           // Area to display expenses

    public ProjectSpendingTrackerGUI() {
        expenses = new ArrayList<>();
        spendingLimit = 1000.00; // Default spending limit

        setTitle("Project Spending Tracker");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Text area to display expenses
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // Panel to hold buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton addButton = new JButton("Add Expense");
        JButton viewTotalButton = new JButton("View Total Spending");
        JButton listButton = new JButton("List All Expenses");
        JButton setLimitButton = new JButton("Set Spending Limit");

        panel.add(addButton);
        panel.add(viewTotalButton);
        panel.add(listButton);
        panel.add(setLimitButton);
        add(panel, BorderLayout.SOUTH);

        // Add action listeners for the buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addExpense();
            }
        });

        viewTotalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewTotalSpending();
            }
        });

        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listExpenses();
            }
        });

        setLimitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSpendingLimit();
            }
        });
    }

    // Method to add a new expense
    private void addExpense() {
        String description = JOptionPane.showInputDialog(this, "Enter expense description:");
        if (description == null) return; // Cancelled

        String amountStr = JOptionPane.showInputDialog(this, "Enter expense amount:");
        if (amountStr == null) return; // Cancelled

        try {
            double amount = Double.parseDouble(amountStr);
            Expense expense = new Expense(description, amount);
            expenses.add(expense);

            if (getTotalSpending() > spendingLimit) {
                JOptionPane.showMessageDialog(this, "Warning: Spending limit exceeded!", "Limit Exceeded", JOptionPane.WARNING_MESSAGE);
            }
            JOptionPane.showMessageDialog(this, "Expense added successfully.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid amount entered. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to view total spending
    private void viewTotalSpending() {
        double total = getTotalSpending();
        JOptionPane.showMessageDialog(this, String.format("Total Spending: %.2f", total));
    }

    // Method to list all expenses
    private void listExpenses() {
        if (expenses.isEmpty()) {
            textArea.setText("No expenses recorded.");
        } else {
            StringBuilder sb = new StringBuilder("Expenses:\n");
            for (Expense expense : expenses) {
                sb.append(expense).append("\n");
            }
            textArea.setText(sb.toString());
        }
    }

    // Method to set a new spending limit
    private void setSpendingLimit() {
        String limitStr = JOptionPane.showInputDialog(this, "Enter new spending limit:");
        if (limitStr != null) {
            try {
                spendingLimit = Double.parseDouble(limitStr);
                JOptionPane.showMessageDialog(this, String.format("Spending limit set to %.2f", spendingLimit));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid limit entered. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Method to calculate total spending
    private double getTotalSpending() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProjectSpendingTrackerGUI().setVisible(true);
            }
        });
    }
}