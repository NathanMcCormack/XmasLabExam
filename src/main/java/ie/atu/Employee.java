package ie.atu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Employee {
    /*private String[] name = new String[25];
    private  int[] ppsId = new int[11];
    private String employmentType;
    private String gender;
    private int age;*/

    private String name;
    private int ppsId;
    private String employmentType;
    private String gender;
    private int age;

    public Employee() {
        this.name = "";
        this.ppsId = 0;
        this.employmentType = "";
        this.gender = "";
        this.age = 0;
    }

    public Employee(String name, int ppsId, String employmentType, String gender, int age) {
        this.name = name;
        this.ppsId = ppsId;
        this.employmentType = employmentType;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPpsId() {
        return ppsId;
    }

    public void setPpsId(int ppsId) {
        this.ppsId = ppsId;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        switch(employmentType){
            case "Full-time":
                this.employmentType = employmentType;
                break;

            case "Part-time":
                this.employmentType = employmentType;
                break;

            case"Contract":
                this.employmentType = employmentType;
                break;

            default:
                System.out.println("Employment type must be Full-time, Part-time or Contract");
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {

        switch(gender){
            case "Man":
                this.gender = gender;
                break;

            case "Woman":
                this.gender = gender;
                break;

            case"Non-Binary":
                this.gender = gender;
                break;

            default:
                System.out.println("Gender must be Man, Woman or Non-Binary");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (getAge() <16 || getAge() >66){
            System.out.println("Age must be over 15 and less than 67");
        }
        else{
            this.age = age;
        }

    }

    @Override
    public String toString() {
        return "\n Employee:" +
                "\n Name: " + name +
                "\n PPS ID: " + ppsId +
                "\n Employment Type: " + employmentType + '\'' +
                "\n Gender: " + gender + '\'' +
                "\n Age: " + age;
    }
}
