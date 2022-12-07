package digital.quintino.gerpessapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import digital.quintino.gerpessapi.domain.PessoaDomain;
import digital.quintino.gerpessapi.service.PessoaService;

@RestController
@RequestMapping("/api/v1/pessoa")
@CrossOrigin(origins = "*")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	// TODO -- Retornar DTO
	@PostMapping
	public PessoaDomain saveOne(@RequestBody PessoaDomain pessoaDomain) {
		return this.pessoaService.saveOne(pessoaDomain);
	}
	
	@PostMapping("all")
	public List<PessoaDomain> saveAll(@RequestBody List<PessoaDomain> pessoaDomainList) {
		return this.pessoaService.saveAll(pessoaDomainList);
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
	
	@PutMapping("{codigo}")
	public ResponseEntity<PessoaDomain> updateOne(@RequestBody PessoaDomain pessoaDomain, @PathVariable("codigo") Long codigo) {
		return ResponseEntity.ok(this.pessoaService.updateOne(pessoaDomain, codigo));
	}
	
	@DeleteMapping("{codigo}")
	public ResponseEntity<?> depeteOne(@PathVariable("codigo") Long codigo) {
		this.pessoaService.deleteOne(codigo);
		return ResponseEntity.ok().build();
	}

}
