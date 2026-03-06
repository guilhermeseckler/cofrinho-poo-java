
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        // cria um scanner para ler as os inputs
        Scanner sc = new Scanner(System.in);
        // cria um objeto cofrinho, onde as moedas serão depositadas
        Cofrinho cof = new Cofrinho();
        
        int opcao = -1;
        // sem isso a opção começa no 0 e o loop do menu nem começa
        while(opcao != 0){
            // loop principal que mantém rodando enquanto a opção não for 0 (sair do cofrinho)
            // os sysout são auto-explicativos
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Total convertido em real");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
                
            // lê a opção supracitada escolhida pelo usuario
            opcao = sc.nextInt();
            // se a opção for 1 (adicionar moeda)
             if(opcao == 1){
                System.out.println("Qual moeda?");
                System.out.println("1-Real 2-Dolar 3-Euro");
                
                //o usuário escolhe o tipo da moeda
                int tipo = sc.nextInt();

                System.out.print("Valor: ");
                double val = sc.nextDouble();

                // cria uma moeda nula para depois definir o valor
                Moeda m=null;
                
                //dependendo do tipo da moeda escolhido, cria o objeto respectivo
                if(tipo==1) m=new Real(val);
                if(tipo==2) m=new Dolar(val);
                if(tipo==3) m=new Euro(val);
                
                //adiciona a moeda no cofrinho através do obj cof e retorna confirmação
                cof.adicionar(m);
                System.out.println("Moeda adicionada!");
                
                //se for opção 2 (remover moeda)        
            } else if(opcao == 2){
                System.out.println("Remover moeda:");
                System.out.println("1-Real 2-Dolar 3-Euro");
                int tipo = sc.nextInt();
                System.out.print("Valor: ");
                double val = sc.nextDouble();

                //mesmo processo anterior, cria moeda conforme o tipo escolhido
                Moeda m=null;
                if(tipo==1) m=new Real(val);
                if(tipo==2) m=new Dolar(val);
                if(tipo==3) m=new Euro(val);
                //remove a moeda no cofrinho atráves do obj e retorna a confirmação
                cof.remover(m);

                //se for opção 3(listar moedas)
            } else if(opcao == 3){
                //chama o método do cofrinho que é um loop for e através do polimorfismo cada moeda imprime a sua informação
                cof.listagemMoedas();
                
                // se for opção 4 (mostrar o total convertido em reais)
            } else if(opcao == 4){
                //aqui é executado a conversão especifica de cada Moeda (mãe) em seu respectivo valor, seja Real, Dólar ou Euro (classes herdadas)
                System.out.println("Total em Reais: " + cof.totalConvertido());
            }
        } //aqui fecha o while, quando o usuário digita a opção 0 com a confirmação verbal no sysout
        System.out.println("Finalizado.");
        sc.close();
    }
}
