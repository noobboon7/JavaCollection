public class RandomWalker {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    int x = 0, y = 0;
    int steps = 0;
    System.out.println("(" + x + ", " + y + ")");

    while (Math.abs(x) < n && Math.abs(y) < n) {
      double r = Math.random();
      if (r < 0.25)
        x--;
      else if (r < 0.50)
        x++;
      else if (r < 0.75)
        y--;
      else if (r < 1.00)
        y++;
      steps++;
      System.out.println("(" + x + ", " + y + ")");
    }
    System.out.println("steps = " + steps);
  }
}