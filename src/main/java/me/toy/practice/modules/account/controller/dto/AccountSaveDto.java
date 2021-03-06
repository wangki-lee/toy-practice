package me.toy.practice.modules.account.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.toy.practice.modules.account.domain.Account;
import me.toy.practice.modules.crew.domain.Crew;

@NoArgsConstructor
@Getter
public class AccountSaveDto {

    private String username;
    private String password;
    private Long crewId;

    @Builder
    public AccountSaveDto(String username, String password, Long crewId) {
        this.username = username;
        this.password = password;
        this.crewId = crewId;
    }

    public Account toEntity(Crew crew) {
        return new Account(username, password, crew);
    }
}
