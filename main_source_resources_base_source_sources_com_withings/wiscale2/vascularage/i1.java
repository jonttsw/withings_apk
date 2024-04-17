package com.withings.wiscale2.vascularage;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$switchShowRange$1", f = "VascularAgeViewModel.kt", l = {ConstantsWs.WS_STATUS_FILEERROR}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class i1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62326a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0 f62327b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(r0 r0Var, qm0.d<? super i1> dVar) {
        super(2, dVar);
        this.f62327b = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new i1(this.f62327b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((i1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62326a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            r0 r0Var = this.f62327b;
            mutableStateFlow = r0Var.f62457r;
            mutableStateFlow2 = r0Var.f62457r;
            Boolean valueOf = Boolean.valueOf(!((Boolean) mutableStateFlow2.getValue()).booleanValue());
            this.f62326a = 1;
            if (mutableStateFlow.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
