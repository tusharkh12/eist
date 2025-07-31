package de.tum.in.ase.eist.repository;

import de.tum.in.ase.eist.model.PhoneStock;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class PhoneStockRepository {

    private final List<PhoneStock> phoneStocks = new ArrayList<>();

    // TODO: Implement retrieve logic here

    public List<PhoneStock> findAll() {
        return new ArrayList<>(phoneStocks);
    }

    public PhoneStock save(PhoneStock phoneStock) {
        if (phoneStock.getId() == null) {
            UUID uuid = UUID.randomUUID();
            phoneStock.setId(uuid.getMostSignificantBits());
        } else {
            phoneStocks.removeIf(stock -> stock.getId().equals(phoneStock.getId()));
        }
        phoneStocks.add(phoneStock);

        return phoneStock;
    }

    public Optional<PhoneStock> findById(Long id) {
        return phoneStocks.stream().filter(stock -> id.equals(stock.getId())).findFirst();
    }
}
