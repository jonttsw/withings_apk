package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.location.repository.ws.GetLocationVasistas;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
/* compiled from: WorkoutDetailViewModel.kt */
/* loaded from: classes4.dex */
public final class x3 implements vh.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j3 f49809a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Track f49810b;

    /* compiled from: WorkoutDetailViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailViewModel$onNoLocationVasistas$syncJob$1$run$1", f = "WorkoutDetailViewModel.kt", l = {649}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f49811a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j3 f49812b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Track f49813c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f49814d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j3 j3Var, Track track, String str, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f49812b = j3Var;
            this.f49813c = track;
            this.f49814d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f49812b, this.f49813c, this.f49814d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            GetLocationVasistas getLocationVasistas;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f49811a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                j3 j3Var = this.f49812b;
                getLocationVasistas = j3Var.f49254e;
                long q11 = j3Var.f49250a.q();
                Track track = this.f49813c;
                DateTime effectiveStartDate = TrackKt.getEffectiveStartDate(track);
                DateTime effectiveEndDate = TrackKt.getEffectiveEndDate(track);
                this.f49811a = 1;
                if (getLocationVasistas.invoke(q11, effectiveStartDate, effectiveEndDate, this.f49814d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x3(j3 j3Var, Track track) {
        this.f49809a = j3Var;
        this.f49810b = track;
    }

    @Override // vh.a
    public final void run() {
        BuildersKt__BuildersKt.runBlocking$default(null, new a(this.f49809a, this.f49810b, "getFromWorkoutView", null), 1, null);
    }
}
