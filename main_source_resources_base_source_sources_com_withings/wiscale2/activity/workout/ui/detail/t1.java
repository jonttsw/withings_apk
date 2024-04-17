package com.withings.wiscale2.activity.workout.ui.detail;

import android.app.Application;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import org.joda.time.DateTime;
/* compiled from: WorkoutListActivity.kt */
/* loaded from: classes4.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f49644a;

    /* renamed from: b  reason: collision with root package name */
    private final DateTime f49645b;

    /* renamed from: c  reason: collision with root package name */
    private final String f49646c;

    /* renamed from: d  reason: collision with root package name */
    private final WorkoutCategory f49647d;

    public t1(Track workout, Application context, WorkoutCategory workoutCategory) {
        long j5;
        kotlin.jvm.internal.u.j(workout, "workout");
        kotlin.jvm.internal.u.j(context, "context");
        Long id2 = workout.getId();
        if (id2 != null) {
            j5 = id2.longValue();
        } else {
            x70.b.p(new Throwable("trackId null"));
            j5 = 0;
        }
        DateTime date = workout.getStartDate();
        String title = b50.b.m(workout.getStartDate(), context, true, 4);
        kotlin.jvm.internal.u.j(date, "date");
        kotlin.jvm.internal.u.j(title, "title");
        this.f49644a = j5;
        this.f49645b = date;
        this.f49646c = title;
        this.f49647d = workoutCategory;
    }

    public final WorkoutCategory a() {
        return this.f49647d;
    }

    public final DateTime b() {
        return this.f49645b;
    }

    public final String c() {
        return this.f49646c;
    }

    public final long d() {
        return this.f49644a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        if (this.f49644a == t1Var.f49644a && kotlin.jvm.internal.u.e(this.f49645b, t1Var.f49645b) && kotlin.jvm.internal.u.e(this.f49646c, t1Var.f49646c) && kotlin.jvm.internal.u.e(this.f49647d, t1Var.f49647d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c11 = defpackage.d.c(this.f49646c, com.google.android.gms.internal.mlkit_common.a.b(this.f49645b, Long.hashCode(this.f49644a) * 31, 31), 31);
        WorkoutCategory workoutCategory = this.f49647d;
        if (workoutCategory == null) {
            hashCode = 0;
        } else {
            hashCode = workoutCategory.hashCode();
        }
        return c11 + hashCode;
    }

    public final String toString() {
        return "WorkoutBaseInfo(workoutId=" + this.f49644a + ", date=" + this.f49645b + ", title=" + this.f49646c + ", category=" + this.f49647d + ")";
    }
}
