/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githubminihomework;

/**
 *
 * @author Capitania
 */
public class Dog {

    String breed;
    String size;
    int age;
    String colour;
    
        public Dog(String breed, String size, int age, String colour) {
        this.breed = breed;
        this.size = size;
        this.age= age;
        this.colour = colour;
    }       
    public void drive(int characteristics) {
        System.out.println(String.format("The %s %s is %s in size and %d years old" ,colour,breed , size, age ));
    
    }

}
