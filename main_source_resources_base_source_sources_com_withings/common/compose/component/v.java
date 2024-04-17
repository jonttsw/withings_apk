package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cells.kt */
/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.text.b f34822a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f34823b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.compose.ui.text.b bVar, int i11) {
        super(2);
        this.f34822a = bVar;
        this.f34823b = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f34823b | 1);
        o.u(this.f34822a, aVar, g11);
        return nm0.y.f85009a;
    }
}
