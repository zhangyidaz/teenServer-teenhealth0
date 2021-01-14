package teenhealth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("teenhealth.mybatis.mapper")
public class TeenhealthApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeenhealthApplication.class, args);
    }

}
