package com.ximouzhao.testsomething.transaction.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * score
 * @author JBS 2019-09-19
 * @Table(name = "score")
 */
public class ScoreModel implements Serializable {
    /**
     * 
	 * @Column(name = "id")
	 * @Id
     */
    @NotNull(message = "不能为空")
    private Integer id;

    /**
     * 
	 * @Column(name = "student_no")
     */
    private Integer student_no;

    /**
     * 
	 * @Column(name = "subject")
     */
    private String subject;

    /**
     * 
	 * @Column(name = "score")
     */
    private BigDecimal score;

    /**
     * 
	 * @Column(name = "create_time")
     */
    private Date create_time;

    /**
     * 
	 * @Column(name = "update_time")
     */
    private Date update_time;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudent_no() {
        return student_no;
    }

    public void setStudent_no(Integer student_no) {
        this.student_no = student_no;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}