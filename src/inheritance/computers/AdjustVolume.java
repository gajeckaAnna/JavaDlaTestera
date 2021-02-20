package inheritance.computers;

public class AdjustVolume {
    public static void main(String[] args) {

        Computer personalLaptop = new Laptop("Personal laptop", "Asus", 300, 8, 99);

        //personalLaptop.volumeLevel = 0
        System.out.println(((Laptop) personalLaptop).volumeUp()); // Type casting
        //personalLaptop.volumeLevel = 5
        System.out.println(personalLaptop.volumeUp()); // volumeUp(); created as abstract method in Computer
        //personalLaptop.volumeLevel = 10

        //personalLaptop.volumeUp0
        System.out.println(personalLaptop.volumeUp(20)); //personalLaptop.volumeLevel = 30

        System.out.println(personalLaptop.volumeUp(20)); //personalLaptop.volumeLevel = 50

        System.out.println(personalLaptop.volumeUp(0));//personalLaptop.volumeLevel = 50

        System.out.println(personalLaptop.volumeUp(120)); //personalLaptop.volumeLevel = 100

        System.out.println(personalLaptop.volumeUp(-70)); //personalLaptop.volumeLevel = 100

        //personalLaptop.volumeDown
        personalLaptop.volumeDown(-70); //personalLaptop.volumeLevel = 100

        personalLaptop.volumeDown(30); //personalLaptop.volumeLevel = 70

        personalLaptop.volumeDown(0);//personalLaptop.volumeLevel = 70

        personalLaptop.volumeDown(50);//personalLaptop.volumeLevel = 20

        personalLaptop.volumeDown(); //personalLaptop.volumeLevel = 15

        personalLaptop.volumeDown(30); //personalLaptop.volumeLevel = 0

//
//        Computer officeComputer = new PC("Office Computer", "Lenovo", 1000, 128);
//
//        //officeComputer.volumeUp
//        officeComputer.volumeUp(); //volumeLevel = 1
//
//        officeComputer.volumeUp(19); //volumeLevel = 20
//
//        officeComputer.volumeUp(-20); //volumeLevel = 20
//
//        officeComputer.volumeUp(0); //volumeLevel = 20
//
//        officeComputer.volumeUp(90); //volumeLevel = 100
//
//        //officeComputer.volumeDown
//        officeComputer.volumeDown(); //volumeLevel = 99
//
//        officeComputer.volumeDown(10); //volumeLevel = 89
//
//        officeComputer.volumeDown(-10); //volumeLevel = 89
//
//        officeComputer.volumeDown(49); //volumeLevel = 40
//
//        officeComputer.volumeDown(0);
//
//        officeComputer.volumeDown(50); //volumeLevel = 0
//
//


    }
}
