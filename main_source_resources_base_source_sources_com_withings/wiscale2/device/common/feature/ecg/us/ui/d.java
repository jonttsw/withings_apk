package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import com.withings.device.Device;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EcgReviewActivity.kt */
/* loaded from: classes5.dex */
final class d extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgReviewActivity f52003a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EcgReviewActivity ecgReviewActivity) {
        super(0);
        this.f52003a = ecgReviewActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        EcgReviewActivity ecgReviewActivity = this.f52003a;
        kn.e eVar = ecgReviewActivity.f51988g;
        if (eVar != null) {
            Device d11 = eVar.d(EcgReviewActivity.z3(ecgReviewActivity));
            if (d11 != null) {
                ch.d dVar = ecgReviewActivity.f51987f;
                if (dVar != null) {
                    ecgReviewActivity.startActivity(((ah.l) dVar.v()).i(EcgReviewActivity.A3(ecgReviewActivity), ecgReviewActivity, d11));
                } else {
                    u.s("intentBuilder");
                    throw null;
                }
            }
            return y.f85009a;
        }
        u.s("deviceManager");
        throw null;
    }
}
