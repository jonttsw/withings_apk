package com.withings.wiscale2.activity.workout.ui.detail;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import com.withings.library.measure.MeasuresGroup;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
public final class s1 extends x5 {

    /* renamed from: b  reason: collision with root package name */
    private final MeasuresGroup f49602b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f49603c;

    /* renamed from: d  reason: collision with root package name */
    private final Drawable f49604d;

    /* renamed from: e  reason: collision with root package name */
    private final String f49605e;

    /* renamed from: f  reason: collision with root package name */
    private final String f49606f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(MeasuresGroup measureGroup, String str, SpannableStringBuilder spannableStringBuilder, GradientDrawable gradientDrawable, String str2, String str3) {
        super(6);
        kotlin.jvm.internal.u.j(measureGroup, "measureGroup");
        this.f49602b = measureGroup;
        this.f49603c = spannableStringBuilder;
        this.f49604d = gradientDrawable;
        this.f49605e = str2;
        this.f49606f = str3;
    }

    public final String b() {
        return this.f49606f;
    }

    public final Drawable c() {
        return this.f49604d;
    }

    public final CharSequence d() {
        return this.f49603c;
    }

    public final MeasuresGroup e() {
        return this.f49602b;
    }

    public final String f() {
        return this.f49605e;
    }
}
