// Define Camera interface
interface Camera {
    void takePhoto();
}

// Define MusicPlayer interface
interface MusicPlayer {
    void playMusic();
}

// Smartphone class implementing both interfaces
class Smartphone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("📸 Photo taken!");
    }

    public void playMusic() {
        System.out.println("🎵 Playing music...");
    }
}

// Main class
public class DeviceFeatures {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        try {
            System.out.println("Trying to take a photo...");
            phone.takePhoto();

            System.out.println("Trying to play music...");
            phone.playMusic();

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
