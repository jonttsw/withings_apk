package com.withings.device.details.scale;

import android.content.Context;
import com.withings.device.Device;
/* compiled from: ScaleDetailFragment.kt */
/* loaded from: classes3.dex */
final class m extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f36998a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f36999b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f37000c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, k kVar, boolean z5) {
        super(0);
        this.f36998a = context;
        this.f36999b = kVar;
        this.f37000c = z5;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        k kVar = this.f36999b;
        Device A1 = kVar.A1();
        m70.i iVar = kVar.f36951u;
        if (iVar != null) {
            kVar.startActivity(zg.b.t(iVar.e().q(), this.f36998a, A1, this.f37000c));
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("userManager");
        throw null;
    }
}
