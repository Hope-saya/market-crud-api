package com.hope.marketcrudapi.controller;

import com.hope.marketcrudapi.model.Market;
import com.hope.marketcrudapi.service.marketService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Tells Spring that this class handles web requests
@RequestMapping("/markets") // base URL meaning everything starts with/markets
public class MarketController {

    //Controller depends on the Service
    private marketService marketService1;

    public MarketController(marketService marketService1){
        this.marketService1 = marketService1;
    }
// Implement the GET, POST, DELETE, PUT . Delete has a void since it doesn't return anything.
    @GetMapping

    public List<Market> getMarkets(){
        return marketService1.getAllMembers();
    }

    @PostMapping
    public Market createMarket(@Valid @RequestBody Market market){
        return marketService1.createMarket(market);
    }

    @DeleteMapping("/{Id}")
    public void deleteMarket(@PathVariable Long Id){
        marketService1.deleteMarket(Id);
    }
    // Find it then change it
    @PutMapping("/{Id}")
    public Market updateMarket(@PathVariable Long Id, @Valid @RequestBody Market market){
        return marketService1.updateMarket(Id, market);
    }





}
