package task.student;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class PrintStudentsByParams {
    public List<Student> studentsByDepartment(UniversityData.Department department, List<Student> allStudents){
        List<Student> students = new ArrayList<>();
        for (Student student : allStudents) {
            if(student.getUniversityData().getDepartment().equals(department)){
                students.add(student);
            }
        }
        return students;
    }
    public List<Student> studentByCourseAndDepartment(UniversityData.Department department, List<Student> allStudents, int course){
         List<Student> students = studentsByDepartment(department, allStudents);
         List<Student> studentsFromOneCourse = new ArrayList<>();
        for (Student student : students) {
            if(student.getUniversityData().getCourse() == course){
                studentsFromOneCourse.add(student);
            }
        }
        return studentsFromOneCourse;
    }

    public List<Student> studentsElderThen(Date date, List<Student> allStudents){
        List<Student> students = new ArrayList<>();
        for (Student student: allStudents) {
            if (student.getStudentPersonalData().getBirthday().after(date)){
                students.add(student);
            }
        }
        return students;
    }

    public List<Student> studentsByGroup(UniversityData.Department department, List<Student> allStudents, int group){
        List<Student> students = studentsByDepartment(department, allStudents);
        List<Student> studentsFromOneGroup = new ArrayList<>();
        for (Student student : students) {
            if(student.getUniversityData().getGroup() == group){
                studentsFromOneGroup.add(student);
            }
        }
        return studentsFromOneGroup;
    }
}
