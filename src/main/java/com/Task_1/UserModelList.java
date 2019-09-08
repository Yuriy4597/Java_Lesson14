package com.Task_1;

import java.util.List;

public class UserModelList {
    @Override
    public String toString() {
        return "UserModelList{" +
                "userss=" + userss +
                '}';
    }

    private List<UserModel> userss;

    public List<UserModel> getUserss() {
        return userss;

    }
    public void setUserss(List<UserModel> userss) {
        this.userss = userss;


    }
}
