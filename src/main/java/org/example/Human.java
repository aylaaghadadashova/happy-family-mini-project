package org.example;
import java.util.Arrays;
import java.util.Objects;

public abstract class Human {
    //name, surname, year, iq, pet, mother, father, schedule.
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String pet;
    private String mother;
    private String father;
    private String[] schedule;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(int year) {
        this.year = year;
    }

    public Human(String[] schedule) {
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, int iq, String pet, String mother, String father, String[] schedule) {
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

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }

    //greetPet(), describePet(), toString()
    public abstract void greetPet();
    public abstract void describePet();

    //feedPet(boolean) metodunu da əlavə edir (Random ilə)
    public void feedPet() {
        System.out.println(name + " heyvanını yemləməyə çalışır...");
        if (pet.isHungry()) {
            pet.eat(); // Random ilə yemək yeyir ya yox
        } else {
            System.out.println(pet.getName() + " toxdur və yemək istəmir.");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) && Objects.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, pet, mother, father, Arrays.hashCode(schedule));
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet='" + pet + '\'' +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
