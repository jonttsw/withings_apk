package com.withings.common.compose.component;
/* compiled from: Avatar.kt */
/* loaded from: classes3.dex */
final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f33823a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Integer f33824b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f33825c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f33826d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f33827e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AvatarSize f33828f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f33829g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f33830h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, Integer num, Integer num2, String str2, String str3, AvatarSize avatarSize, boolean z5, ym0.a<nm0.y> aVar) {
        super(2);
        this.f33823a = str;
        this.f33824b = num;
        this.f33825c = num2;
        this.f33826d = str2;
        this.f33827e = str3;
        this.f33828f = avatarSize;
        this.f33829g = z5;
        this.f33830h = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        d2.f0 f0Var;
        long t11;
        long t12;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            String str = this.f33823a;
            if (str == null) {
                str = "no-url";
            }
            String str2 = str;
            d2.f0 f0Var2 = null;
            Integer num2 = this.f33824b;
            if (num2 != null) {
                f0Var = d2.f0.j(d2.h0.b(num2.intValue()));
            } else {
                f0Var = null;
            }
            aVar2.s(1722223070);
            if (f0Var == null) {
                t11 = ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).O();
            } else {
                t11 = f0Var.t();
            }
            long j5 = t11;
            aVar2.J();
            Integer num3 = this.f33825c;
            if (num3 != null) {
                f0Var2 = d2.f0.j(d2.h0.b(num3.intValue()));
            }
            aVar2.s(1722223191);
            if (f0Var2 == null) {
                t12 = ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).D();
            } else {
                t12 = f0Var2.t();
            }
            long j11 = t12;
            aVar2.J();
            c.b(null, this.f33826d, this.f33827e, str2, this.f33828f, j5, j11, this.f33829g, this.f33830h, aVar2, 0, 1);
        }
        return nm0.y.f85009a;
    }
}
