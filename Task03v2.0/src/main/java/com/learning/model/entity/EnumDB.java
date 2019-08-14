package com.learning.model.entity;

/**
 * Created by Templar on 30.07.2019.
 */
public enum EnumDB {

    USER1 ("Serg", "Voylosh", "Andreevich", "SVAnick", "", "GROPU1", "2354899", "0981112233", "0669993344",
            "SVA@gmail.com", "343434", "57007", "Kharkiv", "Demidovicha", "4", "33", "22.11.2016", "11.01.2017",
            "user1login");



    private String firstName;
    private String lastName;
    private String patronymic;
    private String nickName;
    private String comment;
    private String group;
    private String telephone;
    private String telephoneMobile;
    private String telephoneMobile2;
    private String email;
    private String skype;
    private String index;
    private String city;
    private String street;
    private String house;
    private String appartment;
    private String createDate;
    private String changeDate;
    private String login;

    EnumDB(String firstName, String lastName, String patronymic,
           String nickName, String comment, String group,
           String telephone, String telephoneMobile, String telephoneMobile2,
           String email, String skype, String index,
           String city, String street, String house,
           String appartment, String createDate, String changeDate,
           String login) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.nickName = nickName;
        this.comment = comment;
        this.group = group;
        this.telephone = telephone;
        this.telephoneMobile = telephoneMobile;
        this.telephoneMobile2 = telephoneMobile2;
        this.email = email;
        this.skype = skype;
        this.index = index;
        this.city = city;
        this.street = street;
        this.house = house;
        this.appartment = appartment;
        this.createDate = createDate;
        this.changeDate = changeDate;
        this.login = login;
    }

    public static void isExist throws IsExistException () {

    }

    //Temporary unnecessary
//    public static class Builder {
//
//        private EnumDB data;
//
//        public Builder() {
//        }
//    }
}
