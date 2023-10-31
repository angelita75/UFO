/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jparraylab16;
import java.util.*;

/**
 *
 * @author Angelta
 */
public class JPArrayLab16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int[] myarr = new int[5];
        int i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 5 values in a array: ");
        for(i=0; i<5; i++)
        {
            System.out.print("Enter value: ");
            myarr[i] = s.nextInt();
        }
        System.out.println("Array elements are: ");
        for(i=0; i<5; i++)
        {
            System.out.println("myarr["+i+"]="+myarr[i]);
      } */
      /* Scanner scanner = new Scanner(System.in);
       int[] array = new int[10];
      int sum = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<10; i++)
      {
    	  array[i] = scanner.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);*/

      
       Scanner sc=new Scanner(System.in);
        
        int n;    //Declare size of an array
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();    //Intialize the array size
        
        int arr[]=new int[n];   //Declare an array
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
       
 
        {
            arr[i]=sc.nextInt();    //Initialize the array elements
        }
        //Print the even elements
        System.out.println("The Even Elements are...");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)   //Check whether even or not
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
        
      