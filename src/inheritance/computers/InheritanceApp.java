package inheritance.computers;

import inheritance.computers.Laptop;
import inheritance.computers.PC;

public class InheritanceApp {

    public static void main(String[] args) {


        PC officeComputer = new PC("Office Computer", "Thinkpad", 500, 128);
        Laptop personalLaptop = new Laptop("Personal laptop", "Asus", 300, 128, 50);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        officeComputer.togglePowerSupply();
        officeComputer.switchOn();

        officeComputer.switchOff();
        officeComputer.togglePowerSupply();


        personalLaptop.setBatteryLevel(0);

        personalLaptop.switchOn();
        System.out.println(personalLaptop.getState());

    }
}
