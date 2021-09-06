package com.restSpring.service;

import java.util.List;

import com.restSpring.entity.Medicamento;

public interface IMedicamentoService {

	List<Medicamento> listarMedicamento();
	Medicamento agregarMedicamento(Medicamento medicamento);
	
}
