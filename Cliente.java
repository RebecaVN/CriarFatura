package Atividade2;

public class Cliente {
	
	public String cliente;
	public String cpf;
	public int quantidaDeProdutos;
	public double totalDaCompra;
		
	public void fatura (String nome, String cpf, int quantidade, double total) {
		
		this.cliente = nome;
		this.cpf = cpf;
		this.quantidaDeProdutos = quantidade;
		this.totalDaCompra = total;
		
		System.out.println("---------------");
		System.out.println("Cliente: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Total: " + total);
		System.out.println("---------------");
	}
}
