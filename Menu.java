package contamenu;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// modelos de testes do código da conta 

		Conta c1 = new Conta(1, 123, 1, " Sabrina", 25000.00f);

		c1.visualizar();
		c1.setAgencia(456);
		System.out.println(c1.getAgencia());

		if (c1.sacar(100))
			;
		System.out.println(" Saque efetuado com sucesso.O novo saldo é de R$: " + c1.getSaldo());
		// else // pq esse else deu errado
		// System.out.println(" O saldo é insuficiente");

		c1.depositar(1000);
		System.out.println("O novo saldo é: " + c1.getSaldo());
	}

}
