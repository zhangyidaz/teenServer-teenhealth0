package teenhealth.mybatis.po;

public class TSomaticGameCustom extends TSomaticGame {
    private TStudent tStudent;

    public TStudent gettStudent() {
        return tStudent;
    }

    public void settStudent(TStudent tStudent) {
        this.tStudent = tStudent;
    }
}
