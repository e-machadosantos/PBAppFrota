package br.edu.infnet.appfrota.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appfrota.model.domain.Empresa;

@Repository
public class EmpresaRepository {
	
	private static Integer id = 1;
	
	private static Map<Integer, Empresa> mapaEmpresa = new HashMap<Integer, Empresa>();

	public boolean incluir(Empresa empresa) {
		
		empresa.setId(id++);
		
		try {
			mapaEmpresa.put(empresa.getId(), empresa);	
			return true;
		} catch (Exception e) {
			return false;
		}		
	}
	
	public Empresa excluir(Integer key) {		
		
		return mapaEmpresa.remove(key);
	}

	public Collection<Empresa> obterLista() {
		return mapaEmpresa.values();
	}

}
