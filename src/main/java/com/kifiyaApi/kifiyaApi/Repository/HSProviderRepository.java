package com.kifiyaApi.kifiyaApi.Repository;

import com.kifiyaApi.kifiyaApi.Model.HealthServiceProviders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HSProviderRepository extends JpaRepository<HealthServiceProviders, Long> {
}
