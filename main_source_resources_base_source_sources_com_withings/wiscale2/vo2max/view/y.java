package com.withings.wiscale2.vo2max.view;

import androidx.camera.camera2.internal.q2;
import androidx.compose.runtime.a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f62858a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<String> f62859b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Vo2MaxComparisonView f62860c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i11, ArrayList arrayList, Vo2MaxComparisonView vo2MaxComparisonView) {
        super(2);
        this.f62858a = i11;
        this.f62859b = arrayList;
        this.f62860c = vo2MaxComparisonView;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Object a11 = q2.a(aVar2, 773894976, -492369756);
            if (a11 == a.C0060a.a()) {
                a11 = androidx.camera.camera2.internal.q.b(k1.y.i(aVar2), aVar2);
            }
            aVar2.J();
            CoroutineScope a12 = ((androidx.compose.runtime.k) a11).a();
            aVar2.J();
            List<String> list = this.f62859b;
            u0.k0 e11 = u0.n0.e(this.f62858a, new x(list), aVar2, 0);
            k1.y.f(e11, new s(e11, this.f62860c, null), aVar2);
            List<String> list2 = this.f62859b;
            y0.a(list2, new u(a12, e11, list2), new w(a12, e11, list), e11, aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
