package de.tum.in.ase.eist.service;

import de.tum.in.ase.eist.model.PhoneStock;
import de.tum.in.ase.eist.repository.PhoneStockRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PhoneStockService {
    private final PhoneStockRepository phoneStockRepository;

    public PhoneStockService(PhoneStockRepository phoneStockRepository) {
        this.phoneStockRepository = phoneStockRepository;
    }

    public PhoneStock save(PhoneStock phone) {
        return phoneStockRepository.save(phone);
    }

    // TODO: Implement buy logic here
    public PhoneStock buyPhone(PhoneStock phone) {
        return null;
    }

    // TODO: Implement retrieve logic using PhoneStockRepository
    public List<PhoneStock> getAllPhones(boolean onlyAvailable) {
        return new ArrayList<>();
    }

    public Optional<PhoneStock> getById(Long phoneId) {
        return phoneStockRepository.findById(phoneId);
    }
}
