package com.jybar.web.mapper;

import com.jybar.web.entity.TblFriendLink;
import com.jybar.web.entity.TblFriendLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblFriendLinkMapper extends SqlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblfriendlink
     *
     * @mbggenerated Mon Sep 08 11:59:49 CST 2014
     */
    int countByExample(TblFriendLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblfriendlink
     *
     * @mbggenerated Mon Sep 08 11:59:49 CST 2014
     */
    int deleteByExample(TblFriendLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblfriendlink
     *
     * @mbggenerated Mon Sep 08 11:59:49 CST 2014
     */
    int deleteByPrimaryKey(Long tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblfriendlink
     *
     * @mbggenerated Mon Sep 08 11:59:49 CST 2014
     */
    int insert(TblFriendLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblfriendlink
     *
     * @mbggenerated Mon Sep 08 11:59:49 CST 2014
     */
    int insertSelective(TblFriendLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblfriendlink
     *
     * @mbggenerated Mon Sep 08 11:59:49 CST 2014
     */
    List<TblFriendLink> selectByExample(TblFriendLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblfriendlink
     *
     * @mbggenerated Mon Sep 08 11:59:49 CST 2014
     */
    TblFriendLink selectByPrimaryKey(Long tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblfriendlink
     *
     * @mbggenerated Mon Sep 08 11:59:49 CST 2014
     */
    int updateByExampleSelective(@Param("record") TblFriendLink record, @Param("example") TblFriendLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblfriendlink
     *
     * @mbggenerated Mon Sep 08 11:59:49 CST 2014
     */
    int updateByExample(@Param("record") TblFriendLink record, @Param("example") TblFriendLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblfriendlink
     *
     * @mbggenerated Mon Sep 08 11:59:49 CST 2014
     */
    int updateByPrimaryKeySelective(TblFriendLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblfriendlink
     *
     * @mbggenerated Mon Sep 08 11:59:49 CST 2014
     */
    int updateByPrimaryKey(TblFriendLink record);
}