public class RightTriangle {

  public static void main(String[] args) {
    int a, b, c;
    a = Integer.parseInt(args[0]);
    b = Integer.parseInt(args[1]);
    c = Integer.parseInt(args[2]);
    if(a == 0 || b == 0 || c == 0)  System.out.println(false);
    if(a < 0 || b < 0 || c < 0)  System.out.println(false);
    else{
      boolean isRightLen = ( (Math.pow(a,2) ) + (Math.pow(b,2))) == Math.pow(c,2);
      System.out.println(isRightLen);
    }
  }
}