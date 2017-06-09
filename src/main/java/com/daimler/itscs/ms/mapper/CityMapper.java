package com.daimler.itscs.ms.mapper;

import com.daimler.itscs.ms.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


/**
 * Created by Alex on 2017/3/10.
 */

@Component
public interface CityMapper {
    public City getCityByName(String name);
}
