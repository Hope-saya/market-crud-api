package com.hope.marketcrudapi.controller;

import com.hope.marketcrudapi.model.Market;
import com.hope.marketcrudapi.service.marketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/markets")
public class MarketController {

    private marketService marketService1;

    public MarketController(marketService marketService1){
        this.marketService1 = marketService1;
    }
// Implement the GET, POST, DELETE, PUT  Methods. Delete has a void since it doesn't return anything.
    @GetMapping

    public List<Market> getMarkets(){
        return marketService1.getAllMembers();
    }

    @PostMapping
    public Market createMarket(@RequestBody Market market){
        return marketService1.createMarket(market);
    }

    @DeleteMapping("/{Id}")
    public void deleteMarket(@PathVariable Long Id){
        marketService1.deleteMarket(Id);
    }





}
