package DataStructures.JavaPriorityQueue;

import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */
import java.util.PriorityQueue;
import java.util.Comparator;
class Priorities {
    public List<Student> getStudents(List<String> events) {
        Comparator<Student> studentComparator = Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getId);
        PriorityQueue<Student> queue = new PriorityQueue<>(studentComparator);
        List<Student> studentList = new ArrayList<>();

        for(String e:events){
            if (e.equals("SERVED")) {
                queue.poll();
            } else {
                String[] param = e.split("\\s+");
                Student s = new Student(param[1],Double.parseDouble(param[2]),Integer.parseInt(param[3]));
                queue.add(s);
            }
        }

        while(!queue.isEmpty()){
            studentList.add(queue.poll());
        }

        return studentList;
    }
}

class Student {
    private final String name;
    private final int id;
    private final double cgpa;

    Student() {
        this( "", 0.0d,0);
    }

    Student(String name,double cgpa,int id) {
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}

// 1st onD
// 43rd problem