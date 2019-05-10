package com.swagger.test.com.swagger.controller.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by mopengxiang on 2019-05-08
 */
@Data
@ApiModel(description = "查询参数")
public class SwaggerReq {

    @ApiModelProperty(value = "名称", required = true)
    private String userName;

    @ApiModelProperty(value = "年龄", required = true)
    private String age;
}
