package com.withings.nervehealth.ui.guidedscan;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NerveHealthGuidedScanScreen.kt */
/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42704a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f42705b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42706c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, ym0.a aVar, int i11) {
        super(2);
        this.f42704a = aVar;
        this.f42705b = str;
        this.f42706c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f42706c | 1);
        v.c(this.f42705b, this.f42704a, aVar, g11);
        return nm0.y.f85009a;
    }
}
