package com.hazloakki.cuenta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hazloakki.cuenta.entity.CuentaEntity;
import com.hazloakki.cuenta.entity.CuentaNegocioEntity;

/**
 * @author Jovani Arzate
 * 2018-07-01
 * HazloAkki para Empresas v.1
 *
 */
@Repository
public interface CuentaNegocioRepository extends JpaRepository<CuentaEntity, String>{

	List<CuentaNegocioEntity> findByIdCuenta(String idCuenta);

}
