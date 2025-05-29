public class RadioPlayer implements Player {
    private boolean onOff;
    private double[] stationList;
    private int volume;
    private double station;
    private int currentPosition = 0;

    public RadioPlayer(double[] stationList) {
        this.stationList = stationList;
        this.volume = 0;
        this.onOff = false;
        this.station = 0;
    }

    @Override
    public void start() {
        if (!onOff) {
            onOff = true;
            station = stationList[currentPosition];
        }
    }

    @Override
    public void stop() {
        if (onOff) {
            onOff = false;
            station = 0;
            currentPosition = 0;
        }
    }

    public boolean getOnOff() {
        return onOff;
    }

    @Override
    public void volumeUp() {
        volume++;
        volume++;
    }

    @Override
    public void volumeDown() {
        volume--;
        volume--;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    public void next() {
        station = stationList[++currentPosition];
    }

    public void previous() {
        station = stationList[--currentPosition];
    }

    public double getStation() {
        return station;
    }
}