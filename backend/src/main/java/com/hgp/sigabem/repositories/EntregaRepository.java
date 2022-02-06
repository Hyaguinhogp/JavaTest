package com.hgp.sigabem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hgp.sigabem.entities.Entrega;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long>{
}
