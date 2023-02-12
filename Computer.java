package Homework18;
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.

public class Computer {
    public void internet(){
        System.out.println("Have internet access");
    }
    public void speed(){
        System.out.println("Processor speed is good");
    }
    public void memory (){
        System.out.println("Have enough of  memory");
    }

}
class Apple extends Computer{

    @Override
    public void speed() {
        System.out.println("Mac speed is  3.49Hz");
    }

    @Override
    public void memory() {
        System.out.println("Mac memory is 1 TB");
    }
}
class Lenovo extends Computer{
    @Override
    public void internet() {
        System.out.println("Lenovo has a fast internet access");
    }

    @Override
    public void speed() {
        System.out.println("Lenovo speed is 3.1 GHz");
    }
}
class HP extends Computer{
    @Override
    public void internet() {
        System.out.println(" HP has fast and easy internet access");

    }

    @Override
    public void speed() {
        System.out.println("HP speed is 3.6 GHz");
    }

    @Override
    public void memory() {
        System.out.println("HP memory is 2 TB");
    }
}
class DELL extends Computer{
    @Override
    public void speed() {
        System.out.println("DELL speed is 4.7 GHz  ");
    }
}
