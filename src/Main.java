public class Main {

    public static void main(String[] args) {

        // Первый покупатель
        GasStation firstStation = new GasStation(50, 1000, "Neste");
        firstStation.fillingGasTank(20, 500);
        firstStation.fillingGasTank(30, 2500);

        GasStation secondStation = new GasStation(45, 800, "Circke K");
        secondStation.fillingGasTank(600, 90000);
        secondStation.fillingGasTank(250, 9010);
        secondStation.fillingGasTank(50,2000);

    }
}
