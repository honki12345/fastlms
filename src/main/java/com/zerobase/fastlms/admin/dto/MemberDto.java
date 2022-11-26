package com.zerobase.fastlms.admin.dto;

import com.zerobase.fastlms.member.entity.Member;
import java.time.format.DateTimeFormatter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MemberDto {

    String userId;

    String password;
    String phone;
    LocalDateTime regDt;
    LocalDateTime udtDt;
    String userName;

    String emailAuthKey;
    boolean emailAuthYn;
    LocalDateTime emailAuthDt;

    String resetPasswordKey;
    LocalDateTime resetPasswordLimitDt;

    boolean adminYn;
    String userStatus;

    private String zipcode;
    private String addr;
    private String addrDetail;

    // 추가칼럼
    long totalCount;
    long seq;

    public static MemberDto of(Member member) {
        return  MemberDto.builder()
                .userId(member.getUserId())
                .phone(member.getPhone())
                .regDt(member.getRegDt())
                .udtDt(member.getUdtDt())
                .userName(member.getUserName())
                .emailAuthKey(member.getEmailAuthKey())
                .emailAuthYn(member.isEmailAuthYn())
                .emailAuthDt(member.getEmailAuthDt())
                .resetPasswordKey(member.getResetPasswordKey())
                .resetPasswordLimitDt(member.getResetPasswordLimitDt())
                .adminYn(member.isAdminYn())
                .userStatus(member.getUserStatus())
                .zipcode(member.getZipcode())
                .addr(member.getAddr())
                .addrDetail(member.getAddrDetail())
                .build();

    }

    public String getRegDtText() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "yyyy.MM.dd HH:mm:ss"
        );
        return regDt != null ? regDt.format(formatter) : "";
    }

    public String getUdtDtText() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "yyyy.MM.dd HH:mm:ss"
        );
        return udtDt != null ? udtDt.format(formatter) : "";
    }

}
