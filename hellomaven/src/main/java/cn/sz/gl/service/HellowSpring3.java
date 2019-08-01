package cn.sz.gl.service;

public class HellowSpring3 {
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
        System.out.println("age="+age+",stuname="+stuname);
    }
}
