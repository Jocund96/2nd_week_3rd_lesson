import java.util.Scanner;

public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean switchedOn = false;
    public void turnOn(){switchedOn = true;
        System.out.println("TV is turned on");}
    public void turnOff(){switchedOn = false;
        System.out.println("TV is turned off");}
    public void setChannel(int newChannel){
        if(switchedOn && newChannel>=1 && newChannel <= 120) {
            channel = newChannel;
            outChannelNumber(channel);
        }else if (switchedOn && newChannel==0){
            channel = 1;
            outChannelNumber(channel);
        } else if (switchedOn && newChannel<0) {
            channel = 120+(newChannel%120);
            outChannelNumber(channel);
        } else if (switchedOn) {
            channel = newChannel%120;
            outChannelNumber(channel);
        }
    }
    public void outChannelNumber(int outChannel){
        System.out.println("Current channel is: "+outChannel);}

    public void setVolumeLevel(int newVolumeLevel){
        if(switchedOn && newVolumeLevel>=1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
            outVolumeLevel(volumeLevel);
        }else if (switchedOn && newVolumeLevel==0){
            volumeLevel = 1;
            outVolumeLevel(volumeLevel);
        }else if (switchedOn && newVolumeLevel<0) {
            channel = 7+(newVolumeLevel%7);
            outVolumeLevel(volumeLevel);
        }else if (switchedOn){
            channel = newVolumeLevel%120;
            outVolumeLevel(volumeLevel);
        }
    }
    public void outVolumeLevel(int outVolume){
        System.out.println("Current volume is: "+outVolume);}

    public void channelUp(){
            channel++;
            channel=channel%120;
            outChannelNumber(channel);
    }
    public void channelDown(){
        channel--;
        if (switchedOn && channel<0) {
            channel = 120+(channel%120);
            outChannelNumber(channel);
        }else{channel = channel%120;
        outChannelNumber(channel);}
    }
    public void volumeUp(){
        volumeLevel++;
        volumeLevel= volumeLevel%120;
        outVolumeLevel(volumeLevel);
    }

    public void volumeDown(){
        volumeLevel--;
        if (switchedOn && volumeLevel<0) {
            volumeLevel = 7+(volumeLevel%7);
            outVolumeLevel(volumeLevel);
        }else{volumeLevel = volumeLevel%7;
        outVolumeLevel(volumeLevel);}
    }
}

