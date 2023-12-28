import java.util.*;
class student {
    Scanner sc = new Scanner(System.in);
    float m1, m2, m3, m4, sum;
    float average;

    void inputMarks() {
        System.out.println("Enter the marks of first subject :");
        m1 = sc.nextFloat();

        System.out.println("Enter the marks of second subject :");
        m2 = sc.nextFloat();

        System.out.println("Enter the marks of third subject :");
        m3 = sc.nextFloat();

        System.out.println("Enter the marks of fourth subject :");
        m4 = sc.nextFloat();
    }

    void sum() {
        sum = m1 + m2 + m3 + m4;
        average = sum / 4;
    }

    void display()
    {
        System.out.println("Sum of marks obtained :" + sum);
        System.out.println("Average :" + average+" %");
    }

    void grade()
    {
        if(average>=90.0)
        {
            System.out.println("A+ Grade");
        }
        else if(average>=80.0 && average<=90.0)
        {
            System.out.println("A Grade");
        }
        else if(average>=70.0 && average<=80.0)
        {
            System.out.println("B+ Grade");
        }
        else if(average>=60.0 && average<=70.0)
        {
            System.out.println("B Grade");
        }
        else if(average>=50.0 && average<=60.0)
        {
            System.out.println("C+ Grade");
        }
        else if(average>=40.0 && average<=50.0)
        {
            System.out.println("C Grade");
        }
        else
        {
            System.out.println("FAIL!!");
        }
    }
}
    public class one
    {
        public static void main(String[] args)
        {
            student s=new student();
            s.inputMarks();
            System.out.println("");
            s.sum();
            s.display();
            s.grade();
        }
    }