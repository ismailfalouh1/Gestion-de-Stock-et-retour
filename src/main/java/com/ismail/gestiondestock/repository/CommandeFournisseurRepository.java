package com.ismail.gestiondestock.repository;

import com.ismail.gestiondestock.model.CommandeClient;
import com.ismail.gestiondestock.model.CommandeFournisseur;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeFournisseurRepository extends JpaRepository<CommandeFournisseur, Integer> {

  Optional<CommandeFournisseur> findCommandeFournisseurByCode(String code);

  List<CommandeClient> findAllByFournisseurId(Integer id);
}
