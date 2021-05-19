public class Multimedia extends Device {

    @Override
    public void close() {
        System.out.println("多媒体关了");

    }

    @Override
    public void open() {
        System.out.println("多媒体开了");
    }

}

