package inheritance.computers;

public class PC extends Computer {

    private boolean isPowerSupply;

    public PC(String name, String type, Hdd hdd, Ram ram) {
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

    @Override
    public int volumeUp(int adjustVolumeLevel) {
        if (adjustVolumeLevel < 0) {
            adjustVolumeLevel = 0;
            System.out.println("Ugh, no. We don't appreciate negative vibes around here.");
            return volumeLevel;
        } if (adjustVolumeLevel == 0) {
            System.out.println(adjustVolumeLevel + "? Boy, oh boy. My volume level did not change.");
            return volumeLevel;
        }
        volumeLevel += adjustVolumeLevel;
        if (volumeLevel > 100) {
            System.out.println(adjustVolumeLevel + "? Oh, you sweet summer child. I set my volume level to 100!");
            return volumeLevel = 100;
        } if (volumeLevel == 100) {
            System.out.println("Ring, a ding, ding. It's already a hundred, dear.");
            return volumeLevel;
        }
        System.out.println(adjustVolumeLevel + "? My new volume level is up to " + volumeLevel + ".");
        return volumeLevel;
    }

    @Override
    public int volumeDown(int adjustVolumeLevel){
        if (adjustVolumeLevel < 0) {
            adjustVolumeLevel = 0;
            System.out.println("Ugh, no. We don't appreciate negative vibes around here.");
            return volumeLevel;
        }
        volumeLevel -= adjustVolumeLevel;
        if (volumeLevel < 0) {
            System.out.println(adjustVolumeLevel + "? I have standards I don't plan on lowering for anybody. " +
                    "I set my volume level to 0!");
            return volumeLevel = 0;
        } if (adjustVolumeLevel == 0) {
            System.out.println(adjustVolumeLevel + "? Guurl. My volume level did not change.");
            return volumeLevel;
        } else {
            System.out.println(adjustVolumeLevel + "? My new volume level is down to " + volumeLevel + ".");
            return volumeLevel;
        }
    }
}

