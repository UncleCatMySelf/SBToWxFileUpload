package com.myself.wechatfileupload.service.impl;

import com.myself.wechatfileupload.dataobject.Files;
import com.myself.wechatfileupload.repository.FilesRepository;
import com.myself.wechatfileupload.service.FilesService;
import com.myself.wechatfileupload.util.*;
import com.myself.wechatfileupload.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 13:50 2018\8\12 0012
 */
@Service
public class FilesServiceImpl implements FilesService {

    @Autowired(required = true)
    private FilesRepository repository;

    @Override
    public ResultVO save(String msg, CommonsMultipartFile faultImage) {
        Files files = new Files();
        files.setId(KeyUtil.genUniqueKey());
        files.setMsg(msg);
        try {
            if (faultImage != null){
                ImgHolderUtil imgHolder = new ImgHolderUtil(faultImage.getOriginalFilename(),faultImage.getInputStream());
                if (imgHolder.getImage() != null){
                    //存储图片
                    files.setImg(addFaultImg(files,imgHolder));
                }
            }
            Files result = repository.save(files);
            return ResultVOUtil.success();
        }catch (Exception e) {
            return ResultVOUtil.error(777,"图片上传异常");
        }
    }

    private String addFaultImg(Files files, ImgHolderUtil imgHolder) {
        //获取图片目录的相对值路径
        String dest = PathUtil.getImagePath(files.getId());
        String ImgAddr = ImageUtil.generateThumbnail(imgHolder,dest);
        return ImgAddr;
    }
}
