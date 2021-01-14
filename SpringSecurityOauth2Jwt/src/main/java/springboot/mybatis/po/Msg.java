package springboot.mybatis.po;

import java.util.List;

public class Msg {
    //状态码 200-成功，300-失败，310-测试成绩无效无法生成处方
    private int code;
    //提示信息
    private String msg;

    private Object value;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    //返回成功信息
    public static Msg success(){
        Msg result=new Msg();
        result.setCode(200);
        return result;
    }
    public static Msg success(Object value){
        Msg result=new Msg();
        result.setValue(value);
        result.setCode(200);
        return result;
    }

    public static Msg success(List<Object> value){
        Msg result=new Msg();
        result.setCode(200);
        result.value=value;
        return result;
    }

    //返回失败信息
    public static Msg fail(){
        Msg result=new Msg();
        result.setCode(300);
        return result;
    }

    public static Msg fail(Object value){
        Msg result=new Msg();
        result.setCode(300);
        result.setValue(value);
        return result;
    }

    //返回失败信息
    public static Msg fail1(){
        Msg result=new Msg();
        result.setCode(310);
        return result;
    }
}
