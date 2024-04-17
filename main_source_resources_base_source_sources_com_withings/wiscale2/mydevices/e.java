package com.withings.wiscale2.mydevices;

import k1.r0;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: MyDevicesFragment.kt */
/* loaded from: classes5.dex */
final class e extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f58652a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0<fl.o> f58653b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r0<Boolean> r0Var, r0<fl.o> r0Var2) {
        super(0);
        this.f58652a = r0Var;
        this.f58653b = r0Var2;
    }

    @Override // ym0.a
    public final y invoke() {
        int i11 = q.f58662l;
        this.f58652a.setValue(Boolean.FALSE);
        this.f58653b.setValue(null);
        int i12 = v70.a.f103433b;
        v70.a.d("proximity_device_detection_cancelled", "proximity_device_detection_cancelled", null, true);
        return y.f85009a;
    }
}
