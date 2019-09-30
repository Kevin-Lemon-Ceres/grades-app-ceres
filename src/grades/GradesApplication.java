package grades;

import java.sql.Struct;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Student kevin = new Student("Kevin");
        Student luis = new Student("Luis");
        Student kyndall = new Student("Kyndall");
        Student lemon = new Student("Lemon");

        kevin.addGrade(93);
        kevin.addGrade(83);
        kevin.addGrade(81);
//        kevin.recordAttendance("2019-09-18", "P");
//        kevin.recordAttendance("2019-09-19", "P");
//        kevin.recordAttendance("2019-09-20", "P");

        luis.addGrade(90);
        luis.addGrade(85);
        luis.addGrade(80);
//        luis.recordAttendance("2019-09-18", "P");
//        luis.recordAttendance("2019-09-19", "P");
//        luis.recordAttendance("2019-09-20", "A");

        kyndall.addGrade(82);
        kyndall.addGrade(85);
        kyndall.addGrade(87);
//        kyndall.recordAttendance("2019-09-18", "A");
//        kyndall.recordAttendance("2019-09-19", "A");
//        kyndall.recordAttendance("2019-09-20", "P");

        lemon.addGrade(72);
        lemon.addGrade(54);
        lemon.addGrade(100);
//        lemon.recordAttendance("2019-09-18", "A");
//        lemon.recordAttendance("2019-09-19", "A");
//        lemon.recordAttendance("2019-09-20", "P");

        students.put("kevinjarnall", kevin);
        students.put("luisdelgado373", luis);
        students.put("kyndall707", kyndall);
        students.put("jonathanlemman", lemon);


//        Welcome!
//
//        Here are the GitHub usernames of our students:
//
//        |zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|
//
//        What student would you like to see more information on?
//
//        > pizza
//
//        Sorry, no student found with the GitHub username of "pizza".
//
//        Would you like to see another student?
//
//        > y
//
//        What student would you like to see more information on?
//
//        > zgulde
//
//        Name: Zach - GitHub Username: zgulde
//        Current Average: 87.4
//
//        Would you like to see another student?
//
//        > no
//
//        Goodbye, and have a wonderful day!




    }
}
