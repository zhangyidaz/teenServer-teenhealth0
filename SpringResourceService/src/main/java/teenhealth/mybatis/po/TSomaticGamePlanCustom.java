package teenhealth.mybatis.po;

public class TSomaticGamePlanCustom extends TSomaticGamePlan {
    private TStudent tStudent;

    public TStudent gettStudent() {
        return tStudent;
    }

    public void settStudent(TStudent tStudent) {
        this.tStudent = tStudent;
    }
}
