package br.edu.infnet.appfrota.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfrota.model.domain.Empresa;
import br.edu.infnet.appfrota.model.repository.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public Empresa incluir(Empresa empresa){
		return empresaRepository.save(empresa);
	}
	
	public void excluir(Integer key) {
		empresaRepository.deleteById(key);
	}
	
	public Collection<Empresa> obterLista(){
		return (Collection<Empresa>) empresaRepository.findAll();
	}
}
