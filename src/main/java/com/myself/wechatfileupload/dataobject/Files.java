package com.myself.wechatfileupload.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 13:43 2018\8\12 0012
 */
@Data
@Entity
@DynamicUpdate
public class Files implements Serializable {

    private static final long serialVersionUID = 2926564967822015580L;

    @Id
    private Integer id;

    private String msg;

    private String img;

    private Date createTime;

    private Date uploadTime;
}
