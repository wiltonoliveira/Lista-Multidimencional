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
				novo.codigo = codigo;
				if(aux.ini == null) {
					aux.ini = novo;
				} else {
					No aux2 = aux.ini;
					while(aux2.prox != null) {
						aux2 = aux2.prox;
					}
					aux2.prox = novo;
				}
								
			}
		}
	}

	@Override
	public void removeNo(int codigoCategoria, int codigo) {
		if(inicio == null) {
			System.out.println("Lista Vazia");
		} else {
			Noc aux = inicio;
			while(aux.prox != null && aux.codigo != codigoCategoria) {
				aux = aux.prox;
			}
			
			if (aux.codigo == codigoCategoria) {
				if(aux.ini == null) {
					System.out.println("Elemento não encontrado!");
				} else {
				No ant = null;
				No aux2 = aux.ini;
				
				while(aux2.prox != null && aux2.codigo != codigo) {
					ant = aux2;
					aux2 = aux2.prox;
				}
				
				if(aux2.codigo == codigo) {
					if(ant == null) {
						aux.ini = aux.ini.prox;
					} else if(aux2.prox == null) {
						ant.prox = null;
						aux2 = null;
					} else {
						ant.prox = aux2.prox;
						aux2 = null;
					}
				} else {
					System.out.println("Elemento não encontrado");
				}
				}
			}
			}	
		}
	@Override
	public No buscarNo(int codigoCategoria, int codigo) {
		if(inicio == null) {
			System.out.println("Lista Vazia");
		} else {
			Noc aux = inicio;
			while(aux != null && aux.codigo != codigoCategoria) {
				aux = aux.prox;
			}
			
			if(aux.codigo == codigoCategoria) {
				if(aux.ini == null) {
					System.out.println("Categoria Vazia");
				} else {
					No aux2 = aux.ini;
					while(aux2.prox != null && aux2.codigo != codigo) {
						aux2 = aux2.prox;
					}
					
					if(aux2.codigo == codigo) {
						return aux2;
					}
				}
			}
		}
		
		return null;
	}

	@Override
	public void alterarNo(int codigoCategoria, int codigo, String novaDescricao, int novaQuantidade) {
		if(inicio == null) {
			System.out.println("Lista Vazia");
		} else {
			Noc aux = inicio;
			while(aux.prox != null && aux.codigo != codigoCategoria) {
				aux = aux.prox;
			}
			
			if(aux.codigo == codigoCategoria) {
				if(aux.ini == null) {
					System.out.println("Categoria Vazia");
				} else {
					No aux2 = aux.ini;
					while(aux2.prox != null && aux2.codigo != codigo) {
						System.out.println(aux.codigo +" " +aux.descricao);
						aux2 = aux2.prox;
					}
					
					if(aux2.codigo == codigo) {
						aux2.descricao = novaDescricao;
						aux2.quantidade = novaQuantidade;
					} else {
						System.out.println("Elemento não encontrado");
					}
				}
			}
		}
		
	}

	@Override
	public void imprimeTudo() {
		Noc aux = inicio;
		No aux2 = new No();
		System.out.print("Resultado: ");
		while (aux != null) {
			System.out.print(aux.descricao + " ");
			if(aux.ini != null) {
				aux2 = aux.ini;
				while(aux2 != null) {
					System.out.print("(" +aux2.descricao + " " + aux2.quantidade + ") ");
					aux2 = aux2.prox;
				}
			}
			aux = aux.prox;
		}
		
		System.out.println("\n");
	}

	@Override
	public void imprimeCategoria(int codigoCategoria) {
		Noc aux = inicio;
		
		System.out.print("Resultado: ");
		while(aux.prox != null && aux.codigo != codigoCategoria) {
			aux = aux.prox;
		}
		
		if(aux.codigo == codigoCategoria) {
			System.out.print(aux.descricao + " ");
			No aux2 = aux.ini;
			while(aux2 != null) {
				System.out.print("(" +aux2.descricao + " " + aux2.quantidade + ") ");
				aux2 = aux2.prox;
			}
		} else {
			System.out.println("Categoria não encontrada!");
		}
		System.out.println("\n");
	}
}
