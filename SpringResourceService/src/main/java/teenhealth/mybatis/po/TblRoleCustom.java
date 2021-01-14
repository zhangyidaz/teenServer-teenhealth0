package teenhealth.mybatis.po;

public class TblRoleCustom extends TblRole {
    private TblUser tblUser;

    private TblRole tblRole;

    public TblUser getTblUser() {
        return tblUser;
    }

    public void setTblUser(TblUser tblUser) {
        this.tblUser = tblUser;
    }

    public TblRole getTblRole() {
        return tblRole;
    }

    public void setTblRole(TblRole tblRole) {
        this.tblRole = tblRole;
    }
}
