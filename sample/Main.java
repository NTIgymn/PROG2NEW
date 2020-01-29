package sample;


public class Main   {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("Black"),
                            new Hedgehog("Pink"),
                            new Bird("Yellow"),
                            new Snake("Black and Yellow")};

        System.out.println("###############");
        System.out.println();

        for (Animal animal : animals) {
            activateAnimal(animal);
        }
    }

    private static void activateAnimal(Animal animal) {
        System.out.println();

        animal.eat();
        animal.sleep();
        animal.speak();
        animal.walk();

        printAnimalName(animal);

        System.out.println("###############");
        System.out.println();
    }

    private static void printAnimalName(Animal animal) {
        switch (animal.getClass().getSimpleName())
        {
            case "Dog":
                System.out.println("Its a dog!");
                break;
            case "Bird":
                System.out.println("Its some kind of Bird!");
                break;
            case "Hedgehog":
                System.out.println("Sonic?");
                break;
            case "Snake":
                System.out.println("Oh heck its a Snaek!");
                break;
            default:
                System.out.println("ANIMAL!");
                break;
        }
    }
}
