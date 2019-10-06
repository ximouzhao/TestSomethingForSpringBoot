package com.ximouzhao.testsomething.transaction.model;


import javax.validation.constraints.NotNull;
import java.io.Serializable;


/**
 * student
 * @author JBS 2019-09-19
 * @Table(name = "student")
 */
public class StudentModel implements Serializable {
    /**
     * 
	 * @Column(name = "id")
	 * @Id
     */
    @NotNull(message = "不能为空")
    private Integer id;

    /**
     * 
	 * @Column(name = "name")
     */
    private String name;

    /**
     * 
	 * @Column(name = "no")
     */
    private Integer no;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }
}