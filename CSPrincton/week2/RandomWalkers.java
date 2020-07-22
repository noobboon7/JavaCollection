public class RandomWalkers {
  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]); 
    int trials = Integer.parseInt(args[1]);

    int x = 0;
    int y = 0;

    int randomDirection;
    int steps = 0;

    for (int i = 0; i < trials; i++) {
      x = 0; 
      y = 0;

      while ((Math.abs(x) + Math.abs(y)) < r) {
        randomDirection = (int) (Math.random() * (3 - 0 + 1) + 0);

        switch (randomDirection) {
          case 0: 
            y += 1;
            break;
          case 1: 
            y -= 1;
            break;
          case 2: 
            x += 1;
            break;
          case 3: 
            x -= 1;
            break;
        }
        steps++;
      }
    }

    System.out.println("Average number of steps = " + ((double) steps / trials));
  }
}