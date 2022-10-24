import java.util.ArrayList;

public class Student {
    // Variables
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    // Constructor
    public Student(String name, long id){
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    // Methods
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        int total = 0;
        for (int grade: grades){
            total += grade;
        }
        return (double) total/grades.size();
    }

    public void updateGrade(int index, int grade){
        grades.set(index, grade);
    }

    public void deleteGrade(int index){
        grades.remove(index);
    }



}
