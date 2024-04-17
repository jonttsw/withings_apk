package com.withings.device.setup.ui;

import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: SetupChooseDeviceActivity.kt */
/* loaded from: classes3.dex */
final class e extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupChooseDeviceActivity f37541a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SetupChooseDeviceActivity setupChooseDeviceActivity) {
        super(0);
        this.f37541a = setupChooseDeviceActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        SetupChooseDeviceActivity context = this.f37541a;
        u.j(context, "context");
        Intent className = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.wiscale2.MainActivity");
        u.i(className, "setClassName(...)");
        className.setFlags(268468224);
        context.startActivity(className);
        return y.f85009a;
    }
}
