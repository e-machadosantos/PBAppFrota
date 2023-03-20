package br.edu.infnet.appfrota.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfrota.model.domain.Automovel;

@Repository
public interface AutomovelRepository extends CrudRepository<Automovel, Integer>{
	
	@Query("from Automovel a where a.usuario.id = :userId")
	List<Automovel> obterLista(Integer userId);
}
