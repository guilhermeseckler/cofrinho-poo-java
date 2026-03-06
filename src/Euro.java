//a classe Euro se estende da classe mãe Moeda, herda tudo que Moeda tem.
public class Euro extends Moeda {

   public Euro(double valor){
      super(valor);
      //chama a da classe mãe (Moeda) e passa o valor para ela configurar.
   }
   
   public void info(){
      System.out.println("Euro - " + valor);
      //imprime o valor em euros
   }

   public double converterParaReal(){
      // utilizei a média do ano de 2025 referente ao dólar
      return valor * 6.17;
   }
}
