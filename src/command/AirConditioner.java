package command;

public class AirConditioner {
    boolean isOn;
    int temp;

    public void turnOnAC(){
        isOn=true;
        System.out.println("AC is ON");
    }
    public void turnOffAC(){
        isOn=false;
        System.out.println("AC is Off");
    }
    public void setTemperature(int temp){
        this.temp=temp;
        System.out.println("Temperature changed to: " + temp);
    }

}
