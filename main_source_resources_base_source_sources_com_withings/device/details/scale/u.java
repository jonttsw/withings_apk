package com.withings.device.details.scale;

import android.content.Context;
import com.withings.device.Device;
/* compiled from: ScaleDetailFragment.kt */
/* loaded from: classes3.dex */
final class u extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f37018a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f37019b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ nn.k f37020c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(k kVar, Context context, nn.k kVar2) {
        super(0);
        this.f37018a = kVar;
        this.f37019b = context;
        this.f37020c = kVar2;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        zg.c cVar = zg.c.f110625a;
        Device a11 = this.f37020c.a();
        cVar.getClass();
        this.f37018a.startActivity(zg.c.a(this.f37019b, a11));
        return nm0.y.f85009a;
    }
}
