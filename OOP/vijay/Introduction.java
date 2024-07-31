package OOP.vijay;

public class Introduction {

    public static void main(String[] args){

        Student[] students = new Student[5];

          // default constructor
          Student s1 = new Student();
          s1.roll=101;
          s1.name="Arun";
          s1.marks = 95.5f;
//        System.out.println(s1.roll);

        //constructor with arguments
        Student s2 = new Student(102,"rahul",80.6f);
//        System.out.println(s2.roll);

        //constructor with class as argument
        Student s3 = new Student(s1);
//        System.out.println(s3.roll);


    }




    static class Student{
        int roll;
        String name;
        float marks;

        Student(){
            this.roll=50;
            this.name="name";
            this.marks=80.5f;
        }

        Student(int roll,String name,float marks){
            this.roll=roll;
            this.name=name;
            this.marks=marks;
        }

        Student(Student other){
            this.name=other.name;
            this.marks=other.marks;
            this.roll=other.roll;
        }
    }

}


