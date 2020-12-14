package com.wangf.Statement;

public class PlayState extends CourseVideoState{
    @Override
    public void play() {
        System.out.println("正常播放视频状态");
    }

    @Override
    public void speed() {
        //调用父类里边的上下文，把上下文里边的状态设置成快进,直接用之前声明的常量
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
