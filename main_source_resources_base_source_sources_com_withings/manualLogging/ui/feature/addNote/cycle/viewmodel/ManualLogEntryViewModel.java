package com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel;

import android.content.Context;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.cycletracking.core.model.CycleEntry;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import nm0.j;
import ym.k;
/* compiled from: ManualLogEntryViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/feature/addNote/cycle/viewmodel/ManualLogEntryViewModel;", "Landroidx/lifecycle/g1;", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ManualLogEntryViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final StateFlow<j<List<wm.c>, List<CycleEntry>>> f41351a;

    @Inject
    public ManualLogEntryViewModel(Context context, u0 savedStateHandle, k kVar) {
        u.j(savedStateHandle, "savedStateHandle");
        Long l5 = (Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        if (l5 != null) {
            long longValue = l5.longValue();
            Long l6 = (Long) savedStateHandle.c("date");
            if (l6 != null) {
                Flow flowOn = FlowKt.flowOn(FlowKt.mapLatest(kVar.a(longValue, l6.longValue(), false), new f(context, null)), Dispatchers.getIO());
                i0 i0Var = i0.f76187a;
                this.f41351a = FlowKt.stateIn(flowOn, h1.a(this), SharingStarted.Companion.getEagerly(), new j(i0Var, i0Var));
                return;
            }
            throw new Exception("dateAsLong shouldn't be null");
        }
        throw new Exception("user id shouldn't be null");
    }

    public final StateFlow<j<List<wm.c>, List<CycleEntry>>> f0() {
        return this.f41351a;
    }
}
