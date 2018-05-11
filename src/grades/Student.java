package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    ArrayList <Integer> grades = new ArrayList<>();

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;

        // returns the student's name
        public String getName();
        {
            System.out.println(name);
        }
// adds the given grade to the grades property
        public void addGrade(int grade){
            grades.add(grade);
        }
// returns the average of the students grades
        public double getGradeAverage(){
            int i= 0;
            int summer = 0;
            for(grades){
                summer+=grades.indexOf(i);
            } double gpa = summer/grades.size();
        }
    }
}
