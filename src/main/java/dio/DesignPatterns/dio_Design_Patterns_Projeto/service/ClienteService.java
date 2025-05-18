package dio.DesignPatterns.dio_Design_Patterns_Projeto.service;

import  dio.DesignPatterns.dio_Design_Patterns_Projeto.model.Cliente;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);
}