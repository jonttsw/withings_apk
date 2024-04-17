package com.withings.sharing.datasharing.sendinvitation;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: SelectTimeViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/sharing/datasharing/sendinvitation/SelectTimeViewModel;", "Landroidx/lifecycle/g1;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SelectTimeViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final MutableStateFlow<z40.i> f44100a;

    /* renamed from: b  reason: collision with root package name */
    private final StateFlow<z40.i> f44101b;

    @Inject
    public SelectTimeViewModel() {
        MutableStateFlow<z40.i> MutableStateFlow = StateFlowKt.MutableStateFlow(new z40.i(0));
        this.f44100a = MutableStateFlow;
        this.f44101b = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow<z40.i> g0() {
        return this.f44101b;
    }

    public final void i0(z40.f fVar) {
        dx.a aVar = dx.a.f64529a;
        aVar.a(this, "SelectTimeAction called: " + fVar, new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new f(fVar.a(), this, null), 3, null);
    }
}
