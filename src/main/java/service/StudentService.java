package service;

import dto.StudentDto;
import entity.Student;
import mapper.StudentMapper;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;


public class StudentService implements Service<StudentDto, Integer> {
    private StudentRepository repository = new StudentRepository();
    private StudentMapper mapper = new StudentMapper();

    @Override
    public StudentDto create(StudentDto entity) {
        Integer key = entity.getId();
        repository.getStorage().put(key, mapper.mapToObject(entity));
        return entity;
    }

    @Override
    public StudentDto get(Integer id) {
        return mapper.mapToDto(repository.getStorage().get(id));
    }

    @Override
    public void update(Integer id, StudentDto entity) {
        repository.getStorage().replace(id, mapper.mapToObject(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.getStorage().remove(id);
    }

    @Override
    public List<StudentDto> getAll() {
        List<StudentDto> result = new ArrayList<>();
        List<Student> list = new ArrayList<>(repository.getStorage().values());
        for (Student student : list) {
            result.add(mapper.mapToDto(student));
        }
        return result;
    }
}
