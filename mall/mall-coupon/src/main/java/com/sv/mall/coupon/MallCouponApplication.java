package com.sv.mall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1, how to use Nacos config to manage config
 * 		1), import dependency
 * 				<dependency>
 *      			<groupId>com.alibaba.cloud</groupId>
 *    				<artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *  			</dependency>
 *  	2), create bootstrap.properties , start Nacos, and write down
 *  		spring.application.name=mall-coupon
 * 			spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *  	3), add config(Data Id) in Nacos configurations named projectname.properties (mall-coupon.properties)
 *  	4), add any config in this .properties file
 *		5), get dynamic config use
 * 			@RefreshScope: get dynamic config and refresh it
 * 			@Value("${configItemKey}"):get config value
 * 			primary use Nacos configuration than application.properties file in this project
 *
 * 	2， details
 * 		1), namespace: use dev, test, and prod to separate diff environment
 * 			default: public(to retain control); all new added configuration will in this default namespace
 * 			use dev, test, and prod namespace to separate diff environment
 * 			notice: write which namespace you will use in bootstrap.properties
 * 				spring.cloud.nacos.config.namespace=a161d65d-9ccf-4545-8b1c-eb894050b908
 * 		2), namespace: use diff microservice like coupon, member, and order to separate diff environment
 *
 *  ** In this project, every microservice has its namespace and use configuration group to sparate diff environment like: dev, test, and prod
 *
 *	** Every configuration in microservice will put in the Nacos Configuration Management.
 *		1), only need to write down what config need to be load in Nacos in the bootstrap.properties.
 *		2), Can use @Value, @ConfigurationProperties and so on to get values from configurations.
 *		3), The configurations in the Nacos are used primary.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallCouponApplication.class, args);
	}

}
