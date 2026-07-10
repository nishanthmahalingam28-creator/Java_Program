import java.util.Scanner;
class Calculator
{
    //Varuables declaration
    int a,b;
    Scanner sc=new Scanner(System.in);
    //Input method 
    void input()
    {
        
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();

        
    }
    //Calcultor operations method
    void operations()
    {
        System.out.println("Operations:"+"\n1.Addition"+"\n2.Subtraction"+"\n3.Multiplication"+"\n4.Division"+"\n5.Modulus" +"\n6.power"+"\n7.Square root"+"\n8.Maximum of two numbers"+"\n9.Minimum of two numbers");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        //Switch case to perform operations
        switch(choice)
        {
            case 1:
                System.out.println("Addition of two numbers is:"+(a+b));
                break;
                case 2:
                    System.out.println("Subtraction of two numbers is:"+(a-b));
                    break;
                case 3:
                    System.out.println("Multiplication of two numbers is:"+(a*b));
                    break;
                case 4:
                    System.out.println("Division of two numbers is:"+(a/b));
                    break;
                case 5:
                    System.out.println("MOdulus of the two numbers is :"+(a%b));
                    break;
                case 6:
                    System.out.println("Power of the two numbers is:"+(Math.pow(a,b)));
                    break;
                case 7:
                    System.out.println("Square root of the two numbers is:"+(Math.sqrt(a))+" and"+(Math.sqrt(b)));
                    break;
                case 8:
                    System.out.println("Maximum of the two numbers is:"+Math.max(a,b));
                    break;
                case 9:
                    System.out.println("Minimum of two numbers is:"+Math.min(a,b));
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;

        }
    }
    //main method
    public static void main(String[] args)
    {
        Calculator c=new Calculator();
        c.input();
        c.operations();
    }
}