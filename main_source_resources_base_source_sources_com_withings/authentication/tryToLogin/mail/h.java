package com.withings.authentication.tryToLogin.mail;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.y;
import th.z;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryToLoginViewModel.kt */
/* loaded from: classes3.dex */
public final class h<T> implements FlowCollector {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TryToLoginViewModel f32463a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(TryToLoginViewModel tryToLoginViewModel) {
        this.f32463a = tryToLoginViewModel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, qm0.d dVar) {
        Object emit = this.f32463a.W0().emit((z.a) obj, dVar);
        if (emit != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return emit;
    }
}
