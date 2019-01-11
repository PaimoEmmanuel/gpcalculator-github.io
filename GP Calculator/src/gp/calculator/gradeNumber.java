/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp.calculator;


/**
 *
 * @author HP
 */
public class gradeNumber {
    
    static int gradeNumberInt;
    public static int gradeNumberMethod(String grade){
         if (grade.equalsIgnoreCase("a")){
        gradeNumberInt = 5;
    }
        else if (grade.equalsIgnoreCase("b")){
        gradeNumberInt = 4;
    }
         else if (grade.equalsIgnoreCase("c")){
        gradeNumberInt = 3;
    }
         else if (grade.equalsIgnoreCase("d")){
        gradeNumberInt = 2;
    }
         else if (grade.equalsIgnoreCase("e")){
        gradeNumberInt = 1;
    }
         else if (grade.equalsIgnoreCase("f")){
        gradeNumberInt = 0;
    }
         return gradeNumberInt;
    }
    

}
