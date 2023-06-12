/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jhtpch7;

/**
 *
 * @author miltonbennett
 */
public class SalesCommissionsNew {

public static void main(String[] args)
   {
      // array of Sales Persons amounts
     int[] salesAmount = { 450, 250, 566, 200, 890, 287, 850, 391, 687 };
 
//     outputSales(salesAmount);

//     System.out.printf("The grades are:%n%n");
    
    // output each salesPerson amount 
/*    for (int salesPerson = 0; salesPerson < salesAmount.length; salesPerson++)
       System.out.printf("SalesPerson %2d: %3d%n",
          salesPerson + 1, salesAmount[salesPerson]);
*/   

      int[] frequency = new int[10];
         for (int sales : salesAmount)
       { ++frequency[sales/100];
   //      System.out.printf("%3d%n",frequency[sales/100]);
       }
  
  // for( int i = 0; i < frequency.length; i++)
  //   frequency[i] = 0; 

    System.out.printf("Range   Frequency"); 
    System.out.println();

for (int sales = 0; sales < frequency.length; sales++)
     System.out.printf("%02d-%02d: %3d%n", 
             sales * 100, sales * 100 + 99, frequency[sales]); 
     System.out.println();
     System.out.println();

    // for each sales range frequency, print bar in chart
    for (int count = 0; count < frequency.length; count++)
    {
        // output bar label ("00-09: ", ..., "90-99: ", "100: ")
       if (count == 10)
          System.out.printf("%5d: ", 100);
       else
          System.out.printf("%02d-%02d: ",
             count * 100, count * 100 + 99);

       // print bar of asterisks
       for (int stars = 0; stars < frequency[count]; stars++)
           System.out.print("*");

       System.out.println();
    }
   }
   
}
