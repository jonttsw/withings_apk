package com.withings.device.details.scale;

import android.content.Context;
import androidx.camera.camera2.internal.v1;
import k1.o1;
/* compiled from: ScaleDetailFragment.kt */
/* loaded from: classes3.dex */
final class l extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f36996a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o1<nn.l> f36997b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, o1<nn.l> o1Var) {
        super(0);
        this.f36996a = context;
        this.f36997b = o1Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11 = k.f36948v;
        v1.u0(this.f36997b.getValue(), this.f36996a);
        return nm0.y.f85009a;
    }
}
