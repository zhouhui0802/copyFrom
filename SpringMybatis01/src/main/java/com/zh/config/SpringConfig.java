package com.zh.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.zh")
/*@PropertySource("classpath:jdbc.properties")*/
/*@Import({JdbcConfig.class, MybatisConfig.class})*/
@EnableAspectJAutoProxy
public class SpringConfig {
}
