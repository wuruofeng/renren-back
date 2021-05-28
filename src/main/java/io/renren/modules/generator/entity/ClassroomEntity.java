package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-09 18:02:48
 */
@Data
@TableName("classroom")
public class ClassroomEntity implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 
	 */
	@TableId
	private Integer classroomId;
	/**
	 * 
	 */
	private String classroomNum;

}
