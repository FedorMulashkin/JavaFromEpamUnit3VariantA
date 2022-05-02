package task.student;

import java.util.Date;

public class StudentPersonalData {
    private String name;
    private String surname;
    private String fathersName;
    private Date birthday;

    public StudentPersonalData() {
    }

    public StudentPersonalData(String name, String surname, String fathersName, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.fathersName = fathersName;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", birthday=" + birthday;
    }
}
