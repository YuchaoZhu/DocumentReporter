package com.daimler.itscs.ms.service;

import com.daimler.itscs.ms.domain.City;

/**
 * Created by zhuyuchao on 2017/3/13.
 */
public interface ICityService{
    City getCityByName(String name);
}
