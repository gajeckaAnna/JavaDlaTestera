package inheritance.computers;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram); // super <- always comes first!
        this.batteryLevel = batteryLevel;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking batter level.");
        if (batteryLevel > 0) {
            System.out.println("Checking battery level.");
            if (batteryLevel > 0) {
                super.switchOn();
            } else {
                System.out.println("Battery is dead!");
            }
        }
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    public int volumeUp() {
        return volumeLevel += 5;
    }
}



