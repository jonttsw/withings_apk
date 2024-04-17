package com.withings.survey.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* compiled from: InAppSurveyActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.ui.InAppSurveyActivity$SurveyContent$3$1$1$1$3", f = "InAppSurveyActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGEMAIL}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class l0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f44376a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f44377b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k1.r0<Boolean> r0Var, qm0.d<? super l0> dVar) {
        super(2, dVar);
        this.f44377b = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new l0(this.f44377b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((l0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f44376a;
        k1.r0<Boolean> r0Var = this.f44377b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            int i12 = InAppSurveyActivity.f44288f;
            r0Var.setValue(Boolean.TRUE);
            this.f44376a = 1;
            if (DelayKt.delay(300L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        int i13 = InAppSurveyActivity.f44288f;
        r0Var.setValue(Boolean.FALSE);
        return nm0.y.f85009a;
    }
}
