package com.swagger.test.com.swagger.controller;

import com.swagger.test.com.swagger.controller.req.SwaggerReq;
import com.swagger.test.com.swagger.controller.resp.SwaggerResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mopengxiang on 2019-05-08
 */
@RestController
@EnableSwagger2
@Api
public class SwaggerTestController {

    private static Map<Integer, SwaggerResp> userMap = new HashMap<>();

    static {
        userMap.put(1, new SwaggerResp(1, "oneName"));
        userMap.put(2, new SwaggerResp(1, "twoName"));
    }

    @ApiOperation(value = "测试")
    @GetMapping("/get")
    public SwaggerResp getResp(@Valid SwaggerReq req) {
        SwaggerResp swaggerResp = new SwaggerResp();
        swaggerResp.setId(1);
        swaggerResp.setName(req.getUserName());
        return swaggerResp;
    }

    @ApiOperation(value = "测试")
    @GetMapping("/{id}/get")
    public SwaggerResp getResp(@PathVariable int id) {
        return userMap.get(id);
    }
}
