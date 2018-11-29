package com.glory.yuxueyuan;

/**
 * Create by glorizz on 2018/11/28
 * Describe:
 */
public class JsonPaser {
    int endMonth, StartMonth, typeId, userId;

    public int getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(int endMonth) {
        this.endMonth = endMonth;
    }

    public int getStartMonth() {
        return StartMonth;
    }

    public void setStartMonth(int startMonth) {
        StartMonth = startMonth;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "JsonPaser{" +
                "endMonth=" + endMonth +
                ", StartMonth=" + StartMonth +
                ", typeId=" + typeId +
                ", userId=" + userId +
                '}';
    }
}
