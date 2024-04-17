package com.withings.account.models;

import com.withings.account.core.model.Account;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
import org.joda.time.DateTimeZone;
import sf.c;
import x70.b;
/* compiled from: Account.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/withings/account/models/AccountMapper;", "", "Lcom/withings/account/models/AccountPrefEntity;", "accountPrefEntity", "Lcom/withings/account/core/model/Account$b;", "sourceFrom", "(Lcom/withings/account/models/AccountPrefEntity;)Lcom/withings/account/core/model/Account$b;", "Lsf/c;", "authenticationFrom", "(Lcom/withings/account/models/AccountPrefEntity;)Lsf/c;", "Lnm0/y;", "reportMissingData", "(Lcom/withings/account/models/AccountPrefEntity;)V", "Lcom/withings/account/core/model/Account;", "fromAccountPrefEntity", "(Lcom/withings/account/models/AccountPrefEntity;)Lcom/withings/account/core/model/Account;", "account", "toAccountPrefEntity", "(Lcom/withings/account/core/model/Account;)Lcom/withings/account/models/AccountPrefEntity;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class AccountMapper {
    private final c authenticationFrom(AccountPrefEntity accountPrefEntity) {
        c aVar;
        String str;
        if (accountPrefEntity.getAuthProviderName() != null && accountPrefEntity.getAuthProviderToken() != null && (accountPrefEntity.getVirtualDeviceToken() != null || accountPrefEntity.getUuid() != null)) {
            if (u.e(accountPrefEntity.getAuthProviderName(), AccountPrefEntity.PROVIDER_GOOGLE)) {
                String accountToken = accountPrefEntity.getAccountToken();
                String authProviderToken = accountPrefEntity.getAuthProviderToken();
                String virtualDeviceToken = accountPrefEntity.getVirtualDeviceToken();
                if (virtualDeviceToken == null) {
                    virtualDeviceToken = accountPrefEntity.getUuid();
                    u.g(virtualDeviceToken);
                }
                aVar = new c.b.a(accountToken, authProviderToken, virtualDeviceToken);
            } else {
                String accountToken2 = accountPrefEntity.getAccountToken();
                String authProviderToken2 = accountPrefEntity.getAuthProviderToken();
                String virtualDeviceToken2 = accountPrefEntity.getVirtualDeviceToken();
                if (virtualDeviceToken2 == null) {
                    virtualDeviceToken2 = accountPrefEntity.getUuid();
                    u.g(virtualDeviceToken2);
                }
                aVar = new c.b.C1618b(accountToken2, authProviderToken2, virtualDeviceToken2);
            }
        } else if (accountPrefEntity.getPassword() != null && (accountPrefEntity.getVirtualDeviceToken() != null || accountPrefEntity.getUuid() != null)) {
            String password = accountPrefEntity.getPassword();
            String virtualDeviceToken3 = accountPrefEntity.getVirtualDeviceToken();
            if (virtualDeviceToken3 == null) {
                virtualDeviceToken3 = accountPrefEntity.getUuid();
                u.g(virtualDeviceToken3);
            }
            aVar = new c.C1619c(password, virtualDeviceToken3);
        } else {
            reportMissingData(accountPrefEntity);
            String password2 = accountPrefEntity.getPassword();
            String authProviderName = accountPrefEntity.getAuthProviderName();
            String accountToken3 = accountPrefEntity.getAccountToken();
            String authProviderToken3 = accountPrefEntity.getAuthProviderToken();
            String virtualDeviceToken4 = accountPrefEntity.getVirtualDeviceToken();
            if (virtualDeviceToken4 == null) {
                String uuid = accountPrefEntity.getUuid();
                if (uuid == null) {
                    uuid = "";
                }
                str = uuid;
            } else {
                str = virtualDeviceToken4;
            }
            aVar = new c.a(password2, authProviderName, accountToken3, authProviderToken3, str);
        }
        return aVar;
    }

    private final void reportMissingData(AccountPrefEntity accountPrefEntity) {
        Map j5 = s0.j(new j("authProviderName", accountPrefEntity.getAuthProviderName()), new j("authProviderToken", accountPrefEntity.getAuthProviderToken()), new j("virtualDeviceToken", accountPrefEntity.getVirtualDeviceToken()), new j("uuid", accountPrefEntity.getUuid()), new j("password", accountPrefEntity.getPassword()));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : j5.entrySet()) {
            Object key = entry.getKey();
            String str = (String) key;
            if (entry.getValue() != null) {
                key = null;
            }
            String str2 = (String) key;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        b.p(new IllegalStateException("incorrect authentication : possible missing values : ".concat(x.R(arrayList, ", ", null, null, null, 62))));
    }

    private final Account.b sourceFrom(AccountPrefEntity accountPrefEntity) {
        Account.b.a aVar;
        Account.b.a.C0405b c0405b;
        long id2 = accountPrefEntity.getId();
        Account.AccountType accountType = accountPrefEntity.getAccountType();
        c authenticationFrom = authenticationFrom(accountPrefEntity);
        boolean requireSecureSession = accountPrefEntity.getRequireSecureSession();
        if (accountPrefEntity.getRequestedEmail() != null) {
            c0405b = new Account.b.a.C0405b(accountPrefEntity.getRequestedEmail());
        } else {
            if (accountPrefEntity.getStatus() == 1) {
                aVar = Account.b.a.C0404a.f30950a;
            } else if (accountPrefEntity.getState() == 0) {
                aVar = Account.b.a.c.f30952a;
            } else {
                aVar = Account.b.a.d.f30953a;
            }
            c0405b = aVar;
        }
        return new Account.b(id2, null, accountType, "", authenticationFrom, requireSecureSession, c0405b);
    }

    public final Account fromAccountPrefEntity(AccountPrefEntity accountPrefEntity) {
        boolean z5;
        u.j(accountPrefEntity, "accountPrefEntity");
        String email = accountPrefEntity.getEmail();
        Boolean hasPassword = accountPrefEntity.getHasPassword();
        if (hasPassword != null) {
            z5 = hasPassword.booleanValue();
        } else {
            z5 = true;
        }
        boolean z11 = z5;
        Locale locale = accountPrefEntity.getLocale();
        DateTimeZone forID = DateTimeZone.forID(accountPrefEntity.getTimeZone());
        u.i(forID, "forID(...)");
        return new Account(email, z11, locale, forID, new Account.a(accountPrefEntity.isWpm03AcknowledgmentRequired(), accountPrefEntity.isFqa(), accountPrefEntity.isSqa()), sourceFrom(accountPrefEntity), accountPrefEntity.isSyncNeeded(), accountPrefEntity.getTermsOfUsage(), accountPrefEntity.getPrivacyPolicy());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.withings.account.models.AccountPrefEntity toAccountPrefEntity(com.withings.account.core.model.Account r30) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.account.models.AccountMapper.toAccountPrefEntity(com.withings.account.core.model.Account):com.withings.account.models.AccountPrefEntity");
    }
}
