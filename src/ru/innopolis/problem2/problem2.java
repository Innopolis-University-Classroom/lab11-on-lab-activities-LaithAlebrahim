public class Media implements MediaPlayer {

    @Override
    public void Playmp4() {
        System.out.println("Playing mp4");
    }
}

public class Audio implements AudioPlayer{
    @Override
    public void Playmp3() {
        System.out.println("Playing mp3");
    }
}

public interface MediaPlayer {
    public void Playmp4();

}

public interface AudioPlayer {
    void Playmp3();

}

class MP3Adapt implements MediaPlayer {
    Audio mp3;
  Public MP3Adapt(Audio mp3){
  this.mp3=mp3;
  }
public void Playmp4(){
  mp3.Playmp3();
}
}

public class PlayerDevice implements MP3Adapt {
    Audio mp3;
    Media Mp4;
    PlayerDevice(Audio mp3, Media Mp4){
        this.mp3 = mp3;
        this.Mp4 = Mp4;
    }
  void Playmp4(MediaPlayer mp4) {
      mp4.Playmp4();
  }

    @Override
    public void play(MediaPlayer mp3) {
        mp3.Playmp4();
    }


}

