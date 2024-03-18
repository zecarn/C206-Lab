import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Empresa empresa = new Empresa();

        Scanner pedido = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        int escolha = pedido.nextInt();

        int funcionario;

        empresa.nome = "Ford";
        empresa.cnpj = "12564578";
        empresa.endereco = "Av. Paulista";

        if(escolha == 1){
            System.out.println("Mostrando informações da empresa: ");
            empresa.mostraInfo();
        }
        if(escolha == 2){
            System.out.println("Adicionando um funcionário: ");
            System.out.println("Insira a matrícula: ");
            funcionario = entrada.nextInt();
            empresa.adicionarFuncionario(funcionario);
        }
        if(escolha == 3){
            System.out.println("Alocando um funcionário: ");
            funcionario = entrada.nextInt();
            empresa.alocarFuncionario(funcionario);
        }
        if(escolha == 4){
            System.out.println("Funcionários disponíveis estão em " + empresa.contarFuncionariosDisponiveis() + "%.");
        }


    }
}
