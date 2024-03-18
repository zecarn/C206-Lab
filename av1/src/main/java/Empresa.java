import java.util.Scanner;
public class Empresa {
    String nome;
    String cnpj;
    String endereco;
    int funcionariosDisponiveis;
    Funcionario[] funcionarios = new Funcionario[10];
    Scanner entrada = new Scanner(System.in);

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Cnpj: " + cnpj);
        System.out.println("Endereço: " + endereco);
    }
    void adicionarFuncionario(funcionari){
        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] == null){
                funcionarios[i] = new Funcionario();
                funcionarios[i].pessoa.nome = entrada.nextLine();
                funcionarios[i].pessoa.cpf = entrada.nextLine();
                funcionarios[i].pessoa.idade = entrada.nextInt();
            }
        }
    }
    void alocarFuncionario(int index){
        System.out.println("Funcionário foi para setor " + index + ".");
    }
    float contarFuncionariosDisponiveis(){
        funcionariosDisponiveis = 0;
        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] == null){
                funcionariosDisponiveis++;
            }
        }
        funcionariosDisponiveis = funcionariosDisponiveis * 10;

        return funcionariosDisponiveis;
    }
}
