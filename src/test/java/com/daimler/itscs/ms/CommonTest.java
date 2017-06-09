package com.daimler.itscs.ms;

import com.daimler.itscs.ms.domain.City;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;

/**
 * Created by Chris on 2017/3/15.
 */
public class CommonTest {

    @Test
    public void testObjToJson() {
        City city = new City();
        city.setName("beijing");
        city.setCountryCode("110");
        city.setDistrict("China");
        city.setPopulation(100000);

        Gson gson = new GsonBuilder().create();
        String jsonString = gson.toJson(city);
        System.out.println(jsonString);
    }
}
