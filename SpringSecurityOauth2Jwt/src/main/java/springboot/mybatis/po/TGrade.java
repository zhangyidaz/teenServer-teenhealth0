package springboot.mybatis.po;

public class TGrade {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grade.id
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    private String id;

    private String gradeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_grade.sort
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    private Integer sort;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grade.id
     *
     * @return the value of t_grade.id
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grade.id
     *
     * @param id the value for t_grade.id
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grade.grade_name
     *
     * @return the value of t_grade.grade_name
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public String getGradeName() {
        return gradeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grade.grade_name
     *
     * @param gradeName the value for t_grade.grade_name
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_grade.sort
     *
     * @return the value of t_grade.sort
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_grade.sort
     *
     * @param sort the value for t_grade.sort
     *
     * @mbggenerated Sat Mar 07 21:35:32 CST 2020
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}