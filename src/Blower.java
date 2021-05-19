public class Blower extends Device {

    @Override
    public void close() {
        System.out.println("风扇关了");

    }

    @Override
    public void open() {
        System.out.println("风扇开了");
    }

}
