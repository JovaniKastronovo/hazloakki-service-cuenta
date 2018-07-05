package com.hazloakki.cuenta.service.remoto;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "negocio-service", url = "http://negocio-service:8085")
public interface NegocioApiClient {

	@RequestMapping(method = GET, value = "/api/v1/negocios/{id}")
	NegocioDto obtenerNegocio(@PathVariable("id") String idNegocio);

}
