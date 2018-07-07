package com.hazloakki.cuenta.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
//@Table(name = "cuenta_negocio")
public class CuentaNegocioEntity {

	@EmbeddedId
	private CuentaNegocioId cuentaNegocioId;

	public CuentaNegocioId getCuentaNegocioId() {
		return cuentaNegocioId;
	}

	public void setCuentaNegocioId(CuentaNegocioId cuentaNegocioId) {
		this.cuentaNegocioId = cuentaNegocioId;
	}

}
