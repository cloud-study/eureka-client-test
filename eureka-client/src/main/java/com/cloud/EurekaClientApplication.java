package com.cloud;

import com.cloud.config.EnableAllCommonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@EnableAllCommonConfig
//@RemoteApplicationEventScan(basePackages = "com.cloud.event.basic")
public class EurekaClientApplication {

//	/**
//	 * 启动多个实例
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String port = scanner.nextLine();
//		new SpringApplicationBuilder(EurekaClientApplication.class)
//				.properties("server.port=" + port).run(args);
//	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
