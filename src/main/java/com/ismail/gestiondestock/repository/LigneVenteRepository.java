package com.ismail.gestiondestock.repository;

import com.ismail.gestiondestock.model.LigneVente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneVenteRepository extends JpaRepository<LigneVente, Integer> {

  List<LigneVente> findAllByArticleId(Integer idArticle);

  List<LigneVente> findAllByVenteId(Integer id);
}
