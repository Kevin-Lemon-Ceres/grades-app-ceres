package grades;

import util.Input;

import java.sql.Struct;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        Input userInput = new Input();

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

        System.out.println("Welcome");
        int userChoice;
        boolean exited = false;

        do {
            userChoice = userInput.getInt(0, 4, "What would you like to do?\n" +
                    "0 - Exit\n" +
                    "1 - See an individual student\n" +
                    "2 - View all student grades\n" +
                    "3 - View the overall class average\n" +
                    "4 - Print a csv report of all the students");

            switch (userChoice) {
                case 0:
                    exited = true;
                    break;
                case 1:
                    do {
                        System.out.println("Here are the GitHub usernames of our students: ");

                        for (String student : students.keySet()) {
                            System.out.print("|" + student + "| ");
                        }

                        String sInput = userInput.getString("\nWhat student would you like to see more information on?");

                        if (students.containsKey(sInput)) {
                            System.out.println(String.format("Name: %s - GitHub Username: %s\n" +
                                    "Grades: %s\n" +
                                    "Current Average: %.1f", students.get(sInput).getName(), sInput, students.get(sInput).getGrades(), students.get(sInput).getGradeAverage()));
                        } else {
                            System.out.println(String.format("Sorry, no student found with the GitHub username of %s", sInput));
                        }

                    } while (userInput.yesNo("Would you like to see another student y/n?"));
                    break;
                case 2:
                    System.out.println("Here is a list of every students grades:");

                    for (Student student : students.values()) {
                        System.out.println(String.format("%s - %s", student.getName(), student.getGrades()));
                    }
                    break;
                case 3:
                    double total = 0;

                    for (Student student : students.values()) {
                        total += student.getGradeAverage();
                    }

                    double average = total / students.size();
                    System.out.println(String.format("The class average is: %.1f", average));
                    break;
                case 4:
                    System.out.println("name,github_username,average");

                    for (String name : students.keySet()) {
                        System.out.println(String.format("%s,%s,%f", students.get(name).getName(), name, students.get(name).getGradeAverage()));
                    }
                    break;
            }


        } while (!exited && userInput.yesNo("Would you like to do something else y/n?"));

        System.out.println("Goodbye, and have a wonderful day!");
    }
}