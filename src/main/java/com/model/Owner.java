package com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Repository;

@Repository
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({})
public class Owner {
    @JsonProperty("name")
    private String name;
//    private String password;
    private String flatNo;
/*    private boolean isAdmin;
    private String possessionMonth;
    private String possessionYear;
    private String emailId;
    private String mobileNo;*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

/*

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

      public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getPossessionMonth() {
        return possessionMonth;
    }

    public void setPossessionMonth(String possessionMonth) {
        this.possessionMonth = possessionMonth;
    }

    public String getPossessionYear() {
        return possessionYear;
    }

    public void setPossessionYear(String possessionYear) {
        this.possessionYear = possessionYear;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }*/
}
