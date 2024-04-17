package com.withings.device.setup.ui;

import android.content.Intent;
import com.withings.device.DeviceModel;
import com.withings.device.setup.ui.activity.SetupActivity;
import com.withings.features.FeatureFlag;
import fl.p;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: SetupChooseDeviceActivity.kt */
/* loaded from: classes3.dex */
final class f extends w implements ym0.l<rp.b, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupChooseDeviceActivity f37542a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SetupChooseDeviceActivity setupChooseDeviceActivity) {
        super(1);
        this.f37542a = setupChooseDeviceActivity;
    }

    @Override // ym0.l
    public final y invoke(rp.b bVar) {
        rp.b it = bVar;
        u.j(it, "it");
        int d11 = it.d();
        SetupChooseDeviceActivity context = this.f37542a;
        if (d11 == 93 && wr.b.c(FeatureFlag.S)) {
            int i11 = SetupActivity.f37496h;
            int d12 = it.d();
            u.j(context, "context");
            Intent putExtra = new Intent(context, SetupActivity.class).putExtra("deviceModelId", d12);
            u.i(putExtra, "putExtra(...)");
            context.startActivity(putExtra);
        } else if (it.d() == 61) {
            SetupChooseDeviceActivity.B3(context);
        } else {
            p pVar = context.f37485g;
            if (pVar != null) {
                context.startActivity(com.withings.devicesetup.ui.SetupActivity.P3(context, pVar.d(it.d()).e0(new DeviceModel(it.d(), it.b())), null, SetupChooseDeviceActivity.A3(context)));
            } else {
                u.s("hmModelFactory");
                throw null;
            }
        }
        return y.f85009a;
    }
}
