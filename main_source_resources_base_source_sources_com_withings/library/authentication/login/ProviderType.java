package com.withings.library.authentication.login;

import com.withings.account.models.AccountPrefEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: ProviderType.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/withings/library/authentication/login/ProviderType;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "APPLE", "GOOGLE", "WITHINGS", "Lcom/withings/library/authentication/login/ProviderType$APPLE;", "Lcom/withings/library/authentication/login/ProviderType$GOOGLE;", "Lcom/withings/library/authentication/login/ProviderType$WITHINGS;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProviderType {
    private final String value;

    /* compiled from: ProviderType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/ProviderType$APPLE;", "Lcom/withings/library/authentication/login/ProviderType;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class APPLE extends ProviderType {
        public static final APPLE INSTANCE = new APPLE();

        private APPLE() {
            super("apple", null);
        }
    }

    /* compiled from: ProviderType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/ProviderType$GOOGLE;", "Lcom/withings/library/authentication/login/ProviderType;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class GOOGLE extends ProviderType {
        public static final GOOGLE INSTANCE = new GOOGLE();

        private GOOGLE() {
            super(AccountPrefEntity.PROVIDER_GOOGLE, null);
        }
    }

    /* compiled from: ProviderType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/ProviderType$WITHINGS;", "Lcom/withings/library/authentication/login/ProviderType;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WITHINGS extends ProviderType {
        public static final WITHINGS INSTANCE = new WITHINGS();

        private WITHINGS() {
            super(AccountPrefEntity.PROVIDER_WITHINGS, null);
        }
    }

    public /* synthetic */ ProviderType(String str, m mVar) {
        this(str);
    }

    public final String getValue() {
        return this.value;
    }

    private ProviderType(String str) {
        this.value = str;
    }
}
