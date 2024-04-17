package com.withings.common.compose.component;
/* compiled from: RadioGroup.kt */
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f33728a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33729b;

    /* renamed from: c  reason: collision with root package name */
    private final int f33730c;

    /* renamed from: d  reason: collision with root package name */
    private final String f33731d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f33732e;

    public e0(String text, String str, int i11, String str2, Integer num, int i12) {
        str = (i12 & 2) != 0 ? null : str;
        str2 = (i12 & 8) != 0 ? null : str2;
        num = (i12 & 16) != 0 ? null : num;
        kotlin.jvm.internal.u.j(text, "text");
        this.f33728a = text;
        this.f33729b = str;
        this.f33730c = i11;
        this.f33731d = str2;
        this.f33732e = num;
    }

    public final Integer a() {
        return this.f33732e;
    }

    public final String b() {
        return this.f33731d;
    }

    public final int c() {
        return this.f33730c;
    }

    public final String d() {
        return this.f33729b;
    }

    public final String e() {
        return this.f33728a;
    }
}
