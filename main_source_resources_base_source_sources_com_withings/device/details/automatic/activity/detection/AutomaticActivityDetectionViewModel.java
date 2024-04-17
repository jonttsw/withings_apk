package com.withings.device.details.automatic.activity.detection;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.wiscale2.C1987R;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.s0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: AutomaticActivityDetectionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/details/automatic/activity/detection/AutomaticActivityDetectionViewModel;", "Landroidx/lifecycle/g1;", "device-details-common_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AutomaticActivityDetectionViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final d f36667a;

    /* renamed from: b  reason: collision with root package name */
    private final WorkoutCategoryManager f36668b;

    /* renamed from: c  reason: collision with root package name */
    private final long f36669c;

    /* renamed from: d  reason: collision with root package name */
    private final int f36670d;

    /* renamed from: e  reason: collision with root package name */
    private final StateFlow<Map<WorkoutCategory, Boolean>> f36671e;

    /* renamed from: f  reason: collision with root package name */
    private final StateFlow<Boolean> f36672f;

    /* compiled from: AutomaticActivityDetectionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.automatic.activity.detection.AutomaticActivityDetectionViewModel$categoryStates$1", f = "AutomaticActivityDetectionViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<List<? extends com.withings.device.details.automatic.activity.detection.a>, qm0.d<? super Map<WorkoutCategory, ? extends Boolean>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f36673a;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f36673a = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(List<? extends com.withings.device.details.automatic.activity.detection.a> list, qm0.d<? super Map<WorkoutCategory, ? extends Boolean>> dVar) {
            return ((a) create(list, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            List<com.withings.device.details.automatic.activity.detection.a> list = (List) this.f36673a;
            int h11 = s0.h(kotlin.collections.x.y(list, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
            for (com.withings.device.details.automatic.activity.detection.a aVar : list) {
                nm0.j jVar = new nm0.j(AutomaticActivityDetectionViewModel.this.f36668b.getWorkoutCategory((int) aVar.c()), Boolean.valueOf(aVar.a()));
                linkedHashMap.put(jVar.c(), jVar.d());
            }
            return linkedHashMap;
        }
    }

    /* compiled from: AutomaticActivityDetectionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.automatic.activity.detection.AutomaticActivityDetectionViewModel$globalState$1", f = "AutomaticActivityDetectionViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<Map<WorkoutCategory, ? extends Boolean>, qm0.d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f36675a;

        b() {
            throw null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>, com.withings.device.details.automatic.activity.detection.AutomaticActivityDetectionViewModel$b] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(2, dVar);
            iVar.f36675a = obj;
            return iVar;
        }

        @Override // ym0.p
        public final Object invoke(Map<WorkoutCategory, ? extends Boolean> map, qm0.d<? super Boolean> dVar) {
            return ((b) create(map, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Map map = (Map) this.f36675a;
            boolean z5 = false;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                        z5 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public AutomaticActivityDetectionViewModel(u0 savedStateHandle, d actirecCategoryDetectionRepository, WorkoutCategoryManager workoutCategoryManager) {
        Map map;
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.u.j(actirecCategoryDetectionRepository, "actirecCategoryDetectionRepository");
        kotlin.jvm.internal.u.j(workoutCategoryManager, "workoutCategoryManager");
        this.f36667a = actirecCategoryDetectionRepository;
        this.f36668b = workoutCategoryManager;
        Long l5 = (Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        if (l5 != null) {
            long longValue = l5.longValue();
            this.f36669c = longValue;
            Integer num = (Integer) savedStateHandle.c("device_model_id");
            if (num != null) {
                this.f36670d = num.intValue();
                Flow flowOn = FlowKt.flowOn(FlowKt.mapLatest(actirecCategoryDetectionRepository.e(longValue), new a(null)), Dispatchers.getIO());
                CoroutineScope a11 = h1.a(this);
                SharingStarted.Companion companion = SharingStarted.Companion;
                SharingStarted WhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null);
                map = j0.f76190a;
                StateFlow<Map<WorkoutCategory, Boolean>> stateIn = FlowKt.stateIn(flowOn, a11, WhileSubscribed$default, map);
                this.f36671e = stateIn;
                this.f36672f = FlowKt.stateIn(FlowKt.mapLatest(stateIn, new kotlin.coroutines.jvm.internal.i(2, null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), Boolean.TRUE);
                return;
            }
            throw new NullPointerException("device_model_id should not be null");
        }
        throw new NullPointerException("user_id should not be null");
    }

    public final StateFlow<Map<WorkoutCategory, Boolean>> i0() {
        return this.f36671e;
    }

    public final StateFlow<Boolean> j0() {
        return this.f36672f;
    }

    public final int k0() {
        int i11 = this.f36670d;
        if (i11 != 94) {
            if (i11 != 95) {
                return C1987R.string.scanwatch_settings_actirec_deactivation_description;
            }
            return C1987R.string.scanwatch_settings_actirec_deactivation_description_hwa11;
        }
        return C1987R.string.scanwatch_settings_actirec_deactivation_description_hwa10;
    }

    public final long m0() {
        return this.f36669c;
    }
}
