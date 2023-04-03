package calculate;

import java.util.Scanner;

/* Rewrite the student mark sheet programme (From java-homework-week3
        programmes) using if else and while loop. */
public class Programme__3_Marksheet {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter student Name");
        String Name = s1.next();
        System.out.println("Enter student roll No");
        int rollno = s1.nextInt();
        System.out.println("Enter Maths Marks");
        double Marks1 = s1.nextDouble();
        System.out.println("Enter Science Marks");
        double Marks2 = s1.nextDouble();
        System.out.println("Enter  English Marks");
        double Marks3 = s1.nextDouble();
        s1.close();

        double total = Marks1 + Marks2 + Marks3;
        System.out.println("Total marks is: " + total);
        double percentage = (total * 100) / 300;
        System.out.println(" percentage is:" + percentage);


        if (percentage >= 35) {

            System.out.println("Pass");
        } else if (percentage >= 80) {
            System.out.println("Grade A+");
        } else if (percentage >= 60) {
            System.out.println("Grade A");
        } else if (percentage >= 50) {
            System.out.println("Grade B");
        } else if (percentage >= 35) {
            System.out.println("Grade C  ");
            //System.out.println("Fail");//
        } else

            System.out.println("fail");
    }

}


