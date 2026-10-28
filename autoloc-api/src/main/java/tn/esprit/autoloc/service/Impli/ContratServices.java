package tn.esprit.autoloc.service.Impli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.iContratRepository;
import tn.esprit.autoloc.service.iContratServices;

import java.util.List;

@Service
public class ContratServices implements iContratServices {

    @Autowired
    private iContratRepository contratRepository;

    @Override
    public Contrat createContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat getContratById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }

}
