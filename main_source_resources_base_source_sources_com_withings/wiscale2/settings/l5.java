package com.withings.wiscale2.settings;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: TracesLogsActivity.kt */
/* loaded from: classes5.dex */
final class l5 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TracesLogsViewModel f60187a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(TracesLogsViewModel tracesLogsViewModel) {
        super(0);
        this.f60187a = tracesLogsViewModel;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        TracesLogsViewModel tracesLogsViewModel = this.f60187a;
        tracesLogsViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(tracesLogsViewModel), Dispatchers.getIO(), null, new w5(tracesLogsViewModel, null), 2, null);
        return nm0.y.f85009a;
    }
}
