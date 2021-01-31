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
        return volumeLevel += 1;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

}

