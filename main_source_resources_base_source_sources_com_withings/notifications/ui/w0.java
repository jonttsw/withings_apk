package com.withings.notifications.ui;

import androidx.compose.runtime.a;
/* compiled from: NotificationsSection.kt */
/* loaded from: classes4.dex */
final class w0 extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43139a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<c10.c<?>> f43140b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43141c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(ym0.l<? super c10.c<?>, nm0.y> lVar, k1.r0<c10.c<?>> r0Var, ym0.l<? super c10.c<?>, nm0.y> lVar2) {
        super(3);
        this.f43139a = lVar;
        this.f43140b = r0Var;
        this.f43141c = lVar2;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.c NotificationStack = cVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(NotificationStack, "$this$NotificationStack");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            k1.r0<c10.c<?>> r0Var = this.f43140b;
            c10.c<?> value = r0Var.getValue();
            aVar2.s(1044727316);
            ym0.l<c10.c<?>, nm0.y> lVar = this.f43139a;
            boolean K = aVar2.K(lVar) | aVar2.K(r0Var);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new u0(r0Var, lVar);
                aVar2.n(t11);
            }
            ym0.a aVar3 = (ym0.a) t11;
            aVar2.J();
            aVar2.s(1044727377);
            ym0.l<c10.c<?>, nm0.y> lVar2 = this.f43141c;
            boolean K2 = aVar2.K(lVar2) | aVar2.K(r0Var);
            Object t12 = aVar2.t();
            if (K2 || t12 == a.C0060a.a()) {
                t12 = new v0(r0Var, lVar2);
                aVar2.n(t12);
            }
            aVar2.J();
            h.d(value, null, aVar3, (ym0.a) t12, 4, null, aVar2, 24584, 34);
        }
        return nm0.y.f85009a;
    }
}
