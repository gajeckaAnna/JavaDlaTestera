package inheritance.computers;

public class AdjustVolume {
    public static void main(String[] args) {

        Computer personalLaptop = new Laptop("Personal laptop", "Asus", 300, 8, 99);

        //personalLaptop.volumeLevel = 0
        System.out.println(((Laptop)personalLaptop).volumeUp()); // Type casting
        //personalLaptop.volumeLevel = 5
        System.out.println(personalLaptop.volumeUp()); // volumeUp(); created as abstract method in Computer
        //personalLaptop.volumeLevel = 10

        //adjustVolumeLevel - volumeUp
        personalLaptop.volumeUp(20);
        System.out.println(personalLaptop.volumeLevel); //personalLaptop.volumeLevel = 30

        personalLaptop.volumeUp(20);
        System.out.println(personalLaptop.volumeLevel); //personalLaptop.volumeLevel = 50

        personalLaptop.volumeUp(0);
        System.out.println(personalLaptop.volumeLevel); //personalLaptop.volumeLevel = 50

        personalLaptop.volumeUp(120);
        System.out.println(personalLaptop.volumeLevel); //personalLaptop.volumeLevel = 100

        personalLaptop.volumeUp(-70); //
        System.out.println(personalLaptop.volumeLevel);

        personalLaptop.volumeUp(55);
        System.out.println(personalLaptop.volumeLevel);

        //personalLaptop.volumeDown
        personalLaptop.volumeDown(-70);
        System.out.println(personalLaptop.volumeLevel);

        personalLaptop.volumeDown(20);
        System.out.println(personalLaptop.volumeLevel);

        personalLaptop.volumeDown(0);
        System.out.println(personalLaptop.volumeLevel);

        personalLaptop.volumeDown(50);
        System.out.println(personalLaptop.volumeLevel);

        personalLaptop.volumeDown();
        System.out.println(personalLaptop.volumeLevel);

        Computer officeComputer = new PC("Office Computer", "Lenovo", 100, 128);


//        System.out.println(libraryComputer.volumeUp());
//        System.out.println(libraryComputer.volumeUp());
//
//        System.out.println(libraryComputer.volumeDown());
//        System.out.println(libraryComputer.volumeDown());
//        System.out.println(libraryComputer.volumeDown());





    }
}
