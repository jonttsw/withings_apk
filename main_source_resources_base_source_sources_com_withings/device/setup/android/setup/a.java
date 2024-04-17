package com.withings.device.setup.android.setup;

import com.withings.device.setup.android.setup.k;
import javax.inject.Singleton;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: SetupStateRepository.kt */
@Singleton
/* loaded from: classes3.dex */
public final class a implements jo.a {

    /* renamed from: a  reason: collision with root package name */
    private final MutableStateFlow<k> f37399a = StateFlowKt.MutableStateFlow(k.b.f37462a);

    @Override // jo.q0
    public final MutableStateFlow a() {
        return this.f37399a;
    }

    @Override // jo.a
    public final MutableStateFlow<k> b() {
        return this.f37399a;
    }
}
