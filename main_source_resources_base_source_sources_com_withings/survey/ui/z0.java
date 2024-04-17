package com.withings.survey.ui;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class z0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f44464a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f44465b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(CoroutineScope coroutineScope, r8.n nVar) {
        super(0);
        this.f44464a = coroutineScope;
        this.f44465b = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f44464a, null, null, new y0(this.f44465b, null), 3, null);
        return nm0.y.f85009a;
    }
}
