package de.tum.in.ase.eist.rest;

import de.tum.in.ase.eist.model.PhoneStock;
import de.tum.in.ase.eist.service.PhoneStockService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class PhoneStockResource {

    private final PhoneStockService phoneStockService;

    private final String BASE_URL = "/api/phones";

    public PhoneStockResource(PhoneStockService phoneStockService) {
        this.phoneStockService = phoneStockService;
    }


    public void createPhoneStock(){



    }


    public void buyPhone(){

    }


    public void getAllPhoneStocks(){



    }

    // TODO: Implement createPhoneStock
    

    // TODO: Implement buyPhone
    

    // TODO: Implement getAllPhoneStocks
    
}
