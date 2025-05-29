public class MusicPlayer implements Player {
    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;
    private int currentPosition;

    public MusicPlayer(String[] musicList) {
        this.musicList = musicList;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
        this.currentPosition = 0;
    }

    @Override
    public void start() {
        if (!onOff) {
            onOff = true;
            currentSong = musicList[currentPosition];
        }
    }

    @Override
    public void stop() {
        if (onOff) {
            onOff = false;
            currentSong = "";
        }
    }

    public boolean getOnOff() {
        return onOff;
    }

    @Override
    public void volumeUp() {
        volume++;
    }

    @Override
    public void volumeDown() {
        volume--;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    public void next() {
        currentSong = musicList[++currentPosition];
    }

    public void previous() {
        currentSong = musicList[--currentPosition];
    }

    public String getCurrentSong() {
        return currentSong;
    }
}