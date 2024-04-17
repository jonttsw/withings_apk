package com.withings.webservices.legacy.withings.model;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
/* loaded from: classes4.dex */
public class Wording {
    @SerializedName("default")
    private String defaultText;
    private String key;

    public String getDefaultText() {
        return this.defaultText;
    }

    public String getKey() {
        return this.key;
    }

    public String getText(Context context) {
        int identifier = context.getResources().getIdentifier(this.key, "string", context.getPackageName());
        if (identifier != 0) {
            return context.getString(identifier);
        }
        return this.defaultText;
    }

    public void setDefaultText(String str) {
        this.defaultText = str;
    }

    public void setKey(String str) {
        this.key = str;
    }
}
