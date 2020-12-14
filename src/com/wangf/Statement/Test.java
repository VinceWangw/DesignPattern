package com.wangf.Statement;

public class Test {

    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        //设置成暂停状态
        courseVideoContext.pause();
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        //设置成快进状态
        courseVideoContext.speed();
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        //设置成停止状态
        courseVideoContext.stop();
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        //从停止变快进
        courseVideoContext.speed();
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
    }
}
