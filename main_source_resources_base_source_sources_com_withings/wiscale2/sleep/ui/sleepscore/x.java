package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity", f = "SleepActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGBLINDCODE}, m = "finishIfLegacyTutorialsIsNotCompleted")
/* loaded from: classes5.dex */
public final class x extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    SleepActivity f61551a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f61552b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SleepActivity f61553c;

    /* renamed from: d  reason: collision with root package name */
    int f61554d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(SleepActivity sleepActivity, qm0.d<? super x> dVar) {
        super(dVar);
        this.f61553c = sleepActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f61552b = obj;
        this.f61554d |= Integer.MIN_VALUE;
        return SleepActivity.B3(this.f61553c, this);
    }
}
