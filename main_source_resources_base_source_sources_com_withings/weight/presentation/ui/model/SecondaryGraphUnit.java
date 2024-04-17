package com.withings.weight.presentation.ui.model;

import en0.i;
import en0.k;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SecondaryGraphUiModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/presentation/ui/model/SecondaryGraphUnit;", "", "weight-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SecondaryGraphUnit {

    /* renamed from: d  reason: collision with root package name */
    public static final SecondaryGraphUnit f47265d;

    /* renamed from: e  reason: collision with root package name */
    public static final SecondaryGraphUnit f47266e;

    /* renamed from: f  reason: collision with root package name */
    public static final SecondaryGraphUnit f47267f;

    /* renamed from: g  reason: collision with root package name */
    public static final SecondaryGraphUnit f47268g;

    /* renamed from: h  reason: collision with root package name */
    public static final SecondaryGraphUnit f47269h;

    /* renamed from: i  reason: collision with root package name */
    public static final SecondaryGraphUnit f47270i;

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ SecondaryGraphUnit[] f47271j;

    /* renamed from: a  reason: collision with root package name */
    private final float f47272a;

    /* renamed from: b  reason: collision with root package name */
    private final float f47273b;

    /* renamed from: c  reason: collision with root package name */
    private final k f47274c;

    /* JADX WARN: Type inference failed for: r0v1, types: [en0.i, en0.k] */
    static {
        SecondaryGraphUnit secondaryGraphUnit = new SecondaryGraphUnit("VisceralFat", 0, 3.0f, 1.0f, null);
        f47265d = secondaryGraphUnit;
        SecondaryGraphUnit secondaryGraphUnit2 = new SecondaryGraphUnit("Bmi", 1, 3.0f, 1.0f, null);
        f47266e = secondaryGraphUnit2;
        SecondaryGraphUnit secondaryGraphUnit3 = new SecondaryGraphUnit("Percentage", 2, 6.0f, 2.0f, null);
        f47267f = secondaryGraphUnit3;
        SecondaryGraphUnit secondaryGraphUnit4 = new SecondaryGraphUnit("Weight", 3, 6.0f, 2.0f, null);
        f47268g = secondaryGraphUnit4;
        SecondaryGraphUnit secondaryGraphUnit5 = new SecondaryGraphUnit("Bmr", 4, 12.5f, 10.0f, new i(0, 10000, 1));
        f47269h = secondaryGraphUnit5;
        SecondaryGraphUnit secondaryGraphUnit6 = new SecondaryGraphUnit("PulseWaveVelocity", 5, 2.0f, 2.0f, null);
        f47270i = secondaryGraphUnit6;
        SecondaryGraphUnit[] secondaryGraphUnitArr = {secondaryGraphUnit, secondaryGraphUnit2, secondaryGraphUnit3, secondaryGraphUnit4, secondaryGraphUnit5, secondaryGraphUnit6};
        f47271j = secondaryGraphUnitArr;
        b.a(secondaryGraphUnitArr);
    }

    private SecondaryGraphUnit(String str, int i11, float f11, float f12, k kVar) {
        this.f47272a = f11;
        this.f47273b = f12;
        this.f47274c = kVar;
    }

    public static SecondaryGraphUnit valueOf(String str) {
        return (SecondaryGraphUnit) Enum.valueOf(SecondaryGraphUnit.class, str);
    }

    public static SecondaryGraphUnit[] values() {
        return (SecondaryGraphUnit[]) f47271j.clone();
    }

    public final k a() {
        return this.f47274c;
    }

    public final float b() {
        return this.f47273b;
    }

    public final float d() {
        return this.f47272a;
    }
}
