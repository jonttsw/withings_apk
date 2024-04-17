package com.withings.wiscale2.device.common.ui;
/* compiled from: DeviceShortcutsFragment.kt */
/* loaded from: classes5.dex */
public final class e1 implements ym0.p<Integer, gi.b, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.n0 f53797a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(kotlin.jvm.internal.n0 n0Var) {
        this.f53797a = n0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(Integer num, gi.b bVar) {
        int intValue = num.intValue();
        gi.b radioInfo = bVar;
        kotlin.jvm.internal.u.j(radioInfo, "radioInfo");
        this.f53797a.f76254a = intValue;
        return nm0.y.f85009a;
    }
}
