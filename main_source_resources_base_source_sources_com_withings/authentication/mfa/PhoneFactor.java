package com.withings.authentication.mfa;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SettingsMfaViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/mfa/PhoneFactor;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PhoneFactor {

    /* renamed from: a  reason: collision with root package name */
    public static final PhoneFactor f31561a;

    /* renamed from: b  reason: collision with root package name */
    public static final PhoneFactor f31562b;

    /* renamed from: c  reason: collision with root package name */
    public static final PhoneFactor f31563c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ PhoneFactor[] f31564d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.authentication.mfa.PhoneFactor] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.authentication.mfa.PhoneFactor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.authentication.mfa.PhoneFactor] */
    static {
        ?? r02 = new Enum("WhatsApp", 0);
        f31561a = r02;
        ?? r12 = new Enum("Sms", 1);
        f31562b = r12;
        ?? r22 = new Enum("Call", 2);
        f31563c = r22;
        PhoneFactor[] phoneFactorArr = {r02, r12, r22};
        f31564d = phoneFactorArr;
        sm0.b.a(phoneFactorArr);
    }

    private PhoneFactor() {
        throw null;
    }

    public static PhoneFactor valueOf(String str) {
        return (PhoneFactor) Enum.valueOf(PhoneFactor.class, str);
    }

    public static PhoneFactor[] values() {
        return (PhoneFactor[]) f31564d.clone();
    }
}
