public class GreatCircle {
 public static void main(String[] args) {
  double a,b,c,d;
  a = Double.parseDouble(args[0]);
  b = Double.parseDouble(args[1]);
  c = Double.parseDouble(args[2]);
  d = Double.parseDouble(args[3]);
  // distance between latitudes and longitudes
  double dLat = Math.toRadians(c - a);
  double dLon = Math.toRadians(d - b);

  // convert to radians
  a = Math.toRadians(a);
  c = Math.toRadians(c);

  // apply formulae
  double comp = Math.pow(Math.sin(dLat / 2), 2) + Math.pow(Math.sin(dLon / 2), 2) * Math.cos(a) * Math.cos(c);
  double rad = 6371.0;
  double ci = 2 * Math.asin(Math.sqrt());
  double path = rad * ci;
  
  System.out.println(path + " kilometers");
 } 
}