public class Animal{
    //atributos
    String species;
    String race;
    String name;
    int age;
    String healthCondition;
    String description;
    int price;

    //metodo constructor
    Animal(String name, String species, String race, int age, String healthCondition,String description,int price){
        this.name = name;
        this.species = species;
        this.race = race;
        this.age = age;
        this.healthCondition = healthCondition;
        this.description = description;
        this.price = price;
    }
    //metodos
    public void felices(){
        System.out.println("el " + species + " esta feliz");
    }
}