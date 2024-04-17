package com.withings.appVersion.changelog;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.util.Locale;
import vh.h;
import vh.m;
import vh.o;
/* loaded from: classes3.dex */
public class HtmlChangelogHelper {
    public static final String BASE_IMG_PROD = "https://static.withings.com/content/releasenotes/prod/app/android/%s/timeline_default.png";
    public static final String BASE_URL_ALPHA = "https://static.withings.com/content/releasenotes/alpha/app/android/%s/%s/%s/timeline.json";
    public static final String BASE_URL_PROD = "https://static.withings.com/content/releasenotes/prod/app/android/%s/%s/%s/timeline.json";
    private static final String CHANGELOG_VERSION = "CHANGELOG_VERSION";
    public static final int MAJ_MIN_VERSION_SIZE = 3;
    private static final String PREF_NAME = "changelog";
    public static final String TAG = "HtmlChangelogHelper";

    /* loaded from: classes3.dex */
    public interface Callback {
        void showAvailableChangeLog(ReleaseNoteInfo releaseNoteInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Check implements m<ReleaseNoteInfo> {
        private String appName;
        private String changelogUrl;
        private String versionCode;

        public Check(String str, String str2, String str3) {
            this.appName = str;
            this.versionCode = str2;
            this.changelogUrl = str3;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // vh.m
        public ReleaseNoteInfo call() throws Exception {
            if (TextUtils.isEmpty(this.versionCode)) {
                return null;
            }
            Response execute = new OkHttpClient().newCall(new Request.Builder().url(String.format(this.changelogUrl, this.appName, this.versionCode, Locale.getDefault().getLanguage())).build()).execute();
            if (execute.isSuccessful()) {
                ReleaseNoteInfo releaseNoteInfo = (ReleaseNoteInfo) new Gson().fromJson(execute.body().string(), (Class<Object>) ReleaseNoteInfo.class);
                releaseNoteInfo.version = this.versionCode;
                return releaseNoteInfo;
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    private static class CheckFirmware implements m<ReleaseNoteInfo> {
        private String changelogUrl;

        public CheckFirmware(String str) {
            this.changelogUrl = str.replace("index.html", "timeline.json");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // vh.m
        public ReleaseNoteInfo call() throws Exception {
            Response execute = new OkHttpClient().newCall(new Request.Builder().url(this.changelogUrl).build()).execute();
            if (execute.isSuccessful()) {
                return (ReleaseNoteInfo) new Gson().fromJson(execute.body().string(), (Class<Object>) ReleaseNoteInfo.class);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static class Details {
        public String content;
        public String type = "url";
    }

    /* loaded from: classes3.dex */
    public static class ReleaseNoteInfo {
        public Details details;
        public boolean fullscreen;
        public String glyph;
        public String hexcolor;
        public String img;
        @SerializedName("label_hexcolor")
        public String labelHexcolor;
        @SerializedName("label_title")
        public String labelTitle;
        public String message;
        public String title;
        public String version;
    }

    private static boolean alreadyChecked(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.equals(str2, str)) {
            return false;
        }
        return true;
    }

    private static boolean isBugFixForCurrentRelease(String str, String str2) {
        boolean z5 = !str2.substring(3, 5).equals("00");
        boolean equals = str.substring(0, 3).equals(str2.substring(0, 3));
        if (z5 && equals) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveVersion(Context context, String str) {
        context.getSharedPreferences(PREF_NAME, 0).edit().putString(CHANGELOG_VERSION, str).apply();
    }

    private static void showChangelog(final Context context, String str, final String str2, String str3, final Callback callback) {
        o c11 = h.l().c(new Check(str, str2, str3));
        c11.q(new m.a<ReleaseNoteInfo>() { // from class: com.withings.appVersion.changelog.HtmlChangelogHelper.2
            @Override // vh.m.b
            public void onResult(ReleaseNoteInfo releaseNoteInfo) {
                Callback callback2;
                HtmlChangelogHelper.saveVersion(context, str2);
                if (releaseNoteInfo == null || (callback2 = callback) == null) {
                    return;
                }
                callback2.showAvailableChangeLog(releaseNoteInfo);
            }

            @Override // vh.p
            public void onError(Exception exc) {
            }
        });
        c11.p(TAG);
    }

    public static void showChangelogFirmware(String str, final Callback callback) {
        o c11 = h.l().c(new CheckFirmware(str));
        c11.q(new m.a<ReleaseNoteInfo>() { // from class: com.withings.appVersion.changelog.HtmlChangelogHelper.1
            @Override // vh.m.b
            public void onResult(ReleaseNoteInfo releaseNoteInfo) {
                Callback callback2;
                if (releaseNoteInfo == null || (callback2 = Callback.this) == null) {
                    return;
                }
                callback2.showAvailableChangeLog(releaseNoteInfo);
            }

            @Override // vh.p
            public void onError(Exception exc) {
            }
        });
        c11.p(TAG);
    }

    public static void showChangelogIfNecessary(Context context, String str, String str2, Callback callback) {
        showChangelogIfNecessary(context, str, str2, BASE_URL_PROD, callback);
    }

    private static void transitionPreferenceIfNecessary(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.contains(CHANGELOG_VERSION)) {
            context.getSharedPreferences(PREF_NAME, 0).edit().putString(CHANGELOG_VERSION, defaultSharedPreferences.getString(CHANGELOG_VERSION, null)).commit();
            defaultSharedPreferences.edit().remove(CHANGELOG_VERSION).commit();
        }
    }

    public static void showChangelogIfNecessary(Context context, String str, String str2, String str3, Callback callback) {
        transitionPreferenceIfNecessary(context);
        String string = context.getSharedPreferences(PREF_NAME, 0).getString(CHANGELOG_VERSION, null);
        Log.i("CHANGELOG", String.format("Previous or default version:%1$s. Current version:%2$s", string, str2));
        if (alreadyChecked(string, str2)) {
            Log.i("CHANGELOG", String.format("Saving version for next time:%1$s", str2));
            saveVersion(context, str2);
        } else if (string != null && !isBugFixForCurrentRelease(string, str2)) {
            Log.i("CHANGELOG", String.format("Load and show changelog for version:%1$s", str2));
            showChangelog(context, str, str2, str3, callback);
        } else {
            Log.i("CHANGELOG", String.format("%1$s is a isBugFixForCurrentRelease %2$s", str2, string));
        }
    }
}
