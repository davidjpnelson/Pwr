public class Pwr {

  public static void main(String[] args) {
    DemoPwr x = new DemoPwr(4.0, 2);
    DemoPwr y = new DemoPwr(2.5, 1);
    DemoPwr z = new DemoPwr(5.7, 0);

    System.out.println(x.b + " raised to the " + x.e + " power is " + x.get_pwr());
    System.out.println(y.b + " raised to the " + y.e + " power is " + y.get_pwr());
    System.out.println(z.b + " raised to the " + z.e + " power is " + z.get_pwr());

  }
}

class DemoPwr {
  double b;
  int e;
  double val;

  DemoPwr(double b, int e) {
    this.b = b;
    this.e = e;

    val = 1;
    if (e==0) return;
    for (; e>0; e--) val = val * b;
  }
  double get_pwr() {
    return val;
  }

}
