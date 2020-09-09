package com.changgou.goods.service;

import com.changgou.pojo.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: <br/>
 * date: 2020/9/10 0:31<br/>
 *
 * @author MuyerJ<br />
 */
public interface BrandService {

    /**
     * 查询所有
     * @return
     */
    List<Brand> findAll();
}