package com.jarrodcodes.rollcallapi.rollcallapirepository;

import com.jarrodcodes.rollcallapi.rollcallapimodel.RollCallApiModel;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RollCallApiRepository extends JpaRepository<RollCallApiModel, Long> {

}
