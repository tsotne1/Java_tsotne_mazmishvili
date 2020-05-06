package ge.edu.btu.tsotne_mazmishvili.api.controller;

import ge.edu.btu.tsotne_mazmishvili.api.model.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/studentManager")
public class StudentController {

    //შეიქმნება ყოველ ახალ გამოძახებაზე შედეგები უფრო თვალსაჩინო რო გახდეს
    public  List<Student> createTempSutendts() {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(1,"GIORGI",12));
        studentList.add(new Student(2,"Data",35));
        studentList.add(new Student(3,"Gia",43));
        studentList.add(new Student(4,"Nana",54));
        return studentList;
    }

    @GET
    @Path("/hi")
    public String sayHallo(){
        return "Hello !";
    }

    @GET
    @Path("/students")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudents() {
        ArrayList listOfStudents = (ArrayList) createTempSutendts();
        return listOfStudents;
    }

    @POST
    @Path("addStudent")
    @Produces(MediaType.APPLICATION_JSON) // აბრუნებს ჯეისონს
    @Consumes(MediaType.APPLICATION_JSON) // იღებს ჯეისონს
    public List<Student> addStudent(Student student) {
        ArrayList listOfStudents = (ArrayList) createTempSutendts();
        listOfStudents.add(student);
        System.out.println("added");
        System.out.println(listOfStudents);
        return listOfStudents;
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student updateStudent(Student student) {
        ArrayList listOfStudents = (ArrayList) createTempSutendts();
        for (int i = 0; i <= listOfStudents.size(); i++) {
            Student eachStudent = (Student) listOfStudents.get(i);
            if (eachStudent.getId() == student.getId()){
                System.out.println("student updated");
                eachStudent.setName(student.getName());
                eachStudent.setAge(student.getAge());
            };
            System.out.println(eachStudent);
        }
        return student;
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteStudent(@PathParam("id")int id) {
        ArrayList listOfStudents = (ArrayList) createTempSutendts();
        for (int i = 0; i <= listOfStudents.size(); i++) {
            Student eachStudent = (Student) listOfStudents.get(i);
            if (eachStudent.getId() == id){
                listOfStudents.remove(eachStudent);
            }
            else{
                System.out.println(eachStudent);
            };

        }
    }
}


