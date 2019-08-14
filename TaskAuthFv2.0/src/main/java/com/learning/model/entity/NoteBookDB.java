package com.learning.model.entity;

/**
 * Created by Templar on 30.07.2019.
 */
public enum NoteBookDB {

    USER1 ("Serg", "Voylosh", "Andreevich", "asd", "", Groups.GROUP1, "2354899", "0981112233", "0669993344",
            "SVA@gmail.com", "343434", "57007", "Kharkiv", "Demidovicha", "4", "33", "22.11.2016", "11.01.2017");

    private String firstName;
    private String lastName;
    private String patronymic;
    private String nickName;
    private String comment;
    private Groups group;
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

    NoteBookDB (String firstName, String lastName, String patronymic,
           String nickName, String comment, Groups group,
           String telephone, String telephoneMobile, String telephoneMobile2,
           String email, String skype, String index,
           String city, String street, String house,
           String appartment, String createDate, String changeDate) {
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
    }

    public static boolean testIfExist (String nick) {
        for(NoteBookDB db: NoteBookDB.values()) {
            if(db.nickName.equals(nick)) {
                return true;
            }
        } return false;
    }
}

    //Temporary unnecessary
//    public static class Builder {
//
//        private EnumDB data;
//
//        public Builder() {
//        }
//    }

