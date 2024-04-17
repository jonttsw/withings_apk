package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: ToiletSearchingDevice.kt */
/* loaded from: classes5.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f55398a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context) {
        super(0);
        this.f55398a = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = this.f55398a;
        context.startActivity(aVar.b(context, null, C1987R.string.install_wpa02_cantFind_helpCenter_url));
        return nm0.y.f85009a;
    }
}
