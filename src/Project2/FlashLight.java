package Project2;

public class FlashLight {
    private boolean isOn;

    public FlashLight() {
        this.isOn = false;
    }
    public void turnOff(){
         isOn = false;
        System.out.println("Flashlight is Off");
    }
    public void turnOn(){
        isOn = true;
        System.out.println("flashlight is on");
    }


}
