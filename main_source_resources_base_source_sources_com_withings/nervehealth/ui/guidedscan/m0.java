package com.withings.nervehealth.ui.guidedscan;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NerveHealthGuidedScanViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel", f = "NerveHealthGuidedScanViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_WAIST}, m = "startGuidedScan")
/* loaded from: classes4.dex */
public final class m0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    NerveHealthGuidedScanViewModel f42640a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f42641b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NerveHealthGuidedScanViewModel f42642c;

    /* renamed from: d  reason: collision with root package name */
    int f42643d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel, qm0.d<? super m0> dVar) {
        super(dVar);
        this.f42642c = nerveHealthGuidedScanViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f42641b = obj;
        this.f42643d |= Integer.MIN_VALUE;
        return NerveHealthGuidedScanViewModel.A0(this.f42642c, null, this);
    }
}
