package com.myself.wechatfileupload.util;


import java.util.Random;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 17:18 2018\6\30 0030
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * 在并发下任然可能重复，需要加synchronized 多线程
     * @return
     */
    public static synchronized Integer genUniqueKey() {
        Random random = new Random();
        //生成6位随机数
        Integer number = random.nextInt(900000) + 100;

        return number;
    }

}
