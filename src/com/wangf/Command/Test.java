package com.wangf.Command;

//Client
public class Test {
    public static void main(String[] args) {

        //Receiver
        CourseVideo courseVideo = new CourseVideo("高级软件设计");

        //要传入命令控制的对象
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        //添加并执行命令
        Staff staff = new Staff();

        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);
        staff.executeCommands();
    }

}