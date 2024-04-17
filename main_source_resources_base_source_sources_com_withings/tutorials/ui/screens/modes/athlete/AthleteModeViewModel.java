package com.withings.tutorials.ui.screens.modes.athlete;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import nm0.y;
/* compiled from: AthleteModeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/ui/screens/modes/athlete/AthleteModeViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AthleteModeViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final y60.b f45530a;

    /* renamed from: b  reason: collision with root package name */
    private final y60.d f45531b;

    /* renamed from: c  reason: collision with root package name */
    private final long f45532c;

    /* renamed from: d  reason: collision with root package name */
    private final long f45533d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f45534e;

    /* renamed from: f  reason: collision with root package name */
    private final SharedFlow<Boolean> f45535f;

    /* compiled from: AthleteModeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.athlete.AthleteModeViewModel$hasAnyModeEnabled$1", f = "AthleteModeViewModel.kt", l = {31, 31}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Boolean>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f45536a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f45537b;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f45537b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, qm0.d<? super y> dVar) {
            return ((a) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f45536a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.f45537b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                flowCollector = (FlowCollector) this.f45537b;
                AthleteModeViewModel athleteModeViewModel = AthleteModeViewModel.this;
                y60.b bVar = athleteModeViewModel.f45530a;
                long j5 = athleteModeViewModel.f45532c;
                Long l5 = new Long(athleteModeViewModel.f45533d);
                this.f45537b = flowCollector;
                this.f45536a = 1;
                obj = bVar.c(j5, l5, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f45537b = null;
            this.f45536a = 2;
            if (flowCollector.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    @Inject
    public AthleteModeViewModel(y60.b bVar, y60.d dVar, u0 savedStateHandle) {
        u.j(savedStateHandle, "savedStateHandle");
        this.f45530a = bVar;
        this.f45531b = dVar;
        Object c11 = savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        u.g(c11);
        this.f45532c = ((Number) c11).longValue();
        Object c12 = savedStateHandle.c("device_id");
        u.g(c12);
        this.f45533d = ((Number) c12).longValue();
        Object c13 = savedStateHandle.c("feature_activated");
        u.g(c13);
        this.f45534e = ((Boolean) c13).booleanValue();
        this.f45535f = FlowKt.shareIn(FlowKt.flow(new a(null)), h1.a(this), SharingStarted.Companion.getEagerly(), 1);
    }

    public final boolean k0() {
        return this.f45534e;
    }

    public final SharedFlow<Boolean> m0() {
        return this.f45535f;
    }
}
