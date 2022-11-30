package Strings;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Student {

    String name;
    int rollno;
    int marks;

    Student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    String getName() {
        return name;
    }

    int getRollno() {
        return rollno;
    }

    int getMarks() {
        return marks;
    }
}

public class SortingByComparator {
    public static void main(String[] args) {
        LinkedList<Student> listS = new LinkedList<>();
        listS.add(new Student("Arman", 45, 0));
        listS.add(new Student("Deepak", 47, 100));
        listS.add(new Student("Abhishek", 48, 50));
        listS.add(new Student("Kishor", 42, 70));

        System.out.println("*****Without any sorting*****");
        for (Student s : listS) {
            System.out.println(s.getName() + " " + s.getRollno() + " " + s.getMarks());
        }

        System.out.println("*****Rollno-wise sorting*****");
        Collections.sort(listS, new SortByRollno());
        for (Student s : listS) {
            System.out.println(s.getName() + " " + s.getRollno() + " " + s.getMarks());
        }
        System.out.println("*****Marks-wise sorting*****");
        Collections.sort(listS, new SortByMarks());
        for (Student s : listS) {
            System.out.println(s.getName() + " " + s.getRollno() + " " + s.getMarks());
        }
    }
}

class SortByRollno implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollno - o2.rollno;
    }
}

class SortByMarks implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks - o2.marks;
    }
}