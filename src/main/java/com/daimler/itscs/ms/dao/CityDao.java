package com.daimler.itscs.ms.dao;

import com.daimler.itscs.ms.domain.City;
import com.daimler.itscs.ms.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhuyuchao on 2017/3/13.
 */
@Component
public class CityDao {

    @Autowired
    private CityMapper cityMapper;

    public City getCityByName(String name) {
        return cityMapper.getCityByName(name);
    }
}
