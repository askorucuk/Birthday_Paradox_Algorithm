import java.awt.AWTEventMulticaster;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class table {
    
    
    
     public static void cakısma(){
         
         /**for(int j = 0; j < 15 ; j++) {             
             Random r1 = new Random();
             String first;
             String second;
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
             for (int p = 1; p < 6 ; p++) {
              switch(p){
               case 1:
                   for (int i = 0; i < 2; i++) {
                   first = weekdays[r1.nextInt(7)];
                   second = weekdays[r1.nextInt(7)];
                     if(first == second){
                        n1++;
                     } }
                   System.out.println(n1);
                   System.out.println("**************************************");
               break;              
               case 2:
                   for (int i = 0; i < 3; i++) {
                   first = weekdays[r1.nextInt(7)];
                   second = weekdays[r1.nextInt(7)];
                     if(first == second){
                        n2++;
                     } }
                   System.out.println(n2);
                   System.out.println("**************************************");
               break;
               case 3:
                   for (int i = 0; i < 5; i++) {
                   first = weekdays[r1.nextInt(7)];
                   second = weekdays[r1.nextInt(7)];
                     if(first == second){
                       n3++;
                     } }
                   System.out.println(n3);
                   System.out.println("**************************************");
                break;
               case 4:
                   for (int i = 0; i < 10; i++) {
                   first = weekdays[r1.nextInt(7)];
                   second = weekdays[r1.nextInt(7)];
                     if(first == second){
                     n4++;
                     } }
                   System.out.println(n4);
                   System.out.println("**************************************");
                 break;
               case 5:
                   for (int i = 0; i < 20; i++) {
                   first = weekdays[r1.nextInt(7)];
                   second = weekdays[r1.nextInt(7)];
                     if(first == second){
                     n5++;
                     } }
                   System.out.println(n5);
                   System.out.println("**************************************");
                   break;
              }
             }
              
             
             
             
             
             
         }**/
         
         String[] weekdays = {"PAZARTESİ","SALI","ÇARŞAMBA","PERŞEMBE","CUMA","CUMARTESİ","PAZAR"};
         Random r1 = new Random();
         int n1 = 0;
         int n2 = 0;
         int n3 = 0;
         int n4 = 0;
         int n5 = 0;
         int[] twopeople = new int[2];
         for (int i = 0; i < 2; i++) {
             twopeople[i] = r1.nextInt(7);
         }
          if(twopeople[0]==twopeople[1]){
              n1++;
             }System.out.println(n1);
         
        
        
        int[] threepeople = new int[3];
          for (int i = 0; i < 3; i++) {
             threepeople[i] = r1.nextInt(7);
              for (int j = 1; j < 3; j++) {
               threepeople[j] = r1.nextInt(7);
              }
         }
          if(twopeople[0]==twopeople[1]){
              n2++;
             }System.out.println(n2);
        
             
             
        int[] fivepeople = new int[5];
          for (int i = 0; i < 5; i++) {
             fivepeople[i] = r1.nextInt(7);
         }
          if(twopeople[0]==twopeople[1]){
              n3++;
             }System.out.println(n3);
        
             
         int[] tenpeople = new int[10];
          for (int i = 0; i < 10; i++) {
             tenpeople[i] = r1.nextInt(7);
         }
          if(twopeople[0]==twopeople[1]){
              n4++;
             }System.out.println(n4);
 
             
         int[] twentypeople = new int[20];
          for (int i = 0; i < 20; i++) {
             twentypeople[i] = r1.nextInt(7);
         }
          if(twopeople[0]==twopeople[1]){
              n5++;
             }System.out.println(n5);
         for (int i = 0; i < 15; i++) {
            
             
             
             
             
             
         }

       
             
             
             
             
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
                 
         
         
         
                     
        
     
    
    
    
    public static void main(String[] args) {
     ArrayList<Integer> experiment = new ArrayList<>();   
      Random r1 = new Random();
         int n1 = 0;
         int n2 = 0;
         int n3 = 0;
         int n4 = 0;
         int n5 = 0;
         int[] twopeople = new int[2];
         for (int i = 0; i < 2; i++) {
             twopeople[i] = r1.nextInt(7);
        
         }
               if(twopeople[0]==twopeople[1]){
              n1++;
             }
             System.out.println(n1);  
             
    
    
    
}    
}