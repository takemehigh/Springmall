package com.wg.springmall.controller.vo;

import java.util.Objects;

public class MenuVO {
    public String id;

    public String title;

    public String icon;

    public String href;

    public String spread;

    public String target;

    public String parentCode;

    public String menuCode;

    @Override
    public String toString() {
        return "MenuVO{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", href='" + href + '\'' +
                ", spread='" + spread + '\'' +
                ", target='" + target + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", menuCode='" + menuCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuVO menuVO = (MenuVO) o;
        return Objects.equals(id, menuVO.id) &&
                Objects.equals(title, menuVO.title) &&
                Objects.equals(icon, menuVO.icon) &&
                Objects.equals(href, menuVO.href) &&
                Objects.equals(spread, menuVO.spread) &&
                Objects.equals(target, menuVO.target) &&
                Objects.equals(parentCode, menuVO.parentCode) &&
                Objects.equals(menuCode, menuVO.menuCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, icon, href, spread, target, parentCode, menuCode);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getSpread() {
        return spread;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
