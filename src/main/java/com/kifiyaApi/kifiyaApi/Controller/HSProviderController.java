package com.kifiyaApi.kifiyaApi.Controller;

import com.kifiyaApi.kifiyaApi.Model.HealthServiceProvider;
import com.kifiyaApi.kifiyaApi.Service.HSProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/providers")
public class HSProviderController {

    private HSProviderService hsProviderService;

    @Autowired
    public void setHsProviderService(HSProviderService hsProviderService) {
        this.hsProviderService = hsProviderService;
    }

    @GetMapping(path = "/all")
    public List<HealthServiceProvider> getAllProviders(){
        return hsProviderService.getAllProviders();
    }

    @GetMapping(path = "/{prov_id}")
    public HealthServiceProvider getOneProvider(@PathVariable(name = "prov_id") Long id){
        return hsProviderService.getOneProvider(id);
    }

    @PostMapping(path = "/addnew")
    public HealthServiceProvider addProvider
            (@RequestBody HealthServiceProvider provider){
        return hsProviderService.addHealthServiceProvider(provider);
    }

    @PutMapping(path = "/{prov_id}")
    public HealthServiceProvider updateProvider
            (@PathVariable(name = "prov_id") Long id, @RequestBody HealthServiceProvider provider){
        return hsProviderService.updateProvider(id,provider);
    }

    @DeleteMapping(path = "/{prov_id}")
    public void deleteProvider(@PathVariable (name = "prov_id")Long id){
        hsProviderService.deleteProvider(id);
    }
}
