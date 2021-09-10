
public class Funcionario {
	String nome;
	String cargo;
	double salario;

	String imprimir() {	
		return "Nome: " + nome + " - " + "Cargo: " + cargo + " - " + "Salário: " + salario;
	}

void aumentarSalario(double percentual) {
	salario = salario + (salario * percentual/100);
}

}
