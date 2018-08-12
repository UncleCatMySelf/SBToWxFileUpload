package com.myself.wechatfileupload.controller;

import com.myself.wechatfileupload.service.FilesService;
import com.myself.wechatfileupload.util.HttpServletRequestUtil;
import com.myself.wechatfileupload.util.ResultVOUtil;
import com.myself.wechatfileupload.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 13:53 2018\8\12 0012
 */
@RestController
@RequestMapping("/api/v1/file")
public class WechatFileUploadController {

    @Autowired(required = true)
    private FilesService filesService;

    @PostMapping("/back")
    public ResultVO back(HttpSession session, HttpServletRequest request){
        String msg = HttpServletRequestUtil.getString(request,"msg");
        if (msg == null){
            return ResultVOUtil.error(444,"参数错误");
        }
        CommonsMultipartFile faultImage = null;
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        if (multipartResolver.isMultipart(request)){
            MultipartHttpServletRequest httpServletRequest = (MultipartHttpServletRequest) request;
            faultImage = (CommonsMultipartFile) httpServletRequest.getFile("file");
        }
        filesService.save(msg,faultImage);
        return ResultVOUtil.success();
    }


}
