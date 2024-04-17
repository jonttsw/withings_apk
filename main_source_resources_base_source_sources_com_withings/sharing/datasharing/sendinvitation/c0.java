package com.withings.sharing.datasharing.sendinvitation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShareMethodScreen.kt */
/* loaded from: classes4.dex */
public final class c0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f44143a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, nm0.y> f44144b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f44145c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i11, ym0.l lVar, boolean z5) {
        super(2);
        this.f44143a = z5;
        this.f44144b = lVar;
        this.f44145c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f44145c | 1);
        f0.c(this.f44143a, this.f44144b, aVar, g11);
        return nm0.y.f85009a;
    }
}
