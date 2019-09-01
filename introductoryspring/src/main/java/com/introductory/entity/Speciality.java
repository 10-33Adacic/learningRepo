package com.introductory.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Speciality {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String specialityName;
//    @Enumerated(EnumType.STRING)
//    private String subjects;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "user_id")

//    public Speciality() {
//    }

//    public Speciality(String specialityName
////            ,
////                      String tag,
////                      User user
//    ) {
////        this.author = user;
//        this.specialityName = specialityName;
////        this.tag = tag;
//    }

//    public String getAuthorName() {
//        return author !=null ? author.getUsername() : "<no author>";
//    }

}
