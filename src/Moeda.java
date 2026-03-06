
// classe mae abstrata das moedas
public abstract class Moeda {

   // valor da moeda
   double valor;

   public Moeda(double valor){
      // construtor simples, recebe um valor e armazena
      this.valor = valor;
      // this.valor é o atributo da classe e valor é o que foi recebido
   }

   // cada tipo de moeda mostra info de um jeito (Real, Dólar ou Euro)
   public abstract void info();

   // cada moeda converte para real de acordo com a sua taxa fixa
   public abstract double converterParaReal();
}
