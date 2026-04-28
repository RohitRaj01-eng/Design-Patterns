public class MP4Adapter implements AudioPlayer{
    private final MP4 video;
    public MP4Adapter(MP4 mp4) {
        this.video=mp4;
    }

    @Override
    public void playAudio() {
        video.playVideo();
    }
}
