package com.example.testkhalilchiha.Services;

import com.example.testkhalilchiha.Modules.Client;
import com.example.testkhalilchiha.Repository.ClientRepository;

public class ClientS implements ClientService{
    ClientRepository clientRepository;
    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }
}
