interface RemoteControl {
    void turnOn();
    void turnOff();
    void increaseVolume();
    void decreaseVolume();
}

class TV implements RemoteControl {

    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF");
    }

    public void increaseVolume() {
        System.out.println("TV Volume Increased");
    }

    public void decreaseVolume() {
        System.out.println("TV Volume Decreased");
    }
}

class AirConditioner implements RemoteControl {

    public void turnOn() {
        System.out.println("AC is turned ON");
    }

    public void turnOff() {
        System.out.println("AC is turned OFF");
    }

    public void increaseVolume() {
        System.out.println("AC Fan Speed Increased");
    }

    public void decreaseVolume() {
        System.out.println("AC Fan Speed Decreased");
    }
}

class Speaker implements RemoteControl {

    public void turnOn() {
        System.out.println("Speaker is turned ON");
    }

    public void turnOff() {
        System.out.println("Speaker is turned OFF");
    }

    public void increaseVolume() {
        System.out.println("Speaker Volume Increased");
    }

    public void decreaseVolume() {
        System.out.println("Speaker Volume Decreased");
    }
}

public class Interface1 {
    public static void main(String[] args) {

        TV tv = new TV();
        AirConditioner ac = new AirConditioner();
        Speaker sp = new Speaker();

        tv.turnOn();
        tv.increaseVolume();
        tv.turnOff();

        System.out.println();

        ac.turnOn();
        ac.increaseVolume();
        ac.turnOff();

        System.out.println();

        sp.turnOn();
        sp.increaseVolume();
        sp.turnOff();
    }
}
