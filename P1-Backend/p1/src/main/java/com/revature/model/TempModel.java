package com.revature.model;

public class TempModel {

    private int tempModelId;
    private int someField;
    private String someOtherField;

    public TempModel(int tempModelId, int someField, String someOtherField) {
        this.tempModelId = tempModelId;
        this.someField = someField;
        this.someOtherField = someOtherField;
    }

    public int getTempModelId() {
        return tempModelId;
    }


    public void setTempModelId(int tempModelId) {
        this.tempModelId = tempModelId;
    }

    public int getSomeField() {
        return someField;
    }


    public void setSomeField(int someField) {
        this.someField = someField;
    }

    public String getSomeOtherField() {
        return someOtherField;
    }


    public void setSomeOtherField(String someOtherField) {
        this.someOtherField = someOtherField;
    }

    public String toString() {
        return "TempModel{tempModelId=" + tempModelId + ", someField=" + someField + ", someOtherField="
                + someOtherField + "}";
        
    }
    
}
