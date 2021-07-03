package br.com.qm.gerente.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Cliente {

	// Os clientes, independente do tipo, tem um número de conta, agência, telefone,
	// saldo e limite de cheque especial.
	@Id
	private int nroConta;
	
	private int agencia;
	
	private String telefone;
	private float saldo;
	
	@Column(name = "limite_cheque_especial")
	private float limiteChequeEspecial;
	
	public Cliente(int nroConta, int agencia, String telefone, float saldo, float limiteChequeEspecial) {
		this.nroConta = nroConta;
		this.agencia = agencia;
		this.telefone = telefone;
		this.saldo = saldo;
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public Cliente() {
		
	}

	public abstract String imprimeCliente();

	public int getNroConta() {
		return nroConta;
	}

	public void setNroConta(int nroConta) {
		this.nroConta = nroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(float limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
}
