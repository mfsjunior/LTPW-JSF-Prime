package br.com.curso.dao;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.curso.domain.Usuario;

public interface UsuarioRepository extends Repository {

		//crio os eventos 
		Usuario save(Usuario usuario);
		Optional<Usuario> findById(long id);// um select em toda a base
}



