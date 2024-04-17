package com.withings.survey.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InAppSurveyActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.ui.InAppSurveyActivity$onCreate$1$1$1", f = "InAppSurveyActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class m1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44385a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.o1<Boolean> f44386b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(InAppSurveyActivity inAppSurveyActivity, k1.o1<Boolean> o1Var, qm0.d<? super m1> dVar) {
        super(2, dVar);
        this.f44385a = inAppSurveyActivity;
        this.f44386b = o1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m1(this.f44385a, this.f44386b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((m1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        if (t1.a(this.f44386b)) {
            InAppSurveyActivity inAppSurveyActivity = this.f44385a;
            inAppSurveyActivity.setResult(-1);
            inAppSurveyActivity.finish();
        }
        return nm0.y.f85009a;
    }
}
