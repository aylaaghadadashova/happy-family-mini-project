package hw01;

import java.util.Arrays;

public class Pet {

        private Species species;
        private String nickname;
        private int age;
        private int trickLevel;
        private String[] habits;

        //construction 1
        public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
            this.species = species;
            this.nickname = nickname;
            this.age = age;
            this.trickLevel = trickLevel;
            this.habits = habits;
        }

        //construction 2
        public Pet(Species species, String nickname) {
            this.species = species;
            this.nickname = nickname;
        }

        //construction 3
        public Pet(String nickname) {
            this.nickname = nickname;
        }

        //getter and setters
        public Species getSpecies() {
            return species;
        }

        public void setSpecies(Species species) {
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

        //methods
        public void eat() {
            System.out.println("The dog is eating");
        }

        public void respond() {
            System.out.println("hello , i am" + nickname);
        }

        public boolean isDirty() {
            return true;
        }

        @Override
        public String toString() {
            return ("Pet = {\n" +
                    "Species:" + species + "\n" +
                    "Nickname:" + nickname + "\n" +
                    "Age:" + age + "\n" +
                    "TrickLevel:" + trickLevel + "\n" +
                    "Habits:" + Arrays.toString(habits) + "\n}");

        }
    }