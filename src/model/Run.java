package model;

public class Run {
public static void main(String[] args) {
	Student student = new Student();
    student.setName("zhangsan");
    student.setAge(17);
    student.setSex("man");
    student.setStudentNumber(101);
    System.out.println(student.getName());
    System.out.println(student.getAge());
    System.out.println(student.getSex());
    System.out.println(student.getStudentNumber());
    
}
}