package com.withings.wiscale2.measure.list;

import androidx.lifecycle.h0;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: MeasureListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.list.ListViewModel$user$1$1", f = "MeasureListActivity.kt", l = {219}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class h extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<User>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f58553a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f58554b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f58555c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, qm0.d<? super h> dVar) {
        super(2, dVar);
        this.f58555c = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        h hVar = new h(this.f58555c, dVar);
        hVar.f58554b = obj;
        return hVar;
    }

    @Override // ym0.p
    public final Object invoke(h0<User> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((h) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f58553a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            g gVar = this.f58555c;
            User i12 = gVar.t0().i(gVar.r0());
            this.f58553a = 1;
            if (((h0) this.f58554b).emit(i12, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
