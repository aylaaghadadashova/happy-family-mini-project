package hw01;

public class App01 {

    public static void main(String[] args) {

        Human father = new Human("John", "Karleone", 1980);
        Human mother = new Human("Jane", "Karleone", 1981);

        Pet pet1 = new Pet("dog", "Rock");
        Pet pet2 = new Pet("cat", "Misty", 3, 80, new String{"sleep", "jump"});
        Pet pet3 = new Pet();

        String[][] schedule = {
                {"Monday", "go to gym"},
                {"Tuesday", "study Java"},
                {"Wednesday", "go for a walk"}
        };

        Human child1 = new Human("Michael", "Karleone", 2009, 95, pet2, mother, father, schedule);
        Human child2 = new Human("Anna", "Karleone", 2013, father, mother);
        Human child3 = new Human();

        System.out.println("Mother: " + mother);
        System.out.println("Father: " + father);
        System.out.println("Child1: " + child1);
        System.out.println("Child2: " + child2);
        System.out.println("Child3: " + child3);

        System.out.println("Pet1: " + pet1);
        System.out.println("Pet2: " + pet2);
        System.out.println("Pet3: " + pet3);

        System.out.println("\n--Greeting Pet & Describing Pet--");
        child2.greetPet();
        child2.describePet();

        System.out.println("\n--Eat, Respond, Foul Methods for Pet--");
        pet3.eat();
        pet3.respond();
        pet3.foul();

        System.out.println("\n--Feeding Pet--");
        boolean fed1 = child1.feedPet(true);
        System.out.println("Feeding result1: " + fed1);

        boolean fed2 = child1.feedPet(false);
        System.out.println("Feeding result1: " + fed2);

    }
}
