package access;

public class SpeakerMain {
    public static void main(String[] args) {

        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        // System.out.println("volume 필드에 직접 접근하여 수정");
        // speaker.volume = 200; //멤버변수(필드)에 private을 붙여 선언하여 직접 접근 막는다.
        // speaker.showVolume();

    }
}
