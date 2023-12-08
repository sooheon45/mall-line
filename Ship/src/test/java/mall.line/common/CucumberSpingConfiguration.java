package mall.line.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mall.line.ShipApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ShipApplication.class })
public class CucumberSpingConfiguration {}
