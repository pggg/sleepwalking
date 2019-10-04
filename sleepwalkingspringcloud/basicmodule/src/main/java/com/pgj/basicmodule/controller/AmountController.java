package com.pgj.basicmodule.controller;

import com.pgj.basicmodule.model.Amount;
import com.pgj.basicmodule.service.AmountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * @author Administrator
 * @date 2019/10/3 11:43
 */

@RequestMapping("/amout")
@RestController
public class AmountController {
    @Autowired
    private AmountService amountService;
    @RequestMapping(value = "/getAmountByName/{userName}",method = RequestMethod.GET)
    public List<Amount> getUserByName(@PathVariable String userName){
        return amountService.selectAmountByName(userName);
    }
    @RequestMapping(value = "/createAmount",method = RequestMethod.POST)
    public  String createUser( Amount amount){
        return amountService.createAmount(amount)? "ok":"fail";
    }
}
