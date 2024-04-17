package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.List;
/* compiled from: WorkoutPhoto.kt */
/* loaded from: classes4.dex */
final class a7 extends kotlin.jvm.internal.w implements ym0.l<Track, List<x0>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a7 f49116a = new kotlin.jvm.internal.w(1);

    @Override // ym0.l
    public final List<x0> invoke(Track track) {
        Track track2 = track;
        if (track2 != null) {
            ArrayList e11 = ah.c0.e(track2);
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(e11, 10));
            for (Object obj : e11) {
                arrayList.add(new w0(obj, ah.c0.c(track2, obj)));
            }
            if (arrayList.size() < 8) {
                return kotlin.collections.x.m0(z0.f49833a, arrayList);
            }
            return arrayList;
        }
        return null;
    }
}
