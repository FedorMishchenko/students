package dto;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class StudentDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String faculty;

    @Contract(pure = true)
    public Integer getId() {
        return id;
    }

    @Contract("_ -> this")
    public StudentDto setId(Integer id) {
        this.id = id;
        return this;
    }

    @Contract(pure = true)
    public String getFirstName() {
        return firstName;
    }

    @Contract("_ -> this")
    public StudentDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Contract(pure = true)
    public String getLastName() {
        return lastName;
    }

    @Contract("_ -> this")
    public StudentDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Contract(pure = true)
    public String getFaculty() {
        return faculty;
    }

    @Contract("_ -> this")
    public StudentDto setFaculty(String faculty) {
        this.faculty = faculty;
        return this;
    }

    @Contract(value = "null -> false", pure = true)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentDto)) return false;
        StudentDto that = (StudentDto) o;
        return getId().equals(that.getId()) &&
                getFirstName().equals(that.getFirstName()) &&
                getLastName().equals(that.getLastName()) &&
                getFaculty() == that.getFaculty();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getFaculty());
    }

    @NotNull
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudentDto{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", faculty=").append(faculty);
        sb.append('}');
        return sb.toString();
    }
}
