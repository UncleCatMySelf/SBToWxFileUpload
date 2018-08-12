package com.myself.wechatfileupload.util;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 11:34 2018\8\11 0011
 */
public class PathUtil {
    private static String seperator = System.getProperty("file.separator");

    public static String getImgBasePath(){
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")){
            basePath="D:/mobookImage/image";
        }else{
            basePath = "/Users/mobook/work/image";
        }
        basePath = basePath.replace("/",seperator);
        return basePath;
    }

    public static String getImagePath(int bookId){
        String imagePath = "/upload/images/item/book/"+bookId+"/";
        return imagePath.replace("/",seperator);
    }

    public static String getImagePath(String str){
        String imagePath = "/upload/images/item/book/"+str+"/";
        return imagePath.replace("/",seperator);
    }

    public static String getCodePath(String scence){
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")){
            basePath="D:/mobookImage/image";
        }else{
            basePath = "/Users/mobook/work/image";
        }
        basePath = basePath.replace("/",seperator);
        String imagePath = basePath+"/upload/images/item/code/"+scence+"/";
        return imagePath.replace("/",seperator);
    }
}
