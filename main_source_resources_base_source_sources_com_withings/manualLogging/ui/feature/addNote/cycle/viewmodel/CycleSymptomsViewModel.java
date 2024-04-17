package com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import hx.k;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: CycleSymptomsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/feature/addNote/cycle/viewmodel/CycleSymptomsViewModel;", "Landroidx/lifecycle/g1;", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class CycleSymptomsViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final StateFlow<List<fx.f>> f41347a;

    /* renamed from: b  reason: collision with root package name */
    private final StateFlow<List<fx.f>> f41348b;

    /* renamed from: c  reason: collision with root package name */
    private final StateFlow<List<fx.f>> f41349c;

    /* renamed from: d  reason: collision with root package name */
    private final StateFlow<List<fx.f>> f41350d;

    /* JADX WARN: Type inference failed for: r10v2, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r5v3, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public CycleSymptomsViewModel(u0 savedStateHandle, k kVar) {
        u.j(savedStateHandle, "savedStateHandle");
        Long l5 = (Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        if (l5 != null) {
            long longValue = l5.longValue();
            Flow flowOn = FlowKt.flowOn(FlowKt.mapLatest(kVar.a(3, longValue), new i(2, null)), Dispatchers.getIO());
            i0 i0Var = i0.f76187a;
            CoroutineScope a11 = h1.a(this);
            SharingStarted.Companion companion = SharingStarted.Companion;
            this.f41347a = FlowKt.stateIn(flowOn, a11, companion.getEagerly(), i0Var);
            this.f41348b = FlowKt.stateIn(FlowKt.flowOn(kVar.a(4, longValue), Dispatchers.getIO()), h1.a(this), companion.getEagerly(), i0Var);
            this.f41349c = FlowKt.stateIn(FlowKt.flowOn(FlowKt.mapLatest(kVar.a(2, longValue), new i(2, null)), Dispatchers.getIO()), h1.a(this), companion.getEagerly(), i0Var);
            this.f41350d = FlowKt.stateIn(FlowKt.flowOn(FlowKt.mapLatest(kVar.a(1, longValue), new i(2, null)), Dispatchers.getIO()), h1.a(this), companion.getEagerly(), i0Var);
            return;
        }
        throw new Exception("userId shouldn't be null");
    }

    public final StateFlow<List<fx.f>> f0() {
        return this.f41350d;
    }

    public final StateFlow<List<fx.f>> g0() {
        return this.f41348b;
    }

    public final StateFlow<List<fx.f>> i0() {
        return this.f41349c;
    }

    public final StateFlow<List<fx.f>> j0() {
        return this.f41347a;
    }
}
