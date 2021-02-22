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
        return volumeUp(5);
    }

    @Override
    public int volumeUp(int adjustVolumeLevel) {
        volumeLevel += Math.abs(adjustVolumeLevel);
        return (volumeLevel >= 100) ? volumeLevel = 100 : volumeLevel;
    }

    public int volumeDown() {
        return volumeDown(5);
    }

    @Override
    public int volumeDown(int adjustVolumeLevel) {
        volumeLevel -= Math.abs(adjustVolumeLevel);
        return (volumeLevel <= 0) ? volumeLevel = 0 : volumeLevel;
    }

    public int getVolumeLevel() {
        System.out.println("My current volume level is " + volumeLevel + ".");
        return volumeLevel;
    }
}




