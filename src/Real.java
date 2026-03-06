   //a classe Real se estende da classe mãe Moeda, herda tudo que Moeda tem.
public class Real extends Moeda{

   public Real(double v){
      super(v);
   }

   public void info(){
      // mostra na tela que é Real e o valor guardado
      System.out.println("Real - " + valor); 
   }

   public double converterParaReal(){
      //como ja é em real, não há necessidade de converter
      return valor; 
   }
}
