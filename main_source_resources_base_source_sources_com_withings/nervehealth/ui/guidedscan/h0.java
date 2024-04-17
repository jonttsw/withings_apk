package com.withings.nervehealth.ui.guidedscan;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NerveHealthGuidedScanViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel", f = "NerveHealthGuidedScanViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_VASISTAS_TYPE_WALKING_ASYMETRY}, m = "finishGuidedScanWithInternetCheck")
/* loaded from: classes4.dex */
public final class h0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    NerveHealthGuidedScanViewModel f42621a;

    /* renamed from: b  reason: collision with root package name */
    Context f42622b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f42623c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ NerveHealthGuidedScanViewModel f42624d;

    /* renamed from: e  reason: collision with root package name */
    int f42625e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel, qm0.d<? super h0> dVar) {
        super(dVar);
        this.f42624d = nerveHealthGuidedScanViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f42623c = obj;
        this.f42625e |= Integer.MIN_VALUE;
        return NerveHealthGuidedScanViewModel.i0(this.f42624d, null, this);
    }
}
