package repository;

import entity.Student;

import java.util.HashMap;

public class StudentRepository {
    private HashMap<Integer, Student> map;
    public StudentRepository(){
        this.map = new HashMap<>();
    }
    public HashMap<Integer,Student> store(){
        return this.map;
    }
}
