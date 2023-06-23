
 abstract  class Vehicle {
    private String make;
    private String model;
    private String   year;
    private String fueltype;

    public Vehicle(String make, String model, String year, String fueltype) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fueltype = fueltype;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }
    public abstract double getMaxSpeed();
}
