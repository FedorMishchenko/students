package controller;

import dto.StudentDto;
import handler.StudentHandler;
import service.Service;
import service.SomeOtherService;
import service.StudentService;

import java.util.HashMap;
import java.util.Scanner;

public class StudentController {
    private Service service;
    private StudentHandler handler;
    private Scanner scanner = new Scanner(System.in);
    private static HashMap<String, Service> map;

    public StudentController() {
        map.put("student", new StudentService());
        map.put("command", new SomeOtherService());
        handler = new StudentHandler();
    }

    public void display() {
        String command = scanner.nextLine();
        service = map.get(command);
        while (true) {
            command = scanner.nextLine();
            switch (command){
                case "create":
                    service.create(handler.create());
                    break;
                case "get":
                    StudentDto studentDto = (StudentDto) service.get(handler.get());
                    System.out.println(studentDto.toString());
                    break;
                case "update":
                    System.out.println("Enter id to update");
                    Integer id = scanner.nextInt();
                    service.update(id, handler.update());
                    break;
                case "delete":
                    service.delete(handler.delete());
                    break;
                case "getAll":
                    break;
            }

        }
    }
}
