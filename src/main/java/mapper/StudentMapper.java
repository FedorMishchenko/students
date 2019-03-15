package mapper;

import dto.StudentDto;
import entity.Student;

public class StudentMapper implements Mapper<StudentDto, Student> {
    @Override
    public Student mapToObject(StudentDto dao) {
        return new Student()
                .setId(dao.getId())
                .setFirstName(dao.getFirstName())
                .setLastName(dao.getLastName())
                .setFaculty(dao.getFaculty())
                .setBirthday(dao.getBirthday());
    }

    @Override
    public StudentDto mapToDto(Student origin) {
        return new StudentDto()
                .setId(origin.getId())
                .setFirstName(origin.getFirstName())
                .setLastName(origin.getLastName())
                .setBirthday(origin.getBirthday())
                .setFaculty(origin.getFaculty());
    }
}
