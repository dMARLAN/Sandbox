package creationalpatterns.bridge;

public class SimpleRemote {
    protected Device device;

    public SimpleRemote(){
    }
    
    public SimpleRemote(Device device) {
        this.device = device;
    }
}
