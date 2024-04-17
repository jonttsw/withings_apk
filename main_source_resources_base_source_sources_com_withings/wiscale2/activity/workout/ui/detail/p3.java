package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.lifecycle.LiveData;
import com.withings.wiscale2.track.data.Track;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutDetailViewModel.kt */
/* loaded from: classes4.dex */
public final class p3 extends kotlin.jvm.internal.w implements ym0.l<Track, LiveData<Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ fl.p f49531a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j3 f49532b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ kn.e f49533c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(fl.p pVar, j3 j3Var, kn.e eVar) {
        super(1);
        this.f49531a = pVar;
        this.f49532b = j3Var;
        this.f49533c = eVar;
    }

    @Override // ym0.l
    public final LiveData<Boolean> invoke(Track track) {
        Track track2 = track;
        if (track2 != null) {
            fl.o j5 = this.f49531a.j(track2.getDeviceModel());
            if (j5 instanceof gl.e0) {
                gl.e0 e0Var = (gl.e0) j5;
                j3 j3Var = this.f49532b;
                j3Var.getClass();
                return androidx.lifecycle.h.a(Dispatchers.getIO(), new q3(this.f49533c, j3Var, track2, e0Var, null), 2);
            }
            return xw.d.a(Boolean.FALSE);
        }
        return xw.d.a(Boolean.FALSE);
    }
}
