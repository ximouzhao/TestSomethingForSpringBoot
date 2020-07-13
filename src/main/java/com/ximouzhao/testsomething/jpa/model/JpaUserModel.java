package com.ximouzhao.testsomething.jpa.model;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

/**
 * @Description  
 * @Author  ximouzhao
 * @Date 2020-05-26 
 */

@Data
@Entity
@Table ( name ="jpa_user")
public class JpaUserModel implements Serializable {

	private static final long serialVersionUID =  634254216314050791L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "user_id" )
	private String userId;

   	@Column(name = "user_name" )
	private String userName;

   	@Column(name = "create_time" )
	private Date createTime;

   	@Column(name = "update_time" )
	private Date updateTime;

}
