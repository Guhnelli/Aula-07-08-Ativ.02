package Aula_14_08;

public class Atividade_02 {

	public static void main(String[] args) {
		
		Carros carro1 = new Carros();
		
		carro1.setNome("ONIX");
		carro1.setCor("PRETO");
		carro1.setPlaca("652-523");
		carro1.setMarca("CHOVROLET");
		
		System.out.println("----- OBEJETO -----");
		System.out.println("---Nome---");
		System.out.println(carro1.getNome ());
		System.out.println("---Cor---");
		System.out.println(carro1.getCor ());
		System.out.println("---Placa---");
		System.out.println(carro1.getPlaca ());
		System.out.println("---Marca---");
		System.out.println(carro1.getMarca ());

	}

}
