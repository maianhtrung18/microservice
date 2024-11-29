package com.example.order.oder;

public class ResponseData {
    private boolean isSussces = true;
    private Object data;

    public boolean isSussces() {
        return isSussces;
    }

    public void setSussces(boolean sussces) {
        isSussces = sussces;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
