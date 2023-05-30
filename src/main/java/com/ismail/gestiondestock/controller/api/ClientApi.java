package com.ismail.gestiondestock.controller.api;

import com.ismail.gestiondestock.dto.ClientDto;
import com.ismail.gestiondestock.utils.Constants;
import io.swagger.annotations.Api;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Api("clients")
public interface ClientApi {

  @PostMapping(value = Constants.APP_ROOT + "/clients/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  ClientDto save(@RequestBody ClientDto dto);

  @GetMapping(value = Constants.APP_ROOT + "/clients/{idClient}", produces = MediaType.APPLICATION_JSON_VALUE)
  ClientDto findById(@PathVariable("idClient") Integer id);

  @GetMapping(value = Constants.APP_ROOT + "/clients/all", produces = MediaType.APPLICATION_JSON_VALUE)
  List<ClientDto> findAll();

  @DeleteMapping(value = Constants.APP_ROOT + "/clients/delete/{idClient}")
  void delete(@PathVariable("idClient") Integer id);

}
