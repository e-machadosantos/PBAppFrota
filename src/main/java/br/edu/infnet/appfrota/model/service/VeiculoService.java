package br.edu.infnet.appfrota.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfrota.model.domain.Automovel;
import br.edu.infnet.appfrota.model.domain.Usuario;
import br.edu.infnet.appfrota.model.domain.Veiculo;
import br.edu.infnet.appfrota.model.repository.VeiculoRepository;

@Service
public class VeiculoService {	
	
	@Autowired
	private VeiculoRepository veiculoRepository;


	public void excluir(Integer id) {
		veiculoRepository.deleteById(id);
	}
	
	public Collection<Veiculo> obterLista(){
		return (Collection<Veiculo>) veiculoRepository.findAll();
	}
	
	public Collection<Veiculo> obterLista(Usuario usuario){
		return (Collection<Veiculo>) veiculoRepository.obterLista(usuario.getId());
	}
	
	public Veiculo obterPorId(Integer id) {
		return veiculoRepository.findById(id).orElse(null);
	}
}
