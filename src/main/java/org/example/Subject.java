package org.example;

import java.util.List;

public class Subject {
    private String name;
    private List<Integer> markList;


    public Subject(String name){
        this.name=name;
    }
    public Subject(String name, List<Integer> markList){
        this.markList = List.copyOf(markList);
        this.name=name;
    }


    public double getAverage(){
        double average = 0;
        for (int actualMark: markList) {
            average += actualMark;
        }
        average /= markList.size();
        return average;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarkList(){
        return markList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarkList(List<Integer> markList){
        this.markList =List.copyOf(markList);
    }
}
