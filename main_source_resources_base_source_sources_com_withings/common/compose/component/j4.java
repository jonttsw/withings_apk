package com.withings.common.compose.component;

import java.util.List;
/* compiled from: SliderWithImage.kt */
/* loaded from: classes3.dex */
final class j4 extends kotlin.jvm.internal.w implements ym0.l<Float, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<i4> f33931a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f33932b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<Float> f33933c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f33934d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f33935e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j4(List<i4> list, ym0.l<? super Integer, nm0.y> lVar, k1.r0<Float> r0Var, k1.r0<String> r0Var2, k1.r0<String> r0Var3) {
        super(1);
        this.f33931a = list;
        this.f33932b = lVar;
        this.f33933c = r0Var;
        this.f33934d = r0Var2;
        this.f33935e = r0Var3;
    }

    @Override // ym0.l
    public final nm0.y invoke(Float f11) {
        float floatValue = f11.floatValue();
        this.f33933c.setValue(Float.valueOf(floatValue));
        int i11 = (int) floatValue;
        List<i4> list = this.f33931a;
        this.f33934d.setValue(list.get(i11).c());
        this.f33935e.setValue(list.get(i11).b());
        this.f33932b.invoke(Integer.valueOf(list.get(i11).a()));
        return nm0.y.f85009a;
    }
}
