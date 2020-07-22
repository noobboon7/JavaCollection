public class BandMatrix {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]); 
    int width = Integer.parseInt(args[1]); 

    for (int row = 0; row < n; row++) { 
      for (int column = 0; column < n; column++) { 
        if (Math.abs(row - column) <= width) { 
          System.out.print("*"); // ...we print a * character...
        } else {
          System.out.print("0"); // ...otherwise a 0
        }

        // we add a whitespace after each character, except the last one
        if (column < n - 1) {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }
}