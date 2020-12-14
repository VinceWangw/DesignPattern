package com.wangf.template;

//模版类，制作课程的步骤
public abstract class ACourse {
    //ACourse中定义的模版是不想被修改的，所以方法被声明为final
    protected final void makeCourse() {
        this.makePPT();     //必须制作ppt
        this.makeVideo();   //必须制作视频
        if (needWriteArticle()) {       //制作手记是可选的，这边需要使用hook，子类可以重写hook
            this.writeArticle();
        }
        this.packageCourse();
    }
    //拆解小步骤
    //所有的课程都要制作ppt（如果这个方法所有的子类都不需要重写，就声明为final）
    final void makePPT() {
        System.out.println("制作PPT");
    }
    final void makeVideo() {
        System.out.println("制作视频");
    }
    //对于课程来说，编写手记是一个可选项，可写可不写
    final void writeArticle() {
        System.out.println("编写手记");
    }
    //hook方法,它不是final的，子类可以覆盖它
    protected boolean needWriteArticle() {
        return false;
    }
    //包装课程，对于不同的课程，包装的素材都是不一样的，交给子类来实现
    abstract void packageCourse();
}
