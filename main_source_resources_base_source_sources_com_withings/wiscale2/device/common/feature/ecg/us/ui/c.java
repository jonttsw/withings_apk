package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.device.Device;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EcgReviewActivity.kt */
/* loaded from: classes5.dex */
final class c extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgReviewActivity f52002a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EcgReviewActivity ecgReviewActivity) {
        super(0);
        this.f52002a = ecgReviewActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        EcgReviewActivity ecgReviewActivity = this.f52002a;
        kn.e eVar = ecgReviewActivity.f51988g;
        if (eVar != null) {
            Device d11 = eVar.d(EcgReviewActivity.z3(ecgReviewActivity));
            if (d11 != null) {
                d11.getModelId();
                ch.d dVar = ecgReviewActivity.f51987f;
                if (dVar != null) {
                    ecgReviewActivity.startActivity(ch.l.a(dVar.t(), this.f52002a, null, null, "https://support.withings.com/hc/en-us/articles/4407741101457", new HMWebViewDelegate(), 6));
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
