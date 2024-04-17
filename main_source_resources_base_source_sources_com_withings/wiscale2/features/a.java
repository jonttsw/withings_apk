package com.withings.wiscale2.features;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: FeatureFlagsActivity.kt */
/* loaded from: classes5.dex */
final class a extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FeatureFlagsActivity f56106a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FeatureFlagsActivity featureFlagsActivity) {
        super(0);
        this.f56106a = featureFlagsActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f56106a.finish();
        return y.f85009a;
    }
}
