
package studentclasspract;


public class student extends NameAndAge{
    
    public int studentId;

    public student() {
    }

    public student(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

//    @Override
//    public String getdetailsStudent() {
//       
//        return "name : "+getName()+"\n"+"age : "+getAge()+"\n"+ "student:"+studentId;
//    }

    @Override
    public String getdetailsStudent() {
        return super.getdetailsStudent(); 

// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
   
    
}
