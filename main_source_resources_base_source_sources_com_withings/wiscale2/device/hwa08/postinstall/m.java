package com.withings.wiscale2.device.hwa08.postinstall;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.views.explanation.Explanation;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa08.postinstall.Hwa08PostInstallActivity;
import e80.b;
/* compiled from: Hwa08PostInstallActivity.kt */
/* loaded from: classes5.dex */
final class m extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa08PostInstallActivity f54467a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        super(0);
        this.f54467a = hwa08PostInstallActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Hwa08PostInstallActivity.b bVar = Hwa08PostInstallActivity.f54404n;
        Integer valueOf = Integer.valueOf((int) C1987R.drawable.hwa06_post_install_summary);
        Hwa08PostInstallActivity hwa08PostInstallActivity = this.f54467a;
        String string = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_readyTitle);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_readyDescription);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = hwa08PostInstallActivity.getString(C1987R.string.hwa08Installation_readyButton);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        Explanation explanation = new Explanation(valueOf, null, string, string2, string3, null, ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION);
        b.a aVar = e80.b.f64938f;
        e eVar = new e(hwa08PostInstallActivity);
        aVar.getClass();
        Hwa08PostInstallActivity.Q3(hwa08PostInstallActivity, b.a.a(explanation, eVar));
        return nm0.y.f85009a;
    }
}
