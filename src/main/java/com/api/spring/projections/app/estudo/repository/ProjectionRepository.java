package com.api.spring.projections.app.estudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.spring.projections.app.estudo.entity.FuncionarioEntity;

@Repository
public interface ProjectionRepository extends JpaRepository<FuncionarioEntity, Integer>{

}
