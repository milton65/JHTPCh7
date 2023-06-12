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
public class SalesCommissions 
{

// main method begins program execution
   public static void main(String[] args)
   {
      // array of Sales Persons amounts
     int[] salesAmount = { 450, 350, 566, 1000, 890, 787, 850, 391, 687 };
 
     outputSales(salesAmount);
   }

   // output the contents of the salesAmount array
   public static void outputSales(int[] salesAmount)
   {
     // int[] frequency = 0 ;
      int[] frequency = new int[9];

//      for (int salesPerson : salesAmount)
//         ++frequency[salesPerson / 9];
//         System.out.println(frequency[sale / 9]);


      System.out.printf("The sales amounts are:%n%n");
      System.out.println("Sales Person" + "  Sales Amount($)" + " Salary Ranges($)"
                         + "  Frequency");
        
 
        
            // output each Sales Person salary
      for (int salesPerson = 0; salesPerson < salesAmount.length; salesPerson++)
      {   
           
         if (salesAmount[salesPerson] >= 200 && salesAmount[salesPerson] < 300)
                 frequency[salesPerson] = frequency[salesPerson] + 1;
         else if ( salesAmount[salesPerson] >=300 && salesAmount[salesPerson]<400) 
                 frequency[salesPerson] = frequency[salesPerson] + 1;
         else if ( salesAmount[salesPerson] >=400 && salesAmount[salesPerson]<500) 
                 frequency[salesPerson] = frequency[salesPerson] + 1;
         else if ( salesAmount[salesPerson] >=500 && salesAmount[salesPerson]<600) 
                 frequency[salesPerson] = frequency[salesPerson] + 1;
         else if ( salesAmount[salesPerson] >=600 && salesAmount[salesPerson]<700) 
                 frequency[salesPerson] = frequency[salesPerson] + 1;
         else if ( salesAmount[salesPerson] >=700 && salesAmount[salesPerson]<800) 
                 frequency[salesPerson] = frequency[salesPerson] + 1;
         else if ( salesAmount[salesPerson] >=800 && salesAmount[salesPerson]<900) 
                 frequency[salesPerson] = frequency[salesPerson] + 1;
         else if ( salesAmount[salesPerson] >=900 && salesAmount[salesPerson]<1000) 
                 frequency[salesPerson] = frequency[salesPerson] + 1;
         else if ( salesAmount[salesPerson] ==1000) 
                 frequency[salesPerson] = frequency[salesPerson] + 1;
      //      ++frequency[salesPerson];

            System.out.printf("%6d   %13d     %8d-%3d %13d%n",
            salesPerson + 1, salesAmount[salesPerson],
              200 + salesPerson * 100, 200 + salesPerson * 100 + 99,
              frequency[salesPerson]);
           //         salesAmount[salesPerson] + 0.09 * 5000);
               

//            if (salesAmount[salesPerson] >= 800 && salesAmount[salesPerson] < 900)
//            {frequency[salesPerson] = frequency[salesPerson] + 1;//
//                System.out.printf("%n%2d", frequency[salesPerson]);
     }
   }
}
   

