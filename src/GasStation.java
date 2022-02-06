public class GasStation {
    private int orderCounter = 1;
    private int storage;
    private int price;
    private String stationName;

    public GasStation (int price, int storage, String name){
        this.price = price;
        this.storage = storage;
        this.stationName = name;
    }

    public void fillingGasTank(int requestedFuel, int money) {

        int maxFuelFill = money / price;

        if (storage < maxFuelFill)
            maxFuelFill = storage;

        if (requestedFuel < maxFuelFill)
            maxFuelFill = requestedFuel;

        if (maxFuelFill > 0) ++orderCounter;
            storage -= maxFuelFill;


        System.out.println("Station - " + this.stationName + ": order #" + this.orderCounter + " Filled: " + maxFuelFill + "l. money returned to customer: " + (money - maxFuelFill * price) + " EURO. Fuel left in tank: "+ storage);

        }

}