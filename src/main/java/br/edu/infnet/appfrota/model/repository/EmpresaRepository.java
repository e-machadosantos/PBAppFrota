package br.edu.infnet.appfrota.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfrota.model.domain.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Integer>{

}
