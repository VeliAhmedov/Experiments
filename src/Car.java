public class Car {
    String model;
    int year;
    public Car(){

    }

    public Car(String modelName, int modelYear) {
        model = modelName;
        year = modelYear;
    }
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
