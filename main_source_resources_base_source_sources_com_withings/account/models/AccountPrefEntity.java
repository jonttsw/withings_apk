package com.withings.account.models;

import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.withings.account.core.model.Account;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: AccountPrefEntity.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 d2\u00020\u0001:\u0001dB/\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bB\u0091\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\f\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\f\u0012\b\b\u0002\u0010\"\u001a\u00020\f¢\u0006\u0002\u0010#J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\t\u0010E\u001a\u00020\u0013HÆ\u0003J\t\u0010F\u001a\u00020\u0013HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0013HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\fHÆ\u0003J\t\u0010Q\u001a\u00020\fHÆ\u0003J\t\u0010R\u001a\u00020\fHÆ\u0003J\t\u0010S\u001a\u00020 HÆ\u0003J\t\u0010T\u001a\u00020\fHÆ\u0003J\t\u0010U\u001a\u00020\fHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010/J\t\u0010Y\u001a\u00020\u000eHÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\fHÆ\u0003J\t\u0010\\\u001a\u00020\fHÆ\u0003J\u009c\u0002\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010^J\u0013\u0010_\u001a\u00020\f2\b\u0010`\u001a\u0004\u0018\u00010aHÖ\u0003J\t\u0010b\u001a\u00020\u0013HÖ\u0001J\t\u0010c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u001d\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u00103R\u0011\u00104\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b4\u00103R\u0011\u0010\u001e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u00103R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u00103R\u0011\u00105\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b5\u00103R\u0011\u00106\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b6\u00103R\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u00103R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0011\u0010\"\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0011\u0010\u001c\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b=\u00103R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b>\u0010,R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b?\u0010,R\u0011\u0010!\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b@\u00103R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010%¨\u0006e"}, d2 = {"Lcom/withings/account/models/AccountPrefEntity;", "Ljava/io/Serializable;", FirebaseAnalytics.Event.LOGIN, "", "passwordClear", "id", "", "virtualDeviceToken", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "email", "password", "hasPassword", "", "locale", "Ljava/util/Locale;", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "isSyncNeeded", "isWpm03AcknowledgmentRequired", "status", "", "state", "requestedEmail", "consumer", "authProviderName", "authProviderToken", "accountToken", "uuid", "clientId", "requireSecureSession", "isFqa", "isSqa", "accountType", "Lcom/withings/account/core/model/Account$AccountType;", "termsOfUsage", "privacyPolicy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Locale;Ljava/lang/String;ZZIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/withings/account/core/model/Account$AccountType;ZZ)V", "getAccountToken", "()Ljava/lang/String;", "getAccountType", "()Lcom/withings/account/core/model/Account$AccountType;", "getAuthProviderName", "getAuthProviderToken", "getClientId", "getConsumer", "()I", "getEmail", "getHasPassword", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "()J", "()Z", "isPasswordCorrect", "isThirdPartyProvider", "isTokenProvider", "getLocale", "()Ljava/util/Locale;", "getPassword", "getPasswordClear", "getPrivacyPolicy", "getRequestedEmail", "getRequireSecureSession", "getState", "getStatus", "getTermsOfUsage", "getTimeZone", "getUuid", "getVirtualDeviceToken", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Locale;Ljava/lang/String;ZZIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/withings/account/core/model/Account$AccountType;ZZ)Lcom/withings/account/models/AccountPrefEntity;", "equals", "other", "", "hashCode", "toString", "Companion", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountPrefEntity implements Serializable {
    public static final String PROVIDER_GOOGLE = "google";
    public static final String PROVIDER_WITHINGS = "withings";
    private final String accountToken;
    private final Account.AccountType accountType;
    private final String authProviderName;
    private final String authProviderToken;
    private final String clientId;
    private final int consumer;
    private final String email;
    private final Boolean hasPassword;

    /* renamed from: id  reason: collision with root package name */
    private final long f30977id;
    private final boolean isFqa;
    private final boolean isSqa;
    private final boolean isSyncNeeded;
    private final boolean isWpm03AcknowledgmentRequired;
    private final Locale locale;
    private final String password;
    private final String passwordClear;
    private final boolean privacyPolicy;
    private final String requestedEmail;
    private final boolean requireSecureSession;
    private final int state;
    private final int status;
    private final boolean termsOfUsage;
    private final String timeZone;
    private final String uuid;
    private final String virtualDeviceToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AccountPrefEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/withings/account/models/AccountPrefEntity$Companion;", "", "()V", "PROVIDER_GOOGLE", "", "PROVIDER_WITHINGS", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountPrefEntity(String login, String str) {
        this(login, str, 0L, null, 12, null);
        u.j(login, "login");
    }

    public final long component1() {
        return this.f30977id;
    }

    public final int component10() {
        return this.status;
    }

    public final int component11() {
        return this.state;
    }

    public final String component12() {
        return this.requestedEmail;
    }

    public final int component13() {
        return this.consumer;
    }

    public final String component14() {
        return this.authProviderName;
    }

    public final String component15() {
        return this.authProviderToken;
    }

    public final String component16() {
        return this.accountToken;
    }

    public final String component17() {
        return this.uuid;
    }

    public final String component18() {
        return this.clientId;
    }

    public final String component19() {
        return this.virtualDeviceToken;
    }

    public final String component2() {
        return this.email;
    }

    public final boolean component20() {
        return this.requireSecureSession;
    }

    public final boolean component21() {
        return this.isFqa;
    }

    public final boolean component22() {
        return this.isSqa;
    }

    public final Account.AccountType component23() {
        return this.accountType;
    }

    public final boolean component24() {
        return this.termsOfUsage;
    }

    public final boolean component25() {
        return this.privacyPolicy;
    }

    public final String component3() {
        return this.password;
    }

    public final String component4() {
        return this.passwordClear;
    }

    public final Boolean component5() {
        return this.hasPassword;
    }

    public final Locale component6() {
        return this.locale;
    }

    public final String component7() {
        return this.timeZone;
    }

    public final boolean component8() {
        return this.isSyncNeeded;
    }

    public final boolean component9() {
        return this.isWpm03AcknowledgmentRequired;
    }

    public final AccountPrefEntity copy(long j5, String email, String str, String str2, Boolean bool, Locale locale, String timeZone, boolean z5, boolean z11, int i11, int i12, String str3, int i13, String str4, String str5, String str6, String str7, String str8, String str9, boolean z12, boolean z13, boolean z14, Account.AccountType accountType, boolean z15, boolean z16) {
        u.j(email, "email");
        u.j(locale, "locale");
        u.j(timeZone, "timeZone");
        u.j(accountType, "accountType");
        return new AccountPrefEntity(j5, email, str, str2, bool, locale, timeZone, z5, z11, i11, i12, str3, i13, str4, str5, str6, str7, str8, str9, z12, z13, z14, accountType, z15, z16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPrefEntity)) {
            return false;
        }
        AccountPrefEntity accountPrefEntity = (AccountPrefEntity) obj;
        if (this.f30977id == accountPrefEntity.f30977id && u.e(this.email, accountPrefEntity.email) && u.e(this.password, accountPrefEntity.password) && u.e(this.passwordClear, accountPrefEntity.passwordClear) && u.e(this.hasPassword, accountPrefEntity.hasPassword) && u.e(this.locale, accountPrefEntity.locale) && u.e(this.timeZone, accountPrefEntity.timeZone) && this.isSyncNeeded == accountPrefEntity.isSyncNeeded && this.isWpm03AcknowledgmentRequired == accountPrefEntity.isWpm03AcknowledgmentRequired && this.status == accountPrefEntity.status && this.state == accountPrefEntity.state && u.e(this.requestedEmail, accountPrefEntity.requestedEmail) && this.consumer == accountPrefEntity.consumer && u.e(this.authProviderName, accountPrefEntity.authProviderName) && u.e(this.authProviderToken, accountPrefEntity.authProviderToken) && u.e(this.accountToken, accountPrefEntity.accountToken) && u.e(this.uuid, accountPrefEntity.uuid) && u.e(this.clientId, accountPrefEntity.clientId) && u.e(this.virtualDeviceToken, accountPrefEntity.virtualDeviceToken) && this.requireSecureSession == accountPrefEntity.requireSecureSession && this.isFqa == accountPrefEntity.isFqa && this.isSqa == accountPrefEntity.isSqa && this.accountType == accountPrefEntity.accountType && this.termsOfUsage == accountPrefEntity.termsOfUsage && this.privacyPolicy == accountPrefEntity.privacyPolicy) {
            return true;
        }
        return false;
    }

    public final String getAccountToken() {
        return this.accountToken;
    }

    public final Account.AccountType getAccountType() {
        return this.accountType;
    }

    public final String getAuthProviderName() {
        return this.authProviderName;
    }

    public final String getAuthProviderToken() {
        return this.authProviderToken;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final int getConsumer() {
        return this.consumer;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Boolean getHasPassword() {
        return this.hasPassword;
    }

    public final long getId() {
        return this.f30977id;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPasswordClear() {
        return this.passwordClear;
    }

    public final boolean getPrivacyPolicy() {
        return this.privacyPolicy;
    }

    public final String getRequestedEmail() {
        return this.requestedEmail;
    }

    public final boolean getRequireSecureSession() {
        return this.requireSecureSession;
    }

    public final int getState() {
        return this.state;
    }

    public final int getStatus() {
        return this.status;
    }

    public final boolean getTermsOfUsage() {
        return this.termsOfUsage;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getVirtualDeviceToken() {
        return this.virtualDeviceToken;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int c11 = d.c(this.email, Long.hashCode(this.f30977id) * 31, 31);
        String str = this.password;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (c11 + hashCode) * 31;
        String str2 = this.passwordClear;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Boolean bool = this.hasPassword;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int a11 = h.a(this.state, h.a(this.status, y1.a(this.isWpm03AcknowledgmentRequired, y1.a(this.isSyncNeeded, d.c(this.timeZone, (this.locale.hashCode() + ((i13 + hashCode3) * 31)) * 31, 31), 31), 31), 31), 31);
        String str3 = this.requestedEmail;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int a12 = h.a(this.consumer, (a11 + hashCode4) * 31, 31);
        String str4 = this.authProviderName;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i14 = (a12 + hashCode5) * 31;
        String str5 = this.authProviderToken;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str6 = this.accountToken;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        String str7 = this.uuid;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        String str8 = this.clientId;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        String str9 = this.virtualDeviceToken;
        if (str9 != null) {
            i11 = str9.hashCode();
        }
        return Boolean.hashCode(this.privacyPolicy) + y1.a(this.termsOfUsage, (this.accountType.hashCode() + y1.a(this.isSqa, y1.a(this.isFqa, y1.a(this.requireSecureSession, (i18 + i11) * 31, 31), 31), 31)) * 31, 31);
    }

    public final boolean isFqa() {
        return this.isFqa;
    }

    public final boolean isPasswordCorrect() {
        if (!isTokenProvider() && !isThirdPartyProvider() && this.password == null && this.passwordClear == null) {
            return false;
        }
        return true;
    }

    public final boolean isSqa() {
        return this.isSqa;
    }

    public final boolean isSyncNeeded() {
        return this.isSyncNeeded;
    }

    public final boolean isThirdPartyProvider() {
        String str = this.authProviderName;
        if (str != null && !u.e(PROVIDER_WITHINGS, str)) {
            return true;
        }
        return false;
    }

    public final boolean isTokenProvider() {
        String str;
        String str2 = this.authProviderName;
        if (str2 != null && str2.length() != 0 && (str = this.authProviderToken) != null && str.length() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isWpm03AcknowledgmentRequired() {
        return this.isWpm03AcknowledgmentRequired;
    }

    public String toString() {
        long j5 = this.f30977id;
        String str = this.email;
        String str2 = this.password;
        String str3 = this.passwordClear;
        Boolean bool = this.hasPassword;
        Locale locale = this.locale;
        String str4 = this.timeZone;
        boolean z5 = this.isSyncNeeded;
        boolean z11 = this.isWpm03AcknowledgmentRequired;
        int i11 = this.status;
        int i12 = this.state;
        String str5 = this.requestedEmail;
        int i13 = this.consumer;
        String str6 = this.authProviderName;
        String str7 = this.authProviderToken;
        String str8 = this.accountToken;
        String str9 = this.uuid;
        String str10 = this.clientId;
        String str11 = this.virtualDeviceToken;
        boolean z12 = this.requireSecureSession;
        boolean z13 = this.isFqa;
        boolean z14 = this.isSqa;
        Account.AccountType accountType = this.accountType;
        boolean z15 = this.termsOfUsage;
        boolean z16 = this.privacyPolicy;
        StringBuilder sb2 = new StringBuilder("AccountPrefEntity(id=");
        sb2.append(j5);
        sb2.append(", email=");
        sb2.append(str);
        b.d(sb2, ", password=", str2, ", passwordClear=", str3);
        sb2.append(", hasPassword=");
        sb2.append(bool);
        sb2.append(", locale=");
        sb2.append(locale);
        sb2.append(", timeZone=");
        sb2.append(str4);
        sb2.append(", isSyncNeeded=");
        sb2.append(z5);
        sb2.append(", isWpm03AcknowledgmentRequired=");
        sb2.append(z11);
        sb2.append(", status=");
        sb2.append(i11);
        sb2.append(", state=");
        sb2.append(i12);
        sb2.append(", requestedEmail=");
        sb2.append(str5);
        sb2.append(", consumer=");
        sb2.append(i13);
        sb2.append(", authProviderName=");
        sb2.append(str6);
        b.d(sb2, ", authProviderToken=", str7, ", accountToken=", str8);
        b.d(sb2, ", uuid=", str9, ", clientId=", str10);
        sb2.append(", virtualDeviceToken=");
        sb2.append(str11);
        sb2.append(", requireSecureSession=");
        sb2.append(z12);
        sb2.append(", isFqa=");
        sb2.append(z13);
        sb2.append(", isSqa=");
        sb2.append(z14);
        sb2.append(", accountType=");
        sb2.append(accountType);
        sb2.append(", termsOfUsage=");
        sb2.append(z15);
        sb2.append(", privacyPolicy=");
        sb2.append(z16);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountPrefEntity(String login, String str, long j5) {
        this(login, str, j5, null, 8, null);
        u.j(login, "login");
    }

    public AccountPrefEntity(long j5, String email, String str, String str2, Boolean bool, Locale locale, String timeZone, boolean z5, boolean z11, int i11, int i12, String str3, int i13, String str4, String str5, String str6, String str7, String str8, String str9, boolean z12, boolean z13, boolean z14, Account.AccountType accountType, boolean z15, boolean z16) {
        u.j(email, "email");
        u.j(locale, "locale");
        u.j(timeZone, "timeZone");
        u.j(accountType, "accountType");
        this.f30977id = j5;
        this.email = email;
        this.password = str;
        this.passwordClear = str2;
        this.hasPassword = bool;
        this.locale = locale;
        this.timeZone = timeZone;
        this.isSyncNeeded = z5;
        this.isWpm03AcknowledgmentRequired = z11;
        this.status = i11;
        this.state = i12;
        this.requestedEmail = str3;
        this.consumer = i13;
        this.authProviderName = str4;
        this.authProviderToken = str5;
        this.accountToken = str6;
        this.uuid = str7;
        this.clientId = str8;
        this.virtualDeviceToken = str9;
        this.requireSecureSession = z12;
        this.isFqa = z13;
        this.isSqa = z14;
        this.accountType = accountType;
        this.termsOfUsage = z15;
        this.privacyPolicy = z16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AccountPrefEntity(long r31, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.Boolean r36, java.util.Locale r37, java.lang.String r38, boolean r39, boolean r40, int r41, int r42, java.lang.String r43, int r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, boolean r51, boolean r52, boolean r53, com.withings.account.core.model.Account.AccountType r54, boolean r55, boolean r56, int r57, kotlin.jvm.internal.m r58) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.account.models.AccountPrefEntity.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.Locale, java.lang.String, boolean, boolean, int, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, com.withings.account.core.model.Account$AccountType, boolean, boolean, int, kotlin.jvm.internal.m):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountPrefEntity(String login, String str, long j5, String str2) {
        this(j5, login, str, null, null, null, null, false, false, 0, 0, null, 0, null, null, null, null, null, null, false, false, false, null, false, false, 33554424, null);
        u.j(login, "login");
    }

    public /* synthetic */ AccountPrefEntity(String str, String str2, long j5, String str3, int i11, m mVar) {
        this(str, str2, (i11 & 4) != 0 ? -1L : j5, (i11 & 8) != 0 ? null : str3);
    }
}
