package com.rvapp.listadordefundos.ui.main;

public class FundoFilter {
    private boolean applicationFilterEnabled;
    private boolean profileFilterEnabled;
    private String applicationFilter;
    private String profileFilter;


    public boolean isApplicationFilterEnabled() {
        return applicationFilterEnabled;
    }

    public void setApplicationFilterEnabled(boolean applicationFilterEnabled) {
        this.applicationFilterEnabled = applicationFilterEnabled;
    }

    public boolean isProfileFilterEnabled() {
        return profileFilterEnabled;
    }

    public void setProfileFilterEnabled(boolean profileFilterEnabled) {
        this.profileFilterEnabled = profileFilterEnabled;
    }

    public String getApplicationFilter() {
        return applicationFilter;
    }

    public void setApplicationFilter(String applicationFilter) {
        this.applicationFilter = applicationFilter;
    }

    public String getProfileFilter() {
        return profileFilter;
    }

    public void setProfileFilter(String profileFilter) {
        this.profileFilter = profileFilter;
    }
}
