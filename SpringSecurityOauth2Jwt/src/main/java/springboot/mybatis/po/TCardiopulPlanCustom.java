package springboot.mybatis.po;

public class TCardiopulPlanCustom extends TCardiopulPlan {
    private TStudent tStudent;

    public TStudent gettStudent() {
        return tStudent;
    }

    public void settStudent(TStudent tStudent) {
        this.tStudent = tStudent;
    }
}
