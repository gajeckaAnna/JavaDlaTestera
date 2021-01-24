package inheritance.computers;

public class Laptop extends Computer {

    private int baterryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram); // super always comes first!
        this.baterryLevel = batteryLevel;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking batter level.");
        if (baterryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery is dead!");
        }
    }

    public void setBatteryLevel(int newBatteryLevel) {
        baterryLevel = newBatteryLevel;
    }
}

