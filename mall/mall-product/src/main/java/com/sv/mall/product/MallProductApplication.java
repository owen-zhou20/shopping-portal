package com.sv.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *  1, integrate MyBatis-Plus
 *      1), Import dependency
 *          <!--MyBatis plus-->
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *      2), Configure
 *          1, configure Datasourse ;
 *              1. import database driver;
 *              2. configure datasourse info in application.yml
 *          2, configure MyBatis-Plus;
 *              1. Use @MapperScan
 *              2. let MyBatis-Plus know where Sql Mapping Files are ( dao.xml ).
 *
 *
 *  2, business logic Delete
 *      1), config logic rules at application.yml
 *               logic-delete-value: 1   default
 *               logic-not-delete-value: 0
 *      2), add logic delete annotation at the filed (Bean) in the entity  @TableLogic
 *
 *
 */
@EnableDiscoveryClient
@MapperScan("com.sv.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
