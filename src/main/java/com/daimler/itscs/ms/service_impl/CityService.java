package com.daimler.itscs.ms.service_impl;

import com.daimler.itscs.ms.dao.CityDao;
import com.daimler.itscs.ms.domain.City;
import com.daimler.itscs.ms.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhuyuchao on 2017/3/13.
 */
@Service
public class CityService implements ICityService{

    @Autowired
    private CityDao cityDao;

    @Override
    public City getCityByName(String name) {
        return cityDao.getCityByName(name);
    }
}
