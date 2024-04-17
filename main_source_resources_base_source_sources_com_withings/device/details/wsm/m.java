package com.withings.device.details.wsm;

import android.content.Context;
import com.withings.device.Device;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wsm02DetailFragment.kt */
/* loaded from: classes3.dex */
final class m extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f37351a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f37352b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ nn.k f37353c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, Context context, nn.k kVar) {
        super(0);
        this.f37351a = iVar;
        this.f37352b = context;
        this.f37353c = kVar;
    }

    @Override // ym0.a
    public final y invoke() {
        zg.c cVar = zg.c.f110625a;
        Device a11 = this.f37353c.a();
        cVar.getClass();
        this.f37351a.startActivity(zg.c.a(this.f37352b, a11));
        return y.f85009a;
    }
}
