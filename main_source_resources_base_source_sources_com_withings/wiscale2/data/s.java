package com.withings.wiscale2.data;

import android.content.Context;
import com.withings.clinicalstudy.repository.PatientSessionDao;
import com.withings.ecg.model.HeartSignalDao;
import com.withings.factor.local.dao.FactorDao;
import com.withings.features.platform.model.PlatformFeatureDao;
import com.withings.leaderboard.repositories.data.LeaderboardDAO;
import com.withings.location.repository.data.db.RoomGpsLocationDao;
import com.withings.note.model.NoteGroupDao;
import com.withings.prediction.local.dao.PredictionDao;
import com.withings.screen.repository.data.db.DeviceScreenContentDao;
import com.withings.screen.repository.data.db.DeviceScreenDao;
import com.withings.screen.repository.data.db.DeviceScreensGroupDao;
import com.withings.target.data.TargetDAO;
import com.withings.wiscale2.data.ProdRoomDb;
import com.withings.wiscale2.food.model.MealDao;
import com.withings.wiscale2.food.model.MealNameDao;
import javax.inject.Inject;
import lj0.l0;
/* compiled from: RoomDaoProvider.kt */
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f50669a;

    @Inject
    public s(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        this.f50669a = context;
    }

    public final PatientSessionDao A() {
        return ProdRoomDb.q.a(this.f50669a).s0();
    }

    public final i20.a B() {
        return ProdRoomDb.q.a(this.f50669a).t0();
    }

    public final PlatformFeatureDao C() {
        return ProdRoomDb.q.a(this.f50669a).u0();
    }

    public final PredictionDao D() {
        return ProdRoomDb.q.a(this.f50669a).v0();
    }

    public final a30.d E() {
        return ProdRoomDb.q.a(this.f50669a).w0();
    }

    public final a30.f F() {
        return ProdRoomDb.q.a(this.f50669a).x0();
    }

    public final a30.j G() {
        return ProdRoomDb.q.a(this.f50669a).y0();
    }

    public final a30.l H() {
        return ProdRoomDb.q.a(this.f50669a).z0();
    }

    public final a30.o I() {
        return ProdRoomDb.q.a(this.f50669a).A0();
    }

    public final a30.q J() {
        return ProdRoomDb.q.a(this.f50669a).B0();
    }

    public final ei0.m K() {
        return ProdRoomDb.q.a(this.f50669a).C0();
    }

    public final TargetDAO L() {
        return ProdRoomDb.q.a(this.f50669a).D0();
    }

    public final f60.a M() {
        return ProdRoomDb.q.a(this.f50669a).E0();
    }

    public final bj0.f N() {
        return ProdRoomDb.q.a(this.f50669a).F0();
    }

    public final l0 O() {
        return ProdRoomDb.q.a(this.f50669a).G0();
    }

    public final void a() {
        ProdRoomDb.q.a(this.f50669a).d();
    }

    public final com.withings.device.details.automatic.activity.detection.b b() {
        return ProdRoomDb.q.a(this.f50669a).T();
    }

    public final pl.a c() {
        return ProdRoomDb.q.a(this.f50669a).U();
    }

    public final DeviceScreenContentDao d() {
        return ProdRoomDb.q.a(this.f50669a).V();
    }

    public final DeviceScreenDao e() {
        return ProdRoomDb.q.a(this.f50669a).W();
    }

    public final DeviceScreensGroupDao f() {
        return ProdRoomDb.q.a(this.f50669a).X();
    }

    public final HeartSignalDao g() {
        return ProdRoomDb.q.a(this.f50669a).Y();
    }

    public final a30.a h() {
        return ProdRoomDb.q.a(this.f50669a).Z();
    }

    public final yb0.a i() {
        return ProdRoomDb.q.a(this.f50669a).a0();
    }

    public final FactorDao j() {
        return ProdRoomDb.q.a(this.f50669a).b0();
    }

    public final mr.a k() {
        return ProdRoomDb.q.a(this.f50669a).c0();
    }

    public final RoomGpsLocationDao l() {
        return ProdRoomDb.q.a(this.f50669a).d0();
    }

    public final mx.a m() {
        return ProdRoomDb.q.a(this.f50669a).e0();
    }

    public final fw.a n() {
        return ProdRoomDb.q.a(this.f50669a).f0();
    }

    public final bv.a o() {
        return ProdRoomDb.q.a(this.f50669a).g0();
    }

    public final gt.a p() {
        return ProdRoomDb.q.a(this.f50669a).h0();
    }

    public final yf.g q() {
        return ProdRoomDb.q.a(this.f50669a).i0();
    }

    public final fw.c r() {
        return ProdRoomDb.q.a(this.f50669a).j0();
    }

    public final LeaderboardDAO s() {
        return ProdRoomDb.q.a(this.f50669a).k0();
    }

    public final MealDao t() {
        return ProdRoomDb.q.a(this.f50669a).l0();
    }

    public final MealNameDao u() {
        return ProdRoomDb.q.a(this.f50669a).m0();
    }

    public final tz.a v() {
        return ProdRoomDb.q.a(this.f50669a).n0();
    }

    public final lx.a w() {
        return ProdRoomDb.q.a(this.f50669a).o0();
    }

    public final nx.b x() {
        return ProdRoomDb.q.a(this.f50669a).p0();
    }

    public final NoteGroupDao y() {
        return ProdRoomDb.q.a(this.f50669a).q0();
    }

    public final u10.x z() {
        return ProdRoomDb.q.a(this.f50669a).r0();
    }
}
