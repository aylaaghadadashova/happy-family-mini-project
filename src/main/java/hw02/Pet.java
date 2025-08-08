package hw02;

import java.util.Arrays;
import java.util.Objects;

public class Pet {

    static {
        System.out.println("Pet class is being loaded.");
    }

    {
        System.out.println("Creating a new Pet object...");
    }

    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet() {
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("The dog is eating");
    }

    public void respond() {
        System.out.println("hello , i am" + nickname);
    }

    public void foul() {
        System.out.println(nickname + "made a mess");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Pet pet = (Pet) object;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) && Objects.deepEquals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel, Arrays.hashCode(habits));
    }

    @Override
    public String toString() {
        return ("Pet = {\n" +
                "Species:" + species + "\n" +
                "Nickname:" + nickname + "\n" +
                "Age:" + age + "\n" +
                "TrickLevel:" + trickLevel + "\n" +
                "Habits:" + Arrays.toString(habits) + "\n}\n");

    }
}
