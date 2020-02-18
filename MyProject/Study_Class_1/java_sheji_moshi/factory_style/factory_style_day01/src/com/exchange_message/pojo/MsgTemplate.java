package com.exchange_message.pojo;

import java.util.Date;

public class MsgTemplate {
    private Long id;

    private String subject;

    private String templateCode;

    private Integer templateType;

    private String language;

    private Integer defaultTemplate;

    private String aliyunCode;

    private Date createAt;

    private Date updateAt;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode == null ? null : templateCode.trim();
    }

    public Integer getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Integer getDefaultTemplate() {
        return defaultTemplate;
    }

    public void setDefaultTemplate(Integer defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
    }

    public String getAliyunCode() {
        return aliyunCode;
    }

    public void setAliyunCode(String aliyunCode) {
        this.aliyunCode = aliyunCode == null ? null : aliyunCode.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}