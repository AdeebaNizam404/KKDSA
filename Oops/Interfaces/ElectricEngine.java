package Oops.Interfaces;

public class ElectricEngine implements Engine {
     @Override
    public void start() {
       System.out.println("Electric Engine Start");
    }

    @Override
    public void stop() {
       System.out.println("Electeric Engine Stop");

    }

    @Override
    public void acc() {
       System.out.println("Electrical Engine accelerate");
        
}
}
