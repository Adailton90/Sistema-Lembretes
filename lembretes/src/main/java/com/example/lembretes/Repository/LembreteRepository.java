package com.example.lembretes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lembretes.Model.LembreteEntity;

public interface LembreteRepository extends JpaRepository<LembreteEntity, Long> {
	LembreteEntity findByCodigo(long codigo);
}
