package com.withings.tutorials.ui;

import com.withings.device.Device;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: TutorialViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.TutorialViewModel$activateFeature$1", f = "TutorialViewModel.kt", l = {30, 31}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class h0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f44756a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TutorialViewModel f44757b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f44758c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Device f44759d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f44760e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(TutorialViewModel tutorialViewModel, long j5, Device device, int i11, qm0.d<? super h0> dVar) {
        super(2, dVar);
        this.f44757b = tutorialViewModel;
        this.f44758c = j5;
        this.f44759d = device;
        this.f44760e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new h0(this.f44757b, this.f44758c, this.f44759d, this.f44760e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((h0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        u60.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f44756a;
        TutorialViewModel tutorialViewModel = this.f44757b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            tutorialViewModel.getClass();
            Flow flowOn = FlowKt.flowOn(FlowKt.flow(new i0(tutorialViewModel, this.f44758c, null)), Dispatchers.getIO());
            this.f44756a = 1;
            obj = FlowKt.first(flowOn, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        long q11 = ((User) obj).q();
        aVar = tutorialViewModel.f44699a;
        long id2 = this.f44759d.getId();
        this.f44756a = 2;
        if (aVar.a(id2, q11, this.f44760e, true, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
