package com.jarrodcodes.rollcallapi.rollcallapirepository;

import com.jarrodcodes.rollcallapi.rollcallapimodel.RollCallApiModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RollCallApiRepository extends JpaRepository<RollCallApiModel, Long> {

}
