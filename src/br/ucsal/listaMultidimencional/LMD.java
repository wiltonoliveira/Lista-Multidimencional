package br.ucsal.listaMultidimencional;

public class LMD implements ILMD{
	
	Noc inicio = null;
	
	@Override
	public void insere(int codigo, String descricao) {
		Noc novo = new Noc();
		
		novo.codigo = codigo;
		novo.descricao = descricao;
		
		if(inicio == null) {
			inicio = novo;
		} 
		else{
			Noc aux = inicio;
			while(aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = novo;
		}
	}

	@Override
	public void remove(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Noc buscar(int codigo) {
		if(inicio == null) {
			System.out.println("Lista Vazia");
		} else {
			Noc aux = inicio;
			while(aux.prox != null && aux.prox.codigo != codigo) {
				aux = aux.prox;
			}
			if(aux.codigo == codigo) {
				return aux;
			} else {
				System.out.println("Elemento não encontrado");
			}
		}
		return null;
	}

	@Override
	public void alterar(int codigo, String novaDescricao) {
		if(inicio == null) {
			System.out.println("Lista Vazia");
		} else {
			Noc aux = inicio;
			while (aux.prox != null && aux.codigo != codigo) {
				aux = aux.prox;
			}
			if (aux.codigo == codigo) {
				aux.descricao = novaDescricao;
			}
		}
	}

	@Override
	public void insereNo(int codigoCategoria, int codigo, String descricao, int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeNo(int codigoCategoria, int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public No buscarNo(int codigoCategoria, int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void alterarNo(int codigoCategoria, int codigo, String novaDescricao, int novaQuantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimeTudo() {
		Noc aux = inicio;
		
		while (aux != null) {
			System.out.print(aux.descricao + " ");
			aux = aux.prox;
		}
		
		System.out.println();
	}

	@Override
	public void imprimeCategoria(int codigoCategoria) {
		// TODO Auto-generated method stub
		
	}

}
