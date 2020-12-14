package com.wangf.Statement;

//视频上下文Context
public class CourseVideoContext {

    //上下文组合课程视频的状态
    private CourseVideoState courseVideoState;
    //直接new成final，可以通过享元模式来共享同一个对象，所以声明为final
    public final static PlayState PLAY_STATE = new PlayState();
    public final static SpeedState SPEED_STATE= new SpeedState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static StopState STOP_STATE = new StopState();

    //开放获取课程视频状态
    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        //把自己设置成courseVideoState的上下文，这里是关键！！！
        this.courseVideoState.setCourseVideoContext(this);
    }

    //环境（上下文）想要play，直接调用状态的play
    public void play() {
        this.courseVideoState.play();
    }

    public void speed() {
        this.courseVideoState.speed();
    }

    public void pause() {
        this.courseVideoState.pause();
    }

    public void stop() {
        this.courseVideoState.stop();
    }
}
