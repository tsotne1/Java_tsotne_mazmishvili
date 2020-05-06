package ge.edu.btu.cotne_mazmishvili.animal.model;

public class Animal {
    private String name;
    private String type;
    private String breed;
    private String color;
    private String age;

    public Animal() {

    }

    public Animal(String name, String type, String breed, String color, String age) {
        this.name = name;
        this.type = type;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
