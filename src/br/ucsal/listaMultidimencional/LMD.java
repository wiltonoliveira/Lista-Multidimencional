package br.ucsal.listaMultidimencional;

public class LMD implements ILMD{
	
	Noc inicio = null;
	
	@Override
	public void insere(int codigo, String descricao) {
		Noc novo = new Noc();
		
		novo.ini = null;
		
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
		if(inicio==null) {
			System.out.println("Lista vazia!");
		}else {
			Noc ant = null;
			Noc aux = inicio;
			while(aux.prox!=null&&aux.codigo!=codigo) {
				ant=aux;
				aux=aux.prox;
			}
			if(aux.codigo==codigo) {
				if(ant==null) {
					inicio=inicio.prox;
				}else if(aux.prox==null) {
					ant.prox=null;
					aux=null;
				}else {
					ant.prox=aux.prox;
					aux=null;
				}
			}else {
				System.out.println("Elemento não encontrado!");
			}
			
		}
	}

	@Override
	public Noc buscar(int codigo) {
		if(inicio == null) {
			System.out.println("Lista Vazia");
		} else {
			Noc aux = inicio;
			while(aux.prox != null && aux.codigo != codigo) {
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
		if(inicio == null) {
			System.out.println("Lista Vazia");
		} else {
			Noc aux = inicio;
		
			while(aux.prox != null && aux.codigo != codigoCategoria) {
				aux = aux.prox;
			}
			
			if (aux.codigo == codigoCategoria) {
				No novo = new No();
				novo.descricao = descricao;
				novo.quantidade = quantidade;
				
				if(aux.ini == null) {
					aux.ini = novo;
				} else {
					No aux2 = aux.ini;
					while(aux2 != null) {
						aux2 = aux2.prox;
					}
					
					aux2 = novo;
				}
				
				
			}
		}
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
			if(aux.ini != null) {
				No aux2 = aux.ini;
				while(aux2 != null) {
					System.out.print("(" +aux2.descricao + " " + aux2.quantidade + ") ");
					aux2 = aux2.prox;
				}
			}
			aux = aux.prox;
		}
		
		System.out.println();
	}

	@Override
	public void imprimeCategoria(int codigoCategoria) {
		// TODO Auto-generated method stub
		
	}

}
