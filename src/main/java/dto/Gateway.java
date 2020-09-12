package dto;

public class Gateway implements AutoCloseable{
    public void open(){
        System.out.println("Gateway open");
    }
    public void broken(){
        System.out.println("Gateway broken");
        throw new RuntimeException("Error");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Gateway closed");
    }
}
