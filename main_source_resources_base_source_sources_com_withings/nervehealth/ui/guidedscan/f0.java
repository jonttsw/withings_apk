package com.withings.nervehealth.ui.guidedscan;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NerveHealthGuidedScanViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel", f = "NerveHealthGuidedScanViewModel.kt", l = {180}, m = "cancelGuidedScan")
/* loaded from: classes4.dex */
public final class f0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    NerveHealthGuidedScanViewModel f42611a;

    /* renamed from: b  reason: collision with root package name */
    Context f42612b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f42613c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ NerveHealthGuidedScanViewModel f42614d;

    /* renamed from: e  reason: collision with root package name */
    int f42615e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel, qm0.d<? super f0> dVar) {
        super(dVar);
        this.f42614d = nerveHealthGuidedScanViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f42613c = obj;
        this.f42615e |= Integer.MIN_VALUE;
        return NerveHealthGuidedScanViewModel.f0(this.f42614d, null, this);
    }
}
