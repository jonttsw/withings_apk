package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepScoreInterruptionsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreInterruptionsActivity$loadAndShowData$1", f = "SleepScoreInterruptionsActivity.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_QT_INTERVAL_DURATION}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class a3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60880a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SleepScoreInterruptionsActivity f60881b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SleepScore.Info f60882c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Track f60883d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepScoreInterruptionsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreInterruptionsActivity$loadAndShowData$1$sleepData$1", f = "SleepScoreInterruptionsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super di0.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SleepScoreInterruptionsActivity f60884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Track f60885b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity, Track track, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f60884a = sleepScoreInterruptionsActivity;
            this.f60885b = track;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f60884a, this.f60885b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super di0.a> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            if (ei0.q.f65441d != null) {
                ei0.q qVar = ei0.q.f65441d;
                if (qVar != null) {
                    SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity = this.f60884a;
                    long q11 = SleepScoreInterruptionsActivity.H3(sleepScoreInterruptionsActivity).q();
                    DateTime withTimeAtStartOfDay = TrackKt.getEffectiveEndDate(this.f60885b).withTimeAtStartOfDay();
                    kotlin.jvm.internal.u.i(withTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                    SleepScoreRecalculator E3 = SleepScoreInterruptionsActivity.E3(sleepScoreInterruptionsActivity);
                    lj0.h0 e11 = lj0.h0.e();
                    kotlin.jvm.internal.u.i(e11, "get(...)");
                    return qVar.A(q11, withTimeAtStartOfDay, E3, e11);
                }
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
            kotlin.jvm.internal.u.s("instance");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity, SleepScore.Info info, Track track, qm0.d<? super a3> dVar) {
        super(2, dVar);
        this.f60881b = sleepScoreInterruptionsActivity;
        this.f60882c = info;
        this.f60883d = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new a3(this.f60881b, this.f60882c, this.f60883d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((a3) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60880a;
        SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity = this.f60881b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(sleepScoreInterruptionsActivity, this.f60883d, null);
            this.f60880a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        di0.a aVar2 = (di0.a) obj;
        if (!aVar2.a().isEmpty()) {
            SleepScoreInterruptionsActivity.M3(sleepScoreInterruptionsActivity, aVar2, this.f60882c);
        } else {
            SleepScoreInterruptionsActivity.D3(sleepScoreInterruptionsActivity).setVisibility(0);
        }
        return nm0.y.f85009a;
    }
}
