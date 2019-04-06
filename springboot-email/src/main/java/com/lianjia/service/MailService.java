package com.lianjia.service;

/**
 * 邮件的业务层接口
 * @author panli
 * @date 2019.01.24
 */
public interface MailService {

    /**
     * 发送简单邮件抽象方法
     * @param to
     * @param subject
     * @param content
     */
    public void sendSimpleMail(String to, String subject, String content);

}
