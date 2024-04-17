package com.withings.healthplus.completion.common.ui.viewmodel;

import androidx.lifecycle.g1;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: BaseContentCompletionViewModel.kt */
/* loaded from: classes3.dex */
public abstract class a extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f40014a;

    /* renamed from: b  reason: collision with root package name */
    private final StateFlow<Boolean> f40015b;

    public a() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f40014a = MutableStateFlow;
        this.f40015b = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow<Boolean> f0() {
        return this.f40015b;
    }

    public abstract long g0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final MutableStateFlow<Boolean> i0() {
        return this.f40014a;
    }
}
