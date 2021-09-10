
public class FolhaDePagamento {

	public static void main(String[] args) {
Funcionario f1 = new Funcionario();
f1.cargo = "Desenvolvedor Java jr";
f1.nome = "José Nilton";
f1.salario = 6500;
System.out.println(f1.imprimir());
double percentual = 10;
f1.aumentarSalario(percentual);
System.out.printf("Após o reajuste de %.2f por cento, %s passou a receber R$ %.2f \n", percentual, f1.nome, f1.salario);
	}

}
