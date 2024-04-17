package com.withings.tutorials.ui.screens.explanations;

import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: ExplanationsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/ui/screens/explanations/ExplanationsViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ExplanationsViewModel extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final p60.c f45094a;

    @Inject
    public ExplanationsViewModel(p60.c explanationsRepository) {
        kotlin.jvm.internal.u.j(explanationsRepository, "explanationsRepository");
        this.f45094a = explanationsRepository;
    }
}
