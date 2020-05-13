package com.example.springcloud.client.output;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Output Controller
 *
 * @author L.X <gugia@qq.com>
 */
@RefreshScope
@RestController
public class OutputController {

    @Value("${key}")
    private String key;

    @Value("${loc.value}")
    private String value;

    @GetMapping("/print/key")
    public String getKey() {
        return this.key;
    }

    @GetMapping("/print/value")
    public String getValue() {
        return this.value;
    }
}
