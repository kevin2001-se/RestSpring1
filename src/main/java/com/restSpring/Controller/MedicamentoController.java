package com.restSpring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restSpring.entity.Medicamento;
import com.restSpring.implement.MedicamentoServiceImple;

@RestController
@RequestMapping("/api/medicamento")
public class MedicamentoController {

	@Autowired
	private MedicamentoServiceImple service;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listarMedicamento(){
		List<Medicamento> obj = service.listarMedicamento();
		return ResponseEntity.ok(obj);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Medicamento> agregarMedicamento(Medicamento medicamento){
		Medicamento obj = service.agregarMedicamento(medicamento);
		return ResponseEntity.ok(obj);
	}
	
}
