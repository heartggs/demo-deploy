package org.example.demodeplay;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoDeplayApplicationTests {

    @Test
    void contextLoads() {
        // 단위 테스트
        // MVC 테스트 -> 목업을 통해서 가상 처리 가능
        // RestAPI 테스트 가능
        System.out.println("단위 테스트 호출!! echo");
    }

}
