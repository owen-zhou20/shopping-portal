package com.sv.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sv.mall.product.entity.BrandEntity;
import com.sv.mall.product.service.BrandService;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MallProductApplication.class)
public class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
/*       BrandEntity brandEntity = new BrandEntity();
       brandEntity.setBrandId(1L);
       brandEntity.setDescript("iphone 14");

         brandEntity.setName("Apple");
        brandService.save(brandEntity);
        System.out.println("success to save BrandEntity");

        brandService.updateById(brandEntity);*/

        List<BrandEntity> brand_list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brand_list.forEach((item)->{
            System.out.println(item);
        });
    }

}
