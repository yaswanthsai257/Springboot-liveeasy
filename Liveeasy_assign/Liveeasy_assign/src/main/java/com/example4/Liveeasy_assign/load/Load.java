package com.example4.Liveeasy_assign.load;

import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table
public class Load {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loadid;
    @Column
    private String loadingPoint;
    @Column
    private String unloadingPoint;
    @Column
    private String productType;
    @Column
    private String truckType;
    @Column
    private int noOfTrucks;
    @Column
    private Long weight;
    @Column
    private String comment;
    @Column
    private String shipperId;
    @Column
    private String date;

    public Load() {
    }

    public Load(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks, Long weight, String comment, String date) {
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.shipperId = "shipper:" + UUID.randomUUID().toString();
        this.date = date;
    }


    public int getLoadid() {
        return loadid;
    }

    public void setLoadid(int loadid) {
        this.loadid = loadid;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public int getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(int noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Load{" +
                "loadid=" + loadid +
                ", loadingPoint='" + loadingPoint + '\'' +
                ", unloadingPoint='" + unloadingPoint + '\'' +
                ", productType='" + productType + '\'' +
                ", truckType='" + truckType + '\'' +
                ", noOfTrucks=" + noOfTrucks +
                ", weight=" + weight +
                ", comment='" + comment + '\'' +
                ", shipperId='" + shipperId + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
