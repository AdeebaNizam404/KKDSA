package Oops.Interfaces;

public class Main {
    public static void main(String[] args){
 Car car = new Car();

    car.acc();
    car.start();
    car.stop();
    
    Media carMedia = new Car();
    carMedia.start();
   
     NiceCar carr = new NiceCar();
     carr.start();
     carr.startMusic();
     carr.upgradeEngine();
      carr.start();
    }
}
