//package gic.i4;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//class StudentTest extends Student {
//    int rollno;
//    String name;
//    int age;
//    StudentTest(int rollno,String name,int age){
//        this.rollno=rollno;
//        this.name=name;
//        this.age=age;
//    }
//}
//public class testArrayList {
//
//    public static void main(String args[]){
//        //Creating user-defined class objects
//        StudentTest s1=new StudentTest(101,"Sonoo",23);
//        StudentTest s2=new StudentTest(102,"Ravi",21);
//        StudentTest s3=new StudentTest(103,"Hanumat",25);
//        //creating arraylist
//        ArrayList<Student> al=new ArrayList<Student>();
//        al.add(s1);//adding Student class object
//        al.add(s2);
//        al.add(s3);
//        //Getting Iterator
//        Iterator itr=al.iterator();
//        //traversing elements of ArrayList object
//        while(itr.hasNext()){
//            StudentTest st=(StudentTest) itr.next();
//            System.out.println(st.rollno+" "+st.name+" "+st.age);
//        }
//    }
//}