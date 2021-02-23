package inheritance.computers;

abstract public class Computer {

    protected String name;
    protected String type;
    protected Hdd hdd;
    protected Ram ram;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, Hdd hdd, Ram ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        this.volumeLevel = 0;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void switchOn() {
        System.out.println("Super, I set the computer state to true!");
        state = true;
        System.out.println("The computer is on.");
    }

    public void switchOff() {
        System.out.println("Super, I set the computer state to false!");
        state = false;
        System.out.println("The computer " + name + " is off.");
    }

    public boolean getState() {
        return state;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public abstract int volumeUp();

    public abstract int volumeDown();

    public abstract int volumeUp(int adjustVolumeLevel);

    public abstract int volumeDown(int adjustVolumeLevel);


}
