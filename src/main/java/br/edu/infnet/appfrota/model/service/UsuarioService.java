package br.edu.infnet.appfrota.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfrota.model.domain.Usuario;
import br.edu.infnet.appfrota.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public boolean incluir(Usuario usuario) {
		return usuarioRepository.incluir(usuario);
	}
	
	public Usuario excluir(Integer key) {
		return usuarioRepository.excluir(key);
	}
	
	public Collection<Usuario> obterLista(){
		return usuarioRepository.obterLista();
	}
}