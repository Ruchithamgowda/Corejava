package mil.java.audio;

public class EarbudRunner {
    public static void main(String[] args) {
        Earbud earbud = new Earbud();
        AudioDevice device = new AudioDevice(earbud);
        device.adjustVolume();                     
    }
}
