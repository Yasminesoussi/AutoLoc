package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;

import java.util.List;

public interface iAgenceServices {

    Agence createAgence(Agence agence);

    Agence getAgenceById(Long id);

    Agence updateAgence(Agence agence);

    void deleteAgence(Long id);

    List<Agence> getAllAgences();

}
