public class reversenumber {

  public static void main(String[] args) {

    int num = 1234;

    while (num > 0) {

      System.out.print(num % 10);
      num = num / 10;

    }

  }

}
