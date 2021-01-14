package springboot.mybatis.po;

public class TClassCustom extends TClass {
    private TTeacher tTeacher;

    private TGrade tGrade;

    public TTeacher gettTeacher() {
        return tTeacher;
    }

    public void settTeacher(TTeacher tTeacher) {
        this.tTeacher = tTeacher;
    }

    public TGrade gettGrade() {
        return tGrade;
    }

    public void settGrade(TGrade tGrade) {
        this.tGrade = tGrade;
    }
}
