package br.com.gerenciadordeprodutos.api.Costumer.controller;

import br.com.gerenciadordeprodutos.api.Costumer.dtos.CostumerRequest;
import br.com.gerenciadordeprodutos.api.Costumer.dtos.CostumerResponse;
import br.com.gerenciadordeprodutos.api.Costumer.service.CostumerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/costumers")
public class CostumerController {

    @Autowired
    CostumerService costumerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CostumerResponse create(@Valid @RequestBody CostumerRequest costumerRequest) {
        return costumerService.create(costumerRequest);
    }

}
