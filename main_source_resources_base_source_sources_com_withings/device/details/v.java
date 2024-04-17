package com.withings.device.details;

import android.content.Context;
import android.content.Intent;
import com.withings.zendesk.ui.DeviceGuideDisplayer;
import gl.n0;
/* compiled from: DeviceDetailFragment.kt */
/* loaded from: classes3.dex */
final class v extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f37047a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f37048b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(h hVar, Context context) {
        super(0);
        this.f37047a = hVar;
        this.f37048b = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Intent zendeskIntent$default;
        fl.p a11 = fl.p.f67672b.a();
        h hVar = this.f37047a;
        fl.o g11 = a11.g(hVar.A1());
        if (g11 instanceof n0) {
            zendeskIntent$default = ((n0) g11).e(this.f37048b);
        } else {
            ch.d dVar = hVar.f36826l;
            if (dVar != null) {
                zendeskIntent$default = DeviceGuideDisplayer.getZendeskIntent$default(dVar.t(), this.f37048b, hVar.A1(), null, 8, null);
            } else {
                kotlin.jvm.internal.u.s("intentBuilder");
                throw null;
            }
        }
        hVar.startActivity(zendeskIntent$default);
        return nm0.y.f85009a;
    }
}
