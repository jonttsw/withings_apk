package com.withings.wiscale2.partner.ui;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: PartnerExchangesFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerExchangesViewModel$isAllExportActivated$1$1", f = "PartnerExchangesFragment.kt", l = {395}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class c1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f58929a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f58930b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<d0> f58931c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<d0> f58932d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(List<d0> list, List<d0> list2, qm0.d<? super c1> dVar) {
        super(2, dVar);
        this.f58931c = list;
        this.f58932d = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        c1 c1Var = new c1(this.f58931c, this.f58932d, dVar);
        c1Var.f58930b = obj;
        return c1Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((c1) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f58929a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f58930b;
            ArrayList<d0> l02 = kotlin.collections.x.l0(this.f58932d, kotlin.collections.x.S0(this.f58931c));
            if (!l02.isEmpty()) {
                for (d0 d0Var : l02) {
                    if (!d0Var.c()) {
                        z5 = false;
                        break;
                    }
                }
            }
            z5 = true;
            Boolean valueOf = Boolean.valueOf(z5);
            this.f58929a = 1;
            if (h0Var.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
