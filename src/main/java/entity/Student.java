package entity;

import org.jetbrains.annotations.Contract;

import java.util.Objects;

public class Student extends Entity<Integer> {
    private String firstName;
    private String lastName;
    private String faculty;

    @Override
    public Student setId(Integer id) {
        super.setId(id);
        return this;
    }
    public Integer getId(){
        return super.getId();
    }

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFaculty() {
        return faculty;
    }

    public Student setFaculty(String faculty) {
        this.faculty = faculty;
        return this;
    }

    @Contract(value = "null -> false", pure = true)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getFirstName().equals(student.getFirstName()) &&
                getLastName().equals(student.getLastName()) &&
                getFaculty() == student.getFaculty();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getFaculty());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", faculty=").append(faculty);
        sb.append('}');
        return sb.toString();
    }
}
