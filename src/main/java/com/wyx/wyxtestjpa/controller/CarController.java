package com.wyx.wyxtestjpa.controller;



import com.wyx.wyxtestjpa.pojo.CarPojo;
import com.wyx.wyxtestjpa.servcie.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: SpringBootJPA
 * @description: 车模型控制类
 * @author: LouYue
 * @create: 2019-08-13 16:28
 **/
@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    /**
     * 添加车信息
     *
     * @param pojo 传参模型
     * @return Integer
     */
//    @PutMapping(value = "/addCar")
    @PostMapping(value = "/addCar")
    public CarPojo add(@RequestBody CarPojo pojo) {
        return carService.add(pojo);
    }

    /**
     * 删除车信息 -> 主键标识
     *
     * @param id 主键标识
     */
    @DeleteMapping(value="/deleteCarById")
  //  @PostMapping(value ="/deleteCarById")
    public void deleteById(@RequestParam("id") Integer id){
        carService.deleteById(id);
    }

    /**
     * 修改车信息
     *
     * @param pojo 传参模型
     * @return CarPojo
     */
    @PostMapping(value ="/updateCar")
    public CarPojo update(@RequestBody CarPojo pojo){
        return carService.update(pojo);
    }

    /**
     * 查询车信息列表
     *
     * @return List
     */
    @PostMapping(value = "/selectListCars")
    public List<CarPojo> selectList(){
        return carService.selectList();
    }

    /**
     * 查询车信息列表 - 排序
     *
     * @return List
     */
    @GetMapping(value = "/selectListCarsSort")
    public List<CarPojo>  selectListSorts() {
        return carService.selectListSorts();
    }

    /**
     * 查询车信息 - 主键标识
     *
     * @param id 主键标识
     * @return CarPojo
     */
    @GetMapping(value="/selectCarById")
    public CarPojo selectById(@RequestParam("id") Integer id){
        return carService.selectById(id);
    }
}