package inheritance.computers;

public class Laptop extends Computer {

    public Laptop(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
    }

        public void showComputerName(){
            System.out.println(name);
        }

    @Override
        public void switchOn(){
            System.out.println("Checking batter level");
            state = true;
        }

    }

