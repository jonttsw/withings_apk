package com.withings.wiscale2;

import com.withings.clinicalstudy.repository.ClinicalStudySuggestionRepository;
import com.withings.measure.detail.ui.views.AddDetailsView;
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
final class d1 extends s1 {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f50486a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(b0 b0Var) {
        this.f50486a = b0Var;
    }

    @Override // com.withings.measure.detail.ui.views.e
    public final void a(AddDetailsView addDetailsView) {
        dagger.internal.d dVar;
        dVar = this.f50486a.f50255u3;
        addDetailsView.G = (ClinicalStudySuggestionRepository) dVar.get();
        addDetailsView.M = new pi.a();
    }
}
