package com.withings.wiscale2.settings;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsViewModel$hasPassword$1", f = "SettingsViewModel.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class h5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Boolean>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60034a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f60035b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60036c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(SettingsViewModel settingsViewModel, qm0.d<? super h5> dVar) {
        super(2, dVar);
        this.f60036c = settingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        h5 h5Var = new h5(this.f60036c, dVar);
        h5Var.f60035b = obj;
        return h5Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((h5) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60034a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Boolean valueOf = Boolean.valueOf(this.f60036c.f59759b.h().d());
            this.f60034a = 1;
            if (((FlowCollector) this.f60035b).emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
