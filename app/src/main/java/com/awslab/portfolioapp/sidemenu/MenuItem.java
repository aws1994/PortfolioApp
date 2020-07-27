package com.awslab.portfolioapp.sidemenu;

public class MenuItem {

    private int icon,code;
    private boolean isSelected;

    public MenuItem(int icon, int code) {
        this.icon = icon;
        this.code = code;
    }

    public MenuItem(int icon, int code, boolean isSelected) {
        this.icon = icon;
        this.code = code;
        this.isSelected = isSelected;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
