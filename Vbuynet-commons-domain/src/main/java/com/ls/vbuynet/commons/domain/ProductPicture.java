package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.domain.domain.BaseDomain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "product_picture")
public class ProductPicture  extends BaseDomain implements Serializable {
    /**
     * 图片id
     */
    /**
     * 图片路径
     */
    @Column(name = "fileName")
    private String filename;

    /**
     * 所属商品Id
     */
    @Column(name = "droductId")
    private Integer droductid;

    @Column(name = "about_picture_id")
    private Integer aboutPictureId;

    /**
     * 获取图片路径
     *
     * @return fileName - 图片路径
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置图片路径
     *
     * @param filename 图片路径
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 获取所属商品Id
     *
     * @return droductId - 所属商品Id
     */
    public Integer getDroductid() {
        return droductid;
    }

    /**
     * 设置所属商品Id
     *
     * @param droductid 所属商品Id
     */
    public void setDroductid(Integer droductid) {
        this.droductid = droductid;
    }

    /**
     * @return about_picture_id
     */
    public Integer getAboutPictureId() {
        return aboutPictureId;
    }

    /**
     * @param aboutPictureId
     */
    public void setAboutPictureId(Integer aboutPictureId) {
        this.aboutPictureId = aboutPictureId;
    }
}