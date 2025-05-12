package RecentlyAsked_InterviewProgramms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProgramSortUsingComparableAndComparator {
    public static void main(String[] args) {
        Comparator<Student> comp = new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                return Integer.compare(s1.age%10, s2.age%10);
            }
        };

        List<Student> stud= new ArrayList<>();
        stud.add(new Student(4, "John", 20));
        stud.add(new Student(2, "Alice", 22));
        stud.add(new Student(3, "Bob", 19));

        // Using Comparable
        System.out.println("Sorting using Comparable:");
        Collections.sort(stud);

        for(Student data: stud){
            System.out.println(data.age+" "+data.name+" ");
        }

        // Using Comparator
        System.out.println("Sorting using Comparator:");
        Collections.sort(stud,comp);

        for(Student data: stud){
            System.out.println(data.age+" "+data.name+" ");
        }
    }
}

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.age, that.age);
    }
}
