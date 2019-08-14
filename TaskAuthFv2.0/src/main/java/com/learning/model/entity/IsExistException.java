package com.learning.model.entity;

/**
 * Created by Templar on 31.07.2019.
 */
public class IsExistException extends Exception {
    private String nickName;
    public IsExistException(String message) {
        super(message);
    }
}
