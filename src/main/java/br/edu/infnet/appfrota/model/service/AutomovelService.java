package br.edu.infnet.appfrota.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfrota.model.domain.Automovel;
import br.edu.infnet.appfrota.model.domain.Usuario;
import br.edu.infnet.appfrota.model.repository.AutomovelRepository;

@Service
public class AutomovelService {	
	
	@Autowired
	private AutomovelRepository automovelRepository;


	public Automovel incluir(Automovel automovel) {
		return automovelRepository.save(automovel);
	}
	
	public void excluir(Integer id) {
		automovelRepository.deleteById(id);
	}
	
	public Collection<Automovel> obterLista(){
		return (Collection<Automovel>) automovelRepository.findAll();
	}
	
	public Collection<Automovel> obterLista(Usuario usuario){
		return (Collection<Automovel>) automovelRepository.obterLista(usuario.getId());
	}
	
	public Automovel obterPorId(Integer id) {
		return automovelRepository.findById(id).orElse(null);
	}
}
