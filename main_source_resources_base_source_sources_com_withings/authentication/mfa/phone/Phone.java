package com.withings.authentication.mfa.phone;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SettingsPhoneAuthViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/mfa/phone/Phone;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Phone {

    /* renamed from: a  reason: collision with root package name */
    public static final Phone f31755a;

    /* renamed from: b  reason: collision with root package name */
    public static final Phone f31756b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ Phone[] f31757c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.authentication.mfa.phone.Phone] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.authentication.mfa.phone.Phone] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.authentication.mfa.phone.Phone] */
    static {
        ?? r02 = new Enum("WhatsApp", 0);
        f31755a = r02;
        ?? r12 = new Enum("Sms", 1);
        f31756b = r12;
        Phone[] phoneArr = {r02, r12, new Enum("Call", 2)};
        f31757c = phoneArr;
        sm0.b.a(phoneArr);
    }

    private Phone() {
        throw null;
    }

    public static Phone valueOf(String str) {
        return (Phone) Enum.valueOf(Phone.class, str);
    }

    public static Phone[] values() {
        return (Phone[]) f31757c.clone();
    }
}
