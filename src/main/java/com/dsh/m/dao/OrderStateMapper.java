package com.dsh.m.dao;

import com.dsh.m.model.OrderState;
import com.dsh.m.model.OrderStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderStateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_state
     *
     * @mbggenerated Mon Jul 27 21:46:46 CST 2015
     */
    int countByExample(OrderStateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_state
     *
     * @mbggenerated Mon Jul 27 21:46:46 CST 2015
     */
    int deleteByExample(OrderStateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_state
     *
     * @mbggenerated Mon Jul 27 21:46:46 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_state
     *
     * @mbggenerated Mon Jul 27 21:46:46 CST 2015
     */
    int insert(OrderState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_state
     *
     * @mbggenerated Mon Jul 27 21:46:46 CST 2015
     */
    int insertSelective(OrderState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_state
     *
     * @mbggenerated Mon Jul 27 21:46:46 CST 2015
     */
    List<OrderState> selectByExample(OrderStateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_state
     *
     * @mbggenerated Mon Jul 27 21:46:46 CST 2015
     */
    OrderState selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_state
     *
     * @mbggenerated Mon Jul 27 21:46:46 CST 2015
     */
    int updateByExampleSelective(@Param("record") OrderState record, @Param("example") OrderStateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_state
     *
     * @mbggenerated Mon Jul 27 21:46:46 CST 2015
     */
    int updateByExample(@Param("record") OrderState record, @Param("example") OrderStateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_state
     *
     * @mbggenerated Mon Jul 27 21:46:46 CST 2015
     */
    int updateByPrimaryKeySelective(OrderState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_state
     *
     * @mbggenerated Mon Jul 27 21:46:46 CST 2015
     */
    int updateByPrimaryKey(OrderState record);
}