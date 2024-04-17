package com.withings.sharing.datasharing.sendinvitation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShareMethodScreen.kt */
/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44160a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f44161b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f44162c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(int i11, ym0.a aVar, boolean z5) {
        super(2);
        this.f44160a = aVar;
        this.f44161b = z5;
        this.f44162c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        f0.d(ah.o.g(this.f44162c | 1), aVar, this.f44160a, this.f44161b);
        return nm0.y.f85009a;
    }
}
