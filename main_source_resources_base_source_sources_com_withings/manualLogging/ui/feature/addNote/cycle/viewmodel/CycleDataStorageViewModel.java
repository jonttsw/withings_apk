package com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.library.authentication.api.ConstantsWs;
import fy.l;
import hx.h;
import hx.m;
import hx.o;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.s0;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.j;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import vm.g;
import ym0.p;
/* compiled from: CycleDataStorageViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/feature/addNote/cycle/viewmodel/CycleDataStorageViewModel;", "Landroidx/lifecycle/g1;", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CycleDataStorageViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final hx.a f41319a;

    /* renamed from: b  reason: collision with root package name */
    private final l f41320b;

    /* renamed from: c  reason: collision with root package name */
    private final m f41321c;

    /* renamed from: d  reason: collision with root package name */
    private final o f41322d;

    /* renamed from: e  reason: collision with root package name */
    private final ex.a f41323e;

    /* renamed from: f  reason: collision with root package name */
    private final ym.e f41324f;

    /* renamed from: g  reason: collision with root package name */
    private final ym.c f41325g;

    /* renamed from: h  reason: collision with root package name */
    private final ym.o f41326h;

    /* renamed from: i  reason: collision with root package name */
    private final long f41327i;

    /* renamed from: j  reason: collision with root package name */
    private final long f41328j;

    /* renamed from: k  reason: collision with root package name */
    private DateTime f41329k;

    /* renamed from: l  reason: collision with root package name */
    private DateTime f41330l;

    /* renamed from: m  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f41331m;

    /* renamed from: n  reason: collision with root package name */
    private final StateFlow<Boolean> f41332n;

    /* renamed from: o  reason: collision with root package name */
    private final MutableStateFlow<gx.d> f41333o;

    /* renamed from: p  reason: collision with root package name */
    private final StateFlow<gx.d> f41334p;

    /* renamed from: q  reason: collision with root package name */
    private List<fx.f> f41335q;

    /* renamed from: r  reason: collision with root package name */
    private List<Long> f41336r;

    /* renamed from: s  reason: collision with root package name */
    private List<Long> f41337s;

    /* renamed from: t  reason: collision with root package name */
    private List<Long> f41338t;

    /* renamed from: u  reason: collision with root package name */
    private final StateFlow<List<fx.e>> f41339u;

    /* renamed from: v  reason: collision with root package name */
    private final SharedFlow<List<wm.b>> f41340v;

    /* compiled from: CycleDataStorageViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleDataStorageViewModel$savePeriodFlow$1", f = "CycleDataStorageViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_EDA_RIGHT_FOOT, 200, 203, 205, 209, 213}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f41341a;

        /* renamed from: b  reason: collision with root package name */
        int f41342b;

        /* renamed from: c  reason: collision with root package name */
        int f41343c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f41344d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f41346f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<y> aVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f41346f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f41346f, dVar);
            aVar.f41344d = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:71|36|(2:38|(2:42|(3:46|(3:49|(12:51|52|53|(2:55|(1:57))(2:60|(1:62))|58|24|25|(2:27|(1:29)(2:30|11))|12|(4:14|(1:16)|17|(1:19)(2:20|7))|8|9)|47)|65)))|66|53|(0)(0)|58|24|25|(0)|12|(0)|8|9) */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
            r1 = r12;
            r12 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #0 {all -> 0x00d8, blocks: (B:42:0x00bb, B:48:0x00dd), top: B:73:0x00b9 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #0 {all -> 0x00d8, blocks: (B:42:0x00bb, B:48:0x00dd), top: B:73:0x00b9 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 366
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleDataStorageViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public CycleDataStorageViewModel(h hVar, ox.e eVar, u0 savedStateHandle, um.a aVar, ox.a aVar2, l lVar, androidx.health.connect.client.units.d dVar, o oVar, ex.a lastCycleTrackingSyncRepository, g gVar, vm.f fVar, an.c cVar) {
        u.j(savedStateHandle, "savedStateHandle");
        u.j(lastCycleTrackingSyncRepository, "lastCycleTrackingSyncRepository");
        this.f41319a = aVar2;
        this.f41320b = lVar;
        this.f41321c = dVar;
        this.f41322d = oVar;
        this.f41323e = lastCycleTrackingSyncRepository;
        this.f41324f = gVar;
        this.f41325g = fVar;
        this.f41326h = cVar;
        Long l5 = (Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        if (l5 != null) {
            long longValue = l5.longValue();
            this.f41327i = longValue;
            Long l6 = (Long) savedStateHandle.c("date");
            if (l6 != null) {
                long longValue2 = l6.longValue();
                this.f41328j = longValue2;
                DateTime dateTimeAtStartOfDay = new DateTime(longValue2).toLocalDate().toDateTimeAtStartOfDay(DateTimeZone.UTC);
                u.i(dateTimeAtStartOfDay, "toDateTimeAtStartOfDay(...)");
                this.f41329k = dateTimeAtStartOfDay;
                this.f41330l = hn.a.m(dateTimeAtStartOfDay);
                MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
                this.f41331m = MutableStateFlow;
                this.f41332n = FlowKt.asStateFlow(MutableStateFlow);
                MutableStateFlow<gx.d> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new gx.d(null, 31));
                this.f41333o = MutableStateFlow2;
                this.f41334p = FlowKt.asStateFlow(MutableStateFlow2);
                Flow flowOn = FlowKt.flowOn(h.a(hVar, longValue, dateTimeAtStartOfDay, 12), Dispatchers.getIO());
                CoroutineScope a11 = h1.a(this);
                SharingStarted.Companion companion = SharingStarted.Companion;
                this.f41339u = FlowKt.stateIn(flowOn, a11, companion.getEagerly(), null);
                this.f41340v = FlowKt.shareIn(aVar.get(longValue), h1.a(this), companion.getLazily(), 1);
                BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.a(this, eVar, null), 2, null);
                return;
            }
            throw new Exception("dateAsLong shouldn't be null");
        }
        throw new Exception("user id shouldn't be null");
    }

    public static final void R0(CycleDataStorageViewModel cycleDataStorageViewModel, ArrayList arrayList, int i11) {
        String str;
        cycleDataStorageViewModel.getClass();
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        str = "";
                    } else {
                        str = "vaginal_discharge";
                    }
                } else {
                    str = "symptoms";
                }
            } else {
                str = "sexual_activity";
            }
        } else {
            str = "mood";
        }
        int i12 = v70.a.f103433b;
        v70.a.d("cycle_logs", "cycle_logs", s0.j(new j("logging_type", str), new j("logging_value", arrayList), new j("date", Long.valueOf(cycleDataStorageViewModel.f41328j)), new j("period", null)), true);
    }

    public final void X0(Integer num) {
        MutableStateFlow<gx.d> mutableStateFlow = this.f41333o;
        mutableStateFlow.setValue(gx.d.a(mutableStateFlow.getValue(), num, false, null, null, null, 30));
    }

    public final void Y0(boolean z5) {
        MutableStateFlow<gx.d> mutableStateFlow = this.f41333o;
        mutableStateFlow.setValue(gx.d.a(mutableStateFlow.getValue(), null, z5, null, null, null, 29));
    }

    public final void Z0(Long l5) {
        MutableStateFlow<gx.d> mutableStateFlow = this.f41333o;
        gx.d value = mutableStateFlow.getValue();
        mutableStateFlow.setValue(gx.d.a(value, null, false, null, gx.f.a(value.e(), l5, null, null, 6), null, 23));
    }

    public final void a1(Long l5) {
        MutableStateFlow<gx.d> mutableStateFlow = this.f41333o;
        gx.d value = mutableStateFlow.getValue();
        mutableStateFlow.setValue(gx.d.a(value, null, false, null, gx.f.a(value.e(), null, null, l5, 3), null, 23));
    }

    public final void c1(Integer num) {
        MutableStateFlow<gx.d> mutableStateFlow = this.f41333o;
        mutableStateFlow.setValue(gx.d.a(mutableStateFlow.getValue(), null, false, num, null, null, 27));
    }

    public final void d1(Long l5) {
        MutableStateFlow<gx.d> mutableStateFlow = this.f41333o;
        gx.d value = mutableStateFlow.getValue();
        mutableStateFlow.setValue(gx.d.a(value, null, false, null, gx.f.a(value.e(), null, l5, null, 5), null, 23));
    }

    public final void e1(List<Long> symptoms) {
        u.j(symptoms, "symptoms");
        MutableStateFlow<gx.d> mutableStateFlow = this.f41333o;
        mutableStateFlow.setValue(gx.d.a(mutableStateFlow.getValue(), null, false, null, null, symptoms, 15));
    }

    public final StateFlow<gx.d> g1() {
        return this.f41334p;
    }

    public final long i1() {
        return this.f41327i;
    }

    public final StateFlow<Boolean> k1() {
        return this.f41332n;
    }

    public final void l1(ym0.a aVar, int i11) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(this, i11, aVar, null), 2, null);
    }

    public final void m1(ym0.a<y> aVar) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(aVar, null), 2, null);
    }

    public final void n1(Boolean bool) {
        int i11 = v70.a.f103433b;
        v70.a.d("cycle_logs", "cycle_logs", s0.j(new j("period", bool), new j("date", Long.valueOf(this.f41328j)), new j("logging_value", i0.f76187a), new j("logging_type", "period")), true);
    }
}
