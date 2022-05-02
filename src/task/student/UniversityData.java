package task.student;


public class UniversityData {
    public enum Department{
        CHEMISTRY,
        PHYSICS,
        BIOLOGY,
        MATH,
        COMPUTER_SCIENCE,
        OTHER
    }
    private Department department;
    private int course;
    private int group;

    public UniversityData(Department department, int course, int group) {
        try{
            this.department = department;
        } catch (EnumConstantNotPresentException e){
            System.err.println(e);
        }

        this.course = course;
        this.group = group;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "department=" + department +
                ", course=" + course +
                ", group=" + group;
    }
}
