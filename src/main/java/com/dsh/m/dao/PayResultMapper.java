package com.dsh.m.dao;

import com.dsh.m.model.PayResult;
import com.dsh.m.model.PayResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayResultMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_result
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int countByExample(PayResultExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_result
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int deleteByExample(PayResultExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_result
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_result
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int insert(PayResult record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_result
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int insertSelective(PayResult record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_result
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	List<PayResult> selectByExample(PayResultExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_result
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	PayResult selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_result
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int updateByExampleSelective(@Param("record") PayResult record,
			@Param("example") PayResultExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_result
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int updateByExample(@Param("record") PayResult record,
			@Param("example") PayResultExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_result
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int updateByPrimaryKeySelective(PayResult record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_result
	 * @mbggenerated  Fri Nov 13 17:44:58 CST 2015
	 */
	int updateByPrimaryKey(PayResult record);
}