package hw02;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father){
        this.mother = mother;
        this.father = father;

        this.mother.setFamily(this);
        this.father.setFamily(this);

        this.children = new Human[0];
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child){

        Human[] newChildren = new Human[children.length + 1];

        for(int i=0; i < children.length; i++){
            newChildren[i] = children[i];
        }

        newChildren[children.length] = child;

        children = newChildren;

        System.out.println(child.getName() + " has been added to the family.");

    }


    public void listChildren() {
        System.out.println("Children in the family:");
        for (Human child : children) {
            System.out.println("- " + child.getName());
        }
    }

    public void deleteChild(Human child){

        if(children.length == 0){
            System.out.println("The list is empty.");
            return;
        }

        int index = 0;
        boolean found = false;
        Human[] newChildren = new Human[children.length - 1];

        for(int i=0; i < children.length; i++){
            if(!children[i].equals(child)){
                if(index < newChildren.length){
                    newChildren[index] = children[i];
                    index++;
                }
                else{
                    found = true;
                }
            }
            newChildren[i] = children[i];
        }

        if(!found){
            System.out.println("Child not found.");
        }

        children = newChildren;
        System.out.println(child.getName() + " has been removed from the family.");

    }

    public int  countFamily() {
        int count = 0;
        if (father != null) count++;
        if (mother != null) count++;
        count += children.length;
        return count;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return pet == family.pet && Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.deepEquals(children, family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, Arrays.hashCode(children), pet);
    }

    @Override
    public String toString() {
        return "Family{" + "\n" +
                "Mother='" + mother + "\n" +
                "Father='" + father + "\n" +
                "Children=" + Arrays.toString(children) + "\n" +
                "Pet=" + pet + "\n" +
                "}\n";
    }

}