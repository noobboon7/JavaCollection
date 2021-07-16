import java.util.*;

import javax.swing.plaf.synth.Region;

class Permutation {
  static Set<String> hashSet = new HashSet<String>();
  static int len;
/* Given a Integer, find all possible arrangements of the given integer that length is no greater than 3 . */
  public static void main(String[] args) {
      permute("1912648");
      // prints all the elements of the hash set in a new line using an iterative forEach loop.
      // hashSet.forEach((n) -> System.out.println(n));
      //=======================================================
      // print out the entire hashSet
      System.out.println(hashSet); 
      //=======================================================
      System.out.println("size of hashSet is:" + hashSet.size());
      String maxNum = Collections.max(hashSet);
      System.out.println(maxNum+","+ hashSet.size());
  }

  public static void permute(String str) {
    if(str.length() == 0 || str == null){
      System.out.println("Provide an input that is more than 0 character long");
      return;  
    }

    len = Math.abs(3 - str.length());
    permute("", str);
  }

  private static void permute(String prefix, String remaining){
    if(remaining.length() == len){
      //#region--prints out the permutation
      /* System.out.println("\nEnd Of Recursion:");
      System.out.println(prefix); // store this value in an array  */
      //#endregion
      hashSet.add(prefix);
      return;
    }
    
    for(int i = 0; i < remaining.length(); i++){
      //#region-- print whats being sent to the recursive call 
      /* System.out.println("\nTo be sent to the recursive call");
      System.out.println("\n0 to i: ");
      System.out.println(remaining.substring(0, i));
      System.out.println("=========================================");
      System.out.print("\ni+1: ");
      System.out.println(remaining.substring(i+1, remaining.length()));
      System.out.println("========================================="); */
      //#endregion

      permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i+1, remaining.length()));
    }
  }
}