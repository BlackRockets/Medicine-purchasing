package com.example.medicine.common;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnUtil<T> {
    //layui返回数据包装
    public String getData(List<T> listData, Integer total){
        Map<String,Object> resultMap = new HashMap();
        //状态码，成功0，失败1
        resultMap.put("code","0");
        //提示消息
        resultMap.put("msg","");
        //数据（表格填充数据）
        resultMap.put("data",listData);
        //分页总条数
        resultMap.put("count",total);

        String list = JSON.toJSONString(resultMap);
        return list;
    }
}
