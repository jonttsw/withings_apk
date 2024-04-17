package com.withings.wiscale2.device.common.screen.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
public final class k1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f53374a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53375b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f53376c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(String str, ym0.a<nm0.y> aVar, int i11) {
        super(2);
        this.f53374a = str;
        this.f53375b = aVar;
        this.f53376c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f53376c | 1);
        w1.f(this.f53374a, this.f53375b, aVar, g11);
        return nm0.y.f85009a;
    }
}
