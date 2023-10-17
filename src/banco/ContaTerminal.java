package banco;

import java.util.Scanner;


public class ContaTerminal {
	
	private int numero;
	private String agencia;
	private String cliente;
	private double saldo;
	
	
	
	public ContaTerminal() {
		this.saldo = 0;
	}

	public void criarConta() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor digite o numero da conta:");
		this.numero = entrada.nextInt();
		
		System.out.println("Agora digite a Agência:");
		this.agencia = entrada.next();
		
		System.out.println("Digite o nome do cliente:");
		this.cliente = entrada.next();
		
		System.out.println("Por fim, digite o saldo:");
		this.saldo = entrada.nextDouble();
		
		entrada.close();
	}
	
	public void informarConta() {
		System.out.println(
				"Olá " + this.cliente + ","
				+ " obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ","
				+ " conta " + this.numero + ""
				+ " e seu saldo de R$" + this.saldo + " já está disponível para saque."
				);	
	}
	
	public static void main(String[] args) {
		ContaTerminal conta1 = new ContaTerminal();
		
		conta1.criarConta();
		conta1.informarConta();
	}

}
