package com.jiangyuqin.constance;

public enum Constance {

    SYSDEBUGE(true);

    public String strValue;

    public Boolean booleanValue;

    private Constance(String value){
        this.strValue = value;
    }
    private Constance(Boolean value){
        this.booleanValue = value;
    }
}
