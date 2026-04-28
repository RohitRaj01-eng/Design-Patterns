void main() {
    AudioPlayer audio=new MP3();
    audio.playAudio();
    MP4 video=new MP4();
//    video.playAudio(); // compilation error, MP4 is not an AudioPlayer
    AudioPlayer videoAdapter=new MP4Adapter(video);
    videoAdapter.playAudio();
}
