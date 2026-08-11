package Validating_Form_Input;



import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PersonForm {


    @NotNull
    @Size(min=2 , max=30)
    private String name;

    private int age;

@NotNull
@Min(18)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String toString () {


        return "Person Name is + " + this.name +  " and their age is  " + this.age;
    }



}
