package inheritance.computers;

public class AdjustVolume {
    public static void main(String[] args) {

        Hdd hdd = new Hdd("Asus", 128);
        Ram ram = new Ram("IntEl", 8);
        Computer personalLaptop = new Laptop("Personal laptop", "Asus", hdd, ram, 99);

        //personalLaptop.volumeLevel = 0
        System.out.println(((Laptop) personalLaptop).volumeUp()); // Type casting
        System.out.println(((Laptop) personalLaptop).volumeUp()); // Type casting
        ((Laptop) personalLaptop).getVolumeLevel();
        //personalLaptop.volumeLevel = 5
        System.out.println(personalLaptop.volumeUp()); // volumeUp(); created as abstract method in Computer
        ((Laptop) personalLaptop).getVolumeLevel();//personalLaptop.volumeLevel = 10

        //personalLaptop.volumeUp0
        personalLaptop.volumeUp(20);
        personalLaptop.getVolumeLevel();

        personalLaptop.volumeUp(20);
        personalLaptop.getVolumeLevel();

        personalLaptop.volumeUp(0);
        personalLaptop.getVolumeLevel();

        personalLaptop.volumeUp(120);
        personalLaptop.getVolumeLevel();

        personalLaptop.volumeUp(-30);
        personalLaptop.getVolumeLevel();

        //personalLaptop.volumeDown
        personalLaptop.volumeDown(-30);
        personalLaptop.getVolumeLevel();

        personalLaptop.volumeDown(40);
        personalLaptop.getVolumeLevel();

        personalLaptop.volumeDown(0);
        personalLaptop.getVolumeLevel();

        personalLaptop.volumeDown();
        personalLaptop.getVolumeLevel();

        personalLaptop.volumeDown(50);
        personalLaptop.getVolumeLevel();

        Computer officeComputer = new PC("Office Computer", "Lenovo", hdd, ram);

        //officeComputer.volumeUp
        officeComputer.volumeUp();
        officeComputer.getVolumeLevel();

        officeComputer.volumeUp(19);
        officeComputer.getVolumeLevel();

        officeComputer.volumeUp(-20);
        officeComputer.getVolumeLevel();

        officeComputer.volumeUp(0);
        officeComputer.getVolumeLevel();

        officeComputer.volumeUp(90);
        officeComputer.getVolumeLevel();

        //officeComputer.volumeDown
        officeComputer.volumeDown();
        officeComputer.getVolumeLevel();

        officeComputer.volumeDown(10);
        officeComputer.getVolumeLevel();

        officeComputer.volumeDown(-10);
        officeComputer.getVolumeLevel();

        officeComputer.volumeDown(55);
        officeComputer.getVolumeLevel();

        officeComputer.volumeDown(45);
        officeComputer.getVolumeLevel();

    }
}
