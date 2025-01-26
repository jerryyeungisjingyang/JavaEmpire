package com.jerry.design.chain;

import java.util.Date;

/**
 * 审批结果信息类 仅仅是用来封装审批结果
 */
public class AuthInfo {
    /**
     * "code"
     * "0000" 表示审批通过。
     * "0001" 表示审批未通过。
     * "0002" 表示审批异常。
     */
    private String code;        // 审批结果代码
    private String info;        // 审批结果描述
    private Date authDate;      // 审批时间
    private String authUserId;  // 审批人ID
    private String authUserName;// 审批人姓名

    // 构造函数
    public AuthInfo(String code, String info) {
        this.code = code;
        this.info = info;
        this.authDate = new Date(); // 默认使用当前时间
    }

    public AuthInfo(String code, String info, Date authDate) {
        this.code = code;
        this.info = info;
        this.authDate = authDate;
    }

    public AuthInfo(String code, String info, Date authDate, String authUserId, String authUserName) {
        this.code = code;
        this.info = info;
        this.authDate = authDate;
        this.authUserId = authUserId;
        this.authUserName = authUserName;
    }











    // Getter 和 Setter 方法
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getAuthDate() {
        return authDate;
    }

    public void setAuthDate(Date authDate) {
        this.authDate = authDate;
    }

    public String getAuthUserId() {
        return authUserId;
    }

    public void setAuthUserId(String authUserId) {
        this.authUserId = authUserId;
    }

    public String getAuthUserName() {
        return authUserName;
    }

    public void setAuthUserName(String authUserName) {
        this.authUserName = authUserName;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "AuthInfo{" +
                "code='" + code + '\'' +
                ", info='" + info + '\'' +
                ", authDate=" + authDate +
                ", authUserId='" + authUserId + '\'' +
                ", authUserName='" + authUserName + '\'' +
                '}';
    }
}