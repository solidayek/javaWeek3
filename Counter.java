class Cat {
    // how cat looks like (state = attriutes/variables)
    String name;
    int age;
    String color;

     // behavior = method / functions
    void meow(){
        System.out.println("MeOw~~");
    }

    // create a constructor 
    Cat (String name, int age, String color){
        this.name = name;
        this.age = age; 
        this.color = color; 
    }

}
public class Counter{
    private int value; // this will for sure store the counter's value
    public void click(){ // return nth
        value++;
    }
    public int getValue(){
        return value; // return the current value of the counter 
    }
}
public class weekOne {
    public static void main(String[] args){
        Cat kino = new Cat("kino", 20, "yellowish brown");
        kino.meow();
        String myName = "Soliday";
        System.out.println(myName.toUpperCase());
    }
}
//Notes:
// Accessor methods don't modify the information inside of the object, but only to retrieve the info
// mutator methods do some modification inside the internal state of the object
// class is the blueprint for creating the objects (consists of state(attributes) and behavior(methods))
// class is used as a definition of how an object will look like and will behave 
// usually Class is created outside of file name function; meaning keep it outside of the public class Week1
// A constructor is a special method inside a class that is used to initialize newly created objects. When you create an object, the constructor is called automatically to set up the initial state of the object.