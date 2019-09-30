package HW4.Task8;

/*
Write a project named "Remote Device". Create a class "RemoteController"
which will be simulation the real one to control the TV.

Create interfaces Device and Volume.
The "Device" interface should have methods powerOn(), powerOff(), setChannel(int channel),
and currentChannel();
The "Volume" interface should have methods upVolume(), downVolume() and mute();

Write an abstract class TVDevice which will be implementing interfaces Volume and Device and
has the fields String modelName and boolean isOn (Tip: You don't need to implement methods from the interface
if you class is abstract).

Write a class "TV" which extends the class TVDevice. Implements all the methods.

Write a class RemoteController to control your TV.

Example of the structure in the requirements.
*/

public class RemoteController {
    public static void main(String[] args) {
        TV myTV = new TV("Samsung 3000");
        System.out.println("ModelName: " + myTV.getModelName());
        myTV.powerOn();
        System.out.println("PowerOn: " + myTV.isOn());
        myTV.setChannel(2);
        System.out.println("Channel: " + myTV.getChannel());
        myTV.upVolume();
        System.out.println("Volume after upVolume: " + myTV.getVolume());
        myTV.downVolume();
        System.out.println("Volume after downVolume: " + myTV.getVolume());
        myTV.upVolume();
        myTV.mute();
        System.out.println("Volume after mute:" + myTV.getVolume());
        myTV.powerOff();
        System.out.println("PowerOn: " + myTV.isOn());
    }
}
