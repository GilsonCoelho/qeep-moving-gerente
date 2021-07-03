package br.com.qm.gerente;

import java.util.List;

import br.com.qm.gerente.dao.ClienteDAO;
import br.com.qm.gerente.entity.Cliente;

public class Teste {

	public static void main(String[] args) {
		
		ClienteDAO clienteDao = new ClienteDAO();
		
		
//		ClientePF clientePf = new ClientePF(123, 1, "11992919817", 1000, 1000, "12312344", "João José", 18);
//		ClientePJ clientePj = new ClientePJ(456, 0, "11985632145", 1000, 1500, "00000000011", "José Maria", "Empresa", "Empresa X");
//		
//		
//		clienteDao.cadastraCliente(clientePf);
//		clienteDao.cadastraCliente(clientePj);
		//		clienteDao.removeCliente(123);
		
		System.out.println(clienteDao.consultaCliente(123));
		System.out.println(clienteDao.consultaCliente(456));		
		
//		clienteDao.transfereValor(123, 456, 500);
//		System.out.println(clienteDao.consultaCliente(123));
//		System.out.println(clienteDao.consultaCliente(456));
		
		
		List<Cliente> listaClientes = clienteDao.listaClientes();
		
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente);
		}
		
		System.out.println("Cliente PF");
		System.out.println(clienteDao.consultaPorCpfCnpj("12054632114"));
		System.out.println("Cliente PJ");
		System.out.println(clienteDao.consultaPorCpfCnpj("00000000000011"));
		
		System.out.println("Nao existe:");
		System.out.println(clienteDao.consultaPorCpfCnpj("12054632113"));
		
		
	}
	
}
