//a classe Euro se estende da classe mãe Moeda, herda tudo que Moeda tem.
public class Dolar extends Moeda{

   public Dolar(double valor){
      super(valor);
      //chama a da classe mãe (Moeda) e passa o valor para ela configurar.
   }
   
   public void info(){
      System.out.println("Dolar - " + valor);
      //imprime o valor em dólar
   }
   
   public double converterParaReal(){
      // utilizei a média do ano de 2025 referente ao dólar
      return valor * 5.40;
   }
}
