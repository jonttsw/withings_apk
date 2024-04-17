package com.withings.wiscale2.vo2max.view;

import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
final class u extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f62835a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u0.i0 f62836b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<String> f62837c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(CoroutineScope coroutineScope, u0.k0 k0Var, List list) {
        super(0);
        this.f62835a = coroutineScope;
        this.f62836b = k0Var;
        this.f62837c = list;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f62835a, null, null, new t(this.f62836b, this.f62837c, null), 3, null);
        return nm0.y.f85009a;
    }
}
