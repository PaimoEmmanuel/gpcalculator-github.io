/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp.calculator;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class GPCalculator {

    /**
     * @param args the command line arguments
     */
    static int gradePlus = 1;
    static double GP = 1;
    static double totalGP = 0;
    static double totalUnits = 0;
    static double GPA = 1;

    public static void main(String[] args) {
        // The grade inputed by the user
        String grade;
        // The course units
        double units;
         // Created for good UI in increasing the number courses
        String flowControl;
        // The value of the grade
        double gradeValue;

        System.out.println("Enter grade of Course " + gradePlus + " =");
        Scanner A = new Scanner(System.in);
        grade = A.next();
        System.out.println("Course unit = ");
        Scanner C = new Scanner(System.in);
        units = C.nextDouble();
        totalUnits = units;
        gradeValue = gradeNumber.gradeNumberMethod(grade);
        GP = gradeValue * units;
        totalGP = GP;
        System.out.println("More courses?, enter 'MORE'. if not, enter 'FINISH'");
        Scanner B = new Scanner(System.in);
        flowControl = B.next();
        flowControlMethod(flowControl, units);
        GPA = totalGP / totalUnits;
        System.out.println("Your semester GPA is " + GPA + ".");

    }

    public static void flowControlMethod(String flowControl, double units) {
        while (flowControl.equalsIgnoreCase("MORE")) {
            gradePlus = gradePlus + 1;
            System.out.println("Enter grade of Course " + (gradePlus));
            Scanner A = new Scanner(System.in);
            flowControl = A.next();
            System.out.println("Enter course units ");
            Scanner B = new Scanner(System.in);
            units = B.nextDouble();
            totalUnits = totalUnits + units;
            double gradeValue;
            // The grade point

            gradeValue = gradeNumber.gradeNumberMethod(flowControl);
            GP = gradeValue * units;
            totalGP = totalGP + GP;
            System.out.println("More courses?, enter 'MORE'. If not, enter 'FINISH'");
            flowControl = A.next();
        }
        
      
         }
    
}