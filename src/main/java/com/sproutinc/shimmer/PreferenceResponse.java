package com.sproutinc.shimmer;

public class PreferenceResponse {
    private Preference preference;

    public PreferenceResponse(Preference preference) {
        this.preference = preference;
    }

    public Preference getPreference() {
        return preference;
    }

    public void setPreference(Preference preference) {
        this.preference = preference;
    }
}
