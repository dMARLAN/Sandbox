package creationalpatterns.bridge;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (volume > 100) {
            volume = 100;
        } else if (volume < 0) {
            volume = 0;
        } else {
            volume = percent;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        if (on) {
            System.out.println("Radio is on");
        } else {
            System.out.println("Radio is off");
        }
        System.out.println("Radio volume is at " + volume + "%");
        System.out.println("Radio channel is " + channel);
    }
}
