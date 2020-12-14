package com.wangf.template1;

public class FECourse implements ICourse {
    @Override
    public void packageCourse() {
        System.out.println("提供前端代码");
        System.out.println("提供图片素材");

    }

    @Override
    public boolean needArcitle() {
        return true;
    }
}
