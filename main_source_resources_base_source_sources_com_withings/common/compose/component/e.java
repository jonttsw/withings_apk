package com.withings.common.compose.component;
/* compiled from: Avatar.kt */
/* loaded from: classes3.dex */
final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Integer f33724a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f33725b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AvatarSize f33726c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f33727d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Integer num, int i11, AvatarSize avatarSize, ym0.a<nm0.y> aVar) {
        super(2);
        this.f33724a = num;
        this.f33725b = i11;
        this.f33726c = avatarSize;
        this.f33727d = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        d2.f0 f0Var;
        long t11;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Integer num2 = this.f33724a;
            if (num2 != null) {
                f0Var = d2.f0.j(d2.h0.b(num2.intValue()));
            } else {
                f0Var = null;
            }
            aVar2.s(1466949963);
            if (f0Var == null) {
                t11 = ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).O();
            } else {
                t11 = f0Var.t();
            }
            long j5 = t11;
            aVar2.J();
            c.d(this.f33725b, this.f33726c, j5, this.f33727d, aVar2, 0, 0);
        }
        return nm0.y.f85009a;
    }
}
