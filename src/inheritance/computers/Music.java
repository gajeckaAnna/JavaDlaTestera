package inheritance.computers;

public interface Music {

//    We can’t create instance(interface can’t be instantiated) of interface but we can make reference of it that
//    refers to the Object of its implementing class.
//    All the fields are public, static, and final.
    public static final String NAME = "MUSIC";

//    All the methods are public and abstract.
    void playMusic();
    void pauseMusic();
    void stopMusic();

//    Java 8: we can now add default implementation for interface methods.
//    This default implementation has special use and does not affect the intention behind interfaces.
    default void sayHelloFromMusic() {
        System.out.println("Hello from default music!");
    }

//    Java 9: interfaces can contain following also static, private & private static methods.
    static String getName() {
        privateMethod();
        return NAME;
    }

    private static void privateMethod() {
        System.out.println("Hello from private static!");
    }

//    A class can implement more than one interface.

//    An interface can extends another interface or interfaces (more than one interface) .

//    A class that implements interface must implements all the methods in interface.

//    It is used to achieve multiple inheritance.

//    It is used to achieve loose coupling.
}
