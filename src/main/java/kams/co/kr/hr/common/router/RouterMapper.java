package kams.co.kr.hr.common.router;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import kams.co.kr.hr.properties.RouterProperties;

import java.util.Map;

@Data
@ConfigurationProperties(prefix = "routers")
public class RouterMapper {

    private Map<String, RouterProperties> defaults;

    public Map<String, RouterProperties> list() {
        return this.defaults;
    }
}
