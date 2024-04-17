package com.withings.wiscale2.device.common.feature;

import android.content.Intent;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: FeatureActivationDocumentFragment.kt */
/* loaded from: classes5.dex */
final class e extends w implements ym0.l<Intent, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FeatureActivationDocumentFragment f51061a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FeatureActivationDocumentFragment featureActivationDocumentFragment) {
        super(1);
        this.f51061a = featureActivationDocumentFragment;
    }

    @Override // ym0.l
    public final y invoke(Intent intent) {
        Intent intent2 = intent;
        if (intent2 != null) {
            this.f51061a.startActivity(intent2);
        }
        return y.f85009a;
    }
}
