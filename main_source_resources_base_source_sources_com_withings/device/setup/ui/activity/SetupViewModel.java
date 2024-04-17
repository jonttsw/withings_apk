package com.withings.device.setup.ui.activity;

import androidx.lifecycle.g1;
import com.withings.device.setup.ui.activity.a;
import com.withings.device.setup.ui.activity.l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: SetupViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/device/setup/ui/activity/SetupViewModel;", "Landroidx/lifecycle/g1;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetupViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final MutableStateFlow<l> f37505a;

    /* renamed from: b  reason: collision with root package name */
    private final StateFlow<l> f37506b;

    @Inject
    public SetupViewModel() {
        MutableStateFlow<l> MutableStateFlow = StateFlowKt.MutableStateFlow(l.b.f37528a);
        this.f37505a = MutableStateFlow;
        this.f37506b = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow<l> f0() {
        return this.f37506b;
    }

    public final void g0(a aVar) {
        boolean z5 = aVar instanceof a.C0490a;
        MutableStateFlow<l> mutableStateFlow = this.f37505a;
        if (z5) {
            mutableStateFlow.setValue(new l.a(((a.C0490a) aVar).a()));
        } else if (aVar instanceof a.b) {
            mutableStateFlow.setValue(new l.c(((a.b) aVar).a()));
        }
    }
}
