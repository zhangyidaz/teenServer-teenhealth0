package springboot.mybatis.po;

public class TEyesightCustom extends TEyesight{
    private TStudent tStudent;

    public TStudent gettStudent() {
        return tStudent;
    }

    public void settStudent(TStudent tStudent) {
        this.tStudent = tStudent;
    }
}
