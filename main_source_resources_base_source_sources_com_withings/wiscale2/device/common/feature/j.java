package com.withings.wiscale2.device.common.feature;

import kotlin.jvm.internal.w;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeatureActivationDocument.kt */
/* loaded from: classes5.dex */
public final class j extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f52386a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f52387b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i11, androidx.compose.ui.e eVar) {
        super(2);
        this.f52386a = eVar;
        this.f52387b = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f52387b | 1);
        m.b(this.f52386a, aVar, g11);
        return y.f85009a;
    }
}
