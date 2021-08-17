/*The code below is a sample math of Profit/Loss. There will be input taken from user according to math, some of the basic 

operation of java will be covered here*/

//  The information can get from this program :
//
//  --- Needed selling price for certain amount of profit and loss in percentage
//  --- Any Discount rate or not 
//  --- Amount of profit/loss

import java.lang.Math;                                       // For absolute method
import java.util.Scanner;                                    // For scanning method

class exmaple1 {                                             // Creating class emaple1 
  public static void main(String[] args) {
    
    System.out.println("Hello here ");
    
    Scanner byprc = new Scanner(System.in);                  // Create a Scanner object
    System.out.println("Enter Buying Price ");
    float bynprc = byprc.nextFloat();                        // Read user input
    
    float selprc=0;                                          // Assingning float variable                      
    
    Scanner in_de = new Scanner(System.in); 
    System.out.println("Enter Expenfect Profit or Loss  : Press P/L ");
    char in_desng = in_de.next().charAt(0);                  // reading char from user 
     
    
    if ( in_desng == 'P'){                                   // Conditional branching
      Scanner inprc = new Scanner(System.in);
      System.out.println("Enter Increased Price in percentage ");
      float ingprc = inprc.nextFloat(); 
      float increasingPrc = 100.0f + ingprc;
      System.out.println("Total Increasing Price is: " + increasingPrc+"%"); 
      
      Scanner dscnt = new Scanner(System.in);
      System.out.println("Enter Discount Price in percentage ");
      float discnt = dscnt.nextFloat(); 
      float fselprc = (bynprc*(increasingPrc/100.0f));       // Formula;--int k = (int)(value*(percentage/100.0f));
      selprc = fselprc-discnt;
      System.out.println( "Selling Price is: " + selprc);
     
      
    }
    
    else if (in_desng == 'L') {
      Scanner deprc = new Scanner(System.in);
      System.out.println("Enter Decreased Price in percentage ");
      float degprc = deprc.nextFloat(); 
      float decreasingPrc = 100.0f - degprc ;
      System.out.println("Total Decreasing Price is: " + decreasingPrc+"%"); 
      
      float fselprc = (bynprc*(decreasingPrc/100.0f));
      System.out.println("No DISCOUNT !! ");
      selprc = fselprc;
      System.out.println( "Selling Price is: " + selprc);
      
      }
    
    float profit_loss =  selprc -bynprc ;
    if (profit_loss > 0){
      System.out.println( "Profit is: " + profit_loss);
    }
    else if (profit_loss < 0) {
      float loss = bynprc-selprc;
      System.out.println("Loss is: " + Math.abs(loss)); 
    }
  
}
  
    
       
  }


