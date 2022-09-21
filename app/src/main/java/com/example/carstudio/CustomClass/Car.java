package com.example.carstudio.CustomClass;

import java.io.Serializable;

public class Car implements Serializable {

    private int carID;

    private String catImage, carName, carCategory, carPlateNumber, carChassisNumber,carColor;

    public Car(int carID, String catImage, String carName, String carCategory, String carPlateNumber, String carChassisNumber, String carColor) {
        this.carID = carID;
        this.catImage = catImage;
        this.carName = carName;
        this.carCategory = carCategory;
        this.carPlateNumber = carPlateNumber;
        this.carChassisNumber = carChassisNumber;
        this.carColor = carColor;
    }

    public Car() {
    }

    public Car(int carID, String catImage, String carCategory) {
        this.carID = carID;
        this.catImage = catImage;
        this.carCategory = carCategory;
    }

    public int getCarID() {
        return carID;
    }

    public String getCatImage() {
        return catImage;
    }

    public void setCatImage(String catImage) {
        this.catImage = catImage;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarCategory() {
        return carCategory;
    }

    public void setCarCategory(String carCategory) {
        this.carCategory = carCategory;
    }

    public String getCarPlateNumber() {
        return carPlateNumber;
    }

    public void setCarPlateNumber(String carPlateNumber) {
        this.carPlateNumber = carPlateNumber;
    }

    public String getCarChassisNumber() {
        return carChassisNumber;
    }

    public void setCarChassisNumber(String carChassisNumber) {
        this.carChassisNumber = carChassisNumber;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
