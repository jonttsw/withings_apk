package com.withings.wiscale2.vo2max.view;

import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
final class w extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f62845a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u0.i0 f62846b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<String> f62847c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(CoroutineScope coroutineScope, u0.k0 k0Var, List list) {
        super(0);
        this.f62845a = coroutineScope;
        this.f62846b = k0Var;
        this.f62847c = list;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f62845a, null, null, new v(this.f62846b, this.f62847c, null), 3, null);
        return nm0.y.f85009a;
    }
}
