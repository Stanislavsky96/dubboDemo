package com.chris.server.controller;

import com.chris.api.response.BaseResponse;
import com.chris.api.service.IDubboItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;

@RestController
@RequestMapping("/item")
public class ItemController {
    public static final Logger log= LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private IDubboItemService itemService;

    @GetMapping("/list")
    public BaseResponse getItemList(){
        BaseResponse res= itemService.listItems();
        return res;
    }

    @GetMapping("/search")
    public BaseResponse getSearchRes(@PathParam(value = "pageNum") Integer pageNum,
                                     @PathParam(value = "pageSize") Integer pageSize,
                                     @PathParam(value = "name") String name){
        BaseResponse res=itemService.listPageItemsParams(pageNum,pageSize,name);
        return res;
    }
}
