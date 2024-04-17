package com.withings.device.details.scale;

import android.content.Context;
import android.content.Intent;
import com.withings.device.Device;
import com.withings.device.details.scale.ScaleSharingActivity;
/* compiled from: ScaleDetailFragment.kt */
/* loaded from: classes3.dex */
final class t extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f37015a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f37016b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g0 f37017c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k kVar, Context context, g0 g0Var) {
        super(0);
        this.f37015a = kVar;
        this.f37016b = context;
        this.f37017c = g0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        ScaleSharingActivity.a aVar = ScaleSharingActivity.f36893g;
        Device device = this.f37017c.a();
        aVar.getClass();
        Context context = this.f37016b;
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(device, "device");
        Intent putExtra = new Intent(context, ScaleSharingActivity.class).putExtra("EXTRA_DEVICE", device);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        this.f37015a.startActivity(putExtra);
        return nm0.y.f85009a;
    }
}
