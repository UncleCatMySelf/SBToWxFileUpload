package com.myself.wechatfileupload.repository;

import com.myself.wechatfileupload.dataobject.Files;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 13:45 2018\8\12 0012
 */
public interface FilesRepository extends JpaRepository<Files,Integer> {
}
