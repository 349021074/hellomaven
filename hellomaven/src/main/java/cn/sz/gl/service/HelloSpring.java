package cn.sz.gl.service;

public class HelloSpring {

    private Integer age;
    private String stuname;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public void show(){
        System.out.println("调用了HelloSpring的show方法,age="+age+",stuname="+stuname);
    }
}