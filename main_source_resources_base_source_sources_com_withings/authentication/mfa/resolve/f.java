package com.withings.authentication.mfa.resolve;

import com.withings.authentication.mfa.resolve.a;
import com.withings.authentication.mfa.resolve.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: MfaResolutionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolutionViewModel$onSelectFactor$1", f = "MfaResolutionViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f32063a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MfaResolutionViewModel f32064b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, MfaResolutionViewModel mfaResolutionViewModel, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f32063a = cVar;
        this.f32064b = mfaResolutionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new f(this.f32063a, this.f32064b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        c.C0424c c0424c = c.C0424c.f31965a;
        c cVar = this.f32063a;
        boolean e11 = kotlin.jvm.internal.u.e(cVar, c0424c);
        MfaResolutionViewModel mfaResolutionViewModel = this.f32064b;
        if (!e11) {
            mfaResolutionViewModel.T0(cVar);
        }
        mutableStateFlow = mfaResolutionViewModel.f31939h;
        a value = mfaResolutionViewModel.B0().getValue();
        kotlin.jvm.internal.u.h(value, "null cannot be cast to non-null type com.withings.authentication.mfa.resolve.AuthenticationState.Ready");
        mutableStateFlow.setValue(a.c.a((a.c) value, cVar));
        return nm0.y.f85009a;
    }
}
