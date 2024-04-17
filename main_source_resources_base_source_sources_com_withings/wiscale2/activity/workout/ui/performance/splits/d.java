package com.withings.wiscale2.activity.workout.ui.performance.splits;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.j0;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSplits;
import com.withings.location.model.PaceDistanceUnit;
import com.withings.location.model.Pause;
import com.withings.location.model.Split;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.location.repository.data.ktx.PaceDistanceUnitKt;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lj0.h0;
import org.joda.time.Duration;
/* compiled from: WorkoutSplits.kt */
/* loaded from: classes4.dex */
public final class d extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final h0 f49992a;

    /* renamed from: b  reason: collision with root package name */
    private final GpsLocationRepository f49993b;

    /* renamed from: c  reason: collision with root package name */
    private final ComputeSplits f49994c;

    /* renamed from: d  reason: collision with root package name */
    private final ComputePace f49995d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f49996e;

    /* renamed from: f  reason: collision with root package name */
    private final SharedFlow<Boolean> f49997f;

    /* renamed from: g  reason: collision with root package name */
    private j0 f49998g;

    /* compiled from: WorkoutSplits.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.l<Track, LiveData<nm0.j<List<b>, Integer>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l70.w f49999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f50000b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l70.w wVar, d dVar) {
            super(1);
            this.f49999a = wVar;
            this.f50000b = dVar;
        }

        @Override // ym0.l
        public final LiveData<nm0.j<List<b>, Integer>> invoke(Track track) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new c(track, this.f49999a, this.f50000b, null), 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Application application, long j5, l70.w wVar, WorkoutManager workoutManager, h0 h0Var, GpsLocationRepository gpsLocationRepository, ComputeSplits computeSplits, ComputePace computePace) {
        super(application);
        kotlin.jvm.internal.u.j(workoutManager, "workoutManager");
        this.f49992a = h0Var;
        this.f49993b = gpsLocationRepository;
        this.f49994c = computeSplits;
        this.f49995d = computePace;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.f49996e = MutableStateFlow;
        this.f49997f = FlowKt.asSharedFlow(MutableStateFlow);
        this.f49998g = e1.c(workoutManager.getLiveWorkoutById(j5), new a(wVar, this));
    }

    public static final ArrayList g0(d dVar, Track track, List list, List list2, int i11) {
        PaceDistanceUnit PaceDistanceUnit;
        Integer num;
        dVar.getClass();
        List<Vasistas> list3 = list2;
        ArrayList arrayList = new ArrayList(x.y(list3, 10));
        for (Vasistas vasistas : list3) {
            arrayList.add(new Pause(vasistas.getStartDate(), vasistas.getEnd()));
        }
        List<Split> invoke = dVar.f49994c.invoke(TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track), list, arrayList, PaceDistanceUnitKt.PaceDistanceUnit(i11));
        ArrayList arrayList2 = new ArrayList(x.y(invoke, 10));
        for (Split split : invoke) {
            Duration duration = split.getDuration();
            arrayList2.add(Double.valueOf(dVar.f49995d.fromDistance((float) split.getDistance(), duration, PaceDistanceUnit).getMillis()));
        }
        ArrayList arrayList3 = new ArrayList(x.y(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            Double d11 = null;
            if (i12 >= 0) {
                double doubleValue = ((Number) next).doubleValue();
                if (kotlin.jvm.internal.u.a(doubleValue, x.e0(arrayList2))) {
                    num = Integer.valueOf((int) C1987R.color.statusGood);
                } else if (kotlin.jvm.internal.u.a(doubleValue, x.Z(arrayList2))) {
                    num = Integer.valueOf((int) C1987R.color.statusBad);
                } else {
                    num = null;
                }
                Double d12 = (Double) x.N(i12 - 1, arrayList2);
                if (d12 != null) {
                    d11 = Double.valueOf(doubleValue - d12.doubleValue());
                }
                arrayList3.add(new b(doubleValue, num, d11));
                i12 = i13;
            } else {
                x.K0();
                throw null;
            }
        }
        return arrayList3;
    }

    public final j0 k0() {
        return this.f49998g;
    }

    public final SharedFlow<Boolean> m0() {
        return this.f49997f;
    }
}
