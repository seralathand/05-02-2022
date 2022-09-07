package ZohoGraduationSchool;
import java.util.Scanner;
public class DemoNestedIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student mark: ");
        int mark=sc.nextInt();

        if(mark<=100){
            if(mark>90 && mark<=100)
                System.out.println("The student grade is: S");
            else if(mark>80 && mark<=90)
                System.out.println("The student grade is: A");
            else if(mark>70 && mark<=80)
                System.out.println("The student grade is: B");
            else if(mark >60 && mark<=70)
                System.out.println("The student grade is: C");
            else if(mark >50 && mark<=60)
                System.out.println("The student grade is: E");
            else
                System.out.println("The student grade is: U");
        }
        else
            System.out.println("Please enter the mark from 1 to 100");

    }
}
