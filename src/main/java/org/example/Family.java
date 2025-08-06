package org.example;
import java.util.Arrays;
import java.util.Objects;

public abstract class Family {
    //mother, father, children[], pet.
    private String mother;
    private String father;
    private Human[] children;
    private boolean pet;

    public Family(String mother) {
        this.mother = mother;
    }

//    public Family(String father) {
//        this.father = father;
//    }

    public Family(String mother, String father){
        this.mother = mother;
        this.father = father;
    }

    public Family(Human[] children) {
        this.children = children;
    }

    public Family(boolean pet) {
        this.pet = pet;
    }

    public Family(String mother, String father, Human[] children, boolean pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public boolean isPet() {
        return pet;
    }

    public void setPet(boolean pet) {
        this.pet = pet;
    }


    //addChild(Human), deleteChild(index), deleteChild(Human), countFamily()

    public void addChild(Human child){

        Human[] newChildren = new Human[children.length + 1];

        for(int i=0; i < children.length; i++){
            newChildren[i] = children[i];
        }

        newChildren[children.length] = child;

        children = newChildren;

        System.out.println(child.getName() + " ailəyə əlavə olundu.");

    }


    public void listChildren() {
        System.out.println("Ailədəki uşaqlar:");
        for (Human child : children) {
            System.out.println("- " + child.getName());
        }
    }

    public void deleteChild(Human child){

        if(children.length == 0){
            System.out.println("Siyahı boşdur");
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
            System.out.println("Uşaq taılmadı.");
        }

        children = newChildren;
        System.out.println(child.getName() + "ailədən silindi.");

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
        return "Family{" +
                "mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

}
