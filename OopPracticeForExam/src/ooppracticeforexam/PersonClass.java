
package ooppracticeforexam;


public class PersonClass {

    
   private String name;
   private int age;

    public PersonClass() {
    }

    public PersonClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public String studentDetails(){
    
        return "Student Name :"+name+"\nStudent Age : "+age;
    }
    
    
}
