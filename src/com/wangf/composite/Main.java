package com.wangf.composite;

public class Main {
    public static void main(String[] args) {

        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent algorithmCourse = new Course("算法课程", 11);

        //java课程目录及3个子课程
        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录");
        CatalogComponent j2eeCourse1 = new Course("J2EE课程1", 55);
        CatalogComponent j2eeCourse2 = new Course("J2EE课程2", 66);
        CatalogComponent j2eeCourse3 = new Course("J2EE课程3", 77);

        javaCourseCatalog.add(j2eeCourse1);
        javaCourseCatalog.add(j2eeCourse2);
        javaCourseCatalog.add(j2eeCourse3);

        //主目录,既可以添加课程也可以添加目录，把它们视为同一个对象，减少对象使用时的差异
        CatalogComponent mainCourseCatalog = new CourseCatalog("主目录");
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(algorithmCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();
    }
}
