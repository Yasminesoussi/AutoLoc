package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Vehicule;

import java.util.List;

public interface iVehiculeServices {

    Vehicule createVehicule(Vehicule vehicule);

    Vehicule getVehiculeById(Long id);

    Vehicule updateVehicule(Vehicule vehicule);

    void deleteVehicule(Long id);

    List<Vehicule> getAllVehicules();

}
