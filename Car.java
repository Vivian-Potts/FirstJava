public class Car{
    //All Car objects will have a colour string
    String Colour;

    //This is called when the class is loaded
    static{
        System.out.println("Class loaded into class loader");
    }

    //This is a method tied to the class itself. Because of the "static" keyword,
    //it can be used without making an object
    static void Boop(){
        System.out.println("Boop");
    }


    //This is a constructor tied to every object in this class, its name matches the class name
    //It is called whenever a new object is made
    Car(String carColour){
        System.out.println("New car object made");
        Colour = carColour;

    }

    void Beep() {
        System.out.println(Colour + " Beep");
    }


}
