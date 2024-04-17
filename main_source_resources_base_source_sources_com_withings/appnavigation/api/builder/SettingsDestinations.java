package com.withings.appnavigation.api.builder;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SettingsIntentBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/appnavigation/api/builder/SettingsDestinations;", "", "api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SettingsDestinations {

    /* renamed from: a  reason: collision with root package name */
    public static final SettingsDestinations f31277a;

    /* renamed from: b  reason: collision with root package name */
    public static final SettingsDestinations f31278b;

    /* renamed from: c  reason: collision with root package name */
    public static final SettingsDestinations f31279c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ SettingsDestinations[] f31280d;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.appnavigation.api.builder.SettingsDestinations, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.appnavigation.api.builder.SettingsDestinations, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.appnavigation.api.builder.SettingsDestinations, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.appnavigation.api.builder.SettingsDestinations, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Home", 0);
        f31277a = r02;
        ?? r12 = new Enum("PrivacyAndLegal", 1);
        f31278b = r12;
        ?? r22 = new Enum("Notifications", 2);
        f31279c = r22;
        SettingsDestinations[] settingsDestinationsArr = {r02, r12, r22, new Enum("MFA", 3)};
        f31280d = settingsDestinationsArr;
        b.a(settingsDestinationsArr);
    }

    private SettingsDestinations() {
        throw null;
    }

    public static SettingsDestinations valueOf(String str) {
        return (SettingsDestinations) Enum.valueOf(SettingsDestinations.class, str);
    }

    public static SettingsDestinations[] values() {
        return (SettingsDestinations[]) f31280d.clone();
    }
}
