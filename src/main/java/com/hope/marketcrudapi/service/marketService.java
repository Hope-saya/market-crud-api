package com.hope.marketcrudapi.service;

import com.hope.marketcrudapi.model.Market;
import com.hope.marketcrudapi.repository.marketRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Member;
import java.util.List;

import static org.apache.tomcat.util.net.openssl.OpenSSLStatus.getName;

// we want to be able to create a market, to view it, to save it and to delete it. That's our business logic.
@Service
public class marketService {

    //Dependency Injection - The service needs repository
 private marketRepository marketRepository1;

 public marketService(marketRepository marketRepository1){
     this.marketRepository1 = marketRepository1;
 }

 //Returns many markets - get all rows( like SELECT * FROM markets)
 public List<Market> getAllMembers(){
     return marketRepository1.findAll();
 }

 //Receives a market object and saves it
 public Market createMarket(Market market){
     return marketRepository1.save(market);
 }
 public Market updateMarket(Long Id, Market updatedMarket){
  Market existingMarket = marketRepository1.findById(Id).orElseThrow();
  existingMarket.setName(updatedMarket.getName());

  return marketRepository1.save(existingMarket);
 }
 public void deleteMarket(Long Id){
     marketRepository1.deleteById(Id);
 }

}
