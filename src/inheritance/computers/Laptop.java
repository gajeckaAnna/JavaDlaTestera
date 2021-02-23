package inheritance.computers;

public class Laptop extends Computer implements Music, Video {

    private int batteryLevel;

    public Laptop(String name, String type, Hdd hdd, Ram ram, int batteryLevel) {
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

    @Override
    public void playMusic() {
        System.out.println("PLAY MUSIC >");
    }

    @Override
    public void pauseMusic() {
        System.out.println("PAUSE MUSIC ||");
    }

    @Override
    public void stopMusic() {
        System.out.println("STOP MUSIC #");

    }

    @Override
    public void sayHello() {
        Music.super.sayHello();
    }

    @Override
    public void playVideo() {
        System.out.println("PLAY VIDEO >");
    }

    @Override
    public void pauseVideo() {
        System.out.println("PAUSE VIDEO ||");
    }

    @Override
    public void stopVideo() {
        System.out.println("STOP VIDEO #");
    }

}




