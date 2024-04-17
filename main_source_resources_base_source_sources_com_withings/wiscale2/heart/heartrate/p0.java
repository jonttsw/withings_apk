package com.withings.wiscale2.heart.heartrate;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.heart.heartrate.e0;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* compiled from: HeartRateDayFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.HeartRateDayViewModel$mostRelevantAndLastSleep$1$1", f = "HeartRateDayFragment.kt", l = {ConstantsWs.WS_STATUS_DEACTIVATED_ACCOUNT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class p0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<e0.a>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57713a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f57714b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f57715c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<Track> f57716d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(e0 e0Var, List<Track> list, qm0.d<? super p0> dVar) {
        super(2, dVar);
        this.f57715c = e0Var;
        this.f57716d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        p0 p0Var = new p0(this.f57715c, this.f57716d, dVar);
        p0Var.f57714b = obj;
        return p0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<e0.a> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((p0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DateTime dateTime;
        ei0.q qVar;
        User user;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57713a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f57714b;
            e0 e0Var = this.f57715c;
            dateTime = e0Var.f57597n;
            ArrayList arrayList = new ArrayList();
            for (Track track : this.f57716d) {
                if (TrackKt.getEffectiveEndDate(track).isBefore(dateTime)) {
                    arrayList.add(track);
                }
            }
            new ei0.v();
            Track b10 = ei0.v.b(arrayList);
            qVar = e0Var.f57587d;
            user = e0Var.f57584a;
            e0.a aVar = new e0.a(b10, qVar.u(user.q()));
            this.f57713a = 1;
            if (h0Var.emit(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
