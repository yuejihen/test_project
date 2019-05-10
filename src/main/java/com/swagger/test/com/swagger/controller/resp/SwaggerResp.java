package com.swagger.test.com.swagger.controller.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by mopengxiang on 2019-05-08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class SwaggerResp {

    @ApiModelProperty(value = "id", required = true)
    private int id;

    @ApiModelProperty(value = "名称", required = true)
    private String name;
}
