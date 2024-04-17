package com.withings.ecg.heartsound;

import androidx.transition.Transition;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HeartSoundDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class m extends androidx.transition.v {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f38486a;

    /* compiled from: HeartSoundDetailsFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.heartsound.HeartSoundDetailsFragment$setButtonPauseState$listener$1$onTransitionEnd$1", f = "HeartSoundDetailsFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGDEVICEID}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38487a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f38488b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, qm0.d<? super a> dVar2) {
            super(2, dVar2);
            this.f38488b = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f38488b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            qq.d dVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f38487a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                dVar = this.f38488b.f38442t;
                if (dVar != null) {
                    this.f38487a = 1;
                    if (dVar.h(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(d dVar) {
        this.f38486a = dVar;
    }

    @Override // androidx.transition.v, androidx.transition.Transition.d
    public final void d(Transition transition) {
        d0 d0Var;
        kotlin.jvm.internal.u.j(transition, "transition");
        d dVar = this.f38486a;
        d0Var = dVar.f38443u;
        if (d0Var != null) {
            d0Var.l();
        }
        dVar.D1().f78076h.A();
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(dVar), null, null, new a(dVar, null), 3, null);
    }
}
