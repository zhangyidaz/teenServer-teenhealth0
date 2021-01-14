package springboot.mybatis.po;

import lombok.AllArgsConstructor;
import lombok.Data;


public class ExcelOutput {
    public TStudent tStudent;
    public TCardiopulmonary tCardiopulmonary;
    public TSomaticGame tSomaticGame;
    public TEyesight tEyesight;

    public TStudent gettStudent() {
        return tStudent;
    }

    public void settStudent(TStudent tStudent) {
        this.tStudent = tStudent;
    }

    public TCardiopulmonary gettCardiopulmonary() {
        return tCardiopulmonary;
    }

    public void settCardiopulmonary(TCardiopulmonary tCardiopulmonary) {
        this.tCardiopulmonary = tCardiopulmonary;
    }

    public TSomaticGame gettSomaticGame() {
        return tSomaticGame;
    }

    public void settSomaticGame(TSomaticGame tSomaticGame) {
        this.tSomaticGame = tSomaticGame;
    }

    public TEyesight gettEyesight() {
        return tEyesight;
    }

    public void settEyesight(TEyesight tEyesight) {
        this.tEyesight = tEyesight;
    }
}
