package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final class i6 extends kotlin.jvm.internal.w implements ym0.r<xw.o<Track, List<? extends Vasistas>, Boolean, nm0.o<? extends Track, ? extends List<? extends Vasistas>, ? extends Boolean>>, Track, List<? extends Vasistas>, Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    public static final i6 f49242a = new kotlin.jvm.internal.w(4);

    @Override // ym0.r
    public final nm0.y invoke(xw.o<Track, List<? extends Vasistas>, Boolean, nm0.o<? extends Track, ? extends List<? extends Vasistas>, ? extends Boolean>> oVar, Track track, List<? extends Vasistas> list, Boolean bool) {
        xw.o<Track, List<? extends Vasistas>, Boolean, nm0.o<? extends Track, ? extends List<? extends Vasistas>, ? extends Boolean>> liveData = oVar;
        Track track2 = track;
        List<? extends Vasistas> heartRates = list;
        Boolean bool2 = bool;
        kotlin.jvm.internal.u.j(liveData, "liveData");
        kotlin.jvm.internal.u.j(heartRates, "heartRates");
        if (track2 != null) {
            liveData.setValue(new nm0.o(track2, heartRates, bool2));
        }
        return nm0.y.f85009a;
    }
}
