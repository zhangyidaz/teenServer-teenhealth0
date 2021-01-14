package teenhealth.mybatis.po;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Msg {
    //状态码 200-成功，300-失败
    private int code;
    //提示信息
    private String msg;

    //返回的数据
    private Map<String,Object> extend=new HashMap<String, Object>();

    public Msg add(String key,Object value){
        this.getExtend().put(key, value);
        return this;
    }
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

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

    public static Msg success(){
        Msg result =new Msg();
        result.setCode(200);
        return result;
    }
    public static Msg fail(){
        Msg result=new Msg();
        result.setCode(300);
        return result;
    }

    public static Msg success(Object value){
        Msg result =new Msg();
        result.setCode(200);
        result.value=value;
        return result;
    }
    public static Msg fail(Object value){
        Msg result=new Msg();
        result.setCode(300);
        result.value=value;
        return result;
    }
    public static Msg success(List<Object> list) {
        Msg result=new Msg();
        result.setCode(200);
        result.value=list;
        return result;
    }
}
