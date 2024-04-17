package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cells.kt */
/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.text.b f34623a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.text.b f34624b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f34625c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f34626d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f34627e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.compose.ui.text.b bVar, androidx.compose.ui.text.b bVar2, ym0.a<nm0.y> aVar, int i11, int i12) {
        super(2);
        this.f34623a = bVar;
        this.f34624b = bVar2;
        this.f34625c = aVar;
        this.f34626d = i11;
        this.f34627e = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f34626d | 1);
        androidx.compose.ui.text.b bVar = this.f34624b;
        ym0.a<nm0.y> aVar2 = this.f34625c;
        o.t(this.f34623a, bVar, aVar2, aVar, g11, this.f34627e);
        return nm0.y.f85009a;
    }
}
