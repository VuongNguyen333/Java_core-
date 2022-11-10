package Controller;

import model.AgeStudentComparator;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      List<Student> studentList = new ArrayList<>();
      studentList.add(new Student("Hai", 17));
      studentList.add(new Student("Abc", 18));
      studentList.add(new Student("Xyz", 19));

      studentList.sort(new AgeStudentComparator());
      for(Student student : studentList){
         System.out.println(student);
      }
   }
}

