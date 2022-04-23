package pl.coderslab.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.spring.components.SuperHiperComponent;

public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hw = ctx.getBean("helloWorld", HelloWorld.class);
        hw.hello();
        ctx.close();

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        SuperHiperComponent shc = ctx2.getBean("superHiperComponent", SuperHiperComponent.class);
        shc.doSthUseful();
        ctx2.close();
    }
}
