package com.withings.device.details.automatic.activity.detection;

import android.content.Context;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.ui.platform.u0;
import com.withings.common.compose.component.a3;
import com.withings.common.compose.component.c5;
import com.withings.common.compose.component.l2;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.wiscale2.C1987R;
import qk.v9;
/* compiled from: AutomaticActivityDetection.kt */
/* loaded from: classes3.dex */
final class m extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AutomaticActivityDetection f36721a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AutomaticActivityDetection automaticActivityDetection) {
        super(2);
        this.f36721a = automaticActivityDetection;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            AutomaticActivityDetection automaticActivityDetection = this.f36721a;
            ch.l lVar = automaticActivityDetection.f36661f;
            if (lVar != null) {
                c5.a(((i1) aVar2.D(j1.e())).a(), 0L, null, false, null, kotlin.collections.x.V(new a3.a(new l2.c(v9.f93170a), new k(automaticActivityDetection, ch.l.a(lVar, (Context) aVar2.D(u0.d()), null, ay.b.u(C1987R.string.scanwatch_settings_actirec_deactivation_title, aVar2), ay.b.u(C1987R.string.scanwatch_settings_actirec_deactivation_url, aVar2), new HMWebViewDelegate(), 2)))), null, null, false, new l(automaticActivityDetection), aVar2, 0, 478);
            } else {
                kotlin.jvm.internal.u.s("webIntentBuilder");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
