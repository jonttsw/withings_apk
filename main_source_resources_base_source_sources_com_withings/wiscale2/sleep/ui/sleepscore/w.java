package com.withings.wiscale2.sleep.ui.sleepscore;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity$finishIfGuidedExplanationsIsNotCompleted$2", f = "SleepActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class w extends kotlin.coroutines.jvm.internal.i implements ym0.p<Boolean, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ boolean f61543a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SleepActivity f61544b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(SleepActivity sleepActivity, qm0.d<? super w> dVar) {
        super(2, dVar);
        this.f61544b = sleepActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        w wVar = new w(this.f61544b, dVar);
        wVar.f61543a = ((Boolean) obj).booleanValue();
        return wVar;
    }

    @Override // ym0.p
    public final Object invoke(Boolean bool, qm0.d<? super nm0.y> dVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((w) create(bool2, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        boolean z5 = this.f61543a;
        SleepActivity sleepActivity = this.f61544b;
        if (z5) {
            sleepActivity.S3();
        } else {
            sleepActivity.finish();
        }
        return nm0.y.f85009a;
    }
}
