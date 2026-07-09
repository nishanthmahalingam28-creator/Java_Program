import java.util.Scanner;
class Student
{
    //Variables declaration
    String name;
    int rollno;
    int[] marks=new int[5];
    int total=0;
    int average=0;
    //Input method to take input from user
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of Student name:");
        name=sc.nextLine();
        System.out.println("Enter roll number of Student:");
        rollno=sc.nextInt();
        System.out.println("Enter the marks Of 5 subjects:");
        for(int i=0;i<5;i++)
        {
            marks[i]=sc.nextInt();
        }
    }
    //method to calculate total marks
    void calculatetotal()
    {
        for(int i=0;i<5;i++)
        {
            total=total+marks[i];
            
        }
        System.out.println("Total marks of the student is:"+total);
        average=total/marks.length;
        System.out.println("Average mark of the student is:"+average);

    }
    //Grade calculation method
    void Grade()
    {
        if(80 <= average && average <= 100)
        {
            System.out.println("Grade:A");
        }
        else if(60<= average && average <=79)
        {
            System.out.println("Grade:B");
        }
        else if(40<= average && average <=59)
        {
            System.out.println("Grade:C");
        }
        else
        {
            System.out.println("Grade:D");
        }   
    }
    //main method
    public static void main(String[] argv)
    {
        Student s=new Student();
        s.input();
        s.calculatetotal();
        s.Grade();
    }
}
