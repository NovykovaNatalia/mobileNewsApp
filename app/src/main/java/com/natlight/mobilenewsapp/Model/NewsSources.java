package com.natlight.mobilenewsapp.Model;

import java.util.List;

public class NewsSources {

    private String status;
    private List<Source>sources;
    public NewsSources() {
    }

    public NewsSources(String status, List<Source> sources) {
        this.status = status;
        this.sources = sources;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }
}
