import java.util.Locale;

public class PrecoProdutos {
   public static void main(String[] args){
      
      String produto1 = "Computador";
      String produto2 = "Mesa de Escritório";

      int idade = 30;
      int code = 5290;
      char gender = 'F';

      double preco1 = 2100.0;
      double preco2 = 650.50;
      double measure = 53.234567;

      System.out.println("Products:");
      System.out.println(produto1 + ", seu preço é " + preco1);
      System.out.println(produto2 + ", seu preço é " + preco2);
      System.out.printf("Record: %d years old, code %d and gender: %s %n", idade, code, gender);

      System.out.println("Measure with eight decimal places: " + measure);
      System.out.printf("Rouded (three decimal places): %.3f%n", measure);
      Locale.setDefault(Locale.US);
      System.out.printf("US decimal point: %.3f%n", measure);

   }
}       