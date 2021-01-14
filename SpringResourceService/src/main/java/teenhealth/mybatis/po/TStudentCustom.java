package teenhealth.mybatis.po;

public class TStudentCustom extends TStudent {
    private TGrade tGrade;
    private TClass tClass;

    public TGrade gettGrade() {
        return tGrade;
    }

    public void settGrade(TGrade tGrade) {
        this.tGrade = tGrade;
    }

    public TClass gettClass() {
        return tClass;
    }

    public void settClass(TClass tClass) {
        this.tClass = tClass;
    }
}
