package grades;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public Scanner scanner;

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double gpa = 0;
        for (Integer grade: grades){
            gpa += grade/grades.size();
        }
        return gpa;
    }
    public String getString(String prompt){
        String input;
        System.out.println(prompt);
        input = this.scanner.nextLine();
        return input;
    }
    public static void main(String[] args) {
        Student bob = new Student("Bob");
        bob.addGrade(90);
        bob.addGrade(100);
        bob.addGrade(97);
        bob.addGrade(88);

        System.out.println("Student Name: " + bob.getName());
        System.out.println("Student's Grades: " + bob.getGrades());
        System.out.println("Student's GPA: " + bob.getGradeAverage());
    }

}