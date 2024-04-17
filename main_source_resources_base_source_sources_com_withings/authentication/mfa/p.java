package com.withings.authentication.mfa;
/* compiled from: ResolveMultiFactorActivity.kt */
/* loaded from: classes3.dex */
final class p extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.q<r8.n, androidx.compose.runtime.a, Integer, nm0.y> f31753a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f31754b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(ym0.q<? super r8.n, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar, r8.n nVar) {
        super(3);
        this.f31753a = qVar;
        this.f31754b = nVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.w it = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(it, "it");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            this.f31753a.invoke(this.f31754b, aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
