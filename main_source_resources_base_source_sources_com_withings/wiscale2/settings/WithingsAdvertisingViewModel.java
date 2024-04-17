package com.withings.wiscale2.settings;

import com.withings.wiscale2.settings.e;
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
/* compiled from: WithingsAdvertisingViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/settings/WithingsAdvertisingViewModel;", "Landroidx/lifecycle/g1;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WithingsAdvertisingViewModel extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final r70.c f59815a;

    /* renamed from: b  reason: collision with root package name */
    private final tf.b f59816b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<g> f59817c;

    /* renamed from: d  reason: collision with root package name */
    private final StateFlow<g> f59818d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableSharedFlow<f> f59819e;

    /* renamed from: f  reason: collision with root package name */
    private final SharedFlow<f> f59820f;

    @Inject
    public WithingsAdvertisingViewModel(r70.c userRepository, tf.b advertisingPreferencesRepository) {
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        kotlin.jvm.internal.u.j(advertisingPreferencesRepository, "advertisingPreferencesRepository");
        this.f59815a = userRepository;
        this.f59816b = advertisingPreferencesRepository;
        MutableStateFlow<g> MutableStateFlow = StateFlowKt.MutableStateFlow(new g(0));
        this.f59817c = MutableStateFlow;
        this.f59818d = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<f> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f59819e = MutableSharedFlow$default;
        this.f59820f = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final SharedFlow<f> k0() {
        return this.f59820f;
    }

    public final StateFlow<g> m0() {
        return this.f59818d;
    }

    public final void p0(e action) {
        g value;
        g value2;
        g value3;
        kotlin.jvm.internal.u.j(action, "action");
        boolean z5 = action instanceof e.a;
        MutableStateFlow<g> mutableStateFlow = this.f59817c;
        if (z5) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new j6(this, null), 3, null);
            do {
                value3 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value3, g.a(value3, true, null, null, 6)));
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new i6(this, null), 2, null);
        } else if (action instanceof e.b) {
            boolean a11 = ((e.b) action).a();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, g.a(value, true, null, null, 6)));
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new k6(this, a11, null), 2, null);
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, g.a(value2, false, null, null, 6)));
        }
    }
}
