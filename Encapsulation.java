import java.util.Scanner;

class Encapsulation{
    private String stuName;
    private String tcrName;

    public String getName(){
        return stuName;
    }

    public void setName(String name){
        this.stuName=name;
    }

    public String getTeacherName(){
        return tcrName;
    }
    
    public void setTeacherName(String name){
        this.tcrName=name;
    }
}

class School{
    public static void main(String[] args) {
        String studentName, teacherName;
        Student stu = new Student();
        Teacher tcr = new Teacher();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name:");
        studentName = input.nextLine();
        System.out.print("Enter Teacher Name:");
        teacherName = input.nextLine();
        stu.setName(studentName);
        tcr.setTeacherName(teacherName);
        System.out.println("The student name is: " + stu.getName() + "\n The teacher name is: " + tcr.getTeacherName());
    }
}

