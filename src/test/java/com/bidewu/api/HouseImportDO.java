package com.bidewu.api;


import lombok.Data;

import java.util.Date;

/**
 * @author WuShoulei on 2017/12/5
 */
@Data
public class HouseImportDO {

    /**
     * 导入房源所属城市
     */
    private String city;

    /**
     * 对方的房源Id
     * 区别于我方 houseId
     */
    private String fangyuanId;

    /**
     * 房源标题
     */
    private String houseTitle;

    /**
     * 房源描述
     */
    private String houseDesc;

    /**
     * 建筑面积
     */
    private Double buildArea;

    /**
     * 楼盘Id
     * 区别于我方newcode
     */
    private String loupanId;

    /**
     * 楼盘名/小区名
     */
    private String projName;

    /**
     * 区县
     */
    private String district;

    /**
     * 商圈
     */
    private String circle;

    /**
     * 楼盘/小区地址
     */
    private String address;

    /**
     * 建成年代
     */
    private String year;

    /**
     * 价格
     */
    private Double price;

    /**
     * 价格单位
     */
    private String priceUnit;

    /**
     * 配套设施
     */
    private String accessory;

    /**
     * 交通状况
     */
    private String traffic;

    /**
     * 房源标签
     * 如：[1,4,8,16]
     注1:近地铁 4:随时看 8:满二年 16:满五年 32:近公园
     */
    private Integer[] tags;

    /**
     * 周边配套
     */
    private String round;

    /**
     * 朝向
     * 1:东,2:西,3:南,4:北,5:东南,6:西南,7:东北,8:西北,9:东西,10:南北
     */
    private Integer forward;

    /**
     * 产权性质
     * 1:已购公房,2:商品房,3:空置房,4:使用权房,5:央产,6:经济适用房
     */
    private Integer propertyRight;

    /**
     * 看房时间
     * 1, "随时看房", 2,电话预约", 3, "非工作时间
     */
    private Integer lookTime;

    /**
     * 几室
     */
    private Integer room;

    /**
     * 几厅
     */
    private Integer hall;

    /**
     * 几厨
     */
    private Integer kitchen;

    /**
     * 几卫
     */
    private Integer toilet;

    /**
     * 阳台个数
     */
    private Integer balcony;

    /**
     * 总的楼层数
     */
    private Integer totalFloor;

    /**
     * 高层、低层、中层
     */
    private String floor;

    /**
     * 具体楼层数
     */
    private Integer floorNo;

    /**
     * 装修程度
     * 1:毛坯 2:普通装修 3:精装修 4:豪华装修 5:其他
     */
    private Integer fitment;

    /**
     * 建筑类别：1：板楼，2：塔楼，3：板塔结合，4：砖楼5：其他
     */
    private Integer buildCategory;

    /**
     * 建筑形式1：低层，2：多层，3：小高层，4：高层，5：超高层
     */
    private Integer buildForm;

    /**
     * 房屋类型/住宅类别：1：普通住宅，2：公寓，3：酒店式公寓，4：花园洋房，5：商住楼，6：独栋别墅，7：联排别墅，8：经济适用房，
     * 9：廉租房，10：公共租赁房，11：定向安置房，12：两限商品房，13：自住型商品房，14：其他
     */
    private Integer houseType;

    /**
     * 标题图
     */
    private String logoPic;

    /**
     * 户型图
     */
    private String[] layoutPic;

    /**
     * 室内图
     */
    private String[] roomPic;

    /**
     * 室外图
     */
    private String[] outPic;

    /**
     * 导入方经纪人Id
     */
    private String agentId;

    /**
     * 经纪人姓名
     */
    private String agentName;

    /**
     * 经纪人电话
     */
    private String agentTel;

    /**
     * 展示电话
     */
    private String displayTel;

    /**
     * 经纪人头像
     */
    private String agentPic;

    /**
     * 经纪人信息卡
     */
    private String agentInfoCard;

    /**
     * 更新时间
     */
    private Date updateTime;
}