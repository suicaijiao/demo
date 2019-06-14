package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import java.math.BigDecimal;

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品属性：1捆绑商品(包含多个课程商品)2课程商品;
     */
    private Integer productType;

    /**
     * 商品科目类型：1单科目;2多科目
     */
    private Integer productCategoryType;

    /**
     * 课程商品类型：1单科目多课程;2单科目单课程
     */
    private Integer courseProductType;

    /**
     * 项目id;
     */
    private Integer itemId;

    /**
     * 科目ID
     */
    private String courseCategoryId;

    /**
     * 课程商品授课方式：0;1面授;2;网络;3;混合;
     */
    private Integer teachMode;

    /**
     * 科目范围 1全科2单科3多科
     */
    private Integer categoryScope;

    /**
     * 班型id
     */
    private String classTypeId;

    /**
     * 重听类型：1按捆绑商品;2按课程商品
     */
    private Integer rehearType;

    /**
     * 是否允许重听：1是;0否
     */
    private Integer isRehear;

    /**
     * 激活方式：1按课程商品;2按课程
     */
    private Integer onlineCourseActiveType;

    /**
     * 网课有效天数
     */
    private Integer onlineCourseDays;

    /**
     * 状态：1启用;0停用
     */
    private Integer state;

    /**
     * 说明
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 创建人用户id
     */
    private String createUid;

    /**
     * 修改时间
     */
    private Date modifyDate;

    /**
     * 修改人用户id
     */
    private String modifyUid;

    /**
     *
     */
    private Integer classHour;

    /**
     * 课程商品标准价格
     */
    private BigDecimal courseStandardPrice;

    /**
     * 课程商品参考课时
     */
    private Integer classStandardHour;

    /**
     * 是否允许分部申请特价：1是;0否
     */
    private Integer branchPriceOpenFlag;

    /**
     * 异地上课类型：1全国;2本省
     */
    private Integer remoteType;

    /**
     * 商品id
     *
     * @return String
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 商品id
     *
     * @param productId
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 商品名称
     *
     * @return String
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 商品名称
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 商品属性：1捆绑商品(包含多个课程商品)2课程商品;
     *
     * @return Integer
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 商品属性：1捆绑商品(包含多个课程商品)2课程商品;
     *
     * @param productType
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * 商品科目类型：1单科目;2多科目
     *
     * @return Integer
     */
    public Integer getProductCategoryType() {
        return productCategoryType;
    }

    /**
     * 商品科目类型：1单科目;2多科目
     *
     * @param productCategoryType
     */
    public void setProductCategoryType(Integer productCategoryType) {
        this.productCategoryType = productCategoryType;
    }

    /**
     * 课程商品类型：1单科目多课程;2单科目单课程
     *
     * @return Integer
     */
    public Integer getCourseProductType() {
        return courseProductType;
    }

    /**
     * 课程商品类型：1单科目多课程;2单科目单课程
     *
     * @param courseProductType
     */
    public void setCourseProductType(Integer courseProductType) {
        this.courseProductType = courseProductType;
    }

    /**
     * 项目id;
     *
     * @return Integer
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 项目id;
     *
     * @param itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 科目ID
     *
     * @return String
     */
    public String getCourseCategoryId() {
        return courseCategoryId;
    }

    /**
     * 科目ID
     *
     * @param courseCategoryId
     */
    public void setCourseCategoryId(String courseCategoryId) {
        this.courseCategoryId = courseCategoryId;
    }

    /**
     * 课程商品授课方式：0;1面授;2;网络;3;混合;
     *
     * @return Integer
     */
    public Integer getTeachMode() {
        return teachMode;
    }

    /**
     * 课程商品授课方式：0;1面授;2;网络;3;混合;
     *
     * @param teachMode
     */
    public void setTeachMode(Integer teachMode) {
        this.teachMode = teachMode;
    }

    /**
     * 科目范围 1全科2单科3多科
     *
     * @return Integer
     */
    public Integer getCategoryScope() {
        return categoryScope;
    }

    /**
     * 科目范围 1全科2单科3多科
     *
     * @param categoryScope
     */
    public void setCategoryScope(Integer categoryScope) {
        this.categoryScope = categoryScope;
    }

    /**
     * 班型id
     *
     * @return String
     */
    public String getClassTypeId() {
        return classTypeId;
    }

    /**
     * 班型id
     *
     * @param classTypeId
     */
    public void setClassTypeId(String classTypeId) {
        this.classTypeId = classTypeId;
    }

    /**
     * 重听类型：1按捆绑商品;2按课程商品
     *
     * @return Integer
     */
    public Integer getRehearType() {
        return rehearType;
    }

    /**
     * 重听类型：1按捆绑商品;2按课程商品
     *
     * @param rehearType
     */
    public void setRehearType(Integer rehearType) {
        this.rehearType = rehearType;
    }

    /**
     * 是否允许重听：1是;0否
     *
     * @return Integer
     */
    public Integer getIsRehear() {
        return isRehear;
    }

    /**
     * 是否允许重听：1是;0否
     *
     * @param isRehear
     */
    public void setIsRehear(Integer isRehear) {
        this.isRehear = isRehear;
    }

    /**
     * 激活方式：1按课程商品;2按课程
     *
     * @return Integer
     */
    public Integer getOnlineCourseActiveType() {
        return onlineCourseActiveType;
    }

    /**
     * 激活方式：1按课程商品;2按课程
     *
     * @param onlineCourseActiveType
     */
    public void setOnlineCourseActiveType(Integer onlineCourseActiveType) {
        this.onlineCourseActiveType = onlineCourseActiveType;
    }

    /**
     * 网课有效天数
     *
     * @return Integer
     */
    public Integer getOnlineCourseDays() {
        return onlineCourseDays;
    }

    /**
     * 网课有效天数
     *
     * @param onlineCourseDays
     */
    public void setOnlineCourseDays(Integer onlineCourseDays) {
        this.onlineCourseDays = onlineCourseDays;
    }

    /**
     * 状态：1启用;0停用
     *
     * @return Integer
     */
    public Integer getState() {
        return state;
    }

    /**
     * 状态：1启用;0停用
     *
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 说明
     *
     * @return String
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 说明
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 创建时间
     *
     * @return Date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     *
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 创建人用户id
     *
     * @return String
     */
    public String getCreateUid() {
        return createUid;
    }

    /**
     * 创建人用户id
     *
     * @param createUid
     */
    public void setCreateUid(String createUid) {
        this.createUid = createUid;
    }

    /**
     * 修改时间
     *
     * @return Date
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 修改时间
     *
     * @param modifyDate
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 修改人用户id
     *
     * @return String
     */
    public String getModifyUid() {
        return modifyUid;
    }

    /**
     * 修改人用户id
     *
     * @param modifyUid
     */
    public void setModifyUid(String modifyUid) {
        this.modifyUid = modifyUid;
    }

    /**
     * @return Integer
     */
    public Integer getClassHour() {
        return classHour;
    }

    /**
     * @param classHour
     */
    public void setClassHour(Integer classHour) {
        this.classHour = classHour;
    }

    /**
     * 课程商品标准价格
     *
     * @return BigDecimal
     */
    public BigDecimal getCourseStandardPrice() {
        return courseStandardPrice;
    }

    /**
     * 课程商品标准价格
     *
     * @param courseStandardPrice
     */
    public void setCourseStandardPrice(BigDecimal courseStandardPrice) {
        this.courseStandardPrice = courseStandardPrice;
    }

    /**
     * 课程商品参考课时
     *
     * @return Integer
     */
    public Integer getClassStandardHour() {
        return classStandardHour;
    }

    /**
     * 课程商品参考课时
     *
     * @param classStandardHour
     */
    public void setClassStandardHour(Integer classStandardHour) {
        this.classStandardHour = classStandardHour;
    }

    /**
     * 是否允许分部申请特价：1是;0否
     *
     * @return Integer
     */
    public Integer getBranchPriceOpenFlag() {
        return branchPriceOpenFlag;
    }

    /**
     * 是否允许分部申请特价：1是;0否
     *
     * @param branchPriceOpenFlag
     */
    public void setBranchPriceOpenFlag(Integer branchPriceOpenFlag) {
        this.branchPriceOpenFlag = branchPriceOpenFlag;
    }

    /**
     * 异地上课类型：1全国;2本省
     *
     * @return Integer
     */
    public Integer getRemoteType() {
        return remoteType;
    }

    /**
     * 异地上课类型：1全国;2本省
     *
     * @param remoteType
     */
    public void setRemoteType(Integer remoteType) {
        this.remoteType = remoteType;
    }


}
