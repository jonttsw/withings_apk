package com.withings.sharing.datasharing.acceptinvitation;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.sharing.datasharing.acceptinvitation.a;
import com.withings.sharing.datasharing.acceptinvitation.d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: AcceptInvitationViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/sharing/datasharing/acceptinvitation/AcceptInvitationViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AcceptInvitationViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final v40.a f44007a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableStateFlow<d> f44008b;

    /* renamed from: c  reason: collision with root package name */
    private final StateFlow<d> f44009c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableSharedFlow<b> f44010d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedFlow<b> f44011e;

    @Inject
    public AcceptInvitationViewModel(u40.e eVar) {
        this.f44007a = eVar;
        MutableStateFlow<d> MutableStateFlow = StateFlowKt.MutableStateFlow(d.b.f44073a);
        this.f44008b = MutableStateFlow;
        this.f44009c = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<b> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f44010d = MutableSharedFlow$default;
        this.f44011e = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final SharedFlow<b> j0() {
        return this.f44011e;
    }

    public final StateFlow<d> k0() {
        return this.f44009c;
    }

    public final void m0(a action) {
        d.a aVar;
        d.a aVar2;
        u.j(action, "action");
        if (action instanceof a.b) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new f(this, ((a.b) action).a(), null), 3, null);
            return;
        }
        boolean z5 = action instanceof a.C0604a;
        StateFlow<d> stateFlow = this.f44009c;
        if (z5) {
            d value = stateFlow.getValue();
            if (value instanceof d.a) {
                aVar2 = (d.a) value;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new e(this, aVar2, null), 3, null);
            }
        } else if (action instanceof a.c) {
            d value2 = stateFlow.getValue();
            if (value2 instanceof d.a) {
                aVar = (d.a) value2;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new g(this, aVar, null), 3, null);
            }
        }
    }
}
