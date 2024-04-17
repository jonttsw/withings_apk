package com.withings.details.height;

import androidx.compose.material.c5;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
final class t extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f36635a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f36636b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(c5 c5Var, CoroutineScope coroutineScope) {
        super(0);
        this.f36635a = coroutineScope;
        this.f36636b = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f36635a, null, null, new s(this.f36636b, null), 3, null);
        return nm0.y.f85009a;
    }
}
