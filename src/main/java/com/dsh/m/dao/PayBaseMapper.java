package com.dsh.m.dao;

import com.dsh.m.model.PayBase;
import com.dsh.m.model.PayBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayBaseMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_base
	 * @mbggenerated  Fri Nov 13 19:59:08 CST 2015
	 */
	int countByExample(PayBaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_base
	 * @mbggenerated  Fri Nov 13 19:59:08 CST 2015
	 */
	int deleteByExample(PayBaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_base
	 * @mbggenerated  Fri Nov 13 19:59:08 CST 2015
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_base
	 * @mbggenerated  Fri Nov 13 19:59:08 CST 2015
	 */
	int insert(PayBase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_base
	 * @mbggenerated  Fri Nov 13 19:59:08 CST 2015
	 */
	int insertSelective(PayBase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_base
	 * @mbggenerated  Fri Nov 13 19:59:08 CST 2015
	 */
	List<PayBase> selectByExample(PayBaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_base
	 * @mbggenerated  Fri Nov 13 19:59:08 CST 2015
	 */
	PayBase selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_base
	 * @mbggenerated  Fri Nov 13 19:59:08 CST 2015
	 */
	int updateByExampleSelective(@Param("record") PayBase record,
			@Param("example") PayBaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_base
	 * @mbggenerated  Fri Nov 13 19:59:08 CST 2015
	 */
	int updateByExample(@Param("record") PayBase record,
			@Param("example") PayBaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_base
	 * @mbggenerated  Fri Nov 13 19:59:08 CST 2015
	 */
	int updateByPrimaryKeySelective(PayBase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_base
	 * @mbggenerated  Fri Nov 13 19:59:08 CST 2015
	 */
	int updateByPrimaryKey(PayBase record);
}