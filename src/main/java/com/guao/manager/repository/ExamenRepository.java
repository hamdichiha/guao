package com.guao.manager.repository;

import com.guao.manager.domain.Examen;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Examen entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long> {}
