public class Radio {

    public int currentStationNumber;
    public int currentVolume;
    public int quantityOfStations = 10;

    public Radio() {
        ///по умолчанию, если пользователь не выставил количество станций
    }

    public Radio(int quantityOfStations) {
        this.quantityOfStations = quantityOfStations;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void setNewCurrentStation(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber > 9) {
            return;
        }

        currentStationNumber = newCurrentStationNumber;
    }

    public void increaseVolume() {

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentStationNumber < 9) {
            currentStationNumber = currentStationNumber + 1;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prevStation() {
        if (currentStationNumber > 0) {
            currentStationNumber = currentStationNumber - 1;
        } else {
            currentStationNumber = 9;
        }
    }

}
