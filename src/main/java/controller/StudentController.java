package controller;

import dto.StudentDto;
import handler.Handler;
import handler.StudentHandler;
import service.Service;
import service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentController implements Controller{
    private Scanner scanner = new Scanner(System.in);
    private Service service;
    private Handler handler;

    public StudentController(){
        service = new StudentService();
        handler = new StudentHandler();
    }

    @Override
    public void display() {
        while (true) {
            String command;
            StudentDto dto;
            Integer id;
            System.out.println("Enter command");
            command = scanner.nextLine();
            switch (command){
                case "create":
                    dto = (StudentDto) handler.create();
                    System.out.println(service.create(dto).toString());
                    break;
                case "get":
                    id = (Integer) handler.get();
                    dto = (StudentDto) service.get(id);
                    System.out.println(dto.toString());
                    break;
                case "update":
                    System.out.println("Enter id to update");
                    id = scanner.nextInt();
                    service.update(id, handler.update());
                    break;
                case "delete":
                    id = (Integer) handler.delete();
                    service.delete(id);
                    break;
                case "all":
                    List<StudentDto> list =
                    service.getAll();
                    for(StudentDto studentDto: list){
                        System.out.println(studentDto.toString());
                    }
                    break;
                case "exit":
                    System.exit(0);
            }

        }
    }
}
