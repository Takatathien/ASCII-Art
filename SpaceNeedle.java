// Thien Trinh, CSE 142, Winter 2016, Section EB
// Programing Homework #2, 01/13/2016
//
// This program will print out the following Ascii Art that can be scale by adjusting the constant SIZE. 
/*
This is a sample with SIZE 4

            ||
            ||
            ||
            ||
         __/||\__
      __/:::||:::\__
   __/::::::||::::::\__
__/:::::::::||:::::::::\__
|""""""""""""""""""""""""|
\_/\/\/\/\/\/\/\/\/\/\/\_/
  \_/\/\/\/\/\/\/\/\/\_/
    \_/\/\/\/\/\/\/\_/
      \_/\/\/\/\/\_/
            ||
            ||
            ||
            ||
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         __/||\__
      __/:::||:::\__
   __/::::::||::::::\__
__/:::::::::||:::::::::\__
|""""""""""""""""""""""""|

*/

public class SpaceNeedle {
public static final int SIZE = 4;
   public static void main(String[] args) {
      needleSmallColumn();
      needleTriangleTop();
      needleTriangleMiddle();
      needleTriangleBottom();
      needleSmallColumn();
      needleBigColumn();
      needleTriangleTop();
      needleTriangleMiddle();
   }
   
   /*

            ||
            ||
            ||
            ||
               
   */   
   public static void needleSmallColumn() {
      for (int line = 1; line <= SIZE; line++) {
         for (int space = 1; space <= SIZE * 3; space++) {
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   
   /*
   
         __/||\__
      __/:::||:::\__
   __/::::::||::::::\__
__/:::::::::||:::::::::\__
 
   */
   public static void needleTriangleTop() {
      for (int line = 1; line <= SIZE; line++) {
         for (int space = 1; space <= -3 * line + (SIZE * 3); space++) {
            System.out.print(" ");
         }
         System.out.print("__/");
         for (int colon = 1; colon <= 3 * line - 3; colon++) {
            System.out.print(":");
         }
         System.out.print("||");
         for (int colon = 1; colon <= 3 * line - 3; colon++) {
            System.out.print(":");
         }
         System.out.println("\\__");
      }
   }
   
   /*
   
|""""""""""""""""""""""""|

   */
   public static void needleTriangleMiddle() {
      System.out.print("|");
      for (int quote = 1; quote <= SIZE * 6; quote++) {
         System.out.print("\"");
      }
      System.out.println("|");
   }
   
   /*
   
\_/\/\/\/\/\/\/\/\/\/\/\_/
  \_/\/\/\/\/\/\/\/\/\_/
    \_/\/\/\/\/\/\/\_/
      \_/\/\/\/\/\_/
      
   
   */ 
   public static void needleTriangleBottom() {
      for (int line = 1; line <= SIZE; line++) {
         for (int space = 1; space <= 2 * line - 2; space++) {
            System.out.print(" ");
         }
         System.out.print("\\_");
         for (int slash = 1; slash <= -2 * line + (SIZE * 3 + 1); slash++) {
            System.out.print("/\\");
         }
         System.out.println("_/");
      }
   }
   
   /*
   
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|

   */
   public static void needleBigColumn() {
      for (int line = 1; line <= SIZE * SIZE; line++) {
         for (int space = 1; space <= 2 * SIZE + 1; space++) {
            System.out.print(" ");
         }
         System.out.print("|");
         for (int percent = 1; percent <= SIZE - 2; percent++) {
            System.out.print("%");
         }
         System.out.print("||");
         for (int percent = 1; percent <= SIZE - 2; percent++) {
            System.out.print("%");
         }     
         System.out.println("|");    
      }
   }
}