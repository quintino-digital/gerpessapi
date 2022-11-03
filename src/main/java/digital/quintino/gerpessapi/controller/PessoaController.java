package digital.quintino.gerpessapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import digital.quintino.gerpessapi.domain.PessoaDomain;
import digital.quintino.gerpessapi.service.PessoaService;

@RestController
@RequestMapping("v1/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping
	public PessoaDomain saveOne(@RequestBody PessoaDomain pessoaDomain) {
		return this.pessoaService.saveOne(pessoaDomain);
	}
	
	@GetMapping
	public List<PessoaDomain> findAll() {
		return this.pessoaService.findAll();
	}
	
	@GetMapping("/{codigo}")
	public PessoaDomain findOne(@PathVariable("codigo") Long codigo) {
		return this.pessoaService.findOne(codigo);
	}
	
	@GetMapping("/pessoa-juridica")
	public List<PessoaDomain> recuperarPessoaJuridica() {
		return this.pessoaService.recuperarPessoaJuridica();
	}

}
