public class JavaClass {
    int x = 5;
    public static void main(String args[]){
        System.out.println("All about objects");

        //Making two car objects
        Car redCar = new Car("Red");
        Car blueCar = new Car("Blue");

        //Calling class method only after the class is loaded
        Car.Boop();

        //Don't do this, set your variables in the class itself
        //redCar.Colour = "Red";

        //This is an object's method
        redCar.Beep();

        //This is a class's method




    }
}

