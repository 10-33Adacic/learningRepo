package com.learning.controller;

/**
 * Created by Templar on 19.07.2019.
 */
public interface Regex {
    String REGEX_LAST_NAME = "^[[A-Z][a-z]+(-[A-Z]?[a-z])?]+|([A-Z]?[a-z]+ +[A-Z][a-z](-[A-Z]?[a-z])?){1,20}$";
    String REGEX_LAST_NAME_UKR = "^[[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']+(-[А-ЩЬЮЯҐІЇЄ]?[а-щьюяґіїє'])?]+|([А-ЩЬЮЯҐІЇЄ]?[а-щьюяґіїє']+ +[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє'](-[А-ЩЬЮЯҐІЇЄ]?[а-щьюяґіїє'])?){1,20}$";
    String REGEX_FIRST_NAME = "^[A-Z][a-z]{1,20}$";
    String REGEX_FIRST_NAME_UKR = "^[А-ЩЬЮЯЇІЄҐ][а-щьюяїієґ']{1,20}$";
    String REGEX_PATRONYMIC = "^[A-Z][a-z]+[ '\\w^\\d]?$";
    String REGEX_PATRONYMIC_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']+[ '\\w^\\d]?$";
    String REGEX_NICKNAME = "^[A-Za-z0-9_]+$";
    String REGEX_COMMENT = ".{0,500}";
    String REGEX_GROUP = "^GROUP[1-3]+$";
    String REGEX_TELEPHONE = "^[(\\+?[\\(\\d\\)]{1,6}]?\\d{4,10}$";
    String REGEX_TELEPHONE_MOB = "^[(\\+?[\\(\\d\\)]{1,4}]?\\d{5,12}$";
    String REGEX_TELEPHONE_MOB_SECOND = "^[(\\+?[\\(\\d\\)]{1,4}]?\\d?{5,12}$";
    String REGEX_EMEAIL = "^[\\d\\w_\\.]+@+[\\w\\d]+\\.\\w{2,4}$";
    String REGEX_SKYPE = "^[\\d\\w_\\.\\-,]{5,14}$";
    String REGEX_INDEX = "^[\\d]{4,9}$";
    String REGEX_CITY = "^[A-Z]{1}[A-Za-z\\-' ]{3,30}$";
    String REGEX_STREET = "^[A-Z]{1}[A-Za-z\\-' ]{3,40}$";
    String REGEX_HOUSE = "^[1-9]{1}[\\d]{0,3}[A-Za-z]?$";
    String REGEX_APPARTMENT = "^[1-9]{1}[\\d]{0,3}$";
    String REGEX_CREATE_DATE = "^[\\d]{2}\\.[\\d]{2}\\.[\\d]{2,4}$";
    String REGEX_CHANGE_DATE = "^[\\d]{2}\\.[\\d]{2}\\.[\\d]{2,4}$";
}
