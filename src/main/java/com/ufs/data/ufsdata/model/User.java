package com.ufs.data.ufsdata.model;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String openid;

    private String nickname;

    private String avatar;

    private String restraunt;

    private String qqoid;

    private String mobile;

    private String wxuid;

    private Integer isofficial;

    private Integer created_at;

    private Integer last_modified;

    private String jointname;

    private String aid;

    private String recommendid;

    private Short point_issued;

    private Integer unread_count;

    private String lasttoken;

    private Integer lasttoken_at;

    private Integer na;

    private Integer banned;

    private Integer recover_time;

    private String city;

    private String job_postion;

    private Integer is_followed;

    private Integer used;

    private String wx_openid;

    private Integer perecfet_from;

    private Integer push_message;

    private String login_from;

    private Integer dealer_id;

    private Integer created_from;
}