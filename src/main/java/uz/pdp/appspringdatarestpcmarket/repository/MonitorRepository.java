package uz.pdp.appspringdatarestpcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appspringdatarestpcmarket.entity.Address;
import uz.pdp.appspringdatarestpcmarket.entity.Monitor;
import uz.pdp.appspringdatarestpcmarket.projection.CustomAddress;
import uz.pdp.appspringdatarestpcmarket.projection.CustomMonitor;

@RepositoryRestResource(path = "monitor",excerptProjection = CustomMonitor.class)
public interface MonitorRepository extends JpaRepository<Monitor,Integer> {
}
