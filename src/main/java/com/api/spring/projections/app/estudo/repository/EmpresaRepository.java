package com.api.spring.projections.app.estudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.spring.projections.app.estudo.entity.EmpresaEntity;

@Repository
public interface EmpresaRepository  extends JpaRepository<EmpresaEntity, Integer>{

}
