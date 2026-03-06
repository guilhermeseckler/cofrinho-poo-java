
import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> lista = new ArrayList<>();
        // cria uma lista dinâmica que vai guardar objetos do tipo Moeda
    
    public void adicionar(Moeda m){
        // método público para adicionar uma moeda no cofrinho, recebe objeto moeda (real, dolar ou euro)
        lista.add(m);
    }

    public void remover(Moeda m){
    // um loop for pra percorrer a lista, iterando 1 a 1
    for (int i = 0; i < lista.size(); i++){

        // pega a moeda atual da lista
        Moeda atual = lista.get(i);

        // verifica se é o mesmo tipo (Real, Dolar ou Euro)
        // e se o valor é igual ao que tem que ser removido
        if(atual.getClass() == m.getClass()){

            // subtrai o valor informado da moeda atual
            atual.valor -= m.valor;

            // se após a subtração o valor ficar zerado ou negativo
            // a moeda é removida do cofrinho
            if(atual.valor <= 0){
                lista.remove(i);
            }
        }
    } 
}
    public void listagemMoedas(){
        // se o tamanho do array for igual a 0, retorna que não há nenhuma moeda
        if(lista.size() == 0){
            System.out.println("Nenhuma moeda aqui ainda :( ");
            return; //encerra por aqui
        }
        // se há alguma, percorre cada objeto Moeda dentro da lista
        else 
            System.out.println("=== Moedas no cofrinho ===");
             for(Moeda mo : lista){
             mo.info();
            // chama o método info() do objeto atual.
            // polimorfismo: mo.info() dependendo do objeto (Real, Dólar ou Euro) vai chamar o .info respectivo (que é o valor em reais convertido para moeda)
        }
    }

    // método que retorna o valor total convertido em reais
    public double totalConvertido(){
        //onde será armazenado a soma
        double total = 0;
    
        for(Moeda m : lista){
            // percorre cada moeda da lista e chama m.converterParaReal que cada classe filha converte com sua taxa e adiciona ao valor total, que é retornado em reais
            total += m.converterParaReal();
        }
        return total;
    }
}
