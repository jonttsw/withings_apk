package com.withings.tutorials.ui.screens.modes.pacemaker;

import com.withings.tutorials.core.UserMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: PacemakerModeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pacemaker.PacemakerModeViewModel$changeFeatureActivation$1", f = "PacemakerModeViewModel.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class o extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f45773a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PacemakerModeViewModel f45774b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(PacemakerModeViewModel pacemakerModeViewModel, qm0.d<? super o> dVar) {
        super(2, dVar);
        this.f45774b = pacemakerModeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new o(this.f45774b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((o) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        y60.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f45773a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            PacemakerModeViewModel pacemakerModeViewModel = this.f45774b;
            dVar = pacemakerModeViewModel.f45703b;
            Long l5 = new Long(pacemakerModeViewModel.f45705d);
            this.f45773a = 1;
            if (dVar.a(UserMode.f44574d, pacemakerModeViewModel.f45704c, !pacemakerModeViewModel.k0(), l5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
