package com.withings.nervehealth.ui;

import androidx.compose.material.c5;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NerveHealthMeasureListActivity.kt */
/* loaded from: classes4.dex */
public final class d0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthMeasureListActivity f42493a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f42494b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f42495c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(NerveHealthMeasureListActivity nerveHealthMeasureListActivity, CoroutineScope coroutineScope, c5 c5Var) {
        super(0);
        this.f42493a = nerveHealthMeasureListActivity;
        this.f42494b = coroutineScope;
        this.f42495c = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        NerveHealthMeasureListActivity.E3(this.f42493a);
        BuildersKt__Builders_commonKt.launch$default(this.f42494b, null, null, new c0(this.f42495c, null), 3, null);
        return nm0.y.f85009a;
    }
}
