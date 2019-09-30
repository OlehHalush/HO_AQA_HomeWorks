package HW4.Task8;

public class TV extends TVDevice {
    private int volume;
    private int channel;

    public TV(String modelName){
        super(modelName);
    }

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    public void upVolume(){
        this.volume = getVolume();
        this.volume++;
    }

    public void downVolume(){
        this.volume = getVolume();
        this.volume--;
    }

    public void mute(){
        this.volume = 0;
    }

    public void powerOn(){
        setOn(true);
    }

    public void powerOff(){
        setOn(false);
    }

    public void setChannel(int channel){
        this.channel = channel;
    }

    public void currentChannel(){
        System.out.println(getChannel());
    }
}
