package com.portfolio.backend.repository;

import com.portfolio.backend.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadRepository extends JpaRepository<Habilidad, Long>{
    
}
