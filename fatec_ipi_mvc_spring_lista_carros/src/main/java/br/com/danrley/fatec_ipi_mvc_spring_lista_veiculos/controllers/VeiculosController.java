package br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.beans.Veiculo;
import br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.repository.VeiculosRepository;

@Controller

public class VeiculosController {
	@Autowired
	private VeiculosRepository veiculosRepository;
	@GetMapping ("/veiculos")
	public ModelAndView listarVeiculos() {
		ModelAndView mav = new ModelAndView("lista_veiculos");
		
		List <Veiculo> veiculos = veiculosRepository.findAll();
		mav.addObject("veiculos",veiculos);
		return mav;
		
	}

}
