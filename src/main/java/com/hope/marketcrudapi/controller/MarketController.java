package com.hope.marketcrudapi.controller;

import com.hope.marketcrudapi.model.Market;
import com.hope.marketcrudapi.service.marketService;
import com.hope.shared.responses.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/markets")
public class MarketController {

    private marketService marketService1;

    public MarketController(marketService marketService1) {
        this.marketService1 = marketService1;
    }

    @GetMapping

    public ApiResponse <List<Market>> getMarkets(){
//        return marketService1.getAllMembers();
        List<Market> markets = marketService1.getAllMembers();

        return new  ApiResponse<>(
                true,
                200,
                "Markets Retrieved Successfully",
                markets
                );
    }

    @PostMapping
    public ApiResponse<Market> createMarket(@Valid @RequestBody Market market){
        Market market1 = marketService1.createMarket(market);

        return new ApiResponse<>(
                true,
                201,
                "Market created successfully",
                market1
        );
    }

    @DeleteMapping("/{Id}")
    public ApiResponse<Void> deleteMarket(@PathVariable Long Id){
        marketService1.deleteMarket(Id);
        return new ApiResponse<>(
                true,
                200,
                "Market Deleted Successfully",
                null
        );
    }

    @PutMapping("/{Id}")
    public ApiResponse<Market> updateMarket(@PathVariable Long Id, @Valid @RequestBody Market market){
        Market updatedMarket =  marketService1.updateMarket(Id, market);

        return new ApiResponse<>(
                true,
                200,
                "Market Updated Successfully",
                updatedMarket
        );
    }
}
