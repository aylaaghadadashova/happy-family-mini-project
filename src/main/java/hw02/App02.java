package hw02;

public class App02 {

    public static void main(String[] args) {

        Human father = new Human("John", "Karleone", 1975, 100, null);
        Human mother = new Human("Jane", "Karleone", 1977, 105, null);
        Pet pet = new Pet("dog", "Rocky", 5, 75, new String[]{"eat", "sleep", "play"});

        Family family = new Family(mother, father);
        family.setPet(pet);

        // Testing equals and hashCode
        Family family2 = new Family(mother, father);
        family2.setPet(pet);
        System.out.println("Family equals family2? " + family.equals(family2));

        System.out.println();
        Human child1 = new Human("Michael", "Karleone", 2003, 80, null);
        Human child2 = new Human("Sonny", "Karleone", 2005, 70, null);
        family.addChild(child1);
        family.addChild(child2);
        System.out.println();

        System.out.println("Family members count: " + family.countFamily());
        System.out.println(family);

        // Delete one child by index
//        family.deleteChild(1);
//        System.out.println("After deleting a child by index:");
//        System.out.println(family);

        // Delete child by object (advanced)
        family.deleteChild(child1);
        System.out.println("After deleting a child by object:");
        System.out.println(family);
    }
}
