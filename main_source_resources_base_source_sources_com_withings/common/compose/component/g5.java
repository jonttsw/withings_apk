package com.withings.common.compose.component;

import com.withings.common.compose.component.a3;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopAppBar.kt */
/* loaded from: classes3.dex */
public final class g5 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<a3.b> f33819a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f33820b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f33821c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f33822d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(List<a3.b> list, boolean z5, ym0.a<nm0.y> aVar, int i11) {
        super(2);
        this.f33819a = list;
        this.f33820b = z5;
        this.f33821c = aVar;
        this.f33822d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f33822d | 1);
        boolean z5 = this.f33820b;
        ym0.a<nm0.y> aVar2 = this.f33821c;
        c5.f(this.f33819a, z5, aVar2, aVar, g11);
        return nm0.y.f85009a;
    }
}
