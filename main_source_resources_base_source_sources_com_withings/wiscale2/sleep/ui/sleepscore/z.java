package com.withings.wiscale2.sleep.ui.sleepscore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity", f = "SleepActivity.kt", l = {125, 135}, m = "showSleepApneaOnboardingIfNecessary")
/* loaded from: classes5.dex */
public final class z extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    SleepActivity f61579a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f61580b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SleepActivity f61581c;

    /* renamed from: d  reason: collision with root package name */
    int f61582d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(SleepActivity sleepActivity, qm0.d<? super z> dVar) {
        super(dVar);
        this.f61581c = sleepActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f61580b = obj;
        this.f61582d |= Integer.MIN_VALUE;
        return SleepActivity.L3(this.f61581c, this);
    }
}
