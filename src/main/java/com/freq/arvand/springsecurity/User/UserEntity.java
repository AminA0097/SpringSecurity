package com.freq.arvand.springsecurity.User;

import com.freq.arvand.springsecurity.Base.BaseEntity;
import jakarta.persistence.*;
import org.hibernate.annotations.Where;

import java.util.UUID;

@Entity
@Table(name = "CORE_USER")
@TableGenerator(
        name = "CORE_USER_SEQ",
        table = "CORE_SEQ",
        pkColumnName = "TABLE_NAME",
        valueColumnName = "SEQ_COUNT",
        pkColumnValue = "UserEntitySeq",
        allocationSize = 1
)
@Where(clause = "deleted = false")
public class UserEntity extends BaseEntity {
    @Id
    @Column(name = "FLD_USER_ID")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "CORE_USER_SEQ")
    private Long userId;

    @Column(name = "FLD_USER_NAME")
    private String userName;

    @Column(name = "FLD_USER_PASSWORD")
    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
