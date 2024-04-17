package com.withings.tutorials.ui.screens.modes.athlete;

import com.withings.tutorials.core.UserMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: AthleteModeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.athlete.AthleteModeViewModel$changeFeatureActivation$1", f = "AthleteModeViewModel.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class n extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f45604a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AthleteModeViewModel f45605b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AthleteModeViewModel athleteModeViewModel, qm0.d<? super n> dVar) {
        super(2, dVar);
        this.f45605b = athleteModeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new n(this.f45605b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        y60.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f45604a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            AthleteModeViewModel athleteModeViewModel = this.f45605b;
            dVar = athleteModeViewModel.f45531b;
            Long l5 = new Long(athleteModeViewModel.f45533d);
            this.f45604a = 1;
            if (dVar.a(UserMode.f44573c, athleteModeViewModel.f45532c, !athleteModeViewModel.k0(), l5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
