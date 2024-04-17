package com.withings.wiscale2.device.common.screen.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
public final class l1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f53382a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f53383b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53384c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53385d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f53386e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(String str, String str2, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
        super(2);
        this.f53382a = str;
        this.f53383b = str2;
        this.f53384c = aVar;
        this.f53385d = aVar2;
        this.f53386e = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f53386e | 1);
        ym0.a<nm0.y> aVar2 = this.f53384c;
        ym0.a<nm0.y> aVar3 = this.f53385d;
        w1.g(this.f53382a, this.f53383b, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}
