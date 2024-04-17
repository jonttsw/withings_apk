package com.withings.cycletracking.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.cycletracking.ui.viewmodel.h;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: CycleTrackingHistoryViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/cycletracking/ui/viewmodel/CycleTrackingHistoryViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CycleTrackingHistoryViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final StateFlow<h> f35789a;

    /* JADX WARN: Type inference failed for: r4v4, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public CycleTrackingHistoryViewModel(vm.v vVar, u0 savedStateHandle) {
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        Long l5 = (Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        if (l5 != null) {
            this.f35789a = FlowKt.stateIn(FlowKt.flowOn(FlowKt.mapLatest(vVar.a(l5.longValue()), new kotlin.coroutines.jvm.internal.i(2, null)), Dispatchers.getIO()), h1.a(this), SharingStarted.Companion.getEagerly(), h.b.f35899a);
            return;
        }
        throw new Exception("user id shouldn't be null");
    }

    public final StateFlow<h> f0() {
        return this.f35789a;
    }
}
