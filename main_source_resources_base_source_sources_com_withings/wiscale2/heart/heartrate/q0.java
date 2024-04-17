package com.withings.wiscale2.heart.heartrate;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* compiled from: HeartRateDayFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.HeartRateDayViewModel$sleepTracks$1$1", f = "HeartRateDayFragment.kt", l = {ConstantsWs.WS_STATUS_FILEERROR}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class q0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends Track>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57718a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f57719b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f57720c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(e0 e0Var, qm0.d<? super q0> dVar) {
        super(2, dVar);
        this.f57720c = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        q0 q0Var = new q0(this.f57720c, dVar);
        q0Var.f57719b = obj;
        return q0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends Track>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((q0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ei0.q qVar;
        User user;
        DateTime dateTime;
        DateTime dateTime2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57718a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            e0 e0Var = this.f57720c;
            qVar = e0Var.f57587d;
            user = e0Var.f57584a;
            long q11 = user.q();
            dateTime = e0Var.f57585b;
            dateTime2 = e0Var.f57597n;
            List<Track> i12 = qVar.i(q11, dateTime, dateTime2);
            this.f57718a = 1;
            if (((androidx.lifecycle.h0) this.f57719b).emit(i12, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
