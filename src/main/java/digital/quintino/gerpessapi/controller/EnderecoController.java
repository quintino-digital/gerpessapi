package digital.quintino.gerpessapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import digital.quintino.gerpessapi.domain.EnderecoDomain;
import digital.quintino.gerpessapi.service.EnderecoService;

@RestController
@RequestMapping("/api/v1/endereco")
@CrossOrigin(origins = "*")
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;
	
	// TODO -- Retornar DTO
	@PostMapping
	public EnderecoDomain saveOne(@RequestBody EnderecoDomain enderecoDomain) {
		return this.enderecoService.saveOne(enderecoDomain);
	}
	
	@PostMapping("all")
	public List<EnderecoDomain> saveAll(@RequestBody List<EnderecoDomain> enderecoDomainList) {
		return this.enderecoService.saveAll(enderecoDomainList);
	}
	
	@GetMapping
	public List<EnderecoDomain> findAll() {
		return this.enderecoService.findAll();
	}
	
}
