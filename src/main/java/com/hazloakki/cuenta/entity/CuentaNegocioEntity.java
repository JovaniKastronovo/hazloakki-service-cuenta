package com.hazloakki.cuenta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Jovani Arzate 2018-07-01 HazloAkki para Empresas v.1
 *
 */
@Entity
@Table(name = "cuenta_negocio")
public class CuentaNegocioEntity {

	@Id
	@Column(name="id_cuenta")
	private String idCuenta;
	@Column(name="id_negocio")
	private String idNegocio;

	public String getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getIdNegocio() {
		return idNegocio;
	}

	public void setIdNegocio(String idNegocio) {
		this.idNegocio = idNegocio;
	}

}
