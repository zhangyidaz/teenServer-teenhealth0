package springboot.mybatis.po;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public static CommonResult success(Object data){
        CommonResult commonResult=new CommonResult();
        commonResult.setCode(200);
        commonResult.setMsg("操作成功");
        commonResult.setData(data);
        return commonResult;
    }

    public static CommonResult success(){
        CommonResult commonResult=new CommonResult();
        commonResult.setCode(200);
        commonResult.setMsg("操作成功");
        return commonResult;
    }

    public static CommonResult fail(){
        CommonResult commonResult=new CommonResult();
        commonResult.setCode(300);
        commonResult.setMsg("操作失败");
        return commonResult;
    }
}
