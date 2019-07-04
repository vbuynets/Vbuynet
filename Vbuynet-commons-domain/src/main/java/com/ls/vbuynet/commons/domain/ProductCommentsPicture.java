package com.ls.vbuynet.commons.domain;

import com.ls.vbuynet.commons.dto.AbstractBaseDomain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "product_comments_picture")
public class ProductCommentsPicture  extends AbstractBaseDomain {

    /**
     * 图片理解
     */
    @Column(name = "fileName")
    private String filename;

    /**
     * 所属评论Id
     */
    @Column(name = "product_comment_id")
    private Integer productCommentId;

    @Column(name = "userId")
    private Integer userid;


    /**
     * 获取图片理解
     *
     * @return fileName - 图片理解
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置图片理解
     *
     * @param filename 图片理解
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 获取所属评论Id
     *
     * @return product_comment_id - 所属评论Id
     */
    public Integer getProductCommentId() {
        return productCommentId;
    }

    /**
     * 设置所属评论Id
     *
     * @param productCommentId 所属评论Id
     */
    public void setProductCommentId(Integer productCommentId) {
        this.productCommentId = productCommentId;
    }

    /**
     * @return userId
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}