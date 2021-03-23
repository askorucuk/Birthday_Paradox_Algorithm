
import java.util.Random;

public class experiment {
    
   
    public static void experımentone(){
            int[] people = {2,3,5,10,20};
            String[] weekdays = {"PAZARTESİ","SALI","ÇARŞAMBA","PERŞEMBE","CUMA","CUMARTESİ","PAZAR"};
            Random r1 = new Random();
            String first;
            String second;
             first = weekdays[r1.nextInt(7)];
             second = weekdays[r1.nextInt(7)];
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
          for (int i = 0; i < 5; i++) {
            if (i == 0) {
                for (int j = 0; j < 2 ; j++) {
                    if (first==second) {
                        n1 ++;
                    }
                }
                   System.out.println(n1);
                System.out.println("***************************");
            }
            else if (i == 1) {
                for (int j = 0; j < 3 ; j++) {
                    if (first==second) {
                      n2++;
                    }
                }
                                        System.out.println(n2);
                System.out.println("***************************");

            }
            else if (i == 2) {
                for (int j = 0; j < 5 ; j++) {
                    if (first==second) {
                      n3++;
                       
                    }
                }
                 System.out.println(n3);            
                System.out.println("***************************");

            }
            else if (i == 3) {
                for (int j = 0; j < 10 ; j++) {
                    if (first==second) {
                    n4++;
                        
                    }
                }
                  System.out.println(n4);          
                System.out.println("***************************");

            }
            else if (i == 4) {
                for (int j = 0; j < 20 ; j++) {
                    if (first==second) {
                    n5++;
                        
                    }
                }
                System.out.println(n5);            
                System.out.println("***************************");

            }
        
        
        }
    
    
   
    
        
    
    
    
    
    
    }
    
    
    
    public static void main(String[] args) {
        experımentone();
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
