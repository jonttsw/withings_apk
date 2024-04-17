package com.withings.wiscale2.vascularage;

import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.wiscale2.vascularage.i;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$state$1", f = "VascularAgeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class h1 extends kotlin.coroutines.jvm.internal.i implements ym0.t<d, List<? extends LearnMoreEntryTranslations>, Integer, w, h, qm0.d<? super i.b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ d f62314a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f62315b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ int f62316c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ w f62317d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ h f62318e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(qm0.d<? super h1> dVar) {
        super(6, dVar);
    }

    @Override // ym0.t
    public final Object c(d dVar, List<? extends LearnMoreEntryTranslations> list, Integer num, w wVar, h hVar, qm0.d<? super i.b> dVar2) {
        int intValue = num.intValue();
        h1 h1Var = new h1(dVar2);
        h1Var.f62314a = dVar;
        h1Var.f62315b = list;
        h1Var.f62316c = intValue;
        h1Var.f62317d = wVar;
        h1Var.f62318e = hVar;
        return h1Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        return new i.b(this.f62314a, this.f62315b, this.f62316c, this.f62317d, this.f62318e);
    }
}
