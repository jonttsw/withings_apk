package com.withings.survey.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppSurveyActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.ui.InAppSurveyActivity$SurveyContent$1", f = "InAppSurveyActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class i0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.o1<Integer> f44345a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f44346b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k1.o1<Integer> o1Var, r8.n nVar, qm0.d<? super i0> dVar) {
        super(2, dVar);
        this.f44345a = o1Var;
        this.f44346b = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new i0(this.f44345a, this.f44346b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((i0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        int i11 = InAppSurveyActivity.f44288f;
        Integer value = this.f44345a.getValue();
        if (value != null) {
            androidx.navigation.e.L(this.f44346b, String.valueOf(value.intValue()), null, 6);
        }
        return nm0.y.f85009a;
    }
}
