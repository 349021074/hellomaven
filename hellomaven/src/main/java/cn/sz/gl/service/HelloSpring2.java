package cn.sz.gl.service;

public class HelloSpring2 {
    private Integer age;
    private String stuname;

    public HelloSpring2(Integer age,String stuname){
        this.age=age;
        this.stuname=stuname;
    }

    public void show(){
        System.out.println("age="+age+",stuname="+stuname);
    }

}
