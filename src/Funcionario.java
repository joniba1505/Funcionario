
public class Funcionario {
	String nome;
	String cargo;
	double salario;

	String imprimir() {	
		return "Nome: " + nome + " - " + "Cargo: " + cargo + " - " + "Sal�rio: " + salario;
	}

void aumentarSalario(double percentual) {
	salario = salario + (salario * percentual/100);
}

}
