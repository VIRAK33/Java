package gic.i4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



class Student{
    int id;
    String name;
    int age;
    String gender;
    int year;

    Student( int id,String name, int age, String gender, int year){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.year = year;
    }
    public String getName()
    {
        return name;
    }
}



public class TP08_02 {
    static ArrayList<Student> students = new ArrayList<Student>();
    static int  NumberOfStudent = 0;
    public static void addStudent(){
        int id,age,year;
        String name, gender;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student ID: ");
        id = Integer.parseInt(sc.nextLine()) ;

        System.out.print("Input student Name: ");
        name = sc.nextLine();

        System.out.print("Input student Age: ");
        age = Integer.parseInt(sc.nextLine()) ;

        System.out.print("Input student Gender: ");
        gender = sc.nextLine();

        System.out.print("Input student Year: ");
        year = Integer.parseInt(sc.nextLine()) ;

        Student s1 = new Student(id, name, age,gender, year);
        students.add(s1);
        NumberOfStudent += 1;
    }
    public static void showStudent() throws IOException {
        Iterator itr=students.iterator();
        //traversing elements of ArrayList object
        if(itr.hasNext()){
            System.out.println("No.\tName\tGender\tAge\tYear");
            while(itr.hasNext()){
                Student st=(Student)itr.next();
                System.out.println(st.id+"\t"+st.name + "\t\t"+ st.gender + "\t\t"+ st.age+ "\t" + st.year);
            }
        }else{
            System.out.println("There are no student!");
        }

        System.out.println("Press Enter to continue...");
        System.in.read();
    }
    public static void removeStudent() {
        Scanner sc = new Scanner(System.in);
        boolean isDelete = false;
        String inputName = "";
        if(NumberOfStudent>0){
            System.out.print("Enter student's name that you want to remove: ");
            inputName = sc.nextLine();

            for (Student st : students) {

                if (st.getName().equals(inputName)) {
                    students.remove(st);
                    isDelete = true;
                    NumberOfStudent -= 1;
                }

            }
        }else{
            System.out.println("Thare are no student!");
        }
        if(isDelete){
            System.out.println("\nThe student name: " + inputName +" had been removed!");
        }


    }

    public static void main(String[] args) throws IOException {
        boolean Codition = true;
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do{

            System.out.println("++++++++++++++++++++++++++++++++++++");
            System.out.println("1. Add new student");
            System.out.println("2. List student");
            System.out.println("3. Remove student by name");
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
                    addStudent();
                    break;
                case 2:
                    showStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    Codition =false;
                    break;
            }

        }while(Codition);



    }


}
