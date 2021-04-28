package com.wb.welfare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages="com.wb.welfare.dominio")/*forçando a escanear todas as classes de dominio*/
@ComponentScan(basePackages= {"com.wb.*"})/*forçando o spring a procurar dentro dos pacotes,evita erro no requestmapping*/

public class WelfareApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelfareApplication.class, args);
	}

}
