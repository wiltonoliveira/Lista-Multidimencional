package br.ucsal.listaMultidimencional;
public class TesteLMD {

	public static void main(String[] args) {

		executa(new LMD());
		
	}
	
	public static void executa(ILMD lista) {
		
		System.out.println("Teste insere------------------------------------------------------------------------");
		
		lista.insere(1, "Papelaria");
		lista.insere(2, "Material de limpeza");
		lista.insere(3, "Alimentos");
		lista.insere(4, "Eletrônicos");
		lista.insere(5, "Móveis");
		
		System.out.println("Esperado: Papelaria, Material de limpeza, Alimentos, Eletrônicos, Móveis");
		lista.imprimeTudo();
		
		System.out.println("Teste alterar categoria------------------------------------------------------------------------");	
		
		lista.alterar(1, "Nova papelaria");
		lista.alterar(3, "Novo alimentos");
		lista.alterar(5, "Novo móveis");
		
		System.out.println("Esperado: Nova papelaria, Material de limpeza, Novo alimentos, Eletrônicos, Novo móveis");
		lista.imprimeTudo();	
		
		System.out.println("Categoria não encontrada!");
		lista.alterar(7, "Novo eletrodomésticos");
		
		System.out.println("Teste buscar------------------------------------------------------------------------");
		
		System.out.println("Esperado: Nova papelaria");
		Noc no1 = lista.buscar(1);
		if (no1!=null)
			System.out.println(no1.descricao);
		
		System.out.println("Esperado: Novo alimentos");
		Noc no2 = lista.buscar(3);
		if (no2!=null)
			System.out.println(no2.descricao);
		
		System.out.println("Esperado: Novo móveis");
		Noc no3 = lista.buscar(5);
		if (no3!=null)
			System.out.println(no3.descricao);

		System.out.println("Teste insere nó------------------------------------------------------------------------");
		
		
		lista.insereNo(1, 1, "papel", 10);
		lista.insereNo(1, 2, "borracha", 15);
		lista.insereNo(1, 3, "tesoura", 5);

		lista.insereNo(3, 4, "Maçã", 15);
		lista.insereNo(3, 5, "Pêra", 10);
		
		lista.insereNo(5, 6, "Cadeira", 10);
		
		System.out.println("Esperado: Nova papelaria (papel 10) (borracha 15) (tesoura 5), Material de limpeza, Novo alimentos (maça 15) (pêra 10), Eletrônicos, Novo móveis (cadeira 10)");
		lista.imprimeTudo();
		
		
		System.out.println("Teste alterar nó------------------------------------------------------------------------");

		lista.alterarNo(1, 1, "papelNovo", 20);
		lista.alterarNo(3, 5, "pêraNova", 30);
		lista.alterarNo(5, 6, "cadeiraNova", 50);

		System.out.println("Esperado: Nova papelaria (papelNovo 20) (borracha 15) (tesoura 5), Material de limpeza, Novo alimentos (maça 15) (pêraNova 30), Eletrônicos, Novo móveis (cadeiraNova 50)");
		lista.imprimeTudo();
		
		System.out.println("Esperado: Nó não encontrado!");
		lista.alterarNo(5, 7, "mesa",  70);	
		
		System.out.println("Teste buscar nó------------------------------------------------------------------------");

		System.out.println("Esperado: tesoura 5");
		No no4 = lista.buscarNo(1, 3);
		if(no4!=null) {
			System.out.println(no4.descricao + " " + no4.quantidade);
		}
		
		System.out.println("Esperado: pêraNova 30");
		No no5 = lista.buscarNo(3, 5);
		if(no5!=null) {
			System.out.println(no5.descricao + " " + no5.quantidade);
		}

		System.out.println("Esperado: cadeiraNova 50");
		No no6 = lista.buscarNo(5, 6);
		if(no6!=null) {
			System.out.println(no6.descricao + " " + no6.quantidade);
		}

		
		System.out.println("Esperado: Elemento não encontrado!");
		No no7 = lista.buscarNo(5, 7);
		if(no7!=null) {
			System.out.println(no7.descricao + " " + no7.quantidade);
		}

		System.out.println("Teste remover nó------------------------------------------------------------------------");
		
		lista.removeNo(1, 2);
		System.out.println("Esperado: Nova papelaria (papelNovo 20) (tesoura 5), Material de limpeza, Novo alimentos (maça 15) (pêraNova 30), Eletrônicos, Novo móveis (cadeiraNova 50)");		
		lista.imprimeTudo();
		
		lista.removeNo(3, 5);
		System.out.println("Esperado: Nova papelaria (papelNovo 20) (tesoura 5), Material de limpeza, Novo alimentos (maça 15) , Eletrônicos, Novo móveis (cadeiraNova 50)");		
		lista.imprimeTudo();
		
		lista.removeNo(5, 6);
		System.out.println("Esperado: Nova papelaria (papelNovo 20) (tesoura 5), Material de limpeza, Novo alimentos (maça 15) , Eletrônicos, Novo móveis ");		
		lista.imprimeTudo();
		
		lista.removeNo(5, 70);
		System.out.println("Esperado: Elemento não encontrado!");
		lista.imprimeTudo();
		
		System.out.println("Teste imprimir categoria------------------------------------------------------------------------");
		
		System.out.println("Esperado: Nova papelaria (papelNovo 20) (tesoura 5)");
		lista.imprimeCategoria(1);
		
		System.out.println("Esperado: Novo alimentos (maça 15)");
		lista.imprimeCategoria(3);
		
		System.out.println("Esperado: Novo móveis");
		lista.imprimeCategoria(5);
		
		System.out.println("Esperado: Categoria não encontrada!");
		lista.imprimeCategoria(7);
		
		System.out.println("Teste remover categoria------------------------------------------------------------------------");
		
		lista.remove(3);
		System.out.println("Esperado: Nova papelaria (papelNovo 20) (tesoura 5), Material de limpeza, Eletrônicos, Novo móveis ");		
		lista.imprimeTudo();

		lista.remove(1);
		System.out.println("Esperado: Material de limpeza, Eletrônicos, Novo móveis");
		lista.imprimeTudo();

		lista.remove(5);
		System.out.println("Esperado: Material de limpeza, Eletrônicos");
		lista.imprimeTudo();


	}
	
	

}
