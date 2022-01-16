import java.util.Scanner;
public class Testarray{  
public static void SingleMultiArrays(String args[]){  
int a[]=new int[5];//declaration and instantiation  
a[0]=2;//initialization  
a[1]=4;  
a[2]=6;  
a[3]=8;  
a[4]=10;  
//traversing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
//declaring and initializing 2D array  
int arr[][]={{100,200,300},{400,500,600},{700,800,900}};  
//printing 2D array  
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
   System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  

}}}
    