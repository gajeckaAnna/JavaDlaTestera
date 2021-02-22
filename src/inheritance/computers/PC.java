package inheritance.computers;

public class PC extends Computer {

    private boolean isPowerSupply;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isPowerSupply = false;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply.");
        if (isPowerSupply) { // if (isPowerSupply == true) <- is the same
            System.out.println("♫I've got the power!♫ PC is on!");
            super.switchOn();
        } else {
            System.out.println("No power supply detected. Please, plug me in!");
        }
    }

    public void togglePowerSupply() {
        isPowerSupply = !isPowerSupply;
        System.out.println("Toggled power supply to " + isPowerSupply + "!");
    }

    public int volumeUp() {
        return volumeUp(1);
    }

    @Override
    public int volumeDown() {
        return volumeDown(1);
    }

    private int turningUp(int adjustVolumeLevel) {
        if (volumeLevel >= 100) {
            System.out.println("Oh, you sweet summer child. I set my volume level to 100!");
            return volumeLevel = 100;
        }
        return adjustVolumeLevel;
    }

    private int checkNegativeVolume(int adjustVolumeLevel) {
        if (adjustVolumeLevel < 0) {
            System.out.println("Ugh, no. We don't appreciate negative vibes around here.");
            return adjustVolumeLevel = 0;
        }
        return adjustVolumeLevel;
    }

    private int turningDown(int adjustVolumeLevel) {
        if (volumeLevel <= 0) {
            System.out.println("Too much. I set my volume level to 0!");
            return volumeLevel = 0;
        }
        return adjustVolumeLevel;
    }

    @Override
    public int volumeUp(int adjustVolumeLevel) {
        adjustVolumeLevel = checkNegativeVolume(adjustVolumeLevel);
        volumeLevel += adjustVolumeLevel;
        turningUp(adjustVolumeLevel);
        return volumeLevel;
    }

    @Override
    public int volumeDown(int adjustVolumeLevel) {
        adjustVolumeLevel = checkNegativeVolume(adjustVolumeLevel);
        volumeLevel -= adjustVolumeLevel;
        turningDown(adjustVolumeLevel);
        return volumeLevel;
    }

    public int getVolumeLevel() {
        System.out.println("My current volume level is " + volumeLevel + ".");
        return volumeLevel;
    }
}

