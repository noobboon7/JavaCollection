public class CMYKtoRGB {
  public static void main(String[] args) {
    double c, m, y, k;
    c = Double.parseDouble(args[0]);
    m = Double.parseDouble(args[1]);
    y = Double.parseDouble(args[2]);
    k = Double.parseDouble(args[3]);
    
    double white = (1 - k);
    int red = (int)Math.round((255 * white * (1-c)));
    int blue = (int)Math.round((255 * white * (1-y)));
    int green = (int)Math.round((255 * white * (1-m)));

    System.out.println("red = " + red);
    System.out.println("green = "+ green);
    System.out.println("blue = " + blue);
  }
}