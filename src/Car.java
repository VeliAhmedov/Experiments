public class Car {
    String model;
    int year;
    static String condition;
    public Car(){
    }
    public Car(String modelName, int modelYear) {
        model = modelName;
        year = modelYear;
        // you can write static variable inside constructor
    }
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        //you can write static variable inside instance method
//        System.out.println("Condition: " + condition);
    }
    public static void drive(){
        System.out.println("drive");
        //you can access instance variables and methods after creating object of it
//        Car car = new Car();
//        car.year = 2020;
//        car.model = "Ford";
    }
    //via this you can call via parameter constructor and add value to this
    public static void fueling(Car car){
        System.out.println("fueling " + car.model +" that is made " + car.year);
    }
    /* you can do this like that
    public static void fueling(String model, int year){
        System.out.println("fueling " + model +" that is made " + year);
    }
     */
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
