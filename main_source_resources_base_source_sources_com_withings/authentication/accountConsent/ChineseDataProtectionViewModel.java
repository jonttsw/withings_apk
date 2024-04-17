package com.withings.authentication.accountConsent;

import androidx.lifecycle.g1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import ym0.q;
/* compiled from: ChineseDataProtectionViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/authentication/accountConsent/ChineseDataProtectionViewModel;", "Landroidx/lifecycle/g1;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ChineseDataProtectionViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f31355a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f31356b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f31357c;

    /* renamed from: d  reason: collision with root package name */
    private final Flow<Boolean> f31358d;

    /* compiled from: ChineseDataProtectionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.accountConsent.ChineseDataProtectionViewModel$optinsAccepted$1", f = "ChineseDataProtectionViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements q<Boolean, Boolean, qm0.d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ boolean f31359a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f31360b;

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.authentication.accountConsent.ChineseDataProtectionViewModel$a] */
        @Override // ym0.q
        public final Object invoke(Boolean bool, Boolean bool2, qm0.d<? super Boolean> dVar) {
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
            iVar.f31359a = booleanValue;
            iVar.f31360b = booleanValue2;
            return iVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            boolean z11 = this.f31359a;
            boolean z12 = this.f31360b;
            if (z11 && z12) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public ChineseDataProtectionViewModel() {
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f31355a = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f31356b = MutableStateFlow2;
        this.f31357c = StateFlowKt.MutableStateFlow(bool);
        this.f31358d = FlowKt.combine(MutableStateFlow, MutableStateFlow2, new kotlin.coroutines.jvm.internal.i(3, null));
    }

    public final void f0(boolean z5) {
        this.f31357c.setValue(Boolean.valueOf(z5));
    }

    public final MutableStateFlow<Boolean> g0() {
        return this.f31357c;
    }

    public final Flow<Boolean> i0() {
        return this.f31358d;
    }

    public final MutableStateFlow<Boolean> j0() {
        return this.f31355a;
    }

    public final MutableStateFlow<Boolean> k0() {
        return this.f31356b;
    }

    public final void m0(boolean z5) {
        this.f31355a.setValue(Boolean.valueOf(z5));
    }

    public final void p0(boolean z5) {
        this.f31356b.setValue(Boolean.valueOf(z5));
    }
}
