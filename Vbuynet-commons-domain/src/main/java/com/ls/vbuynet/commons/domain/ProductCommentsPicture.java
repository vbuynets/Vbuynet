package com.ls.vbuynet.commons.domain;

import javax.persistence.*;

@Table(name = "sl..product_comments_picture")
public class ProductCommentsPicture {
    /**
     * 评论图片Id
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
     * 获取评论图片Id
     *
     * @return Id - 评论图片Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置评论图片Id
     *
     * @param id 评论图片Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

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