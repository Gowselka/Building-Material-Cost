
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gowse
 */
public class buildingMat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       //variables for width, height, cost per sq foot
       Scanner in = new Scanner(System.in);
       double width = 0;
       double height = 0;
       double costSqFoot = 0; 
       double totalArea = 0;
       double totalCost = 0;
       String trash = "";
        
       //prompt the user for input1
       System.out.println("Total Cost Calculator. "); 
       System.out.print("Please enter the width of your material in feet: ");
       //bulletproof
       if(in.hasNextDouble())
            {
                    //ok to read the double value 
                width = in.nextDouble();
                in.nextLine();
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please input a valid measurement. ");
                System.exit(0);
            } 
       //prompt the user for input2
       System.out.print("Please enter the height of your material in feet: ");
       //bulletproof
        if(in.hasNextDouble())
            {
                    //ok to read the double value 
                height = in.nextDouble();
                in.nextLine();
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please input a valid measurement. ");
                System.exit(0);
            }
       //prompt the user for input3
        System.out.print("Please enter the cost per square foot of your material: ");
       //bulletproof
        if(in.hasNextDouble())
            {
                    //ok to read the double value 
                costSqFoot = in.nextDouble();
                in.nextLine();
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please input a valid measurement. ");
                System.exit(0);
            }
       //calculate total area 
       totalArea = width * height;
        
       //calculate total cost 
       totalCost = totalArea * costSqFoot;
       
       //output results 
        System.out.println("Your total area for construction is: " + totalArea);
        System.out.println("Your total cost for building material per square foot is: " + totalCost);


    }
    
}
