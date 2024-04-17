package com.withings.wiscale2.device.common.feature.highlowhr;

import androidx.lifecycle.h1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: HighLowHRSettingsActivity.kt */
/* loaded from: classes5.dex */
final class f extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f52269a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar) {
        super(0);
        this.f52269a = aVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        a aVar = this.f52269a;
        aVar.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(aVar), Dispatchers.getIO(), null, new d(aVar, null), 2, null);
        return nm0.y.f85009a;
    }
}
