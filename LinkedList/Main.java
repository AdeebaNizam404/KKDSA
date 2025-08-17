package LinkedList;
public class Main {
    public static void main(String[] args){
SinglyLL list = new SinglyLL();
list.insertFirst(3);
list.insertFirst(6);
list.insertFirst(4);
list.insertFirst(7);
list.insertLast(88);
list.insert(100, 3);
list.display();
list.deleteFirst();
list.display();
list.deleteLast();
list.display();
list.delete(2);
list.display();
list.find(6);
    System.out.println("Doubly Linked List");
 DoublyLL list1 = new DoublyLL();
list1. insertFirst(6);
list1. insertFirst(8);
list1.insertFirst(4);
list1.insertFirst(7);
list1.insertLast(77);
list1.display();
list1.insert(4,66);
list1.display();
  System.out.println("Circular Linked List");
  CircularLL list2 = new CircularLL();
  list2.insert(2);
  list2.insert(6);
  list2.insert(7);
  list2.insert(88);
  list2.insert(25);
  list2.insert(9);
  list2.delete(88);
  list2.display();
}
}
