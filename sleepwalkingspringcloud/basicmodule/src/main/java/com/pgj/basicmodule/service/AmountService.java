package com.pgj.basicmodule.service;

import com.pgj.basicmodule.dao.AmountMapper;
import com.pgj.basicmodule.model.Amount;
import com.pgj.basicmodule.model.AmountExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2019/10/3 11:12
 */
@Service
public class AmountService {
    @Autowired
   private AmountMapper amountMapper;

    public boolean createAmount(Amount Amount) {
        return amountMapper.insert(Amount) > 0 ? true : false;
    }

    public List<Amount> selectAmountByName(String amountName) {
        AmountExample amountExample = new AmountExample();
        AmountExample.Criteria criteria = amountExample.createCriteria().andAmountNameLike('%' + amountName + '%');
        List<Amount> amounts = amountMapper.selectByExample(amountExample);
        return amounts;
    }


}
