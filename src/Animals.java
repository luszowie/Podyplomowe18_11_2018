public class Animals {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Dog(" Burek");
        animals[1] = new Cat(" Filemon");
        animals[2] = new Pig(" Prosiaczek");
        animals[3] = new Animal();
        animals[4] = new Chomik(" Chrupek");
        animals[5] = new Ptak(" Fruwak");

        for (Animal animal : animals){
            animal.introduce();

        }



    }
}


class Animal{
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String showName(){
        return "zwierzę: " + name;
    }

    String makeSound(){
        return "????";
    }

    void introduce(){
        System.out.println("Jestem: " +  showName()  + " : " + makeSound());

    }

}

class Dog extends Animal{
    public Dog(String name) {
        this.name = name;

    }





    @Override
    String showName() {
        return "pies" + name;
    }

    @Override
    String makeSound() {
        return "hau hau";


    }

}
class Cat extends Animal {
    public Cat(String name) {
        this.name = name;

    }

    @Override
    String showName() {
        return "Kot" + name;
    }

    @Override
    String makeSound() {
        return "miau";


    }
}

class Pig extends Animal {
    public Pig(String name) {
        this.name = name;

    }

    @Override
    String showName() {
        return "świnka" + name;
    }

    @Override
    String makeSound() {
        return "chrum ";


    }
}

class Chomik extends Animal {
    public Chomik(String name) {
        this.name = name;

    }

    @Override
    String showName() {
        return "Chomik" + name;
    }

    @Override
    String makeSound() {
        return "xxx";
    }
}
class Ptak extends Animal {
    public Ptak(String name) {
        this.name = name;

    }

    @Override
    String showName() {
        return "Ptak" + name;
    }

    @Override
    String makeSound() {
        return "ccc";
    }
}
