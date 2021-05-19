public class airCleaner extends Device{

    @Override
    public void close() {
        System.out.println("空调关了");

    }

    @Override
    public void open() {
        System.out.println("空调开了");
    }
}
