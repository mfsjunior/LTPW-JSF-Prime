package br.com.dominio.model;

import java.io.Serializable;
import java.util.Objects;

//este é o nosso bean, devem implementar serializable 


public class Pessoa implements Serializable {

	/**
	 * este é o ID padrão
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String email;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
