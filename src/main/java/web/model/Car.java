package web.model;

public class Car {
    private String brand;

    private int series;

    private long price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Car(String brand, int series, long price) {
        this.brand = brand;
        this.series = series;
        this.price = price;
    }

    @Override
    public String toString() {
        return brand + " " + series + " " + price;
    }
}
