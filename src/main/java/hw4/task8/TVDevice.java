package hw4.task8;

public abstract class TVDevice implements Volume, Device {
    private String modelName;
    private boolean isOn;

    public TVDevice(String modelName){
        this.modelName = modelName;
        isOn = false;
    }

    public String getModelName() {
        return modelName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
}
