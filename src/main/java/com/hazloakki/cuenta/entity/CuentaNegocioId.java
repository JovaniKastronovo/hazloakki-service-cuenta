package com.hazloakki.cuenta.entity;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 * @author Jovani Arzate 2018-07-01 HazloAkki para Empresas v.1
 *
 */
@Embeddable
public class CuentaNegocioId implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="id_cuenta",nullable = false)
	private String idCuenta;
	 
	@Column(name="id_negocio",nullable = false)
	private String idNegocio;
	
	public CuentaNegocioId() {
		
	}
	
	public CuentaNegocioId(String idCuenta, String idNegocio) {
		this.idCuenta = idCuenta;
		this.idNegocio = idNegocio;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCuenta == null) ? 0 : idCuenta.hashCode());
		result = prime * result + ((idNegocio == null) ? 0 : idNegocio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaNegocioId other = (CuentaNegocioId) obj;
		if (idCuenta == null) {
			if (other.idCuenta != null)
				return false;
		} else if (!idCuenta.equals(other.idCuenta))
			return false;
		if (idNegocio == null) {
			if (other.idNegocio != null)
				return false;
		} else if (!idNegocio.equals(other.idNegocio))
			return false;
		return true;
	}
	
	

}
