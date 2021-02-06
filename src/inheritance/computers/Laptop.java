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
        if (adjustVolumeLevel < 0) {
            adjustVolumeLevel = 0;
            System.out.println("U-uh. Positive numbers only.");
            return volumeLevel;
        } if (adjustVolumeLevel == 0) {
            System.out.println(adjustVolumeLevel + "? Neither high, neither low. My volume level did not change.");
            return volumeLevel;
        }
        volumeLevel += adjustVolumeLevel;
        if (volumeLevel > 100) {
            System.out.println(adjustVolumeLevel + "? Too high! I set my volume level to 100!");
            return volumeLevel = 100;
        } if (volumeLevel == 100) {
            System.out.println("It's already a hundred, dear.");
            return volumeLevel;
        }
            System.out.println(adjustVolumeLevel + "? My new volume level is up to " + volumeLevel + ".");
            return volumeLevel;
        }

        @Override
        public int volumeDown(){
            return volumeDown(5);
        }

        @Override
        public int volumeDown(int adjustVolumeLevel){
            if (adjustVolumeLevel < 0) {
                adjustVolumeLevel = 0;
                System.out.println("U-uh. Positive numbers only.");
                return volumeLevel;
            }
            volumeLevel -= adjustVolumeLevel;
            if (volumeLevel < 0) {
                System.out.println(adjustVolumeLevel + "? Too much. I set my volume level to 0!");
                return volumeLevel = 0;
            } if (adjustVolumeLevel == 0) {
                System.out.println(adjustVolumeLevel + "? Neither high, neither low. My volume level did not change.");
                return volumeLevel;
            } else {
                System.out.println("My new volume level is down to " + volumeLevel + ".");
                return volumeLevel;
            }
        }
    }




