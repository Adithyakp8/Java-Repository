package DesignPatterns.Creational.BuilderDesignPattern;

//Creational Design Pattern.
// It is introduced because there is a difficulty in setting values to an object using constructor ,
//Now we need to only put what we need and there is no need to remember the sequence inside constructor
public class BuilderDesignPatternMain {
    public static void main(String[] args) {

        Phone phone = new PhoneBuilder().setOs("Android").setRam(4).getPhone();
        System.out.println(phone.toString());
    }
}