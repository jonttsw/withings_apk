package com.withings.webservices.legacy.withings.model.session;
/* loaded from: classes4.dex */
public class AccountSession extends Session {
    public static final int TIME_TO_LIVE = 900000;
    private boolean isFqa;
    private boolean isSecure;
    public long mAccountId;
    public String mAccountLogin;
    public String mAuthToken;
    public String mProviderToken;
    private boolean secureSessionRequired;

    public AccountSession(String str, long j5, long j11, long j12, String str2, boolean z5) {
        super(str, j5, j11);
        this.mAccountId = j12;
        this.mAccountLogin = str2;
        this.secureSessionRequired = z5;
    }

    public String getAccountLogin() {
        return this.mAccountLogin;
    }

    public long getmAccountId() {
        return this.mAccountId;
    }

    public boolean isFqa() {
        return this.isFqa;
    }

    public boolean isSecure() {
        return this.isSecure;
    }

    public boolean isSecureSessionRequired() {
        return this.secureSessionRequired;
    }

    public void setAccountId(long j5) {
        this.mAccountId = j5;
    }

    public void setAccountLogin(String str) {
        this.mAccountLogin = str;
    }

    public void setFqa(boolean z5) {
        this.isFqa = z5;
    }

    public void setSecure(boolean z5) {
        this.isSecure = z5;
    }

    public void setSecureSessionRequired(boolean z5) {
        this.secureSessionRequired = z5;
    }

    /* renamed from: clone */
    public AccountSession m36clone() {
        AccountSession accountSession = new AccountSession(this.mSessionId, this.mCreationTime, this.mTimeToLive, this.mAccountId, this.mAccountLogin, this.mAuthToken, this.mProviderToken);
        accountSession.setFqa(this.isFqa);
        accountSession.setSecureSessionRequired(this.secureSessionRequired);
        accountSession.setSecure(this.isSecure);
        return accountSession;
    }

    public AccountSession(String str, long j5, long j11, long j12, String str2, String str3, String str4) {
        super(str, j5, j11);
        this.mAccountId = j12;
        this.mAccountLogin = str2;
        this.mAuthToken = str3;
        this.mProviderToken = str4;
    }

    public AccountSession(String str, long j5, long j11, String str2) {
        super(str, j5);
        this.mAccountId = j11;
        this.mAccountLogin = str2;
    }
}
