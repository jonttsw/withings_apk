package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.common.compose.component.ToastStyle;
import com.withings.common.compose.component.z4;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CycleManualLogging.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingKt$showErrorToast$1", f = "CycleManualLogging.kt", l = {ConstantsWs.HTTP_STATUS_TOO_MANY_REQUESTS}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class s0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f41203a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z4 f41204b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f41205c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f41206d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(z4 z4Var, String str, String str2, qm0.d<? super s0> dVar) {
        super(2, dVar);
        this.f41204b = z4Var;
        this.f41205c = str;
        this.f41206d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new s0(this.f41204b, this.f41205c, this.f41206d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((s0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f41203a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            ToastStyle toastStyle = ToastStyle.f33350c;
            this.f41203a = 1;
            if (z4.c(this.f41204b, toastStyle, this.f41205c, this.f41206d, 0L, null, this, 24) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
