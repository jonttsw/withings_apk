package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Intent;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: WorkoutPreview.kt */
/* loaded from: classes4.dex */
public final class l7 {

    /* renamed from: a  reason: collision with root package name */
    private final long f49416a;

    /* renamed from: b  reason: collision with root package name */
    private final WorkoutCategory f49417b;

    /* renamed from: c  reason: collision with root package name */
    private final DateTime f49418c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49419d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f49420e;

    /* renamed from: f  reason: collision with root package name */
    private final m7 f49421f;

    /* renamed from: g  reason: collision with root package name */
    private final Intent f49422g;

    /* renamed from: h  reason: collision with root package name */
    private final String f49423h;

    /* renamed from: i  reason: collision with root package name */
    private final List<xa0.a> f49424i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f49425j;

    /* renamed from: k  reason: collision with root package name */
    private final Track f49426k;

    public l7(long j5, WorkoutCategory workoutCategory, DateTime date, String duration, Object obj, m7 m7Var, Intent intent, String str, ArrayList arrayList, boolean z5, Track workout) {
        kotlin.jvm.internal.u.j(date, "date");
        kotlin.jvm.internal.u.j(duration, "duration");
        kotlin.jvm.internal.u.j(workout, "workout");
        this.f49416a = j5;
        this.f49417b = workoutCategory;
        this.f49418c = date;
        this.f49419d = duration;
        this.f49420e = obj;
        this.f49421f = m7Var;
        this.f49422g = intent;
        this.f49423h = str;
        this.f49424i = arrayList;
        this.f49425j = z5;
        this.f49426k = workout;
    }

    public final WorkoutCategory a() {
        return this.f49417b;
    }

    public final Intent b() {
        return this.f49422g;
    }

    public final DateTime c() {
        return this.f49418c;
    }

    public final String d() {
        return this.f49423h;
    }

    public final String e() {
        return this.f49419d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj;
        if (this.f49416a == l7Var.f49416a && kotlin.jvm.internal.u.e(this.f49417b, l7Var.f49417b) && kotlin.jvm.internal.u.e(this.f49418c, l7Var.f49418c) && kotlin.jvm.internal.u.e(this.f49419d, l7Var.f49419d) && kotlin.jvm.internal.u.e(this.f49420e, l7Var.f49420e) && kotlin.jvm.internal.u.e(this.f49421f, l7Var.f49421f) && kotlin.jvm.internal.u.e(this.f49422g, l7Var.f49422g) && kotlin.jvm.internal.u.e(this.f49423h, l7Var.f49423h) && kotlin.jvm.internal.u.e(this.f49424i, l7Var.f49424i) && this.f49425j == l7Var.f49425j && kotlin.jvm.internal.u.e(this.f49426k, l7Var.f49426k)) {
            return true;
        }
        return false;
    }

    public final Object f() {
        return this.f49420e;
    }

    public final m7 g() {
        return this.f49421f;
    }

    public final boolean h() {
        return this.f49425j;
    }

    public final int hashCode() {
        int hashCode;
        int c11 = defpackage.d.c(this.f49419d, com.google.android.gms.internal.mlkit_common.a.b(this.f49418c, (this.f49417b.hashCode() + (Long.hashCode(this.f49416a) * 31)) * 31, 31), 31);
        int i11 = 0;
        Object obj = this.f49420e;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int hashCode2 = (this.f49422g.hashCode() + ((this.f49421f.hashCode() + ((c11 + hashCode) * 31)) * 31)) * 31;
        String str = this.f49423h;
        if (str != null) {
            i11 = str.hashCode();
        }
        return this.f49426k.hashCode() + androidx.camera.core.y1.a(this.f49425j, defpackage.e.b(this.f49424i, (hashCode2 + i11) * 31, 31), 31);
    }

    public final List<xa0.a> i() {
        return this.f49424i;
    }

    public final Track j() {
        return this.f49426k;
    }

    public final long k() {
        return this.f49416a;
    }

    public final String toString() {
        return "WorkoutPreviewInfo(workoutId=" + this.f49416a + ", category=" + this.f49417b + ", date=" + this.f49418c + ", duration=" + this.f49419d + ", picture=" + this.f49420e + ", previewMapInfo=" + this.f49421f + ", clickIntent=" + this.f49422g + ", distanceAndCalories=" + this.f49423h + ", statbarContents=" + this.f49424i + ", shouldShowBigItem=" + this.f49425j + ", workout=" + this.f49426k + ")";
    }
}
