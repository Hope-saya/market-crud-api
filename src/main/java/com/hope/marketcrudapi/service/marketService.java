package com.hope.marketcrudapi.service;

import com.hope.marketcrudapi.model.Market;
import com.hope.marketcrudapi.repository.marketRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Member;
import java.util.List;

import static org.apache.tomcat.util.net.openssl.OpenSSLStatus.getName;

@Service
public class marketService {

 private marketRepository marketRepository1;

 public marketService(marketRepository marketRepository1){
     this.marketRepository1 = marketRepository1;
 }

 public List<Market> getAllMembers(){
     return marketRepository1.findAll();
 }

 public Market createMarket(Market market){
     return marketRepository1.save(market);
 }
 public Market updateMarket(Long Id, Market updatedMarket)
 {
  Market existingMarket = marketRepository1.findById(Id).orElseThrow();
  existingMarket.setName(updatedMarket.getName());

  return marketRepository1.save(existingMarket);
 }

 public void deleteMarket(Long Id){
     marketRepository1.deleteById(Id);
 }

}
