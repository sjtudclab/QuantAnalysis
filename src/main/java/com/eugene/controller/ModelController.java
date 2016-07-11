package com.eugene.controller;

import com.eugene.common.Constants;
import com.eugene.exception.ErrorCode;
import com.eugene.exception.RestException;
import com.eugene.model.Admin;
import com.eugene.model.ModelBacktestParameters;
import com.eugene.model.ModelBacktestResult;
import com.eugene.service.ModelBacktestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by eugene on 16/7/11.
 */
@RestController
@Api(value = "模型模块")
@RequestMapping(Constants.URI_API_BASE + "/models")
public class ModelController {
    @Autowired
    private ModelBacktestService service;

    @ApiOperation(value = "请求模型回测结果")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "NOT_FOUND")})
    @RequestMapping(method = RequestMethod.POST, value = "/svm")
    public ModelBacktestResult svmModelBacktest(@RequestBody ModelBacktestParameters modelParas){
        ModelBacktestResult res = service.doModelBacktest(modelParas);
        if (res != null){
            return res;
        } else {
            throw new RestException("模型回测请求失败", ErrorCode.INTERNAL_SERVER_ERROR);
        }
    }

}
