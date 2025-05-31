public class student {
    private String name;
    private String idNumber;
    private double gpa;
    public student(String studentName, String studentId, double studentGpa) {
        name = studentName;
        idNumber = studentId;
        gpa = studentGpa;
    }
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void setIdNumber(String newId) {
        idNumber = newId;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public double getGpa() {
        return gpa;
    }

    public void showInfo() {
        System.out.println("Student Info:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + idNumber);
        System.out.println("GPA: " + gpa);
    }
    public static void main(String[] args) {
       
        student s1 = new student("Samrachana Panthi", "240535", 3.8);
        s1.showInfo();
        System.out.println("Note: GPA is read-only and cannot be changed.");
    }
}