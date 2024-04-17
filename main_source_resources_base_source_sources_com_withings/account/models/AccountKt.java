package com.withings.account.models;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.withings.account.core.model.Account;
import com.withings.library.authentication.login.ProviderType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTimeZone;
import sf.c;
/* compiled from: Account.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\t¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0000*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u00020\u0010*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/withings/account/core/model/Account;", "Ljava/util/Locale;", "locale", "withLocale", "(Lcom/withings/account/core/model/Account;Ljava/util/Locale;)Lcom/withings/account/core/model/Account;", "Lorg/joda/time/DateTimeZone;", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "withTimeZone", "(Lcom/withings/account/core/model/Account;Lorg/joda/time/DateTimeZone;)Lcom/withings/account/core/model/Account;", "Lsf/c;", "authentication", "withAuthentication", "(Lcom/withings/account/core/model/Account;Lsf/c;)Lcom/withings/account/core/model/Account;", "Lcom/withings/library/authentication/login/ProviderType;", "getProviderType", "(Lsf/c;)Lcom/withings/library/authentication/login/ProviderType;", "Lcom/withings/account/models/AccountPrefEntity;", "toAccount", "(Lcom/withings/account/models/AccountPrefEntity;)Lcom/withings/account/core/model/Account;", "toAccountPrefEntity", "(Lcom/withings/account/core/model/Account;)Lcom/withings/account/models/AccountPrefEntity;", "Lcom/withings/account/models/AccountMapper;", "accountMapper", "Lcom/withings/account/models/AccountMapper;", "android_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AccountKt {
    private static final AccountMapper accountMapper = new AccountMapper();

    public static final ProviderType getProviderType(c cVar) {
        u.j(cVar, "<this>");
        String a11 = cVar.a();
        if (u.e(a11, AccountPrefEntity.PROVIDER_GOOGLE)) {
            return ProviderType.GOOGLE.INSTANCE;
        }
        if (u.e(a11, AccountPrefEntity.PROVIDER_WITHINGS)) {
            return ProviderType.WITHINGS.INSTANCE;
        }
        return ProviderType.WITHINGS.INSTANCE;
    }

    public static final Account toAccount(AccountPrefEntity accountPrefEntity) {
        u.j(accountPrefEntity, "<this>");
        return accountMapper.fromAccountPrefEntity(accountPrefEntity);
    }

    public static final AccountPrefEntity toAccountPrefEntity(Account account) {
        u.j(account, "<this>");
        return accountMapper.toAccountPrefEntity(account);
    }

    public static final Account withAuthentication(Account account, c authentication) {
        u.j(account, "<this>");
        u.j(authentication, "authentication");
        return Account.a(account, null, false, null, null, null, Account.b.a(account.i(), 0L, authentication, false, null, 111), false, false, false, 479);
    }

    public static final Account withLocale(Account account, Locale locale) {
        u.j(account, "<this>");
        u.j(locale, "locale");
        return Account.a(account, null, false, locale, null, null, null, false, false, false, 507);
    }

    public static final Account withTimeZone(Account account, DateTimeZone timeZone) {
        u.j(account, "<this>");
        u.j(timeZone, "timeZone");
        return Account.a(account, null, false, null, timeZone, null, null, false, false, false, 503);
    }
}
