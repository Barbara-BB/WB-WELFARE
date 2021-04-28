package com.wb.welfare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wb.welfare.dominio.Cliente;

@Repository
@Transactional
public interface ClienteRepository extends CrudRepository<Cliente,Long>{
	
	@Query("select p from Cliente p where p.nome like %?1%")
	List<Cliente> findClienteByName(String nome);

}
