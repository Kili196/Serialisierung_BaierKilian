package Student;

import Student.Student;

import java.util.ArrayList;

/**
 * Created: 18.10.2021
 *
 * @author Kilian Baier (20190608)
 */
public class Student_Main {
    public static void main(String[] args) {
        ArrayList<Student> Students = new ArrayList<>();
        Student s1 = new Student (" Muster ", " Thomas ", 123456);
        Student s2 = new Student (" Herbert ", " Franz ", 111111);
        Student s3 = new Student (" Malt ", " David R.", 323232);
        new Student ("", "", 111111);
        Students.add(s1);
        Students.add(s2);
        Students.add(s3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);






            }
    }
