package com.withings.device.details.wsm;

import android.content.Context;
import androidx.camera.camera2.internal.v1;
import k1.o1;
import k1.r0;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wsm02DetailFragment.kt */
/* loaded from: classes3.dex */
final class j extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f37344a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o1<nn.l> f37345b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, r0 r0Var) {
        super(0);
        this.f37344a = context;
        this.f37345b = r0Var;
    }

    @Override // ym0.a
    public final y invoke() {
        v1.u0(this.f37345b.getValue(), this.f37344a);
        return y.f85009a;
    }
}
