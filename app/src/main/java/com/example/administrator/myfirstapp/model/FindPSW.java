package com.example.administrator.myfirstapp.model;

/**
 * Created by Administrator on 2016/9/26 0026.
 */
public class FindPSW {
    private int result;
    private String explain;

    public FindPSW(int result, String explain) {
        this.result = result;
        this.explain = explain;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    @Override
    public String toString() {
        return "FindPSW{" +
                "result=" + result +
                ", explain='" + explain + '\'' +
                '}';
    }
}
