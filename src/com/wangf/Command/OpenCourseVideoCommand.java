package com.wangf.Command;

//ConcreteComnand_1：open 创建具体类OpenCourseVideoCommand类
public class OpenCourseVideoCommand implements Command{

    //构造器要传入该命令的控制对象
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}