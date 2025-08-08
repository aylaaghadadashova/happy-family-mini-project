package hw02;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
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

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily(){
        return family;
    }

    public void setFamily(Family family){
        this.family = family;
    }

    public void greetPet(){
        if (family != null && family.getPet() != null) {
            System.out.println("Hello, " + family.getPet().getNickname());
        }
    }

    public void describePet() {
        if (family != null && family.getPet() != null) {
            System.out.println("I have an " + family.getPet().getSpecies() + " is " + family.getPet().getAge() + " years old, he is " + (family.getPet().getTrickLevel() > 50 ? "very sly." : "almost not sly"));
        }
    }

    public boolean feedPet(boolean isTimeToFeed) {
        if (family.getPet() == null) {
            System.out.println("No pet to feed.");
            return false;
        }
        if (isTimeToFeed) {
            System.out.printf("Hm... I will feed %s's %s%n", this.name, family.getPet().getSpecies());
            return true;
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(101); // generates 0–100

            if (family.getPet().getTrickLevel() > randomNumber) {
                System.out.printf("Hm... I will feed %s's %s%n", this.name, family.getPet().getSpecies());
                return true;
            } else {
                System.out.printf("I think %s is not hungry.%n", family.getPet().getNickname());
                return false;
            }
        }

    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Human human = (Human) object;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.deepEquals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, Arrays.deepHashCode(schedule), family);
    }

    @Override
    public String toString() {
        return "Human{" + "\n" +
                "Name='" + name + "\n" +
                "Surname='" + surname + "\n" +
                "Year=" + year + "\n" +
                "Iq=" + iq + "\n" +
                "Schedule=" + Arrays.toString(schedule) + "\n" +
                "}\n";
    }
}
