package com.withings.notifications.ui;
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
final class m0 extends kotlin.jvm.internal.w implements ym0.l<Integer, Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<k3.n> f42980a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(k1.r0<k3.n> r0Var) {
        super(1);
        this.f42980a = r0Var;
    }

    @Override // ym0.l
    public final Integer invoke(Integer num) {
        num.intValue();
        return Integer.valueOf(-((int) (this.f42980a.getValue().f() & 4294967295L)));
    }
}
