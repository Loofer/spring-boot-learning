package com.loofer.service.impl;

import com.loofer.domain.City;
import com.loofer.service.CityService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {


    @Override
    public List<City> findAllCity() {
        City city = new City();
        city.setCityName("深圳");
        city.setDescription("一个美丽的城市");
        city.setId(1000L);
        city.setProvinceId(200L);
        City city1 = new City();
        city1.setId(1001L);
        city1.setProvinceId(201L);
        city1.setDescription("华裔成立个国家城市");
        city1.setCityName("新加坡");
        List<City> cityList = new ArrayList<>();
        cityList.add(city);
        cityList.add(city1);
        return cityList;
    }

    @Override
    public City findCityById(Long id) {
        City city = new City();
        city.setCityName("深圳");
        city.setDescription("一个美丽的城市");
        city.setId(1000L);
        city.setProvinceId(200L);
        return city;
    }


}
