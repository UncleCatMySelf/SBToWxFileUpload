package com.myself.wechatfileupload.service;

import com.myself.wechatfileupload.vo.ResultVO;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 13:50 2018\8\12 0012
 */
public interface FilesService {

    ResultVO save(String msg, CommonsMultipartFile faultImage);
}
