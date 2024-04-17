package com.withings.device.details.scale;

import android.widget.Toast;
import androidx.compose.ui.platform.l1;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
/* compiled from: ScaleDetailFragment.kt */
/* loaded from: classes3.dex */
final class h extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l1 f36940a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Device f36941b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f36942c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l1 l1Var, Device device, k kVar) {
        super(0);
        this.f36940a = l1Var;
        this.f36941b = device;
        this.f36942c = kVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        String iVar = this.f36941b.getMacAddress().toString();
        kotlin.jvm.internal.u.i(iVar, "toString(...)");
        this.f36940a.c(new androidx.compose.ui.text.b(iVar, null, 6));
        Toast.makeText(this.f36942c.getContext(), (int) C1987R.string._MAC_COPIED_TO_CLIPBOARD_, 0).show();
        return nm0.y.f85009a;
    }
}
