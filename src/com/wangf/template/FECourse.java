package com.wangf.template;

//FE前端课程类
public class FECourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供前端代码");
        System.out.println("提供图片素材");
    }
    //前端课程要编写手记，那就重写hook
    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
