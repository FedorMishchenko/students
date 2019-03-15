package handler;


import dto.StudentDto;

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
        System.out.println("COMPUTER_SCIENCE, FINANCE, COMMON_EDUCATION");
        String faculty = scanner.nextLine();
        return new StudentDto()
                .setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setFaculty(faculty);

    }

    @Override
    public Integer get() {
        System.out.println("Enter id");
        Integer id = scanner.nextInt();
        return id;
    }

    @Override
    public StudentDto update() {
        return create();
    }

    @Override
    public Integer delete() {
        return get();
    }
}
