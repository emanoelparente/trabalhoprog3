package controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import model.Empresa;
import repository.EmpresaRepository;


@RestController
@RequestMapping("/empresa")


public class EmpresaController{
	
	
	private final EmpresaRepository empresaRepository;
	
	public EmpresaController(EmpresaRepository empresaRepository)
	{
		this.empresaRepository = empresaRepository;
	}
	
	@GetMapping
	public List<Empresa>list() {
		return empresaRepository.findAll();
	}
}