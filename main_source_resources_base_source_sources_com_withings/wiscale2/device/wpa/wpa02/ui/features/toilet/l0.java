package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;
/* compiled from: ToiletSelectionScreen.kt */
/* loaded from: classes5.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<Boolean, nm0.y> f55431a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f55432b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k1.r0 r0Var, ym0.l lVar) {
        super(0);
        this.f55431a = lVar;
        this.f55432b = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Boolean value = this.f55432b.getValue();
        value.booleanValue();
        this.f55431a.invoke(value);
        return nm0.y.f85009a;
    }
}
