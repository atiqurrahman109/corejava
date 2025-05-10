
package ooppracticeforexam;

import ooppracticeforexam.stu.Student;


public class OopPracticeForExam {

  
    public static void main(String[] args) {
        
//        Student s=new Student("36", "reja", 25);
//        
//        System.out.println("   "+ s);


    Student st=new Student();
    
    st.setName("Reja");
    st.setAge(25);
    st.setStudentId("30");
    
        System.out.println(""+st.studentDetails() );
        
    }
    
}
