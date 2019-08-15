package com.demo.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Mijail on 5/07/2019.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campana {
    private String campaign_code;
    private String short_name;
    private String start_date;

    private String end_date;

    public String getCampaign_code() {
        return campaign_code;
    }

    public void setCampaign_code(String campaign_code) {
        this.campaign_code = campaign_code;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
}
