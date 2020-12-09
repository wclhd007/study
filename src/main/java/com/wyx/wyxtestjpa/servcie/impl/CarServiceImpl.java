package com.wyx.wyxtestjpa.servcie.impl;


import com.wyx.wyxtestjpa.pojo.CarPojo;
import com.wyx.wyxtestjpa.respository.CarRepository;
import com.wyx.wyxtestjpa.servcie.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SpringBootJPA
 * @description: 车模型业务实现类
 * @author: LouYue
 * @create: 2019-08-13 16:18
 **/
@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public CarPojo add(CarPojo pojo) {
        return carRepository.save(pojo);
    }

    @Override
    public void deleteById(Integer id) {
        carRepository.deleteById(id);
    }

    @Override
    public CarPojo update(CarPojo pojo) {
        return carRepository.save(pojo);
    }

    @Override
    public List<CarPojo> selectList() {
        return carRepository.findAll();
    }

    @Override
    public List<CarPojo> selectListSorts() {
        return null;
    }

//    @Override
//    public List<CarPojo> selectListSorts() {
//        return carRepository.findAll(new Sort(Sort.Direction.DESC,"createTime"));
//    }

    @Override
    public CarPojo selectById(Integer id) {
        return carRepository.getById(id);
    }
}