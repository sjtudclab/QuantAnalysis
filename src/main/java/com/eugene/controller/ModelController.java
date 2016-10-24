package com.eugene.controller;

import com.eugene.common.Constants;
import com.eugene.exception.ErrorCode;
import com.eugene.exception.RestException;
import com.eugene.model.*;
import com.eugene.service.ModelBacktestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by eugene on 16/7/11.
 */
@RestController
@Api(value = "模型模块")
@RequestMapping(Constants.URI_API_BASE + "/models")
public class ModelController {
    @Autowired
    private ModelBacktestService service;

    @ApiOperation(value = "请求日区间SVM模型回测结果")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "NOT_FOUND")})
    @RequestMapping(method = RequestMethod.POST, value = "/svm")
    public DaySvmModelBacktestResult daySvmModelBacktest(@RequestBody DaySvmModelBacktestParameters modelParas){
        DaySvmModelBacktestResult res = service.doDaySvmModelBacktest(modelParas);
        if (res != null){
            return res;
        } else {
            throw new RestException("日区间SVM模型回测请求失败", ErrorCode.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "请求MA模型回测结果")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "NOT_FOUND")})
    @RequestMapping(method = RequestMethod.POST, value = "/ma")
    public MABacktestResult maBacktest(@RequestBody MABacktestParameters modelParas){
        MABacktestResult res = service.doMABacktest(modelParas);
        if (res != null){
            return res;
        } else {
            throw new RestException("MA模型回测请求失败", ErrorCode.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "请求Hurst模型结果")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "NOT_FOUND")})
    @RequestMapping(method = RequestMethod.POST, value = "/hurst")
    public HurstModelResult hurstModel(@RequestBody HurstModelParameters modelParas){
        HurstModelResult res = service.doHurstModel(modelParas);
        if (res != null){
            return res;
        } else {
            throw new RestException("Hurst模型请求失败", ErrorCode.INTERNAL_SERVER_ERROR);
        }
    }

}
