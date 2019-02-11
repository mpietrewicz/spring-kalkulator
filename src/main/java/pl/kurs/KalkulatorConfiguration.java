package pl.kurs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="pl.kurs")
@EnableAspectJAutoProxy
public class KalkulatorConfiguration {



}
