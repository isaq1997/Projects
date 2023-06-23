
public class Car extends Vehicle{

    public Car(String make, String model, String year, String fueltype) {
        super(make, model, year, fueltype);
    }
    public String getMake() {
        return super.getMake();
    }

    public void setMake(String make) {
        super.setMake(make);
    }

    public String getModel() {
        return super.getModel();
    }

    public void setModel(String model) {
        super.setModel(model);
    }

    public String getYear() {
        return super.getYear();
    }

    public void setYear(String year) {
        super.setYear(year);
    }

    public String getFueltype() {
        return super.getFueltype();
    }

    public void setFueltype(String fueltype) {
        super.setFueltype(fueltype);
    }

    @Override
    public double getMaxSpeed() {
        return 120;
    }

}
