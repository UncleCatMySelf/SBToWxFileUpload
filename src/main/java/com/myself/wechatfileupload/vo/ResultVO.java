package com.myself.wechatfileupload.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 10:23 2018\6\13 0013
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -202525633360959892L;

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
