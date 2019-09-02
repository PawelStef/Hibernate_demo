package javagda25;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.swing.text.html.parser.Entity;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EntityDao entityDao = new EntityDao();

        Scanner sc = new Scanner(System.in);

        System.out.println("Program do operacjach na danych w bazie");
        System.out.println("Student");

        boolean quit = false;

        String menuItem;

        do {
            System.out.println("Możliwe opcje:");
            System.out.println("-add-  -remove-  -addGrade-  -list-  -getId-  -getName-  -edit  -quit-");
            int id;
            menuItem = sc.nextLine().toLowerCase();

            switch (menuItem) {

                case "add":

                    System.out.println("Add student:");
                    Student student = new Student();
                    System.out.println("Student name:");
                    student.setName(sc.nextLine());
                    System.out.println("Student age:");
                    student.setAge(Integer.parseInt(sc.nextLine()));
                    //System.out.println("Student average:");
                    //student.setAverage(Double.parseDouble(sc.nextLine()));
                    System.out.println("Student alive?:");
                    student.setAlive(Boolean.parseBoolean(sc.nextLine()));

                    entityDao.saveOrUpdate(student);

                    break;

                case "remove":
                    System.out.println("Remove student");
                    System.out.println("Student id?:");
                    Long idL = Long.parseLong(sc.nextLine());

                    entityDao.delite(Student.class, idL );
                    break;

                case "addgrade":
                    System.out.println("Add grade:");

                    Grade grade = new Grade();
                    System.out.println("Student id:");
                    Optional<Student> studentOptional = entityDao.getById(Student.class,  Long.parseLong(sc.nextLine()));
                    Student st = studentOptional.get();
                    grade.setStudent(st);
                    System.out.println("Subject:");
                    grade.setSubject(GradeSubject.valueOf(sc.nextLine()));

                    System.out.println("grade:");
                    grade.setValue(Double.parseDouble(sc.nextLine()));

                    entityDao.saveOrUpdate(grade);

                    break;

                case "list":
                    System.out.println("List students");

                    entityDao.getAll(Student.class).forEach(System.out::println);
                    //studentDao.listStudents().forEach(System.out::println);

                    break;

                case "getid":
                    /*
                    System.out.println("Get one student by id:");

                    System.out.println("Student id?:");
                    id = Integer.parseInt(sc.nextLine());
                    studentDao.getOneStudent(id);

                    */
                    break;

                case "getname":
                    /*
                    System.out.println("Get one student by name:");

                    System.out.println("Student name?:");
                    String name = (sc.nextLine());
                    studentDao.getOneStudentByName(name);
                    */
                    break;

                case "edit":

                    System.out.println("Edit student");

                    break;

                case "quit":

                    System.out.println("You've chosen qiut ");

                    quit = true;
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (!quit);

        System.out.println("Bye-bye!");

    }
}
