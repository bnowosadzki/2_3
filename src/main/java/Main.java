// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

  import java.util.Random;

  public class Main {
      public static void main(String[] args) {
          Random random = new Random();

          int sumaKwadratow = 0;

          for (int i = 0; i < 5; i++) {
              int liczbaLosowa = random.nextInt(100); 
              int kwadrat = liczbaLosowa * liczbaLosowa;
              sumaKwadratow += kwadrat;
              System.out.println( liczbaLosowa + " Kwadrat: " + kwadrat);
          }
          System.out.println("Suma kwadratów pięciu wylosowanych liczb: " + sumaKwadratow);
      }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
