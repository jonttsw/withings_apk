package com.withings.wiscale2.activity.workout.ui.detail;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.withings.wiscale2.activity.workout.model.WorkoutDataBuilder;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.GpsSummary;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: PostWorkoutActivity.kt */
/* loaded from: classes4.dex */
public final class l1 extends androidx.lifecycle.g1 {

    /* renamed from: a */
    private final WorkoutDataBuilder f49392a;

    /* renamed from: b */
    private final ua0.a f49393b;

    /* renamed from: c */
    private boolean f49394c;

    /* renamed from: d */
    private final LiveData<Track> f49395d;

    /* renamed from: e */
    private final androidx.lifecycle.j0 f49396e;

    /* renamed from: f */
    private final androidx.lifecycle.j0 f49397f;

    /* renamed from: g */
    private final androidx.lifecycle.j0 f49398g;

    /* renamed from: h */
    private final androidx.lifecycle.j0 f49399h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<Track, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(1);
            l1.this = r1;
        }

        @Override // ym0.l
        public final Boolean invoke(Track track) {
            boolean z5;
            Track track2 = track;
            l1 l1Var = l1.this;
            if (!l1Var.f49394c && track2 != null && !kotlin.collections.x.W(7, 2).contains(Integer.valueOf(track2.getAttrib()))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                l1Var.f49394c = true;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<Track, Boolean> {

        /* renamed from: a */
        public static final b f49401a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Boolean invoke(Track track) {
            GpsSummary gpsSummary;
            boolean z5;
            Track track2 = track;
            if (track2 != null) {
                gpsSummary = track2.getGpsSummary();
            } else {
                gpsSummary = null;
            }
            if (gpsSummary != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.l<Track, Boolean> {

        /* renamed from: a */
        public static final c f49402a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Boolean invoke(Track track) {
            Integer num;
            Track track2 = track;
            List W = kotlin.collections.x.W(7, 2);
            if (track2 != null) {
                num = Integer.valueOf(track2.getAttrib());
            } else {
                num = null;
            }
            return Boolean.valueOf(!kotlin.collections.x.z(W, num));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<Track, String> {

        /* renamed from: a */
        final /* synthetic */ Application f49403a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Application application) {
            super(1);
            this.f49403a = application;
        }

        @Override // ym0.l
        public final String invoke(Track track) {
            DateTime now;
            Track track2 = track;
            if (track2 == null || (now = track2.getStartDate()) == null) {
                now = DateTime.now();
            }
            kotlin.jvm.internal.u.g(now);
            return b50.b.m(now, this.f49403a, true, 4);
        }
    }

    public l1(Application application, WorkoutManager workoutManager, long j5, WorkoutDataBuilder workoutDataBuilder, ua0.a aVar) {
        kotlin.jvm.internal.u.j(workoutManager, "workoutManager");
        this.f49392a = workoutDataBuilder;
        this.f49393b = aVar;
        LiveData<Track> liveWorkoutById = workoutManager.getLiveWorkoutById(j5);
        this.f49395d = liveWorkoutById;
        this.f49396e = androidx.lifecycle.e1.b(liveWorkoutById, new d(application));
        this.f49397f = androidx.lifecycle.e1.b(liveWorkoutById, b.f49401a);
        this.f49398g = androidx.lifecycle.e1.b(liveWorkoutById, new a());
        this.f49399h = androidx.lifecycle.e1.b(liveWorkoutById, c.f49402a);
    }

    public static final /* synthetic */ ua0.a g0(l1 l1Var) {
        return l1Var.f49393b;
    }

    public static final /* synthetic */ WorkoutDataBuilder i0(l1 l1Var) {
        return l1Var.f49392a;
    }

    public final androidx.lifecycle.j0 k0() {
        return this.f49398g;
    }

    public final androidx.lifecycle.j0 m0() {
        return this.f49397f;
    }

    public final androidx.lifecycle.j0 p0() {
        return this.f49399h;
    }

    public final androidx.lifecycle.j0 q0() {
        return this.f49396e;
    }

    public final LiveData<Track> r0() {
        return this.f49395d;
    }
}
