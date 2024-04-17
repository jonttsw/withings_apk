package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import com.withings.user.core.models.User;
import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* compiled from: SleepDisorderPagerViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderPagerViewModel$sleepTracks$1$1", f = "SleepDisorderPagerViewModel.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class k1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends Track>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61377a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f61378b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j1 f61379c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(j1 j1Var, qm0.d<? super k1> dVar) {
        super(2, dVar);
        this.f61379c = j1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        k1 k1Var = new k1(this.f61379c, dVar);
        k1Var.f61378b = obj;
        return k1Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends Track>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((k1) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ei0.q qVar;
        User user;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61377a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            j1 j1Var = this.f61379c;
            qVar = j1Var.f61355a;
            user = j1Var.f61356b;
            long id2 = user.getId();
            DateTime dateTime = new DateTime(1583017200000L);
            DateTime now = DateTime.now();
            kotlin.jvm.internal.u.i(now, "now(...)");
            ArrayList n11 = qVar.n(id2, dateTime, now, j1Var.f61359e);
            j1Var.q0().postValue(Boolean.FALSE);
            this.f61377a = 1;
            if (((androidx.lifecycle.h0) this.f61378b).emit(n11, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
