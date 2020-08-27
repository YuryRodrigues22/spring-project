package com.dbcont.api.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.dbcont.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepositoryImplementation<Empresa, Long>{

	Empresa findByCnpj(String cnpj);
	
}
