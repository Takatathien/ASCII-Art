// Thien Trinh, CSE 142, Winter 2016, Section EB
// Programing Homework #2, 01/13/2016
//
// This program will print out the following Ascii Art. 
/*
                        
         //\\
        //**\\
       //****\\
      //******\\
     //********\\
    //**********\\  
 __//            \\__
/___\            /___\
    \\_========_//  
      \\_====_//
        \\__//                          

*/
public class AsciiArt {
   public static void main(String[] args) {
      upperTriangle();
      upperMiddle();
      lowerMiddle();
      lowerTriangle();
   }
   
   /*
     
         //\\
        //**\\
       //****\\
      //******\\
     //********\\
    //**********\\
   
   */
   public static void upperTriangle() {
      for (int line = 1; line <= 6; line++) {
         for (int space = 1; space <= -1 * line + 10; space++) {
            System.out.print(" ");
         }
         System.out.print("//");
         for (int star = 1; star <= 2 * line - 2; star++) {
            System.out.print("*");
         } 
         System.out.println("\\\\");
      }
   }
   
   /*
   
 __//            \\__
                       
   */
   public static void upperMiddle() {
      System.out.print(" __//");
      for (int space = 1; space <= 12; space++) {
         System.out.print(" ");
      } 
      System.out.println("\\\\__");      
   }
   
   /*
   
/___\            /___\
              
   */   
   public static void lowerMiddle() {
      System.out.print("/___\\");
      for (int space = 1; space <= 12; space++) {
         System.out.print(" ");
      }
      System.out.println("/___\\");
   }
   
   /*
   
    \\_========_//  
      \\_====_//
        \\__//     
                             
   */   
   public static void lowerTriangle() {
      for (int line = 1; line <= 3; line++) {
         for (int space = 1; space <= 2 * line + 2; space++) {
            System.out.print(" ");
         }
         System.out.print("\\\\_");
         for (int equal = 1; equal <= -4 * line + 12; equal++) {
            System.out.print("=");
         }
         System.out.println("_//");
      }
   } 
}