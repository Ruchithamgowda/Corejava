package mil.java.audio;

public class AudioDevice {
    public AudioDevice(Earbud earbud) {
        System.out.println("Audio device is now connected.");
        earbud.playMusic();
    }

    public void adjustVolume() {
        System.out.println("Volume is set to medium level.");
    }
}
