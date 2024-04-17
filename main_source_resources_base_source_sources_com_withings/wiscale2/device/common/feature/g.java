package com.withings.wiscale2.device.common.feature;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class g implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FeatureActivationDocumentFragment f52169a;

    public g(FeatureActivationDocumentFragment featureActivationDocumentFragment) {
        this.f52169a = featureActivationDocumentFragment;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        FeatureActivationDocumentFragment featureActivationDocumentFragment = this.f52169a;
        Application application = featureActivationDocumentFragment.requireActivity().getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        String string = featureActivationDocumentFragment.getString(FeatureActivationDocumentFragment.t1(featureActivationDocumentFragment).c());
        kotlin.jvm.internal.u.i(string, "getString(...)");
        Context requireContext = featureActivationDocumentFragment.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        d dVar = new d(requireContext);
        ch.d dVar2 = featureActivationDocumentFragment.f50868m;
        if (dVar2 != null) {
            return new p(application, string, dVar, dVar2);
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}
