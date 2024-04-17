package com.withings.wiscale2;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ThemeHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/Theme;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Theme {

    /* renamed from: d  reason: collision with root package name */
    public static final Theme f47982d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ Theme[] f47983e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f47984f;

    /* renamed from: a  reason: collision with root package name */
    private final String f47985a;

    /* renamed from: b  reason: collision with root package name */
    private final int f47986b;

    /* renamed from: c  reason: collision with root package name */
    private final int f47987c;

    static {
        Theme theme = new Theme("Default", 0, C1987R.string.settings_theme_default, -1, "Default");
        f47982d = theme;
        Theme[] themeArr = {theme, new Theme("Light", 1, C1987R.string.settings_theme_light, 1, "Light"), new Theme("Dark", 2, C1987R.string.settings_theme_dark, 2, "Dark")};
        f47983e = themeArr;
        f47984f = sm0.b.a(themeArr);
    }

    private Theme(String str, int i11, int i12, int i13, String str2) {
        this.f47985a = str2;
        this.f47986b = i12;
        this.f47987c = i13;
    }

    public static sm0.a<Theme> a() {
        return f47984f;
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) f47983e.clone();
    }

    public final int b() {
        return this.f47986b;
    }

    public final int d() {
        return this.f47987c;
    }

    public final String e() {
        return this.f47985a;
    }
}
