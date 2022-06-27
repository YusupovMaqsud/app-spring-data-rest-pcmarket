package uz.pdp.appspringdatarestpcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appspringdatarestpcmarket.entity.Address;
import uz.pdp.appspringdatarestpcmarket.entity.PCMarket;
import uz.pdp.appspringdatarestpcmarket.projection.CustomAddress;
import uz.pdp.appspringdatarestpcmarket.projection.CustomPCMarket;

@RepositoryRestResource(path = "pcmarket",excerptProjection = CustomPCMarket.class)
public interface PCMarketRepository extends JpaRepository<PCMarket,Integer> {
}
