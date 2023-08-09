
class school{
    String schoolName = "SMK Maju Terus";

    void displayName(){
        System.out.println(schoolName);
    }
}

class student extends school{
    String studentName = "Aiman Shahran";

    void displayStudentName(){
        System.out.println(studentName);
    }
}

class teacher extends student{
    String teacherName = "Atiqah Hasbullah";
    
    void displayTeacherName(){
        System.out.println(teacherName);
    }
}

class inheritance{
    public static void main(String[] args) {
        teacher d = new teacher();
        d.displayName();
        d.displayStudentName();
        d.displayTeacherName();
    }
}
