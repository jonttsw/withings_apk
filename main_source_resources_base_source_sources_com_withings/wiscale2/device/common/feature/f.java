package com.withings.wiscale2.device.common.feature;

import android.widget.ImageView;
import com.withings.wiscale2.device.common.feature.q;
import kotlin.jvm.internal.w;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeatureActivationDocumentFragment.kt */
/* loaded from: classes5.dex */
public final class f extends w implements ym0.l<q, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FeatureActivationDocumentFragment f52168a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FeatureActivationDocumentFragment featureActivationDocumentFragment) {
        super(1);
        this.f52168a = featureActivationDocumentFragment;
    }

    @Override // ym0.l
    public final y invoke(q qVar) {
        ImageView imageView;
        q document = qVar;
        kotlin.jvm.internal.u.j(document, "document");
        boolean z5 = document instanceof q.c;
        FeatureActivationDocumentFragment featureActivationDocumentFragment = this.f52168a;
        if (z5) {
            featureActivationDocumentFragment.y1(true);
        } else if (document instanceof q.a) {
            FeatureActivationDocumentFragment.w1(featureActivationDocumentFragment, ((q.a) document).a());
        } else if (document instanceof q.b) {
            FeatureActivationDocumentFragment.v1(featureActivationDocumentFragment);
        }
        imageView = featureActivationDocumentFragment.f50864i;
        if (imageView != null) {
            imageView.setEnabled(document instanceof q.a);
            return y.f85009a;
        }
        kotlin.jvm.internal.u.s("documentPreview");
        throw null;
    }
}
