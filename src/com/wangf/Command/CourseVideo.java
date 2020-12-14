package com.wangf.Command;

//应用场景：课程视频，需要开放或关闭课程的视频
//Receiver：课程视频，接收到开关命令来执行
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {

        this.name = name;
    }

    //命令1，开放视频，针对命令1创建具体命令类OpenCourseVideoCommand
    public void open() {

        System.out.println(this.name+"视频开放");
    }

    //命令2，关闭视频,针对命令2创建具体命令类CloseCourseVideoCommand
    public void close() {

        System.out.println(this.name+"视频关闭");
    }
}
