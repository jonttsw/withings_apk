package com.withings.wiscale2.features;

import k1.r0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: FeatureFlagsActivity.kt */
/* loaded from: classes5.dex */
final class b extends w implements l<String, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0<String> f56107a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r0<String> r0Var) {
        super(1);
        this.f56107a = r0Var;
    }

    @Override // ym0.l
    public final y invoke(String str) {
        String filteredText = str;
        u.j(filteredText, "filteredText");
        this.f56107a.setValue(filteredText);
        return y.f85009a;
    }
}
