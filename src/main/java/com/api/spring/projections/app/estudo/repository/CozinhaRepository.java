package com.api.spring.projections.app.estudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.spring.projections.app.estudo.entity.CozinhaEntity;

@Repository
public interface CozinhaRepository extends JpaRepository<CozinhaEntity, Integer> {

}
