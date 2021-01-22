package inheritance.computers;

import inheritance.computers.Laptop;
import inheritance.computers.PC;

public class InheritanceApp {

    public static void main(String[] args) {


        PC officeComputer = new PC("Office Computer", "Thinkpad", 500, 128);
        Laptop personalLaptop = new Laptop("Personal laptop", "Asus", 300, 128);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        personalLaptop.switchOn();
        System.out.println(personalLaptop.getState());

        personalLaptop.showComputerName();

    }
}
