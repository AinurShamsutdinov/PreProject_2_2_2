package web.model;

public class Car {
    private String model;
    private int payload;
    private int maxSpeedKmph;

    public Car(String model, int payload, int maxSpeedKmph){
        this.model = model;
        this.payload = payload;
        this.maxSpeedKmph = maxSpeedKmph;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public int getMaxSpeedKmph() {
        return maxSpeedKmph;
    }

    public void setMaxSpeedKmph(int maxSpeedKmph) {
        this.maxSpeedKmph = maxSpeedKmph;
    }
}
