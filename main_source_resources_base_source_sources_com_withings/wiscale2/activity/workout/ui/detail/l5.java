package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.activity.workout.model.WorkoutSaver;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllWorkoutsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutItemViewHolder$onActivityRecognitionConfirmed$1", f = "AllWorkoutsActivity.kt", l = {ConstantsWs.HTTP_STATUS_I_M_A_TEAPOT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class l5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49409a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k5 f49410b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Track f49411c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AllWorkoutsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutItemViewHolder$onActivityRecognitionConfirmed$1$1", f = "AllWorkoutsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Track f49412a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Track track, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f49412a = track;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f49412a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Track track = this.f49412a;
            track.setStartDate(TrackKt.getEffectiveStartDate(track));
            track.setEndDate(TrackKt.getEffectiveEndDate(track));
            track.setAttrib(7);
            DateTime now = DateTime.now();
            kotlin.jvm.internal.u.i(now, "now(...)");
            track.setModifiedDate(now);
            track.setSyncedToWs(false);
            WorkoutSaver.save(track);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(k5 k5Var, Track track, qm0.d<? super l5> dVar) {
        super(2, dVar);
        this.f49410b = k5Var;
        this.f49411c = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new l5(this.f49410b, this.f49411c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((l5) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49409a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(this.f49411c, null);
            this.f49409a = 1;
            if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        k5.b(this.f49410b).setVisibility(8);
        return nm0.y.f85009a;
    }
}
