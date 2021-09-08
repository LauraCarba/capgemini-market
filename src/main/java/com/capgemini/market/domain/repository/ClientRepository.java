package com.capgemini.market.domain.repository;

import com.capgemini.market.domain.Client;

import java.util.List;
import java.util.Optional;

public interface ClientRepository {
  List<Client> getAll();
  //***********************************
  // Optional  <Client>getByName(String name);

  //***********************************
  Optional<Client> getClient(String id);
  Client save (Client client);
  void delete(String id);
}
