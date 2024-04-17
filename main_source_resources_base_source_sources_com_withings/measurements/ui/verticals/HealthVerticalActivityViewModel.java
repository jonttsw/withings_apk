package com.withings.measurements.ui.verticals;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measurement.model.MeasurementsVertical;
import com.withings.measurements.ui.verticals.a;
import com.withings.user.core.models.User;
import iz.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import qm0.d;
import xw.b;
import ym0.p;
/* compiled from: HealthVerticalActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurements/ui/verticals/HealthVerticalActivityViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HealthVerticalActivityViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final r70.a f42143a;

    /* renamed from: b  reason: collision with root package name */
    private final c f42144b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<com.withings.measurements.ui.verticals.a> f42145c;

    /* renamed from: d  reason: collision with root package name */
    private final StateFlow<com.withings.measurements.ui.verticals.a> f42146d;

    /* renamed from: e  reason: collision with root package name */
    private final User f42147e;

    /* compiled from: HealthVerticalActivityViewModel.kt */
    @e(c = "com.withings.measurements.ui.verticals.HealthVerticalActivityViewModel$1", f = "HealthVerticalActivityViewModel.kt", l = {36}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f42148a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HealthVerticalActivityViewModel.kt */
        @e(c = "com.withings.measurements.ui.verticals.HealthVerticalActivityViewModel$1$1", f = "HealthVerticalActivityViewModel.kt", l = {39, 44}, m = "invokeSuspend")
        /* renamed from: com.withings.measurements.ui.verticals.HealthVerticalActivityViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0559a extends i implements p<Set<? extends MeasurementsVertical>, d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            ArrayList f42150a;

            /* renamed from: b  reason: collision with root package name */
            int f42151b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f42152c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ HealthVerticalActivityViewModel f42153d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0559a(HealthVerticalActivityViewModel healthVerticalActivityViewModel, d<? super C0559a> dVar) {
                super(2, dVar);
                this.f42153d = healthVerticalActivityViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<y> create(Object obj, d<?> dVar) {
                C0559a c0559a = new C0559a(this.f42153d, dVar);
                c0559a.f42152c = obj;
                return c0559a;
            }

            @Override // ym0.p
            public final Object invoke(Set<? extends MeasurementsVertical> set, d<? super y> dVar) {
                return ((C0559a) create(set, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ArrayList S0;
                List list;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f42151b;
                HealthVerticalActivityViewModel healthVerticalActivityViewModel = this.f42153d;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            l.b(obj);
                            return y.f85009a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    S0 = this.f42150a;
                    list = (List) this.f42152c;
                    l.b(obj);
                } else {
                    l.b(obj);
                    S0 = x.S0((Set) this.f42152c);
                    r70.a aVar = healthVerticalActivityViewModel.f42143a;
                    long id2 = healthVerticalActivityViewModel.f42147e.getId();
                    this.f42152c = S0;
                    this.f42150a = S0;
                    this.f42151b = 1;
                    obj = aVar.a(id2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = S0;
                }
                if (!((Boolean) obj).booleanValue()) {
                    S0.remove(MeasurementsVertical.f41868g);
                }
                List Q0 = x.Q0(list);
                MutableStateFlow mutableStateFlow = healthVerticalActivityViewModel.f42145c;
                a.C0560a c0560a = new a.C0560a(Q0);
                this.f42152c = null;
                this.f42150a = null;
                this.f42151b = 2;
                if (mutableStateFlow.emit(c0560a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return y.f85009a;
            }
        }

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f42148a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                HealthVerticalActivityViewModel healthVerticalActivityViewModel = HealthVerticalActivityViewModel.this;
                Flow<Set<MeasurementsVertical>> c11 = healthVerticalActivityViewModel.f42144b.c();
                C0559a c0559a = new C0559a(healthVerticalActivityViewModel, null);
                this.f42148a = 1;
                if (FlowKt.collectLatest(c11, c0559a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public HealthVerticalActivityViewModel(u0 savedStateHandle, b dispatchers, r70.a isMainUserUseCase, c measurementItemsByVerticalRepository) {
        u.j(savedStateHandle, "savedStateHandle");
        u.j(dispatchers, "dispatchers");
        u.j(isMainUserUseCase, "isMainUserUseCase");
        u.j(measurementItemsByVerticalRepository, "measurementItemsByVerticalRepository");
        this.f42143a = isMainUserUseCase;
        this.f42144b = measurementItemsByVerticalRepository;
        MutableStateFlow<com.withings.measurements.ui.verticals.a> MutableStateFlow = StateFlowKt.MutableStateFlow(a.b.f42155a);
        this.f42145c = MutableStateFlow;
        this.f42146d = FlowKt.asStateFlow(MutableStateFlow);
        User user = (User) savedStateHandle.c(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        if (user != null) {
            this.f42147e = user;
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), dispatchers.a(), null, new a(null), 2, null);
            return;
        }
        throw new Exception("user shouldn't be null");
    }

    public final StateFlow<com.withings.measurements.ui.verticals.a> k0() {
        return this.f42146d;
    }
}
