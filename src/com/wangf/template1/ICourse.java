package com.wangf.template1;

public interface ICourse {

    default void makeCouse(){
        makePPT();
        makeVideo();
        writeArticle();
        packageCourse();
    }

    default void makePPT(){
        System.out.println("Making PPT!");
    };
    default void makeVideo(){
        System.out.println("Making video!");
    }
    default void writeArticle(){
        if (needArcitle()){
            System.out.println("Writing Article!");
        }
    }
    default boolean needArcitle(){
        return false;
    }
    void packageCourse();

}
