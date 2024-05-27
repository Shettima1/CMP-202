public class Student extends User {
    String matric_no = "bhu/22/04/09/0004";
    String admission_no = "youarecorrect";

    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register your courses at this moment";
        } else {
            return "You have registered all courses";
        }
    }

    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result.";
        } else {
            return "You got 8As, 2Bs and 1C";
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Shettima Ijasini";
        student.password = "008242357";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}
