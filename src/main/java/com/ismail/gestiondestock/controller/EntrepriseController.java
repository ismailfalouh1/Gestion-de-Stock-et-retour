package com.ismail.gestiondestock.controller;

import com.ismail.gestiondestock.services.EntrepriseService;
import com.ismail.gestiondestock.controller.api.EntrepriseApi;
import com.ismail.gestiondestock.dto.EntrepriseDto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntrepriseController implements EntrepriseApi {

  private EntrepriseService entrepriseService;

  @Autowired
  public EntrepriseController(EntrepriseService entrepriseService) {
    this.entrepriseService = entrepriseService;
  }

  @Override
  public EntrepriseDto save(EntrepriseDto dto) {
    return entrepriseService.save(dto);
  }

  @Override
  public EntrepriseDto findById(Integer id) {
    return entrepriseService.findById(id);
  }

  @Override
  public List<EntrepriseDto> findAll() {
    return entrepriseService.findAll();
  }

  @Override
  public void delete(Integer id) {
    entrepriseService.delete(id);
  }
}
