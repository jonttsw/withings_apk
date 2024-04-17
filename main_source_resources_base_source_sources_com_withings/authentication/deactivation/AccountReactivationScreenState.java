package com.withings.authentication.deactivation;

import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountReactivationScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/deactivation/AccountReactivationScreenState;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AccountReactivationScreenState {

    /* renamed from: a  reason: collision with root package name */
    public static final AccountReactivationScreenState f31457a;

    /* renamed from: b  reason: collision with root package name */
    public static final AccountReactivationScreenState f31458b;

    /* renamed from: c  reason: collision with root package name */
    public static final AccountReactivationScreenState f31459c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AccountReactivationScreenState[] f31460d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.authentication.deactivation.AccountReactivationScreenState] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.authentication.deactivation.AccountReactivationScreenState] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.authentication.deactivation.AccountReactivationScreenState] */
    static {
        ?? r02 = new Enum("Default", 0);
        f31457a = r02;
        ?? r12 = new Enum("Activating", 1);
        f31458b = r12;
        ?? r22 = new Enum("Disconnecting", 2);
        f31459c = r22;
        AccountReactivationScreenState[] accountReactivationScreenStateArr = {r02, r12, r22};
        f31460d = accountReactivationScreenStateArr;
        sm0.b.a(accountReactivationScreenStateArr);
    }

    private AccountReactivationScreenState() {
        throw null;
    }

    public static AccountReactivationScreenState valueOf(String str) {
        return (AccountReactivationScreenState) Enum.valueOf(AccountReactivationScreenState.class, str);
    }

    public static AccountReactivationScreenState[] values() {
        return (AccountReactivationScreenState[]) f31460d.clone();
    }
}
