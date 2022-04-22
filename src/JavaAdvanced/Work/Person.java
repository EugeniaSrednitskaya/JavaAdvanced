package JavaAdvanced.Work;

public class Person {
    private String name;
    private int age;
    private String sex;
    private String[] sexArray = {"female", "male"};

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {

        String nameNew = "";

        if (this.sex.equals(sexArray[0]) == true) {
            nameNew = "Mrs. " + this.name;
        } else if (this.sex.equals(sexArray[1]) == true) {
            nameNew = "Mr. " + this.name;
        }
        return nameNew;
    }

    public String getNames() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

}
