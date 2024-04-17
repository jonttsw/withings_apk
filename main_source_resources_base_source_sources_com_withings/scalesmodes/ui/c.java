package com.withings.scalesmodes.ui;

import com.withings.wiscale2.C1987R;
/* compiled from: ModeCellUIModel.kt */
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f43925a;

    /* renamed from: b  reason: collision with root package name */
    private final int f43926b;

    /* renamed from: c  reason: collision with root package name */
    private final int f43927c;

    /* renamed from: d  reason: collision with root package name */
    private final int f43928d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f43929e;

    /* compiled from: ModeCellUIModel.kt */
    /* loaded from: classes4.dex */
    public static final class a extends c {
        public a(boolean z5) {
            super(C1987R.color.backgroundGood, C1987R.color.textSecondaryGood, C1987R.string.glyph_run2, C1987R.string.athlete_mode_title, z5);
        }
    }

    /* compiled from: ModeCellUIModel.kt */
    /* loaded from: classes4.dex */
    public static final class b extends c {
        public b(boolean z5) {
            super(C1987R.color.backgroundInfo, C1987R.color.textSecondaryInfo, C1987R.string.glyph_eyeclose, C1987R.string.eyesClosed_mode_title, z5);
        }
    }

    /* compiled from: ModeCellUIModel.kt */
    /* renamed from: com.withings.scalesmodes.ui.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0600c extends c {
        public C0600c(boolean z5) {
            super(C1987R.color.backgroundBad, C1987R.color.textSecondaryBad, C1987R.string.glyph_heart, C1987R.string.pacemakerSafety_mode_title, z5);
        }
    }

    /* compiled from: ModeCellUIModel.kt */
    /* loaded from: classes4.dex */
    public static final class d extends c {
        public d(boolean z5) {
            super(C1987R.color.datavizDiverging6, C1987R.color.datavizDiverging9, C1987R.string.glyph_baby1, C1987R.string.pregnancy_mode_title, z5);
        }
    }

    public c(int i11, int i12, int i13, int i14, boolean z5) {
        this.f43925a = i11;
        this.f43926b = i12;
        this.f43927c = i13;
        this.f43928d = i14;
        this.f43929e = z5;
    }

    public final int a() {
        return this.f43925a;
    }

    public final int b() {
        return this.f43926b;
    }

    public final int c() {
        return this.f43927c;
    }

    public final int d() {
        return this.f43928d;
    }

    public final boolean e() {
        return this.f43929e;
    }
}
