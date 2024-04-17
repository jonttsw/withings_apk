package com.withings.overview.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import r10.d0;
/* compiled from: StartTrackingViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/overview/ui/StartTrackingViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StartTrackingViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final StateFlow<d0> f43351a;

    @Inject
    public StartTrackingViewModel(o10.a aVar, s10.b bVar, u0 savedStateHandle) {
        u.j(savedStateHandle, "savedStateHandle");
        Object c11 = savedStateHandle.c("url");
        u.g(c11);
        this.f43351a = FlowKt.stateIn(new k(new j(aVar.b((String) c11), bVar)), h1.a(this), SharingStarted.Companion.getEagerly(), d0.b.f94392a);
    }

    public final StateFlow<d0> f0() {
        return this.f43351a;
    }
}
