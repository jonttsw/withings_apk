package com.withings.survey.ui;

import com.withings.common.compose.component.ToastStyle;
import com.withings.common.compose.component.z4;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InAppSurveyActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.ui.InAppSurveyActivity$SurveyContent$3$2$1$2", f = "InAppSurveyActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGURL}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class q0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f44416a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z4 f44417b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f44418c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(z4 z4Var, String str, qm0.d<? super q0> dVar) {
        super(2, dVar);
        this.f44417b = z4Var;
        this.f44418c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new q0(this.f44417b, this.f44418c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((q0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f44416a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            ToastStyle toastStyle = ToastStyle.f33351d;
            this.f44416a = 1;
            if (z4.c(this.f44417b, toastStyle, this.f44418c, null, 0L, null, this, 28) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
