package br.com.dominio.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.dominio.model.Pessoa;

@Named("bean") // aqui definimos um bean de demos um nome, se não tiver nome, pega o nome da classe 
@javax.enterprise.context.SessionScoped //definimos o escopo - Outros escopos: RequestScoped  ApplicationScoped  
public class PessoaMB implements Serializable {

	/**
	 * Não esqueça dos getters and setters 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject 
	private Pessoa pessoa;// cria objeto do tipo pessoa 
	
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public String adicionar() {
		pessoas.add(pessoa);
		limpar();
		return null;
	}
	
	private void limpar() {
		
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	

}
