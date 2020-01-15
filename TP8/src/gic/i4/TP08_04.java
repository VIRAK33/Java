package gic.i4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Course{
    int id;
    String name;
    String teachBy;
    int count;
    Course(){}
    Course(int id, String name, String teachBy){
        this.id = id; this.name = name; this.teachBy = teachBy;
    }

    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getTeachBy(){
        return teachBy;
    }
    static ArrayList<Course> courses = new ArrayList<Course>();

    void listAllCourse(){
        Iterator itr=courses.iterator();
        //traversing elements of ArrayList object
        if(itr.hasNext()){
            System.out.println("Course No.\tCourse Name\tTeach By");
            while(itr.hasNext()){
                Course co=(Course) itr.next();
                System.out.println(co.id + "\t"+ co.name+ "\t" + co.teachBy);
            }
        }else{
            System.out.println("There are no course!");
        }
    }
    void findCourseByName(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String inputName = sc.nextLine();

        if(count <= 0){
            System.out.print("There are no courese!");
        }else{
            for (Course co : courses) {
                if (co.getName().equalsIgnoreCase(inputName)) {
                    System.out.println(co.id +"\t" + co.name + "\t" + co.teachBy);
                    break;
                }
                else{
                    System.out.println("There are no this courese!");
                }

            }
        }
    }
    void addNewCourse(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course id: ");
        int inputID = Integer.parseInt(sc.nextLine());
        System.out.print("Enter course name: ");
        String inputName = sc.nextLine();
        System.out.print("Enter lecturer name: ");
        String inputLecName = sc.nextLine();


        Course course = new Course(inputID, inputName, inputLecName);
        courses.add(course);
        System.out.println("The course" +inputName+ "has been added!");
        count += 1;
    }


}

public class TP08_04 {


    public static void main(String [] args){

        Course co = new Course();
        boolean Codition = true;
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do{

            System.out.println("++++++++++++++++++++++++++++++++++++");
            System.out.println("1. List all courses");
            System.out.println("2. Find courses by name");
            System.out.println("3. Add new course");
            System.out.println("4. Quit");
            System.out.println("++++++++++++++++++++++++++++++++++++");

            try {
                System.out.print("Choose an option: ");
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong input!");
                continue;
            }

            switch (option){
                case 1:
                    co.listAllCourse();
                    break;
                case 2:
                    co.findCourseByName();
                    break;
                case 3:
                    co.addNewCourse();
                    break;
                case 4:
                    Codition =false;
                    break;

            }

        }while(Codition);
    }
}
