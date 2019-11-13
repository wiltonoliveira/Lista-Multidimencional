package br.ucsal.listaMultidimencional;

public interface ILMD {
	
	void insere (int codigo, String descricao);
	void remove (int codigo);
	Noc buscar (int codigo);
	void alterar (int codigo, String novaDescricao);
	
	void insereNo (int codigoCategoria, int codigo, String descricao, int quantidade);
	void removeNo(int codigoCategoria, int codigo);
	No buscarNo (int codigoCategoria, int codigo);
	void alterarNo(int codigoCategoria, int codigo, String novaDescricao, int novaQuantidade);
	
	void imprimeTudo();
	void imprimeCategoria(int codigoCategoria);
}
