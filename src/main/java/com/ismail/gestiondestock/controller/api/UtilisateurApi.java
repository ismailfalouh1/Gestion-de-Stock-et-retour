package com.ismail.gestiondestock.controller.api;


import com.ismail.gestiondestock.dto.ChangerMotDePasseUtilisateurDto;
import com.ismail.gestiondestock.dto.UtilisateurDto;
import com.ismail.gestiondestock.utils.Constants;
import io.swagger.annotations.Api;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Api("utilisateurs")
public interface UtilisateurApi {

  @PostMapping(Constants.UTILISATEUR_ENDPOINT + "/create")
  UtilisateurDto save(@RequestBody UtilisateurDto dto);

  @PostMapping(Constants.UTILISATEUR_ENDPOINT + "/update/password")
  UtilisateurDto changerMotDePasse(@RequestBody ChangerMotDePasseUtilisateurDto dto);

  @GetMapping(Constants.UTILISATEUR_ENDPOINT + "/{idUtilisateur}")
  UtilisateurDto findById(@PathVariable("idUtilisateur") Integer id);

  @GetMapping(Constants.UTILISATEUR_ENDPOINT + "/find/{email}")
  UtilisateurDto findByEmail(@PathVariable("email") String email);

  @GetMapping(Constants.UTILISATEUR_ENDPOINT + "/all")
  List<UtilisateurDto> findAll();

  @DeleteMapping(Constants.UTILISATEUR_ENDPOINT + "/delete/{idUtilisateur}")
  void delete(@PathVariable("idUtilisateur") Integer id);

}
