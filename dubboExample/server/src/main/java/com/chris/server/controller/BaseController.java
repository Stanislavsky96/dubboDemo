package com.chris.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.chris.api.enums.StatusCode;
import com .chris.api.response.BaseResponse;


@RestController
public class BaseController {

    private static final Logger log= LoggerFactory.getLogger(BaseController.class);

    @RequestMapping(value="/test",method = RequestMethod.GET)
    public BaseResponse test(String param){
        BaseResponse response=new BaseResponse(StatusCode.Success);
        return response;
    }
}
