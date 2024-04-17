package com.withings.wiscale2.heart.heartrate;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* compiled from: HeartRateDayFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.HeartRateDayViewModel$mergeVasistas$1$1", f = "HeartRateDayFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGDEPLOYGRP}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class o0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends Vasistas>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57707a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f57708b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f57709c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<Track> f57710d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<Vasistas> f57711e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(e0 e0Var, List<Track> list, List<Vasistas> list2, qm0.d<? super o0> dVar) {
        super(2, dVar);
        this.f57709c = e0Var;
        this.f57710d = list;
        this.f57711e = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        o0 o0Var = new o0(this.f57709c, this.f57710d, this.f57711e, dVar);
        o0Var.f57708b = obj;
        return o0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends Vasistas>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((o0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Comparator] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DateTime dateTime;
        Track track;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57707a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f57708b;
            e0 e0Var = this.f57709c;
            dateTime = e0Var.f57597n;
            ArrayList arrayList = new ArrayList();
            for (Track track2 : this.f57710d) {
                if (TrackKt.getEffectiveEndDate(track2).isBefore(dateTime)) {
                    arrayList.add(track2);
                }
            }
            new ei0.v();
            Track b10 = ei0.v.b(arrayList);
            List<Vasistas> list = this.f57711e;
            if (b10 != null) {
                List list2 = null;
                if (b10.getDeviceType() == 32) {
                    track = b10;
                } else {
                    track = null;
                }
                if (track != null) {
                    List A0 = e0.A0(e0Var, Vasistas.Category.BED);
                    kotlin.jvm.internal.u.g(list);
                    kotlin.jvm.internal.u.g(A0);
                    if (!A0.isEmpty()) {
                        list2 = A0;
                    }
                    if (list2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list) {
                            if (!hn.a.c(((Vasistas) obj2).getStartDate(), b10.getStartDate(), b10.getEndDate())) {
                                arrayList2.add(obj2);
                            }
                        }
                        list = kotlin.collections.x.D0(kotlin.collections.x.l0(A0, arrayList2), new Object());
                    }
                }
            }
            kotlin.jvm.internal.u.g(list);
            this.f57707a = 1;
            if (h0Var.emit(list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
