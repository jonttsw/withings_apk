package com.withings.tutorials.ui.screens.modes.eyesclosed;

import com.withings.tutorials.core.UserMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: EyesClosedModeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.eyesclosed.EyesClosedModeViewModel$changeFeatureActivation$1", f = "EyesClosedModeViewModel.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class n extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f45689a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EyesClosedModeViewModel f45690b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(EyesClosedModeViewModel eyesClosedModeViewModel, qm0.d<? super n> dVar) {
        super(2, dVar);
        this.f45690b = eyesClosedModeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new n(this.f45690b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        y60.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f45689a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            EyesClosedModeViewModel eyesClosedModeViewModel = this.f45690b;
            dVar = eyesClosedModeViewModel.f45616b;
            Long l5 = new Long(eyesClosedModeViewModel.f45618d);
            this.f45689a = 1;
            if (dVar.a(UserMode.f44572b, eyesClosedModeViewModel.f45617c, !eyesClosedModeViewModel.k0(), l5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
