package com.withings.device.details;

import k1.r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceDetailFragment.kt */
/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f36813a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f36814b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<Integer> f36815c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r0 r0Var, ym0.a aVar, ym0.a aVar2) {
        super(0);
        this.f36813a = aVar;
        this.f36814b = aVar2;
        this.f36815c = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        fn0.k<Object>[] kVarArr = h.f36821o;
        Integer value = this.f36815c.getValue();
        if (value != null && value.intValue() == 0) {
            this.f36813a.invoke();
        } else if (value != null && value.intValue() == 1) {
            this.f36814b.invoke();
        }
        return nm0.y.f85009a;
    }
}
