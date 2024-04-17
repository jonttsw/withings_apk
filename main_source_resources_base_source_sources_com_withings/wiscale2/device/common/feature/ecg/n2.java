package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.ecg.review.EcgReviewStatusValue;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class n2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51531a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f51532b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(EcgActivationActivity ecgActivationActivity, k1.r0<Boolean> r0Var) {
        super(0);
        this.f51531a = ecgActivationActivity;
        this.f51532b = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        EcgReviewStatusValue ecgReviewStatusValue;
        EcgActivationActivity ecgActivationActivity = this.f51531a;
        rq.b bVar = (rq.b) ecgActivationActivity.U3().i1().getValue();
        if (bVar != null) {
            ecgReviewStatusValue = bVar.d();
        } else {
            ecgReviewStatusValue = null;
        }
        if (ecgReviewStatusValue == EcgReviewStatusValue.f38859f) {
            this.f51532b.setValue(Boolean.TRUE);
        } else {
            ecgActivationActivity.finish();
        }
        return nm0.y.f85009a;
    }
}
