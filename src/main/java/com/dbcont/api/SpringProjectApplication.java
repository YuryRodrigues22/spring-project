package com.dbcont.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {


//	@Autowired
//	private EmpresaRepository empresaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner() {
//		return args -> {
//			
//			Empresa empresa = new Empresa();
//			empresa.setRazaoSocial("TI TEC");
//			empresa.setCnpj("10312731000126");
//			
//			this.empresaRepository.save(empresa);
//			
//			List<Empresa> empresas = empresaRepository.findAll();
//			empresas.forEach(System.out::println);
//			
//			Optional<Empresa> empresaDb = empresaRepository.findById(1L);
//			System.out.println("Empresa por ID: " + empresaDb);
//			
//			empresaDb.get().setRazaoSocial("TI TI");
//			this.empresaRepository.save(empresaDb.get());
//			
//			Empresa empresaCnpj = empresaRepository.findByCnpj("10312731000126");
//			System.out.println("Empresa por CNPJ: " + empresaCnpj);
//			
//			this.empresaRepository.deleteById(1L);
//			empresas = empresaRepository.findAll();
//			System.out.println("Empresas: " + empresas.size());
//			
//		};
//	}
}
	
