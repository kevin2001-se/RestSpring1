package com.restSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restSpring.entity.Medicamento;

public interface IMedicamentoRepository extends JpaRepository<Medicamento, Integer> {

}
