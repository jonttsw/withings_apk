package com.withings.wiscale2.activity.logging.ui;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.track.data.GpsSummary;
import com.withings.wiscale2.track.data.Track;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: EditWorkoutViewModel.kt */
/* loaded from: classes4.dex */
public final class u0 extends androidx.lifecycle.k0<Track> {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f48455a;

    /* renamed from: b  reason: collision with root package name */
    private final ua0.a f48456b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditWorkoutViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditedWorkoutLiveData$computeGpsSummary$1", f = "EditWorkoutViewModel.kt", l = {ConstantsWs.WS_STATUS_ALREADY_ASSOCIATED}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Track f48457a;

        /* renamed from: b  reason: collision with root package name */
        int f48458b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Track f48459c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u0 f48460d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Track track, u0 u0Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f48459c = track;
            this.f48460d = u0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f48459c, this.f48460d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Track track;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48458b;
            u0 u0Var = this.f48460d;
            Track track2 = this.f48459c;
            if (i11 != 0) {
                if (i11 == 1) {
                    track = this.f48457a;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                ua0.a aVar = u0Var.f48456b;
                this.f48457a = track2;
                this.f48458b = 1;
                obj = aVar.b(track2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                track = track2;
            }
            track.setGpsSummary((GpsSummary) obj);
            u0Var.postValue(track2);
            return nm0.y.f85009a;
        }
    }

    public u0(CoroutineScope coroutineScope, ua0.a computeTrackGpsSummary) {
        kotlin.jvm.internal.u.j(computeTrackGpsSummary, "computeTrackGpsSummary");
        this.f48455a = coroutineScope;
        this.f48456b = computeTrackGpsSummary;
    }

    public final void v(Track workout) {
        kotlin.jvm.internal.u.j(workout, "workout");
        BuildersKt__Builders_commonKt.launch$default(this.f48455a, Dispatchers.getIO(), null, new a(workout, this, null), 2, null);
    }
}
