package com.restSpring.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restSpring.entity.Medicamento;
import com.restSpring.repository.IMedicamentoRepository;
import com.restSpring.service.IMedicamentoService;

@Service
public class MedicamentoServiceImple implements IMedicamentoService {

	@Autowired
	private IMedicamentoRepository repository;
	
	@Override
	public List<Medicamento> listarMedicamento() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Medicamento agregarMedicamento(Medicamento medicamento) {
		// TODO Auto-generated method stub
		return repository.save(medicamento);
	}

}
