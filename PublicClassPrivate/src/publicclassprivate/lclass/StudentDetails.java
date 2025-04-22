
package publicclassprivate.lclass;


public class StudentDetails {
    private String name;
    private String address;
    private String section;
    private int id;
    private int cell ;
    private String email ;

    public StudentDetails() {
    }

    public StudentDetails(String name, String address, String section, int id, int cell, String email) {
        this.name = name;
        this.address = address;
        this.section = section;
        this.id = id;
        this.cell = cell;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentDetails{" + "name=" + name + ", address=" + address + ", section=" + section + ", id=" + id + ", cell=" + cell + ", email=" + email + '}';
    }
   
    
    
}
