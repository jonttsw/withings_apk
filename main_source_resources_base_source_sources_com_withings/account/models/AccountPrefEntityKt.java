package com.withings.account.models;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.account.core.model.Account;
import com.withings.library.authentication.login.SessionType;
import com.withings.webservices.legacy.withings.model.session.AccountSession;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
/* compiled from: AccountPrefEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\u0000\u001a\"\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u000e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003\u001a\u0012\u0010\u0010\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0003¨\u0006\u0012"}, d2 = {"toAccountType", "Lcom/withings/account/core/model/Account$AccountType;", "Lcom/withings/library/authentication/login/SessionType;", "", "toSerializedString", "withAccountSession", "Lcom/withings/account/models/AccountPrefEntity;", "accountSession", "Lcom/withings/webservices/legacy/withings/model/session/AccountSession;", "providerName", "uuid", "withLocale", "locale", "Ljava/util/Locale;", "withPassword", "password", "withTimezone", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountPrefEntityKt {

    /* compiled from: AccountPrefEntity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Account.AccountType.values().length];
            try {
                Account.AccountType accountType = Account.AccountType.f30936a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Account.AccountType accountType2 = Account.AccountType.f30936a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Account.AccountType accountType3 = Account.AccountType.f30936a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SessionType.values().length];
            try {
                iArr2[SessionType.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SessionType.WITHINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SessionType.PARTNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Account.AccountType toAccountType(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -940096873) {
                if (hashCode != -792929080) {
                    if (hashCode == 3343801 && str.equals("main")) {
                        return Account.AccountType.f30936a;
                    }
                } else if (str.equals("partner")) {
                    return Account.AccountType.f30938c;
                }
            } else if (str.equals(AccountPrefEntity.PROVIDER_WITHINGS)) {
                return Account.AccountType.f30937b;
            }
        }
        return Account.AccountType.f30936a;
    }

    public static final String toSerializedString(Account.AccountType accountType) {
        u.j(accountType, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[accountType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return "partner";
                }
                throw new NoWhenBranchMatchedException();
            }
            return AccountPrefEntity.PROVIDER_WITHINGS;
        }
        return "main";
    }

    public static final AccountPrefEntity withAccountSession(AccountPrefEntity accountPrefEntity, AccountSession accountSession, String providerName, String uuid) {
        long id2;
        AccountPrefEntity copy;
        u.j(accountPrefEntity, "<this>");
        u.j(accountSession, "accountSession");
        u.j(providerName, "providerName");
        u.j(uuid, "uuid");
        String str = accountSession.mAuthToken;
        if (str == null) {
            str = accountPrefEntity.getAccountToken();
        }
        String str2 = str;
        String str3 = accountSession.mProviderToken;
        boolean isSecureSessionRequired = accountSession.isSecureSessionRequired();
        Long valueOf = Long.valueOf(accountSession.mAccountId);
        if (valueOf.longValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            id2 = valueOf.longValue();
        } else {
            id2 = accountPrefEntity.getId();
        }
        copy = accountPrefEntity.copy((r44 & 1) != 0 ? accountPrefEntity.f30977id : id2, (r44 & 2) != 0 ? accountPrefEntity.email : null, (r44 & 4) != 0 ? accountPrefEntity.password : null, (r44 & 8) != 0 ? accountPrefEntity.passwordClear : null, (r44 & 16) != 0 ? accountPrefEntity.hasPassword : null, (r44 & 32) != 0 ? accountPrefEntity.locale : null, (r44 & 64) != 0 ? accountPrefEntity.timeZone : null, (r44 & 128) != 0 ? accountPrefEntity.isSyncNeeded : false, (r44 & 256) != 0 ? accountPrefEntity.isWpm03AcknowledgmentRequired : false, (r44 & 512) != 0 ? accountPrefEntity.status : 0, (r44 & 1024) != 0 ? accountPrefEntity.state : 0, (r44 & ModuleCopy.f28574b) != 0 ? accountPrefEntity.requestedEmail : null, (r44 & 4096) != 0 ? accountPrefEntity.consumer : 0, (r44 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? accountPrefEntity.authProviderName : providerName, (r44 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? accountPrefEntity.authProviderToken : str3, (r44 & Utils.MAX_EVENT_SIZE) != 0 ? accountPrefEntity.accountToken : str2, (r44 & 65536) != 0 ? accountPrefEntity.uuid : uuid, (r44 & 131072) != 0 ? accountPrefEntity.clientId : null, (r44 & 262144) != 0 ? accountPrefEntity.virtualDeviceToken : uuid, (r44 & 524288) != 0 ? accountPrefEntity.requireSecureSession : isSecureSessionRequired, (r44 & 1048576) != 0 ? accountPrefEntity.isFqa : false, (r44 & 2097152) != 0 ? accountPrefEntity.isSqa : false, (r44 & 4194304) != 0 ? accountPrefEntity.accountType : null, (r44 & 8388608) != 0 ? accountPrefEntity.termsOfUsage : false, (r44 & 16777216) != 0 ? accountPrefEntity.privacyPolicy : false);
        return copy;
    }

    public static final AccountPrefEntity withLocale(AccountPrefEntity accountPrefEntity, Locale locale) {
        AccountPrefEntity copy;
        u.j(accountPrefEntity, "<this>");
        u.j(locale, "locale");
        copy = accountPrefEntity.copy((r44 & 1) != 0 ? accountPrefEntity.f30977id : 0L, (r44 & 2) != 0 ? accountPrefEntity.email : null, (r44 & 4) != 0 ? accountPrefEntity.password : null, (r44 & 8) != 0 ? accountPrefEntity.passwordClear : null, (r44 & 16) != 0 ? accountPrefEntity.hasPassword : null, (r44 & 32) != 0 ? accountPrefEntity.locale : locale, (r44 & 64) != 0 ? accountPrefEntity.timeZone : null, (r44 & 128) != 0 ? accountPrefEntity.isSyncNeeded : false, (r44 & 256) != 0 ? accountPrefEntity.isWpm03AcknowledgmentRequired : false, (r44 & 512) != 0 ? accountPrefEntity.status : 0, (r44 & 1024) != 0 ? accountPrefEntity.state : 0, (r44 & ModuleCopy.f28574b) != 0 ? accountPrefEntity.requestedEmail : null, (r44 & 4096) != 0 ? accountPrefEntity.consumer : 0, (r44 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? accountPrefEntity.authProviderName : null, (r44 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? accountPrefEntity.authProviderToken : null, (r44 & Utils.MAX_EVENT_SIZE) != 0 ? accountPrefEntity.accountToken : null, (r44 & 65536) != 0 ? accountPrefEntity.uuid : null, (r44 & 131072) != 0 ? accountPrefEntity.clientId : null, (r44 & 262144) != 0 ? accountPrefEntity.virtualDeviceToken : null, (r44 & 524288) != 0 ? accountPrefEntity.requireSecureSession : false, (r44 & 1048576) != 0 ? accountPrefEntity.isFqa : false, (r44 & 2097152) != 0 ? accountPrefEntity.isSqa : false, (r44 & 4194304) != 0 ? accountPrefEntity.accountType : null, (r44 & 8388608) != 0 ? accountPrefEntity.termsOfUsage : false, (r44 & 16777216) != 0 ? accountPrefEntity.privacyPolicy : false);
        return copy;
    }

    public static final AccountPrefEntity withPassword(AccountPrefEntity accountPrefEntity, String password) {
        AccountPrefEntity copy;
        u.j(accountPrefEntity, "<this>");
        u.j(password, "password");
        copy = accountPrefEntity.copy((r44 & 1) != 0 ? accountPrefEntity.f30977id : 0L, (r44 & 2) != 0 ? accountPrefEntity.email : null, (r44 & 4) != 0 ? accountPrefEntity.password : null, (r44 & 8) != 0 ? accountPrefEntity.passwordClear : password, (r44 & 16) != 0 ? accountPrefEntity.hasPassword : null, (r44 & 32) != 0 ? accountPrefEntity.locale : null, (r44 & 64) != 0 ? accountPrefEntity.timeZone : null, (r44 & 128) != 0 ? accountPrefEntity.isSyncNeeded : false, (r44 & 256) != 0 ? accountPrefEntity.isWpm03AcknowledgmentRequired : false, (r44 & 512) != 0 ? accountPrefEntity.status : 0, (r44 & 1024) != 0 ? accountPrefEntity.state : 0, (r44 & ModuleCopy.f28574b) != 0 ? accountPrefEntity.requestedEmail : null, (r44 & 4096) != 0 ? accountPrefEntity.consumer : 0, (r44 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? accountPrefEntity.authProviderName : null, (r44 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? accountPrefEntity.authProviderToken : null, (r44 & Utils.MAX_EVENT_SIZE) != 0 ? accountPrefEntity.accountToken : null, (r44 & 65536) != 0 ? accountPrefEntity.uuid : null, (r44 & 131072) != 0 ? accountPrefEntity.clientId : null, (r44 & 262144) != 0 ? accountPrefEntity.virtualDeviceToken : null, (r44 & 524288) != 0 ? accountPrefEntity.requireSecureSession : false, (r44 & 1048576) != 0 ? accountPrefEntity.isFqa : false, (r44 & 2097152) != 0 ? accountPrefEntity.isSqa : false, (r44 & 4194304) != 0 ? accountPrefEntity.accountType : null, (r44 & 8388608) != 0 ? accountPrefEntity.termsOfUsage : false, (r44 & 16777216) != 0 ? accountPrefEntity.privacyPolicy : false);
        return copy;
    }

    public static final AccountPrefEntity withTimezone(AccountPrefEntity accountPrefEntity, String timeZone) {
        AccountPrefEntity copy;
        u.j(accountPrefEntity, "<this>");
        u.j(timeZone, "timeZone");
        copy = accountPrefEntity.copy((r44 & 1) != 0 ? accountPrefEntity.f30977id : 0L, (r44 & 2) != 0 ? accountPrefEntity.email : null, (r44 & 4) != 0 ? accountPrefEntity.password : null, (r44 & 8) != 0 ? accountPrefEntity.passwordClear : null, (r44 & 16) != 0 ? accountPrefEntity.hasPassword : null, (r44 & 32) != 0 ? accountPrefEntity.locale : null, (r44 & 64) != 0 ? accountPrefEntity.timeZone : timeZone, (r44 & 128) != 0 ? accountPrefEntity.isSyncNeeded : false, (r44 & 256) != 0 ? accountPrefEntity.isWpm03AcknowledgmentRequired : false, (r44 & 512) != 0 ? accountPrefEntity.status : 0, (r44 & 1024) != 0 ? accountPrefEntity.state : 0, (r44 & ModuleCopy.f28574b) != 0 ? accountPrefEntity.requestedEmail : null, (r44 & 4096) != 0 ? accountPrefEntity.consumer : 0, (r44 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? accountPrefEntity.authProviderName : null, (r44 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? accountPrefEntity.authProviderToken : null, (r44 & Utils.MAX_EVENT_SIZE) != 0 ? accountPrefEntity.accountToken : null, (r44 & 65536) != 0 ? accountPrefEntity.uuid : null, (r44 & 131072) != 0 ? accountPrefEntity.clientId : null, (r44 & 262144) != 0 ? accountPrefEntity.virtualDeviceToken : null, (r44 & 524288) != 0 ? accountPrefEntity.requireSecureSession : false, (r44 & 1048576) != 0 ? accountPrefEntity.isFqa : false, (r44 & 2097152) != 0 ? accountPrefEntity.isSqa : false, (r44 & 4194304) != 0 ? accountPrefEntity.accountType : null, (r44 & 8388608) != 0 ? accountPrefEntity.termsOfUsage : false, (r44 & 16777216) != 0 ? accountPrefEntity.privacyPolicy : false);
        return copy;
    }

    public static final Account.AccountType toAccountType(SessionType sessionType) {
        u.j(sessionType, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$1[sessionType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return Account.AccountType.f30938c;
                }
                throw new NoWhenBranchMatchedException();
            }
            return Account.AccountType.f30937b;
        }
        return Account.AccountType.f30936a;
    }
}
