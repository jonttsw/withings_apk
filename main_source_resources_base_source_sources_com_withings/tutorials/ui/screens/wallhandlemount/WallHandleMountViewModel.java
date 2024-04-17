package com.withings.tutorials.ui.screens.wallhandlemount;

import androidx.lifecycle.g1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import m70.i;
import u60.a;
/* compiled from: WallHandleMountViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/ui/screens/wallhandlemount/WallHandleMountViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WallHandleMountViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final a f46311a;

    /* renamed from: b  reason: collision with root package name */
    private final i f46312b;

    @Inject
    public WallHandleMountViewModel(a featureActivationUseCase, i userManager) {
        u.j(featureActivationUseCase, "featureActivationUseCase");
        u.j(userManager, "userManager");
        this.f46311a = featureActivationUseCase;
        this.f46312b = userManager;
    }
}
