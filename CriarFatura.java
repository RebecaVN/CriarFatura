package Atividade2;

public class CriarFatura {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.fatura("José Carlos", "908.765.231-06", 5, 60);
		cliente.fatura("Maria Silva", "109.785.345-07", 3, 50);
		cliente.fatura("Marcelo Pires", "123.456.676-03", 10, 20);
	}	
}
