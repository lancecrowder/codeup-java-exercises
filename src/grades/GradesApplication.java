package grades;

import java.util.HashMap;
import util.Input;
import static CardGames.GameOfWar.wantsToContinue;

public class GradesApplication {
    public static void main(String[] args) {
        Student student1 = new Student("Lance_Crowder");
        student1.addGrade(90);
        student1.addGrade(100);
        student1.addGrade(95);
        Student student2 = new Student("Robert_Oso");
        student2.addGrade(70);
        student2.addGrade(75);
        student2.addGrade(72);
        student2.addGrade(80);
        Student student3 = new Student("Faye_Kerr");
        student3.addGrade(80);
        student3.addGrade(78);
        student3.addGrade(82);
        student3.addGrade(80);
        Student student4 = new Student("Dell_McApple");
        student4.addGrade(60);
        student4.addGrade(65);
        student4.addGrade(88);
        student4.addGrade(75);
        HashMap<Student, String> students = new HashMap<>();
        students.put(student1, "lancecrowder");
        students.put(student2, "BobBear");
        students.put(student3, "EmaNymton");
        students.put(student4, "CoolArrow");
        do {
            System.out.println("Welcome!\n");
            System.out.println("Here are the github usernames of our students:\n");
            System.out.println("|" + students.get(student1) + "| |" + students.get(student2) + "| |" + students.get(student3) + "| |" + students.get(student4) + "|\n");
            Input input = new Input();
            input.getString("What student would you like to see more information about?\n >");
            input.toString();
//            for (Student student: map.keyset()){
//
//            }


//            if (.equalsIgnoreCase("lancecrowder")) {
//                System.out.println("Student1: " + student1.getName());
//                System.out.println("Grades: " + student1.getGrades());
//                System.out.println("GPA: " + student1.getGradeAverage());
//            } else if (test.equalsIgnoreCase("BobBear")) {
//                System.out.println("Student2: " + student2.getName());
//                System.out.println("Grades: " + student2.getGrades());
//                System.out.println("GPA: " + student2.getGradeAverage());
//            } else if (test.equalsIgnoreCase("EmaNymton")) {
//                System.out.println("Student3: " + student3.getName());
//                System.out.println("Grades: " + student3.getGrades());
//                System.out.println("GPA: " + student3.getGradeAverage());
//            } else if (test.equalsIgnoreCase("CoolArrow")) {
//                System.out.println("Student4: " + student4.getName());
//                System.out.println("Grades: " + student4.getGrades());
//                System.out.println("GPA: " + student4.getGradeAverage());
//            } else System.out.println("No users with that username were found.");
        } while (wantsToContinue());
    }
}
