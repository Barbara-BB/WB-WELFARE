package com.wb.welfare.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wb.welfare.dominio.Cliente;

@Repository
@Transactional
public interface ClienteRepository extends CrudRepository<Cliente,Long>{

}
