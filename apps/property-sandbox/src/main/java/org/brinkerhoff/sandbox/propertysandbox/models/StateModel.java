package org.brinkerhoff.sandbox.propertysandbox.models;

public class StateModel {
    private  String name;
    private  Integer totalArea;
    private String capital;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Integer totalArea) {
        this.totalArea = totalArea;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "StateModel{" +
                "name='" + name + '\'' +
                ", totalArea=" + totalArea +
                ", capital='" + capital + '\'' +
                '}';
    }
}
