package com.withings.wiscale2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.PowerManager;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.core.data.aggregate.GetStepsUseCase;
import com.withings.device.Device;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.leaderboard.domain.GetLeaderBoardItemUseCase;
import com.withings.leaderboard.domain.LeaderboardManager;
import com.withings.leaderboard.utils.FilterLeaderBoardEntryUseCase;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.location.di.LocationProviderModule_ProvideComputeElevationFactory;
import com.withings.location.domain.AndroidGpsDistanceComputer;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSpeed;
import com.withings.location.domain.uc.ComputeSplits;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.location.repository.ws.GetLocationVasistas;
import com.withings.measure.detail.ui.screen.MeasureDetailScreen;
import com.withings.medicalreport.ui.PdfPreviewFragment;
import com.withings.medicalreport.webservices.MedicalReportRemoteRepository;
import com.withings.note.model.NoteRepository;
import com.withings.partner.ws.PartnerRemoteRepository;
import com.withings.reminder.di.RemindersBinderModule_ProvideReminderRepositoryFactory;
import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import com.withings.vasistas.v2.repository.VasistasRepository;
import com.withings.webradio.network.WebRadiosRemoteRepository;
import com.withings.webradio.ui.WebRadioListFragment;
import com.withings.webradio.ui.WebRadioListFragment_MembersInjector;
import com.withings.webservices.legacy.Webservices;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.activity.workout.ui.detail.j3;
import com.withings.wiscale2.activity.workout.ui.detail.y3;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.device.common.feature.FeatureActivationDocumentFragment;
import com.withings.wiscale2.device.common.feature.activitygoal.FitnessAndStepsGoalSettingsFragment;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import fk0.a;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
final class o extends p1 {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f58767a;

    /* renamed from: b  reason: collision with root package name */
    private final j f58768b;

    /* renamed from: c  reason: collision with root package name */
    private dagger.internal.d<com.withings.device.details.scale.y> f58769c;

    /* renamed from: d  reason: collision with root package name */
    private dagger.internal.d<com.withings.ecg.heartsound.a0> f58770d;

    /* renamed from: e  reason: collision with root package name */
    private dagger.internal.d<qy.e0> f58771e;

    /* renamed from: f  reason: collision with root package name */
    private dagger.internal.d<com.withings.medicalreport.ui.a0> f58772f;

    /* renamed from: g  reason: collision with root package name */
    private dagger.internal.d<fa0.p1> f58773g;

    /* renamed from: h  reason: collision with root package name */
    private dagger.internal.d<ja0.s> f58774h;

    /* renamed from: i  reason: collision with root package name */
    private dagger.internal.d<y3> f58775i;

    /* renamed from: j  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.device.common.feature.activitygoal.d> f58776j;

    /* renamed from: k  reason: collision with root package name */
    private dagger.internal.d<jd0.s0> f58777k;

    /* renamed from: l  reason: collision with root package name */
    private dagger.internal.d<ld0.q0> f58778l;

    /* renamed from: m  reason: collision with root package name */
    private dagger.internal.d<nd0.q0> f58779m;

    /* renamed from: n  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.profile.c1> f58780n;

    /* renamed from: o  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.sleep.ui.sleepscore.s1> f58781o;

    /* renamed from: p  reason: collision with root package name */
    private dagger.internal.d<ei0.d0> f58782p;

    /* renamed from: q  reason: collision with root package name */
    private dagger.internal.d<ei0.b0> f58783q;

    /* renamed from: r  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.k0> f58784r;

    /* renamed from: s  reason: collision with root package name */
    private dagger.internal.d<ji0.z> f58785s;

    /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
    /* loaded from: classes4.dex */
    private static final class a<T> implements dagger.internal.d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final b0 f58786a;

        /* renamed from: b  reason: collision with root package name */
        private final com.withings.wiscale2.j f58787b;

        /* renamed from: c  reason: collision with root package name */
        private final o f58788c;

        /* renamed from: d  reason: collision with root package name */
        private final int f58789d;

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* renamed from: com.withings.wiscale2.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        final class C0761a implements ld0.q0 {
            C0761a() {
            }

            @Override // ld0.q0
            public final ld0.b0 a(Device device) {
                fy.p H8;
                dagger.internal.d dVar;
                a aVar = a.this;
                Application a11 = gk0.b.a(aVar.f58786a.f50131a);
                PlatformFeatureRepository platformFeatureRepository = (PlatformFeatureRepository) aVar.f58786a.f50263w.get();
                ej.w a12 = bg.a.a();
                kn.e eVar = (kn.e) aVar.f58786a.f50251u.get();
                m70.i iVar = (m70.i) aVar.f58786a.f50258v0.get();
                TargetRepository a13 = dl.a.a();
                H8 = aVar.f58786a.H8();
                l70.w wVar = (l70.w) aVar.f58786a.H.get();
                q70.j b82 = b0.b8(aVar.f58786a);
                fl.p a14 = fl.p.f67672b.a();
                dVar = aVar.f58786a.D3;
                return new ld0.b0(a11, a12, (fl.i) dVar.get(), a14, device, eVar, platformFeatureRepository, H8, a13, wVar, iVar, b82);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class b implements nd0.q0 {
            b() {
            }

            @Override // nd0.q0
            public final nd0.b0 a(Device device) {
                fy.p H8;
                dagger.internal.d dVar;
                ej.w a11 = bg.a.a();
                a aVar = a.this;
                PlatformFeatureRepository platformFeatureRepository = (PlatformFeatureRepository) aVar.f58786a.f50263w.get();
                m70.i iVar = (m70.i) aVar.f58786a.f50258v0.get();
                TargetRepository a12 = dl.a.a();
                H8 = aVar.f58786a.H8();
                l70.w wVar = (l70.w) aVar.f58786a.H.get();
                Application a13 = gk0.b.a(aVar.f58786a.f50131a);
                kn.e eVar = (kn.e) aVar.f58786a.f50251u.get();
                fl.p a14 = fl.p.f67672b.a();
                dVar = aVar.f58786a.D3;
                return new nd0.b0(a13, a11, (fl.i) dVar.get(), a14, device, eVar, platformFeatureRepository, H8, a12, wVar, iVar, b0.b8(aVar.f58786a));
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class c implements com.withings.wiscale2.profile.c1 {
            c() {
            }

            @Override // com.withings.wiscale2.profile.c1
            public final com.withings.wiscale2.profile.y0 create(User user) {
                a aVar = a.this;
                return new com.withings.wiscale2.profile.y0(user, gk0.c.a(aVar.f58786a.f50131a), (t10.e) aVar.f58786a.f50217o1.get(), (PartnerRemoteRepository) aVar.f58786a.f50211n1.get(), (oi0.b) aVar.f58786a.f50152d2.get(), (kn.e) aVar.f58786a.f50251u.get(), o.h0(aVar.f58788c), b0.b8(aVar.f58786a), b0.Y5(aVar.f58786a), (WorkoutCategoryManager) aVar.f58786a.K1.get(), (m70.i) aVar.f58786a.f50258v0.get(), dl.a.a(), RemindersBinderModule_ProvideReminderRepositoryFactory.provideReminderRepository(), b0.X6(aVar.f58786a), (ActivityAggregateManager) aVar.f58786a.F1.get(), (l70.w) aVar.f58786a.H.get(), (iy.e) aVar.f58786a.L0.get(), b0.p5(aVar.f58786a));
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class d implements com.withings.wiscale2.sleep.ui.sleepscore.s1 {
            d() {
            }

            @Override // com.withings.wiscale2.sleep.ui.sleepscore.s1
            public final com.withings.wiscale2.sleep.ui.sleepscore.j1 a(com.withings.user.core.models.User user, DateTime dateTime, SleepScoreRecalculator sleepScoreRecalculator) {
                dagger.internal.d dVar;
                a aVar = a.this;
                hx.l lVar = (hx.l) aVar.f58786a.f50158e2.get();
                hx.i S5 = b0.S5(aVar.f58786a);
                ei0.q qVar = (ei0.q) aVar.f58786a.J1.get();
                lj0.h0 h0Var = (lj0.h0) aVar.f58786a.W0.get();
                fl.p a11 = fl.p.f67672b.a();
                hx.n z72 = b0.z7(aVar.f58786a);
                dVar = aVar.f58786a.I3;
                return new com.withings.wiscale2.sleep.ui.sleepscore.j1(user, dateTime, sleepScoreRecalculator, lVar, S5, qVar, h0Var, a11, z72, (hx.c) dVar.get(), b0.N5(aVar.f58786a));
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class e implements ei0.d0 {
            e() {
            }

            @Override // ei0.d0
            public final ei0.c0 a(com.withings.user.core.models.User user) {
                a aVar = a.this;
                return new ei0.c0(user, (lj0.h0) aVar.f58786a.W0.get(), (ei0.q) aVar.f58786a.J1.get(), (t00.d) aVar.f58786a.f50146c2.get(), b0.g6(aVar.f58786a));
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class f implements ei0.b0 {
            f() {
            }

            @Override // ei0.b0
            public final ei0.a0 a(com.withings.user.core.models.User user) {
                dagger.internal.d dVar;
                a aVar = a.this;
                ei0.q qVar = (ei0.q) aVar.f58786a.J1.get();
                lj0.h0 h0Var = (lj0.h0) aVar.f58786a.W0.get();
                t00.d dVar2 = (t00.d) aVar.f58786a.f50146c2.get();
                lj0.k g62 = b0.g6(aVar.f58786a);
                dVar = aVar.f58786a.D3;
                return new ei0.a0(user, qVar, h0Var, dVar2, g62, (fl.i) dVar.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class g implements com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.k0 {
            g() {
            }

            @Override // com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.k0
            public final com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g0 a(long j5, com.withings.user.core.models.User user, boolean z5) {
                fy.p H8;
                a aVar = a.this;
                Context a11 = gk0.c.a(aVar.f58786a.f50131a);
                ei0.q qVar = (ei0.q) aVar.f58786a.J1.get();
                H8 = aVar.f58786a.H8();
                return new com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g0(user, j5, z5, a11, qVar, H8, (lj0.h0) aVar.f58786a.W0.get(), b0.g6(aVar.f58786a), (t00.d) aVar.f58786a.f50146c2.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class h implements ji0.z {
            h() {
            }

            @Override // ji0.z
            public final ji0.s a(User user, DateTime dateTime) {
                fy.l F8;
                a aVar = a.this;
                ActivityAggregateManager activityAggregateManager = (ActivityAggregateManager) aVar.f58786a.F1.get();
                LearnMoreManager Z1 = com.withings.wiscale2.j.Z1(aVar.f58787b);
                ah.m mVar = new ah.m();
                kn.e eVar = (kn.e) aVar.f58786a.f50251u.get();
                lj0.k g62 = b0.g6(aVar.f58786a);
                t00.d dVar = (t00.d) aVar.f58786a.f50146c2.get();
                ei0.q qVar = (ei0.q) aVar.f58786a.J1.get();
                PlatformFeatureRepository platformFeatureRepository = (PlatformFeatureRepository) aVar.f58786a.f50263w.get();
                lj0.h0 h0Var = (lj0.h0) aVar.f58786a.W0.get();
                cy.a X6 = b0.X6(aVar.f58786a);
                F8 = aVar.f58786a.F8();
                return new ji0.s(dateTime, user, activityAggregateManager, Z1, mVar, eVar, g62, dVar, qVar, platformFeatureRepository, h0Var, X6, F8);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class i implements com.withings.device.details.scale.y {
            i() {
            }

            @Override // com.withings.device.details.scale.y
            public final com.withings.device.details.scale.w a(Device device) {
                a aVar = a.this;
                return new com.withings.device.details.scale.w(gk0.b.a(aVar.f58786a.f50131a), fl.p.f67672b.a(), (vr.d) aVar.f58786a.f50246t0.get(), (kn.e) aVar.f58786a.f50251u.get(), (m70.i) aVar.f58786a.f50258v0.get(), (ch.d) ((b0.a) aVar.f58786a.Q0).get(), (il.a) aVar.f58786a.f50207m3.get(), device);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class j implements com.withings.ecg.heartsound.a0 {
            j() {
            }

            @Override // com.withings.ecg.heartsound.a0
            public final com.withings.ecg.heartsound.r a(long j5) {
                fy.k E8;
                a aVar = a.this;
                Context a11 = gk0.c.a(aVar.f58786a.f50131a);
                HeartSignalRepository heartSignalRepository = (HeartSignalRepository) aVar.f58786a.f50181i1.get();
                E8 = aVar.f58786a.E8();
                return new com.withings.ecg.heartsound.r(j5, a11, heartSignalRepository, E8, b0.j5(aVar.f58786a), (t00.d) aVar.f58786a.f50146c2.get(), com.withings.wiscale2.j.S1(aVar.f58787b), b0.E6(aVar.f58786a), (NoteRepository) aVar.f58786a.B1.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class k implements qy.e0 {
            k() {
            }

            @Override // qy.e0
            public final qy.w a(long j5, MeasureDetailScreen measureDetailScreen, Long l5, DateTime dateTime) {
                fy.a u82;
                fy.l F8;
                fy.j D8;
                a aVar = a.this;
                Context a11 = gk0.c.a(aVar.f58786a.f50131a);
                hx.l lVar = (hx.l) aVar.f58786a.f50158e2.get();
                NoteRepository noteRepository = (NoteRepository) aVar.f58786a.B1.get();
                hx.i S5 = b0.S5(aVar.f58786a);
                u82 = aVar.f58786a.u8();
                F8 = aVar.f58786a.F8();
                D8 = aVar.f58786a.D8();
                return new qy.w(l5, j5, dateTime, measureDetailScreen, a11, lVar, noteRepository, S5, u82, F8, D8, b0.X6(aVar.f58786a));
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class l implements com.withings.medicalreport.ui.a0 {
            l() {
            }

            @Override // com.withings.medicalreport.ui.a0
            public final com.withings.medicalreport.ui.z a(long j5, String str, DateTime dateTime, DateTime dateTime2) {
                dagger.internal.d dVar;
                a aVar = a.this;
                dVar = aVar.f58786a.G3;
                return new com.withings.medicalreport.ui.z(j5, str, dateTime, dateTime2, gk0.b.a(aVar.f58786a.f50131a), (Webservices) aVar.f58786a.f50156e0.get(), (MedicalReportRemoteRepository) dVar.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class m implements fa0.p1 {
            m() {
            }

            @Override // fa0.p1
            public final fa0.o1 a(User user, DateTime dateTime, List<Integer> list) {
                dagger.internal.d dVar;
                a aVar = a.this;
                Activity activity = aVar.f58787b.f57870a;
                TargetRepository a11 = dl.a.a();
                ActivityAggregateManager activityAggregateManager = (ActivityAggregateManager) aVar.f58786a.F1.get();
                ga0.c d02 = o.d0(aVar.f58788c);
                ga0.d e02 = o.e0(aVar.f58788c);
                WorkoutManager workoutManager = (WorkoutManager) aVar.f58786a.f50223p1.get();
                ei0.q qVar = (ei0.q) aVar.f58786a.J1.get();
                kn.e eVar = (kn.e) aVar.f58786a.f50251u.get();
                WorkoutCategoryManager workoutCategoryManager = (WorkoutCategoryManager) aVar.f58786a.K1.get();
                fl.p a12 = fl.p.f67672b.a();
                GetLeaderBoardItemUseCase g02 = o.g0(aVar.f58788c);
                t00.d dVar2 = (t00.d) aVar.f58786a.f50146c2.get();
                dVar = aVar.f58786a.D3;
                return new fa0.o1(user, dateTime, list, activity, a11, activityAggregateManager, d02, e02, workoutManager, qVar, eVar, workoutCategoryManager, a12, g02, dVar2, (fl.i) dVar.get(), b0.g6(aVar.f58786a), (GetStepsUseCase) aVar.f58786a.f50135a3.get(), o.f0(aVar.f58788c), (VasistasRepository) ((b0.a) aVar.f58786a.X0).get(), (xw.b) aVar.f58786a.K0.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class n implements ja0.s {
            n() {
            }

            @Override // ja0.s
            public final ja0.n a(User user, DateTime dateTime) {
                a aVar = a.this;
                return new ja0.n(user, dateTime, (ActivityAggregateManager) aVar.f58786a.F1.get(), (WorkoutManager) aVar.f58786a.f50223p1.get(), dl.a.a(), (WorkoutCategoryManager) aVar.f58786a.K1.get(), o.f0(aVar.f58788c), (sw.a) aVar.f58786a.f50264w0.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* renamed from: com.withings.wiscale2.o$a$o  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        final class C0762o implements y3 {
            C0762o() {
            }

            @Override // com.withings.wiscale2.activity.workout.ui.detail.y3
            public final j3 a(User user, long j5, WorkoutCategory workoutCategory, PowerManager powerManager, Context context, va0.d dVar) {
                dagger.internal.d dVar2;
                fy.l F8;
                dagger.internal.d dVar3;
                a aVar = a.this;
                Context a11 = gk0.c.a(aVar.f58786a.f50131a);
                WorkoutManager workoutManager = (WorkoutManager) aVar.f58786a.f50223p1.get();
                GetLocationVasistas E5 = b0.E5(aVar.f58786a);
                HasEnoughGpsLocations p62 = b0.p6(aVar.f58786a);
                dVar2 = aVar.f58786a.f50169g1;
                ComputePace computePace = (ComputePace) ((b0.a) dVar2).get();
                ComputeSpeed computeSpeed = (ComputeSpeed) ((b0.a) aVar.f58786a.f50163f1).get();
                ComputeSplits E4 = b0.E4(aVar.f58786a);
                jm.a V6 = b0.V6(aVar.f58786a);
                F8 = aVar.f58786a.F8();
                VasistasRepository vasistasRepository = (VasistasRepository) ((b0.a) aVar.f58786a.X0).get();
                cb0.a aVar2 = new cb0.a();
                dVar3 = aVar.f58786a.D3;
                fl.i iVar = (fl.i) dVar3.get();
                aVar.f58786a.getClass();
                return new j3(user, j5, workoutCategory, powerManager, dVar, context, a11, workoutManager, E5, p62, computePace, computeSpeed, E4, V6, F8, vasistasRepository, aVar2, iVar, LocationProviderModule_ProvideComputeElevationFactory.provideComputeElevation(new AndroidGpsDistanceComputer()), (t00.d) aVar.f58786a.f50146c2.get(), b0.g6(aVar.f58786a), (l70.w) aVar.f58786a.H.get(), (kn.e) aVar.f58786a.f50251u.get(), (WorkoutCategoryManager) aVar.f58786a.K1.get(), (GpsLocationRepository) aVar.f58786a.f50139b1.get(), (lj0.h0) aVar.f58786a.W0.get(), dl.a.a(), fl.p.f67672b.a(), o.i0(aVar.f58788c), (iy.e) aVar.f58786a.L0.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class p implements com.withings.wiscale2.device.common.feature.activitygoal.d {
            p() {
            }

            @Override // com.withings.wiscale2.device.common.feature.activitygoal.d
            public final com.withings.wiscale2.device.common.feature.activitygoal.a a(Device device, User user) {
                fy.p H8;
                TargetRepository a11 = dl.a.a();
                a aVar = a.this;
                fy.v M8 = aVar.f58786a.M8();
                Context a12 = gk0.c.a(aVar.f58786a.f50131a);
                m70.i iVar = (m70.i) aVar.f58786a.f50258v0.get();
                l70.w wVar = (l70.w) aVar.f58786a.H.get();
                H8 = aVar.f58786a.H8();
                return new com.withings.wiscale2.device.common.feature.activitygoal.a(user, device, a11, M8, a12, iVar, wVar, H8, b0.b8(aVar.f58786a), b0.X6(aVar.f58786a));
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class q implements jd0.s0 {
            q() {
            }

            @Override // jd0.s0
            public final jd0.c0 a(Device device) {
                fy.p H8;
                dagger.internal.d dVar;
                ej.w a11 = bg.a.a();
                a aVar = a.this;
                PlatformFeatureRepository platformFeatureRepository = (PlatformFeatureRepository) aVar.f58786a.f50263w.get();
                m70.i iVar = (m70.i) aVar.f58786a.f50258v0.get();
                TargetRepository a12 = dl.a.a();
                H8 = aVar.f58786a.H8();
                l70.w wVar = (l70.w) aVar.f58786a.H.get();
                Application a13 = gk0.b.a(aVar.f58786a.f50131a);
                kn.e eVar = (kn.e) aVar.f58786a.f50251u.get();
                fl.p a14 = fl.p.f67672b.a();
                dVar = aVar.f58786a.D3;
                return new jd0.c0(a13, a11, (fl.i) dVar.get(), a14, device, eVar, platformFeatureRepository, H8, a12, wVar, iVar, b0.b8(aVar.f58786a));
            }
        }

        a(b0 b0Var, com.withings.wiscale2.j jVar, o oVar, int i11) {
            this.f58786a = b0Var;
            this.f58787b = jVar;
            this.f58788c = oVar;
            this.f58789d = i11;
        }

        @Override // javax.inject.Provider
        public final T get() {
            int i11 = this.f58789d;
            switch (i11) {
                case 0:
                    return (T) new i();
                case 1:
                    return (T) new j();
                case 2:
                    return (T) new k();
                case 3:
                    return (T) new l();
                case 4:
                    return (T) new m();
                case 5:
                    return (T) new n();
                case 6:
                    return (T) new C0762o();
                case 7:
                    return (T) new p();
                case 8:
                    return (T) new q();
                case 9:
                    return (T) new C0761a();
                case 10:
                    return (T) new b();
                case 11:
                    return (T) new c();
                case 12:
                    return (T) new d();
                case 13:
                    return (T) new e();
                case 14:
                    return (T) new f();
                case 15:
                    return (T) new g();
                case 16:
                    return (T) new h();
                default:
                    throw new AssertionError(i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(b0 b0Var, l lVar, j jVar) {
        this.f58767a = b0Var;
        this.f58768b = jVar;
        this.f58769c = dagger.internal.f.b(new a(b0Var, jVar, this, 0));
        this.f58770d = dagger.internal.f.b(new a(b0Var, jVar, this, 1));
        this.f58771e = dagger.internal.f.b(new a(b0Var, jVar, this, 2));
        this.f58772f = dagger.internal.f.b(new a(b0Var, jVar, this, 3));
        this.f58773g = dagger.internal.f.b(new a(b0Var, jVar, this, 4));
        this.f58774h = dagger.internal.f.b(new a(b0Var, jVar, this, 5));
        this.f58775i = dagger.internal.f.b(new a(b0Var, jVar, this, 6));
        this.f58776j = dagger.internal.f.b(new a(b0Var, jVar, this, 7));
        this.f58777k = dagger.internal.f.b(new a(b0Var, jVar, this, 8));
        this.f58778l = dagger.internal.f.b(new a(b0Var, jVar, this, 9));
        this.f58779m = dagger.internal.f.b(new a(b0Var, jVar, this, 10));
        this.f58780n = dagger.internal.f.b(new a(b0Var, jVar, this, 11));
        this.f58781o = dagger.internal.f.b(new a(b0Var, jVar, this, 12));
        this.f58782p = dagger.internal.f.b(new a(b0Var, jVar, this, 13));
        this.f58783q = dagger.internal.f.b(new a(b0Var, jVar, this, 14));
        this.f58784r = dagger.internal.f.b(new a(b0Var, jVar, this, 15));
        this.f58785s = dagger.internal.f.b(new a(b0Var, jVar, this, 16));
    }

    static ga0.c d0(o oVar) {
        b0 b0Var = oVar.f58767a;
        return new ga0.c(gk0.c.a(b0Var.f50131a), (VasistasRepository) ((b0.a) b0Var.X0).get(), (kn.e) b0Var.f50251u.get(), fl.p.f67672b.a());
    }

    static ga0.d e0(o oVar) {
        dagger.internal.d dVar;
        b0 b0Var = oVar.f58767a;
        dVar = b0Var.D3;
        return new ga0.d((lj0.h0) b0Var.W0.get(), (fl.i) dVar.get(), b0.g6(b0Var), (t00.d) b0Var.f50146c2.get());
    }

    static com.withings.wiscale2.activity.h f0(o oVar) {
        b0 b0Var = oVar.f58767a;
        return new com.withings.wiscale2.activity.h((iy.e) b0Var.L0.get(), (ky.c) b0Var.f50270x0.get());
    }

    static GetLeaderBoardItemUseCase g0(o oVar) {
        oVar.getClass();
        LeaderboardManager leaderboardManager = LeaderboardManager.Companion.get();
        ah.p.d(leaderboardManager);
        return new GetLeaderBoardItemUseCase(leaderboardManager, (m70.i) oVar.f58767a.f50258v0.get(), new FilterLeaderBoardEntryUseCase());
    }

    static com.withings.wiscale2.profile.w0 h0(o oVar) {
        return new com.withings.wiscale2.profile.w0(b0.m4(oVar.f58767a));
    }

    static nj0.a i0(o oVar) {
        b0 b0Var = oVar.f58767a;
        return new nj0.a((WorkoutCategoryManager) b0Var.K1.get(), (kn.e) b0Var.f50251u.get(), (m70.i) b0Var.f50258v0.get(), b0Var.T(), b0Var.v());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [if.a, java.lang.Object] */
    private com.withings.device.details.c0 j0() {
        b0 b0Var = this.f58767a;
        return new com.withings.device.details.c0((kn.e) b0Var.f50251u.get(), bg.a.a(), new Object(), new nn.m(gk0.c.a(b0Var.f50131a), (kn.e) b0Var.f50251u.get()), new nn.a(gk0.c.a(b0Var.f50131a), (vf.c) b0Var.f50144c0.get()), new nn.b((vf.c) b0Var.f50144c0.get()));
    }

    private zx.r k0() {
        dagger.internal.d dVar;
        fy.a u82;
        b0 b0Var = this.f58767a;
        fy.f k52 = b0.k5(b0Var);
        fy.s n62 = b0.n6(b0Var);
        dVar = b0Var.f50276y0;
        u82 = b0Var.u8();
        return new zx.r((kn.e) b0Var.f50251u.get(), (m70.i) b0Var.f50258v0.get(), (com.withings.util.database.c) b0Var.f50245t.get(), k52, n62, (iy.d) dVar.get(), (sw.a) b0Var.f50264w0.get(), u82, b0.H4(b0Var));
    }

    @Override // com.withings.wiscale2.partner.ui.b2
    public final void A(com.withings.wiscale2.partner.ui.k1 k1Var) {
        b0 b0Var = this.f58767a;
        k1Var.f59138j = (AccountSessionRepository) b0Var.f50216o0.get();
        k1Var.f59139k = (vf.c) b0Var.f50144c0.get();
        k1Var.f59140l = (t10.e) b0Var.f50217o1.get();
        k1Var.f59141m = (m70.i) b0Var.f50258v0.get();
    }

    @Override // nn.e
    public final void B(com.withings.device.details.h hVar) {
        b0 b0Var = this.f58767a;
        hVar.f36826l = (ch.d) ((b0.a) b0Var.Q0).get();
        hVar.f36827m = j0();
        hVar.f36828n = (il.a) b0Var.f50207m3.get();
    }

    @Override // com.withings.wiscale2.activity.workout.ui.detail.i3
    public final void C(com.withings.wiscale2.activity.workout.ui.detail.x1 x1Var) {
        x1Var.A = this.f58775i.get();
    }

    @Override // ld0.z
    public final void D(ld0.b bVar) {
        b0 b0Var = this.f58767a;
        bVar.f53949q = b0.C6(b0Var);
        bVar.f53950r = j0();
        bVar.f79359w = this.f58778l.get();
        bVar.f79360x = (ch.d) ((b0.a) b0Var.Q0).get();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.w
    public final void E(com.withings.wiscale2.measure.accountmeasure.ui.add.u uVar) {
        fy.p H8;
        uVar.f58204t = k0();
        b0 b0Var = this.f58767a;
        uVar.f58205u = b0Var.M8();
        uVar.f58206v = (oi0.b) b0Var.f50152d2.get();
        H8 = b0Var.H8();
        uVar.F = H8;
    }

    @Override // com.withings.wiscale2.device.common.feature.i
    public final void F(FeatureActivationDocumentFragment featureActivationDocumentFragment) {
        featureActivationDocumentFragment.f50868m = (ch.d) ((b0.a) this.f58767a.Q0).get();
    }

    @Override // nd0.z
    public final void G(nd0.b bVar) {
        b0 b0Var = this.f58767a;
        bVar.f53949q = b0.C6(b0Var);
        bVar.f53950r = j0();
        bVar.f83951w = this.f58779m.get();
        bVar.f83952x = (ch.d) ((b0.a) b0Var.Q0).get();
    }

    @Override // com.withings.measurements.ui.j2
    public final void H(com.withings.measurements.ui.i2 i2Var) {
        i2Var.f42051i = (ch.d) ((b0.a) this.f58767a.Q0).get();
        i2Var.f42052j = j.b2(this.f58768b);
    }

    @Override // com.withings.wiscale2.device.common.feature.activitygoal.t
    public final void I(FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment) {
        fitnessAndStepsGoalSettingsFragment.f50889k = this.f58776j.get();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.f0
    public final void J(com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.s sVar) {
        sVar.f61454o = this.f58784r.get();
    }

    @Override // com.withings.wiscale2.vascularage.j0
    public final void K(com.withings.wiscale2.vascularage.y yVar) {
        fy.l F8;
        fy.p H8;
        b0 b0Var = this.f58767a;
        F8 = b0Var.F8();
        yVar.f62510h = F8;
        H8 = b0Var.H8();
        yVar.f62519q = H8;
    }

    @Override // com.withings.wiscale2.vo2max.view.q1
    public final void L(com.withings.wiscale2.vo2max.view.i1 i1Var) {
        fy.l F8;
        fy.c0 h92;
        b0 b0Var = this.f58767a;
        F8 = b0Var.F8();
        i1Var.f62763h = F8;
        h92 = b0Var.h9();
        i1Var.f62764i = h92;
        i1Var.f62765j = k0();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.i1
    public final void M(com.withings.wiscale2.sleep.ui.sleepscore.f1 f1Var) {
        f1Var.f60944h = this.f58782p.get();
        f1Var.f60945i = this.f58783q.get();
    }

    @Override // og0.v
    public final void N(og0.n nVar) {
        fy.l F8;
        F8 = this.f58767a.F8();
        nVar.f86890i = F8;
    }

    @Override // jd0.a0
    public final void O(jd0.b bVar) {
        b0 b0Var = this.f58767a;
        bVar.f53949q = b0.C6(b0Var);
        bVar.f53950r = j0();
        bVar.f74215w = this.f58777k.get();
        bVar.f74216x = (ch.d) ((b0.a) b0Var.Q0).get();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.f
    public final void P(com.withings.wiscale2.measure.accountmeasure.ui.add.a aVar) {
        fy.p H8;
        aVar.f58204t = k0();
        b0 b0Var = this.f58767a;
        aVar.f58205u = b0Var.M8();
        aVar.f58206v = (oi0.b) b0Var.f50152d2.get();
        H8 = b0Var.H8();
        aVar.A = H8;
    }

    @Override // com.withings.wiscale2.heart.bloodpressure.q
    public final void Q(com.withings.wiscale2.heart.bloodpressure.k kVar) {
        fy.l F8;
        F8 = this.f58767a.F8();
        kVar.f57417v = F8;
    }

    @Override // jf0.h
    public final void R(jf0.d dVar) {
        b0 b0Var = this.f58767a;
        dVar.f53949q = b0.C6(b0Var);
        dVar.f53950r = j0();
        dVar.f74355z = (ch.d) ((b0.a) b0Var.Q0).get();
        dVar.A = (il.a) b0Var.f50207m3.get();
        dVar.B = fl.p.f67672b.a();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kg0.c] */
    @Override // com.withings.wiscale2.profile.u0
    public final void S(com.withings.wiscale2.profile.q qVar) {
        qVar.G = this.f58780n.get();
        qVar.M = (ch.d) ((b0.a) this.f58767a.Q0).get();
        qVar.P = new Object();
    }

    @Override // com.withings.wiscale2.device.common.ui.q
    public final void T(com.withings.wiscale2.device.common.ui.h hVar) {
        hVar.f53949q = b0.C6(this.f58767a);
        hVar.f53950r = j0();
    }

    @Override // pg0.w
    public final void U(pg0.b bVar) {
        bVar.f91229i = (ch.d) ((b0.a) this.f58767a.Q0).get();
        bVar.f91230j = j.b2(this.f58768b);
    }

    @Override // rn.s
    public final void V(rn.c cVar) {
        b0 b0Var = this.f58767a;
        cVar.f36826l = (ch.d) ((b0.a) b0Var.Q0).get();
        cVar.f36827m = j0();
        cVar.f36828n = (il.a) b0Var.f50207m3.get();
        cVar.f95290t = b0.C6(b0Var);
    }

    @Override // com.withings.device.details.scale.v
    public final void W(com.withings.device.details.scale.k kVar) {
        b0 b0Var = this.f58767a;
        kVar.f36826l = (ch.d) ((b0.a) b0Var.Q0).get();
        kVar.f36827m = j0();
        kVar.f36828n = (il.a) b0Var.f50207m3.get();
        kVar.f36950t = this.f58769c.get();
        kVar.f36951u = (m70.i) b0Var.f50258v0.get();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.l
    public final void X(com.withings.wiscale2.measure.accountmeasure.ui.add.k kVar) {
        fy.p H8;
        kVar.f58204t = k0();
        b0 b0Var = this.f58767a;
        kVar.f58205u = b0Var.M8();
        kVar.f58206v = (oi0.b) b0Var.f50152d2.get();
        H8 = b0Var.H8();
        kVar.G = H8;
    }

    @Override // ji0.r
    public final void Y(ji0.g gVar) {
        gVar.f74468h = this.f58785s.get();
        gVar.f74469i = new ah.m();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.v0
    public final void Z(com.withings.wiscale2.measure.accountmeasure.ui.add.o0 o0Var) {
        fy.p H8;
        o0Var.f58204t = k0();
        b0 b0Var = this.f58767a;
        o0Var.f58205u = b0Var.M8();
        o0Var.f58206v = (oi0.b) b0Var.f50152d2.get();
        H8 = b0Var.H8();
        o0Var.f58257z = H8;
        o0Var.A = b0.X6(b0Var);
    }

    @Override // fk0.a.b
    public final a.c a() {
        return this.f58768b.a();
    }

    @Override // com.withings.ecg.details.d1
    public final void a0(com.withings.ecg.details.a1 a1Var) {
        a1Var.f38090h = (ch.d) ((b0.a) this.f58767a.Q0).get();
    }

    @Override // com.withings.wiscale2.heart.afib.e0
    public final void b(com.withings.wiscale2.heart.afib.y yVar) {
        yVar.f57285q = this.f58767a.T();
    }

    @Override // com.withings.device.details.scale.f0
    public final void b0(com.withings.device.details.scale.c0 c0Var) {
        dagger.internal.d dVar;
        b0 b0Var = this.f58767a;
        dVar = b0Var.F3;
        c0Var.f36915h = (com.withings.device.details.scale.b) dVar.get();
        c0Var.f36916i = b0Var.w();
    }

    @Override // ja0.g
    public final void c(ja0.a aVar) {
        aVar.f73961q = this.f58774h.get();
    }

    @Override // com.withings.weight.legacy.w
    public final void c0(com.withings.weight.legacy.n nVar) {
        fy.c0 h92;
        fy.a u82;
        b0 b0Var = this.f58767a;
        h92 = b0Var.h9();
        nVar.f47058h = h92;
        u82 = b0Var.u8();
        nVar.f47059i = u82;
        nVar.f47060j = k0();
        nVar.f47061k = b0.J5(b0Var);
    }

    @Override // ry.k
    public final void d(ry.e eVar) {
        fy.l F8;
        b0 b0Var = this.f58767a;
        eVar.f95998h = b0.X6(b0Var);
        F8 = b0Var.F8();
        eVar.f95999i = F8;
    }

    @Override // og0.j
    public final void e(og0.i iVar) {
        fy.c0 h92;
        h92 = this.f58767a.h9();
        og0.k.b(iVar, h92);
        og0.k.a(iVar, k0());
    }

    @Override // com.withings.wiscale2.heart.heartrate.y0
    public final void f(com.withings.wiscale2.heart.heartrate.x0 x0Var) {
        fy.c0 h92;
        h92 = this.f58767a.h9();
        com.withings.wiscale2.heart.heartrate.z0.b(x0Var, h92);
        com.withings.wiscale2.heart.heartrate.z0.a(x0Var, k0());
    }

    @Override // ao.s
    public final void g(ao.p pVar) {
        b0 b0Var = this.f58767a;
        pVar.f36826l = (ch.d) ((b0.a) b0Var.Q0).get();
        pVar.f36827m = j0();
        pVar.f36828n = (il.a) b0Var.f50207m3.get();
        pVar.f19457t = b0.C6(b0Var);
    }

    @Override // com.withings.wiscale2.heart.bloodpressure.h
    public final void h(com.withings.wiscale2.heart.bloodpressure.g gVar) {
        zx.v Q8;
        Q8 = this.f58767a.Q8();
        com.withings.wiscale2.heart.bloodpressure.i.b(gVar, new fy.z(Q8));
        com.withings.wiscale2.heart.bloodpressure.i.a(gVar, k0());
    }

    @Override // he0.f
    public final void i(he0.d dVar) {
        b0 b0Var = this.f58767a;
        dVar.f53949q = b0.C6(b0Var);
        dVar.f53950r = j0();
        dVar.f70647w = b0.b8(b0Var);
    }

    @Override // com.withings.webradio.ui.WebRadioListFragment_GeneratedInjector
    public final void injectWebRadioListFragment(WebRadioListFragment webRadioListFragment) {
        dagger.internal.d dVar;
        dVar = this.f58767a.f50261v3;
        WebRadioListFragment_MembersInjector.injectWebRadiosRemoteRepository(webRadioListFragment, (WebRadiosRemoteRepository) dVar.get());
    }

    @Override // q30.o
    public final void j(q30.a aVar) {
        aVar.f92073i = (ch.d) ((b0.a) this.f58767a.Q0).get();
    }

    @Override // com.withings.ecg.details.a0
    public final void k(com.withings.ecg.details.g gVar) {
        dagger.internal.d dVar;
        dVar = this.f58768b.f57892l;
        gVar.f38202h = (com.withings.ecg.details.w0) dVar.get();
    }

    @Override // com.withings.wiscale2.heart.afib.i
    public final void l(com.withings.wiscale2.heart.afib.e eVar) {
        b0 b0Var = this.f58767a;
        eVar.f57136j = (HeartSignalRepository) b0Var.f50181i1.get();
        eVar.f57137k = j.S1(this.f58768b);
        eVar.f57138l = (t00.d) b0Var.f50146c2.get();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.z
    public final void m(com.withings.wiscale2.measure.accountmeasure.ui.add.x xVar) {
        fy.p H8;
        xVar.f58204t = k0();
        b0 b0Var = this.f58767a;
        xVar.f58205u = b0Var.M8();
        xVar.f58206v = (oi0.b) b0Var.f50152d2.get();
        H8 = b0Var.H8();
        xVar.B = H8;
    }

    @Override // com.withings.wiscale2.device.common.notifications.ui.t0
    public final void n(com.withings.wiscale2.device.common.notifications.ui.m mVar) {
        dagger.internal.d dVar;
        dagger.internal.d dVar2;
        b0 b0Var = this.f58767a;
        mVar.f52949h = b0.T5(b0Var);
        mVar.f52950i = (m70.i) b0Var.f50258v0.get();
        mVar.f52951j = (kn.e) b0Var.f50251u.get();
        mVar.f52952k = (PlatformFeatureRepository) b0Var.f50263w.get();
        dVar = b0Var.D3;
        mVar.f52953l = (fl.i) dVar.get();
        dVar2 = b0Var.H3;
        mVar.f52954m = (u60.a) dVar2.get();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.n0
    public final void o(com.withings.wiscale2.measure.accountmeasure.ui.add.j0 j0Var) {
        j0Var.f58204t = k0();
        b0 b0Var = this.f58767a;
        j0Var.f58205u = b0Var.M8();
        j0Var.f58206v = (oi0.b) b0Var.f50152d2.get();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.d1
    public final void p(com.withings.wiscale2.sleep.ui.sleepscore.k0 k0Var) {
        k0Var.f61075n0 = this.f58781o.get();
        b0 b0Var = this.f58767a;
        k0Var.f61077o0 = (ei0.q) b0Var.J1.get();
        k0Var.f61079p0 = b0Var.getActiveSessionProvider();
        k0Var.f61081q0 = j.O1(this.f58768b);
    }

    @Override // com.withings.wiscale2.device.wpm.ui.i0
    public final void q(com.withings.wiscale2.device.wpm.ui.c0 c0Var) {
        zx.v Q8;
        Q8 = this.f58767a.Q8();
        c0Var.f55723u = new fy.z(Q8);
        c0Var.f55724v = k0();
    }

    @Override // qc0.j
    public final void r(qc0.b bVar) {
        fy.p H8;
        b0 b0Var = this.f58767a;
        H8 = b0Var.H8();
        bVar.f92463k = H8;
        bVar.f92464l = b0Var.M8();
        bVar.f92465m = b0.X6(b0Var);
    }

    @Override // lh0.e
    public final void s(com.withings.wiscale2.mydevices.q qVar) {
        b0 b0Var = this.f58767a;
        qVar.f58664i = new com.withings.wiscale2.mydevices.a((ch.d) ((b0.a) b0Var.Q0).get());
        qVar.f58665j = (kn.e) b0Var.f50251u.get();
    }

    @Override // com.withings.medicalreport.ui.w
    public final void t(PdfPreviewFragment pdfPreviewFragment) {
        b0 b0Var = this.f58767a;
        pdfPreviewFragment.f42198l = (ch.d) ((b0.a) b0Var.Q0).get();
        pdfPreviewFragment.f42199m = this.f58772f.get();
        pdfPreviewFragment.f42200n = (m70.i) b0Var.f50258v0.get();
    }

    @Override // com.withings.ecg.heartsound.p
    public final void u(com.withings.ecg.heartsound.d dVar) {
        dagger.internal.d dVar2;
        dVar.f38435m = this.f58770d.get();
        dVar2 = this.f58767a.R0;
        dVar.f38436n = (jq.b) dVar2.get();
    }

    @Override // qy.u
    public final void v(qy.d dVar) {
        dVar.f93712h = this.f58771e.get();
    }

    @Override // com.withings.wiscale2.heart.heartrate.c0
    public final void w(com.withings.wiscale2.heart.heartrate.w wVar) {
        dagger.internal.d dVar;
        j jVar = this.f58768b;
        dVar = jVar.f57885h0;
        wVar.f57741r = (com.withings.wiscale2.heart.heartrate.r0) dVar.get();
        this.f58767a.F8();
        j.H1(jVar);
    }

    @Override // fa0.e0
    public final void x(fa0.f fVar) {
        fVar.f66574v = this.f58773g.get();
    }

    @Override // oe0.f
    public final void y(oe0.e eVar) {
        b0 b0Var = this.f58767a;
        eVar.f53949q = b0.C6(b0Var);
        eVar.f53950r = j0();
        eVar.f86742w = (o60.g) b0Var.K.get();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.t
    public final void z(com.withings.wiscale2.measure.accountmeasure.ui.add.m mVar) {
        mVar.f58226q = k0();
        b0 b0Var = this.f58767a;
        mVar.f58227r = b0Var.M8();
        mVar.f58228s = (oi0.b) b0Var.f50152d2.get();
    }
}
