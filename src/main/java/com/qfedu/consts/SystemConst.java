package com.qfedu.consts;

import com.qfedu.entity.tuser;

import java.util.LinkedHashMap;
import java.util.Map;

public class SystemConst {
    public static Map<String, tuser> currUsers;
    static {
        currUsers=new LinkedHashMap<>();
    }

}