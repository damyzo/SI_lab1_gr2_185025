import java.util.*;

class Faculty{
    List<Student> students;
    String facultyName;

    public Faculty(List<Student> students, String facultyName) {
        this.students = students;
        this.facultyName = facultyName;
    }

    public Faculty() {
        this.students = null;
        this.facultyName = "";
    }

    public void addStudent (Student studentToAdd)
    {
        this.students.add(studentToAdd);
    }

    public void deleteStudent (Student studentToDelete)
    {
        this.students.remove(studentToDelete);
    }

    public double studentsAverage ()
    {
        double sum = 0;

        for (int i = 0; i < students.size(); i++)
        {
            sum = sum + students.get(i).getAverage();
        }

        sum = sum/students.size();

        return sum;
    }
}
