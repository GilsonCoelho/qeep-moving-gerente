package br.com.qm.gerente.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cliente_pf")
public class ClientePF extends Cliente {

	
//	Os clientes PF tem no seu cadastro o cpf, nome e idade.
	@Column(length = 11, unique = true)
	private String cpf;
	private String nome;
	private int idade;
	
	public ClientePF(int nroConta, int agencia, String telefone, float saldo, float limiteChequeEspecial, String cpf,
			String nome, int idade) {
		super(nroConta, agencia, telefone, saldo, limiteChequeEspecial);
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}
	
	public ClientePF() {
		super();
	}

	@Override
	public String imprimeCliente() {
		return String.format("%-5d %-3d %-20s %-14s %-20s", super.getNroConta(), super.getAgencia(), super.getTelefone(), this.cpf, this.nome);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	@Override
	public String toString() {
		return "ClientePF [cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + ", saldo=" + super.getSaldo() + "]";
	}

}
