package com.withings.wiscale2.settings;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsViewModel$hasAccessToAccountAndSecuritySettings$1", f = "SettingsViewModel.kt", l = {68, 68}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class g5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Boolean>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60017a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f60018b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60019c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(SettingsViewModel settingsViewModel, qm0.d<? super g5> dVar) {
        super(2, dVar);
        this.f60019c = settingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        g5 g5Var = new g5(this.f60019c, dVar);
        g5Var.f60018b = obj;
        return g5Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((g5) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        f0 f0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60017a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.f60018b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            flowCollector = (FlowCollector) this.f60018b;
            f0Var = this.f60019c.f59760c;
            this.f60018b = flowCollector;
            this.f60017a = 1;
            obj = f0Var.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f60018b = null;
        this.f60017a = 2;
        if (flowCollector.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
