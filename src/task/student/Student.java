package task.student;

import java.util.Date;

public class Student implements Comparable<Student>{
    private static int count = 0;
    private final int id;
    private StudentPersonalData studentPersonalData;
    private UniversityData universityData;
    private OtherStudentData otherStudentData;

    public Student() {
        this.id = ++count;
    }

    public Student(StudentPersonalData studentPersonalData, UniversityData universityData, OtherStudentData otherStudentData) {
        this.studentPersonalData = studentPersonalData;
        this.universityData = universityData;
        this.otherStudentData = otherStudentData;
        id = ++count;
    }

    public int getId() {
        return id;
    }

    public StudentPersonalData getStudentPersonalData() {
        return studentPersonalData;
    }

    public void setStudentPersonalData(StudentPersonalData studentPersonalData) {
        this.studentPersonalData = studentPersonalData;
    }

    public UniversityData getUniversityData() {
        return universityData;
    }

    public void setUniversityData(UniversityData universityData) {
        this.universityData = universityData;
    }

    public OtherStudentData getOtherStudentData() {
        return otherStudentData;
    }

    public void setOtherStudentData(OtherStudentData otherStudentData) {
        this.otherStudentData = otherStudentData;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                "\n, " + studentPersonalData.toString() +
                "\n, " + universityData.toString() +
                "\n, " + otherStudentData.toString() +
                '}';
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.id, otherStudent.getId());
    }
}
