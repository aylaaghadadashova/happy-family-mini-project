package hw01;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet(){
        System.out.println("Hello, " + pet.getNickname());
    };
    public void describePet() {
        System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() + " years old, he is " + (pet.getTrickLevel() > 50 ? "very sly." : "almost not sly"));
    }

    public boolean feedPet(boolean isTimeToFeed) {
        if (this.pet == null) {
            System.out.println("No pet to feed.");
            return false;
        }
        if (isTimeToFeed) {
            System.out.printf("Hm... I will feed %s's %s%n", this.name, this.pet.getSpecies());
            return true;
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(101); // generates 0–100

            if (this.pet.getTrickLevel() > randomNumber) {
                System.out.printf("Hm... I will feed %s's %s%n", this.name, this.pet.getSpecies());
                return true;
            } else {
                System.out.printf("I think %s is not hungry.%n", this.pet.getNickname());
                return false;
            }
        }

    }

    @Override
    public String toString() {
        return "Human{" + "\n" +
                "Name='" + name + "\n" +
                "Surname='" + surname + "\n" +
                "Year=" + year + "\n" +
                "Iq=" + iq + "\n" +
                "Pet='" + pet + "\n" +
                "Mother='" + mother + "\n" +
                "Father='" + father + "\n" +
                "Schedule=" + Arrays.toString(schedule) + "\n" +
                "}\n";
    }
}
