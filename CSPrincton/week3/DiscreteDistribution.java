public class DiscreteDistribution {

  public static void main(String[] args) {
    int len = args.length;
    int[] freq = new int[len];

    for (int i = 1; i < len; i++) {
      freq[i] = Integer.parseInt(args[i]);
    }
    System.out.println(freq);
  }
  
}