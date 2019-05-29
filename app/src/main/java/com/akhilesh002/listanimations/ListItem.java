package com.akhilesh002.listanimations;

public class ListItem {

    private String name;
    private String disc1;
    private String disc2;
    private String disc3;

    public ListItem() {
    }

    public ListItem(String name, String disc1, String disc2, String disc3) {
        this.name = name;
        this.disc1 = disc1;
        this.disc2 = disc2;
        this.disc3 = disc3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisc1() {
        return disc1;
    }

    public void setDisc1(String disc1) {
        this.disc1 = disc1;
    }

    public String getDisc2() {
        return disc2;
    }

    public void setDisc2(String disc2) {
        this.disc2 = disc2;
    }

    public String getDisc3() {
        return disc3;
    }

    public void setDisc3(String disc3) {
        this.disc3 = disc3;
    }
}
