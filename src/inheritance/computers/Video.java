package inheritance.computers;

public interface Video {

    void playVideo();
    void pauseVideo();
    void stopVideo();

    default void sayHelloFromVideo(){
        System.out.println("Hello from default video!");
    }

    default void sayHello(){
        System.out.println("Hello, hello!");
    }
}
