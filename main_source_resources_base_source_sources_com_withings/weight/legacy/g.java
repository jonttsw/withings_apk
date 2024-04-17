package com.withings.weight.legacy;
/* compiled from: WeightDetailActivity.kt */
/* loaded from: classes4.dex */
final class g extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeightDetailActivity f47051a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WeightDetailActivity weightDetailActivity) {
        super(1);
        this.f47051a = weightDetailActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        e90.a E3;
        Integer num2 = num;
        E3 = this.f47051a.E3();
        kotlin.jvm.internal.u.g(num2);
        E3.f64951a.D(num2.intValue(), false);
        return nm0.y.f85009a;
    }
}
