package Advanced.JavaReflectionAttributes;

import java.lang.reflect.Method;
import java.util.*;

// [# use java7 #]
// [# not used #]
class Student{
    private String name;
    private String id;
    private String email;

    public void anotherMethod(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method:methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }

//        List<Method> methods= Arrays.asList(Student.class.getDeclaredMethods());
//        List<String> methodNames = new ArrayList<>();
//        methods.forEach(method -> methodNames.add(method.getName()));
//        Collections.sort(methodNames);
//        methodNames.forEach(System.out::println);
    }
}

//1st onD
// 54th problem

