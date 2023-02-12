package Homework18;

public class ComputerTester {
    public static void main(String[] args) {
        Computer []computers={new Apple(),new Lenovo(),new HP(),new DELL()};
        for(Computer computer:computers){
            computer.internet();
            computer.memory();
            computer.speed();
        }

    }
}
