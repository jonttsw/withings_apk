package com.withings.device.details.wsm;

import android.content.Context;
import com.withings.device.Device;
import com.withings.device.details.elabel.ElabelDeviceActivity;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wsm02DetailFragment.kt */
/* loaded from: classes3.dex */
final class h extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f37322a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(0);
        this.f37322a = iVar;
    }

    @Override // ym0.a
    public final y invoke() {
        ElabelDeviceActivity.a aVar = ElabelDeviceActivity.f36793b;
        i iVar = this.f37322a;
        Context requireContext = iVar.requireContext();
        u.i(requireContext, "requireContext(...)");
        Device A1 = iVar.A1();
        aVar.getClass();
        iVar.startActivity(ElabelDeviceActivity.a.a(requireContext, A1));
        return y.f85009a;
    }
}
