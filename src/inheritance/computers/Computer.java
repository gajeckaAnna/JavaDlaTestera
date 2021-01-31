package inheritance.computers;

abstract public class Computer {

    protected String name;
    protected String type;
    protected int hdd;
    protected int ram;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, int hdd, int ram) {
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

    public int getHdd() {
        return hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setRam(int ram) {
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

    public abstract int volumeUp();


}
