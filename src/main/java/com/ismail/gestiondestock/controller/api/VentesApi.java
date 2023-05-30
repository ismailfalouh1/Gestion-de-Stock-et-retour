package com.ismail.gestiondestock.controller.api;

import com.ismail.gestiondestock.dto.VentesDto;
import com.ismail.gestiondestock.utils.Constants;
import io.swagger.annotations.Api;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Api("ventes")
public interface VentesApi {

  @PostMapping(Constants.VENTES_ENDPOINT + "/create")
  VentesDto save(@RequestBody VentesDto dto);

  @GetMapping(Constants.VENTES_ENDPOINT + "/{idVente}")
  VentesDto findById(@PathVariable("idVente") Integer id);

  @GetMapping(Constants.VENTES_ENDPOINT + "/{codeVente}")
  VentesDto findByCode(@PathVariable("codeVente") String code);

  @GetMapping(Constants.VENTES_ENDPOINT + "/all")
  List<VentesDto> findAll();

  @DeleteMapping(Constants.VENTES_ENDPOINT + "/delete/{idVente}")
  void delete(@PathVariable("idVente") Integer id);

}
