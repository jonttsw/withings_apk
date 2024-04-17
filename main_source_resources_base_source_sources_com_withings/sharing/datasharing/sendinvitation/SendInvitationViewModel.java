package com.withings.sharing.datasharing.sendinvitation;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.sharing.core.model.TimeSharePeriod;
import com.withings.sharing.datasharing.sendinvitation.g;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: SendInvitationViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/sharing/datasharing/sendinvitation/SendInvitationViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SendInvitationViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final v40.a f44102a;

    /* renamed from: b  reason: collision with root package name */
    private final r70.c f44103b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<z40.j> f44104c;

    /* renamed from: d  reason: collision with root package name */
    private final StateFlow<z40.j> f44105d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableSharedFlow<h> f44106e;

    /* renamed from: f  reason: collision with root package name */
    private final SharedFlow<h> f44107f;

    @Inject
    public SendInvitationViewModel(u40.e eVar, r70.c userRepository) {
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        this.f44102a = eVar;
        this.f44103b = userRepository;
        MutableStateFlow<z40.j> MutableStateFlow = StateFlowKt.MutableStateFlow(new z40.j(0));
        this.f44104c = MutableStateFlow;
        this.f44105d = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<h> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f44106e = MutableSharedFlow$default;
        this.f44107f = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final SharedFlow<h> k0() {
        return this.f44107f;
    }

    public final StateFlow<z40.j> m0() {
        return this.f44105d;
    }

    public final void p0(g gVar) {
        z40.j value;
        z40.j value2;
        boolean z5 = gVar instanceof g.c;
        MutableStateFlow<z40.j> mutableStateFlow = this.f44104c;
        if (z5) {
            TimeSharePeriod a11 = ((g.c) gVar).a();
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, z40.j.a(value2, null, a11, null, 5)));
        } else if (gVar instanceof g.b) {
            List<y40.a> a12 = ((g.b) gVar).a();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, z40.j.a(value, null, null, a12, 3)));
        } else if (gVar instanceof g.a) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new y(this, ((g.a) gVar).a(), null), 2, null);
        }
    }
}
