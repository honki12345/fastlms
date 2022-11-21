package com.zerobase.fastlms.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Member implements MemberCode {
    @Id
    private String userId;
    private String password;
    private String phone;
    private LocalDateTime regDt;
    private String userName;

    private String emailAuthKey;
    private boolean emailAuthYn;
    private LocalDateTime emailAuthDt;


    private String resetPasswordKey;
    private LocalDateTime resetPasswordLimitDt;

    private boolean adminYn;

    private String userStatus; // 이용가능상태, 정지
}
