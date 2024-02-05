import java.io.Serializable;
import java.util.Objects;

public class Student implements IPerson, Serializable {
    private String name;
    private String birthDate;
    private int StudentId;

    public Student(String name, String birthDate, int studentId) {
        this.name = name;
        this.birthDate = birthDate;
        StudentId = studentId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    @Override
    public String toString() {
        return "Student [" +
                "№ Student ID: " + StudentId +
                ", Full name: " + name +
                ", birthday: " + birthDate + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return StudentId == student.StudentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(StudentId, 20);
    }
}
