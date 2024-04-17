package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.sleep.libc.AHIPreprocessor;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g0;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: SleepDisorderDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderDetailsViewModel$sleepDisorderGraphData$1$1", f = "SleepDisorderDetailsFragment.kt", l = {ConstantsWs.WS_STATUS_NOSHARINGS, ConstantsWs.WS_STATUS_SHARINGUPDATEERROR}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class j0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<g0.a>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61349a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f61350b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f61351c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<Vasistas> f61352d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ g0 f61353e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Track f61354f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Integer num, List<Vasistas> list, g0 g0Var, Track track, qm0.d<? super j0> dVar) {
        super(2, dVar);
        this.f61351c = num;
        this.f61352d = list;
        this.f61353e = g0Var;
        this.f61354f = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        j0 j0Var = new j0(this.f61351c, this.f61352d, this.f61353e, this.f61354f, dVar);
        j0Var.f61350b = obj;
        return j0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<g0.a> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((j0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        short s11;
        int i11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i12 = this.f61349a;
        if (i12 != 0) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f61350b;
            Track track = this.f61354f;
            g0 g0Var = this.f61353e;
            List<Vasistas> list = this.f61352d;
            Integer num = this.f61351c;
            if (num != null && list.isEmpty()) {
                g0.f0(g0Var, track);
            }
            int i13 = 0;
            if (g0Var.f61305b) {
                List<Vasistas> list2 = list;
                ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
                for (Vasistas vasistas : list2) {
                    Integer apneaHypopneaIndex = vasistas.getApneaHypopneaIndex();
                    if (apneaHypopneaIndex != null) {
                        i11 = apneaHypopneaIndex.intValue();
                    } else {
                        i11 = 0;
                    }
                    arrayList.add(new DatedValue(vasistas.getStartDate(), i11));
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Short((short) ((DatedValue) it.next()).b()));
                }
                short[] V0 = kotlin.collections.x.V0(arrayList2);
                AHIPreprocessor aHIPreprocessor = new AHIPreprocessor();
                if (num != null) {
                    s11 = (short) num.intValue();
                } else {
                    s11 = 0;
                }
                short[] preprocessAHI = aHIPreprocessor.preprocessAHI(s11, V0);
                ArrayList arrayList3 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                int i14 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i15 = i14 + 1;
                    if (i14 >= 0) {
                        arrayList3.add(new DatedValue(((DatedValue) next).a(), preprocessAHI[i14]));
                        i14 = i15;
                    } else {
                        kotlin.collections.x.K0();
                        throw null;
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    DatedValue datedValue = (DatedValue) next2;
                    if (hn.a.a(datedValue.a(), TrackKt.getEffectiveStartDate(track)) && hn.a.b(datedValue.a(), TrackKt.getEffectiveEndDate(track))) {
                        arrayList4.add(next2);
                    }
                }
                if (num != null) {
                    i13 = num.intValue();
                }
                g0.a aVar = new g0.a(i13, arrayList4);
                this.f61349a = 1;
                if (h0Var.emit(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                g0.a aVar2 = new g0.a(0, kotlin.collections.i0.f76187a);
                this.f61349a = 2;
                if (h0Var.emit(aVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return nm0.y.f85009a;
    }
}
