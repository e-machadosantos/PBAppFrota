package br.edu.infnet.appfrota.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfrota.model.domain.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Integer>{
	
	@Query("from Empresa e where e.usuario.id = :userId")
	List<Empresa> obterLista(Integer userId);
}
