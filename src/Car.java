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
    //this way you can assign parameter to instance variable.
    //you can create object but that is diference
    //in main method Car car = new Car("Toyota", 2020); // Existing Car instance
    //Car.read(car, 2023); // Updates the year of this car
    //car.display(); // Outputs: Model: Toyota, Year: 2023
    static void read(Car car,int readYear){
//        Car car = new Car();
        car.year = readYear;
    }
}
