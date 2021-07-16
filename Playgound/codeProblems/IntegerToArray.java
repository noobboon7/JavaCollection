import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerToArray {
  
  public static void main(String[] args) {
    int[] arr = intToArray(123);
    String strArr = Arrays.toString(arr);
    System.out.println(strArr);

    ////////  with an ArrayList<Integer>/////////
    /* 
      int temp = 1233321;
      ArrayList<Integer> array = new ArrayList<Integer>();
      do{
          array.add(temp % 10);
          temp /= 10;
      } while  (temp > 0);

      System.out.println(array);
    */
  }

  public static int[] intToArray(int num) {
    String numString = Integer.toString(num);
    int[] numArr = new int[numString.length()];
    
    for (int i = 0; i < numString.length(); ++i) {
      numArr[i] = numString.charAt(i) - '0';
    }

    return numArr;
  }
}
