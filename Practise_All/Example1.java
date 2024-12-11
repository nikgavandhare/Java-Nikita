/*Vehicle Abstraction: Design an abstract class Vehicle with methods like startEngine, stopEngine, and fuelType. 
Create subclasses Car, Bike, implement specific behavior for each type of vehicle*/

abstract class Vehicle
{

    // construtor
    Vehicle()
    {

    }

    // abstract fun()
    abstract void  startEngine();

    abstract void  stopEngine();

    abstract void  fuelType();
    
}

//class car
class Car extends Vehicle
{
    void startEngine()
    {
        System.out.println("it will start the engine of car");
    }

    void stopEngine()
    {
        System.out.println("it will stop the engine of car");
    }

    void  fuelType()
    {
        System.out.println("it will show fuel type of car");

    }
}

//class bike 
class Bike extends Vehicle
{
    void startEngine()
    {
        System.out.println("it will start the engine of Bike");
    }

    void stopEngine()
    {
        System.out.println("it will stop the engine of bike");
    }

    void  fuelType()
    {
        System.out.println("it will show fuel type of Bike");
    }


}





class Example1
{
    public static void main(String[] args) {
        System.out.println("This is main fun");

        //letrs creat object of child class car and bike bcz we can not creat object of abstarct class

        Car c1= new Car();
        c1.startEngine();
        c1.stopEngine();
        c1.fuelType();

        // object of bike
        Bike b1=new Bike();
        b1.startEngine();
        b1.stopEngine();
        b1.fuelType();
        
    }

}