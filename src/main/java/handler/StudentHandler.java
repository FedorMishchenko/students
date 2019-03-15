package handler;


import dto.StudentDto;
import entity.Faculty;

import java.util.Scanner;

public class StudentHandler implements Handler<StudentDto, Integer> {
private Scanner scanner = new Scanner(System.in);
    @Override
    public StudentDto create() {
        System.out.println("Enter id");
        Integer id = scanner.nextInt();
        System.out.println("Enter first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter faculty");
        System.out.println("1 = COMPUTER_SCIENCE, 2 = FINANCE or 3 = COMMON_EDUCATION");
        String fac = scanner.nextLine();
        Faculty faculty = null;
        if(fac == "1")
            faculty = Faculty.COMPUTER_SCIENCE;
        else if(fac == "2")
            faculty = Faculty.FINANCE;
        else if(fac == "3")
            faculty = Faculty.COMMON_EDUCATION;
        return new StudentDto()
                .setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setFaculty(faculty);

    }

    @Override
    public Integer get() {
        return null;
    }

    @Override
    public StudentDto update() {
        return null;
    }

    @Override
    public Integer delete() {
        return null;
    }
}
