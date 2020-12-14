package com.wangf.Statement;

//课程状态抽象类
public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }
    //四种状态，对应四种状态类，来继承CourseState抽象类
    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}