package com.withings.wiscale2.sleep.ui.sleepscore;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$finishIfLegacyTutorialsIsNotCompleted$2", f = "SleepActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class y extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepActivity f61561a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(SleepActivity sleepActivity, qm0.d<? super y> dVar) {
        super(2, dVar);
        this.f61561a = sleepActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new y(this.f61561a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
        return ((y) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        SleepActivity sleepActivity = this.f61561a;
        return Boolean.valueOf(new hi0.d(sleepActivity).c(new Long(sleepActivity.P3().getId())));
    }
}
