package com.kifiyaApi.kifiyaApi.Service;

import com.kifiyaApi.kifiyaApi.Model.HealthServiceProviders;
import com.kifiyaApi.kifiyaApi.Repository.HSProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HSProviderService {

    private HSProviderRepository hsProviderRepository;

    @Autowired
    public void setHsProviderRepository(HSProviderRepository hsProviderRepository) {
        this.hsProviderRepository = hsProviderRepository;
    }

    public HealthServiceProviders saveHealthServiceProvider (HealthServiceProviders providers){
        HealthServiceProviders newProvider = new HealthServiceProviders();
        newProvider.setName(providers.getName());
        newProvider.setDescription(providers.getDescription());
        newProvider.setAddress(providers.getAddress());
        hsProviderRepository.save(newProvider);
        return newProvider;
    }
}
