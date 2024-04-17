package com.withings.survey.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InAppSurveyActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.ui.InAppSurveyActivity$SurveyContent$4$3$1$1$1$1", f = "InAppSurveyActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class y0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f44462a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(r8.n nVar, qm0.d<? super y0> dVar) {
        super(2, dVar);
        this.f44462a = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new y0(this.f44462a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((y0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        androidx.navigation.e.L(this.f44462a, "NumberPickerBottomSheet", null, 6);
        return nm0.y.f85009a;
    }
}
