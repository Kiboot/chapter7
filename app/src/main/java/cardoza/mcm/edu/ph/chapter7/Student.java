package cardoza.mcm.edu.ph.chapter7;

public class Student {
    int studentID=0;
    String fName;
    String lName;
    char sex;
    int age=0;

    Student(int studentID,String fName, String lName,char sex, int age){
        this.studentID  = studentID;
        this.fName      = fName;
        this.lName      = lName;
        this.sex        = sex;
        this.age        = age;
    }
    String getfName(){
        return this.fName;
    }
    String getlName(){
        return this.lName;
    }
    char getSex(){
        return this.sex;
    }
    int getAge(){
        return this.age;
    }
    int getStudentID(){
        return this.studentID;
    }
    void setStudentID(int studentID){
        this.studentID  = studentID;
    }
    void setfName(String fName){
        this.fName = fName;
    }
    void setlName(String lName){
        this.lName = lName;
    }
    void setSex(char sex){
        this.sex = sex;
    }
    void setAge(int age){
        this.age = age;
    }
}
