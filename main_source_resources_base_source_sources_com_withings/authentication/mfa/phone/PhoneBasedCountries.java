package com.withings.authentication.mfa.phone;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhoneBasedCountries.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/authentication/mfa/phone/PhoneBasedCountries;", "", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PhoneBasedCountries {

    /* renamed from: b  reason: collision with root package name */
    public static final a f31758b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ PhoneBasedCountries[] f31759c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f31760d;

    /* renamed from: a  reason: collision with root package name */
    private final String f31761a;

    /* compiled from: PhoneBasedCountries.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.withings.authentication.mfa.phone.PhoneBasedCountries$a] */
    static {
        PhoneBasedCountries[] phoneBasedCountriesArr = {new PhoneBasedCountries("AUSTRALIA", 0, "AU"), new PhoneBasedCountries("BELGIUM", 1, "BE"), new PhoneBasedCountries("BRUNEI", 2, "BN"), new PhoneBasedCountries("CZECH_REPUBLIC", 3, "CZ"), new PhoneBasedCountries("CHINA", 4, "CN"), new PhoneBasedCountries("FRANCE", 5, "FR"), new PhoneBasedCountries("GERMANY", 6, "DE"), new PhoneBasedCountries("ITALY", 7, "IT"), new PhoneBasedCountries("LIECHTENSTEIN", 8, "LI"), new PhoneBasedCountries("LITHUANIA", 9, "LT"), new PhoneBasedCountries("POLAND", 10, "PL"), new PhoneBasedCountries("SINGAPORE", 11, "SG"), new PhoneBasedCountries("SPAIN", 12, "ES"), new PhoneBasedCountries("SWITZERLAND", 13, "CH"), new PhoneBasedCountries("THAILAND", 14, "TH"), new PhoneBasedCountries("UNITED_KINGDOM", 15, "GB"), new PhoneBasedCountries("UNITED_STATES", 16, "US")};
        f31759c = phoneBasedCountriesArr;
        f31760d = sm0.b.a(phoneBasedCountriesArr);
        f31758b = new Object();
    }

    private PhoneBasedCountries(String str, int i11, String str2) {
        this.f31761a = str2;
    }

    public static sm0.a<PhoneBasedCountries> a() {
        return f31760d;
    }

    public static PhoneBasedCountries valueOf(String str) {
        return (PhoneBasedCountries) Enum.valueOf(PhoneBasedCountries.class, str);
    }

    public static PhoneBasedCountries[] values() {
        return (PhoneBasedCountries[]) f31759c.clone();
    }

    public final String b() {
        return this.f31761a;
    }
}
