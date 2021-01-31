package inheritance.computers;

import inheritance.computers.Laptop;
import inheritance.computers.PC;

public class InheritanceApp {

    public static void main(String[] args) {


        Computer officeComputer = new PC("Office Computer", "Thinkpad", 500, 128);
        Computer personalLaptop = new Laptop("Personal laptop", "Asus", 300, 128, 50);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        ((PC)officeComputer).togglePowerSupply();
        officeComputer.switchOn();

        officeComputer.switchOff();
        ((PC)officeComputer).togglePowerSupply();


        ((Laptop)personalLaptop).setBatteryLevel(0);

        personalLaptop.switchOn();
        System.out.println(personalLaptop.getState());

        // Object referencing an address in memory where all methods and variables associated with object resides.
        Computer libraryComputer = new PC("BUR 1", "LG", 150, 8);
        System.out.println(libraryComputer); // inheritance.computers.PC@668bc3d5 - object reference

        Computer[] computers = {officeComputer, personalLaptop, libraryComputer};
        for (Computer computer : computers) {
            computer.switchOff();
        }


        //We cannot create object from an abstract class
        //Computer computer = new Computer("Dell", "DD", 500, 125);

    }
}
