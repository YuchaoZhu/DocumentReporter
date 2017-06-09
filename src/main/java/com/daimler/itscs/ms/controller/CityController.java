package com.daimler.itscs.ms.controller;

import com.daimler.itscs.ms.domain.City;
import com.daimler.itscs.ms.service.ICityService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



/**
 * Created by Alex on 2017/3/11.
 */

@RestController
public class CityController {

    private static Logger logger = Logger.getLogger(CityController.class);

    @Autowired
    private ICityService iCityService;

    @RequestMapping(value = "/v1/getCityByName",method = RequestMethod.GET)
    public City selectCityByName(@RequestParam(value = "name",defaultValue = "Guagua") String name){
        logger.info("Controller is mapping to the url");
        return iCityService.getCityByName(name);
    }

    @RequestMapping(value = "/v1/putCityByName/{cityName}", method = RequestMethod.POST)
    public long updateCityByName(@PathVariable("cityName") String cityName,@RequestBody City city) {
        city.setPopulation(1000);
        return city.getPopulation();
    }





}

