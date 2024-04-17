package com.withings.tutorials.ui;

import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: TutorialViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.TutorialViewModel$userFlow$1", f = "TutorialViewModel.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class i0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super User>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f44764a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f44765b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TutorialViewModel f44766c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f44767d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(TutorialViewModel tutorialViewModel, long j5, qm0.d<? super i0> dVar) {
        super(2, dVar);
        this.f44766c = tutorialViewModel;
        this.f44767d = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        i0 i0Var = new i0(this.f44766c, this.f44767d, dVar);
        i0Var.f44765b = obj;
        return i0Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super User> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((i0) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        m70.i iVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f44764a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            iVar = this.f44766c.f44700b;
            User i12 = iVar.i(this.f44767d);
            this.f44764a = 1;
            if (((FlowCollector) this.f44765b).emit(i12, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
