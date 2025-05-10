
package ooppracticeforexam.stu;

import ooppracticeforexam.PersonClass;


public class Student extends PersonClass{
   private String studentId;

    public Student() {
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String studentDetails() {
        
        return super.studentDetails()+"\nStudent Id : "+studentId; 
    }

   
   
}
