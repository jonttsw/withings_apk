package com.withings.wiscale2;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteException;
import android.location.LocationManager;
import android.os.StrictMode;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.w;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.b;
import androidx.work.e;
import androidx.work.t;
import androidx.work.w;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKt;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.huawei.agconnect.crash.AGConnectCrash;
import com.huawei.hms.maps.MapsInitializer;
import com.lokalise.sdk.Lokalise;
import com.lokalise.sdk.LokaliseFallbackStrategy;
import com.withings.account.core.model.Account;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.clinicalstudy.repository.PatientSessionRepository;
import com.withings.common.device.BluetoothBondReceiver;
import com.withings.common.device.h;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.core.data.aggregate.GetDailyUserProgressionForMeasureTypeUseCase;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.device.Device;
import com.withings.ecg.CleanDeletedSignals;
import com.withings.ecg.model.EcgSignalSaver;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.ecg.model.LiveEcgMeasurementRepository;
import com.withings.ecg.model.LiveEcgMeasurementRepositoryImpl;
import com.withings.ecg.model.LiveEcgStatus;
import com.withings.features.FeatureFlag;
import com.withings.features.InternalSetting;
import com.withings.features.TestSetting;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.leaderboard.domain.LeaderboardManager;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import com.withings.library.authentication.login.AuthenticationService;
import com.withings.library.authentication.sensitiveaction.SensitiveActionService;
import com.withings.library.authentication.setup2fa.Setup2FAService;
import com.withings.library.measure.ws.MeasureGroupResponse;
import com.withings.library.measure.ws.StoreMeasureResponse;
import com.withings.library.sleep.SleepLib;
import com.withings.location.domain.uc.ComputeGpsDistance;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSpeed;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.note.model.NoteRepository;
import com.withings.reminder.database.AssetDefaultReminderTypesProvider;
import com.withings.reminder.database.SQLiteReminderDAO;
import com.withings.reminder.database.SQLiteReminderRepository;
import com.withings.reminder.database.SQLiteReminderTypeDAO;
import com.withings.reminder.di.ReminderModule;
import com.withings.reminder.notification.AndroidReminderScheduler;
import com.withings.target.TargetObserverKt;
import com.withings.target.data.LocalTargetRepository;
import com.withings.target.data.TargetRepository;
import com.withings.vasistas.v2.repository.VasistasRepository;
import com.withings.webservices.legacy.Webservices;
import com.withings.webservices.legacy.WsFailer;
import com.withings.webview.WebActivity;
import com.withings.widget.steps.StepWidgetReceiver;
import com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutActivityStarter;
import com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutNotificationManager;
import com.withings.wiscale2.activity.workout.model.WorkoutDataBuilder;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.appupgrade.OnUpgradeReceiver;
import com.withings.wiscale2.data.WiscaleDBH;
import com.withings.wiscale2.device.SetupStartBroadcastReceiver;
import com.withings.wiscale2.device.SetupStopBroadcastReceiver;
import com.withings.wiscale2.food.model.FoodManager;
import com.withings.wiscale2.heart.heartrate.events.HearRateThresholdsAlgo;
import com.withings.wiscale2.notification.DeleteLeaderboardNotificationReceiver;
import com.withings.wiscale2.notification.DeletePlatformNotificationReceiver;
import com.withings.wiscale2.notification.LeaderboardNotificationActionReceiver;
import com.withings.wiscale2.push.RegisterHMSPushToken;
import com.withings.wiscale2.push.RequestNewToken;
import com.withings.wiscale2.settings.changelog.ChangeLogTimelineDelegate;
import com.withings.wiscale2.track.data.SleepScoreHelperKt;
import com.withings.wiscale2.vasistas.model.CleanVasistasData;
import com.withings.workout.category.model.WorkoutCategoryManager;
import com.withings.zendesk.repositories.data.ZendeskManager;
import fj0.c;
import fl.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlinx.coroutines.GlobalScope;
import org.joda.time.DateTime;
import xp.c;
import yb0.c;
import zendesk.core.AnonymousIdentity;
import zendesk.core.Zendesk;
import zendesk.support.Support;
import zx.j;
/* loaded from: classes4.dex */
public class HealthmateApplication extends u1 implements w.b, b.InterfaceC0174b, w9.h {

    /* renamed from: k1  reason: collision with root package name */
    public static final /* synthetic */ int f47891k1 = 0;
    @Inject
    public f6.a A;
    @Inject
    public ak0.a<lj0.w> A0;
    @Inject
    public ak0.a<j90.h> B;
    @Inject
    public ak0.a<lj0.g> B0;
    @Inject
    public ak0.a<lj0.r> C0;
    @Inject
    public ak0.a<lj0.b> D0;
    @Inject
    public ak0.a<ei0.q> E0;
    @Inject
    public ak0.a<j90.b> F;
    @Inject
    public ak0.a<WorkoutCategoryManager> F0;
    @Inject
    public ak0.a<k00.b> G;
    @Inject
    public ak0.a<WorkoutManager> G0;
    @Inject
    public ak0.a<ax.i> H0;
    @Inject
    public x90.b I0;
    @Inject
    public is.a J0;
    @Inject
    public d00.d K0;
    @Inject
    public ak0.a<NoteRepository> L0;
    @Inject
    public ak0.a<com.withings.device.details.automatic.activity.detection.d> M;
    @Inject
    public ak0.a<x30.c> M0;
    @Inject
    public ak0.a<v30.f> N0;
    @Inject
    public ak0.a<tt.c> O0;
    @Inject
    public c90.a P;
    @Inject
    public tt.a P0;
    @Inject
    public ak0.a<vr.c> Q;
    @Inject
    public GetDailyUserProgressionForMeasureTypeUseCase Q0;
    @Inject
    public ak0.a<com.withings.wiscale2.data.s> R;
    @Inject
    public ak0.a<x60.a> R0;
    @Inject
    public ak0.a<PlatformFeatureRepository> S;
    @Inject
    public ak0.a<ft.a> S0;
    @Inject
    public ak0.a<ax.c> T;
    @Inject
    public ak0.a<pw.a> T0;
    @Inject
    public ak0.a<ot.k> U0;
    @Inject
    public ak0.a<v20.d> V0;
    @Inject
    public ak0.a<bx.a> W;
    @Inject
    public ak0.a<cz.l> W0;
    @Inject
    public u70.a X;
    @Inject
    public ak0.a<yb0.c> X0;
    @Inject
    public ij.e Y;
    @Inject
    public ak0.a<ch.d> Y0;
    @Inject
    public ak0.a<oi0.b> Z;
    @Inject
    public ak0.a<ex.a> Z0;
    @Inject

    /* renamed from: a1  reason: collision with root package name */
    public ak0.a<qg0.a> f47892a1;
    @Inject

    /* renamed from: b1  reason: collision with root package name */
    public ak0.a<lb0.l> f47893b1;
    @Inject

    /* renamed from: c  reason: collision with root package name */
    public fy.m f47894c;
    @Inject

    /* renamed from: c1  reason: collision with root package name */
    public ak0.a<ch0.g> f47895c1;
    @Inject

    /* renamed from: d  reason: collision with root package name */
    public fy.i f47896d;
    @Inject

    /* renamed from: d1  reason: collision with root package name */
    public ak0.a<wi0.c> f47897d1;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public s20.a f47898e;
    @Inject

    /* renamed from: e1  reason: collision with root package name */
    public ak0.a<ug0.c> f47899e1;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public s20.c f47900f;
    @Inject

    /* renamed from: f1  reason: collision with root package name */
    public ak0.a<ih0.e> f47901f1;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public fj0.c f47902g;
    @Inject

    /* renamed from: g1  reason: collision with root package name */
    public ak0.a<mc0.b> f47903g1;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public ti.d f47904h;
    @Inject

    /* renamed from: h1  reason: collision with root package name */
    public ak0.a<vh0.d> f47905h1;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public ak0.a<ew.a> f47906i;
    @Inject

    /* renamed from: i1  reason: collision with root package name */
    public ak0.a<ww.b> f47907i1;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public ak0.a<VasistasRepository> f47908j;
    @Inject

    /* renamed from: j1  reason: collision with root package name */
    public ak0.a<rg.b> f47909j1;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public yf.d f47910k;
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public ak0.a<PatientSessionRepository> f47911l;
    @Inject

    /* renamed from: l0  reason: collision with root package name */
    public ak0.a<l70.w> f47912l0;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public ak0.a<GpsLocationRepository> f47913m;
    @Inject

    /* renamed from: m0  reason: collision with root package name */
    public ak0.a<hw.a> f47914m0;
    @Inject

    /* renamed from: n  reason: collision with root package name */
    public ak0.a<com.withings.wiscale2.device.common.feature.c> f47915n;
    @Inject

    /* renamed from: n0  reason: collision with root package name */
    public ak0.a<p60.c> f47916n0;
    @Inject

    /* renamed from: o  reason: collision with root package name */
    public ak0.a<ua0.a> f47917o;
    @Inject

    /* renamed from: o0  reason: collision with root package name */
    public ak0.a<h10.a> f47918o0;
    @Inject

    /* renamed from: p  reason: collision with root package name */
    public ak0.a<ComputeGpsDistance> f47919p;
    @Inject

    /* renamed from: p0  reason: collision with root package name */
    public ak0.a<ActivityAggregateManager> f47920p0;
    @Inject

    /* renamed from: q  reason: collision with root package name */
    public ak0.a<ComputeSpeed> f47921q;
    @Inject

    /* renamed from: q0  reason: collision with root package name */
    public WiscaleDBH f47922q0;
    @Inject

    /* renamed from: r  reason: collision with root package name */
    public ak0.a<ComputePace> f47923r;
    @Inject

    /* renamed from: r0  reason: collision with root package name */
    public ak0.a<m70.i> f47924r0;
    @Inject

    /* renamed from: s  reason: collision with root package name */
    public ak0.a<l30.c> f47925s;
    @Inject

    /* renamed from: s0  reason: collision with root package name */
    public ak0.a<vf.c> f47926s0;
    @Inject

    /* renamed from: t  reason: collision with root package name */
    public HeartSignalRepository f47927t;
    @Inject

    /* renamed from: t0  reason: collision with root package name */
    public ak0.a<t10.e> f47928t0;
    @Inject

    /* renamed from: u  reason: collision with root package name */
    public ak0.a<o60.g> f47929u;
    @Inject

    /* renamed from: u0  reason: collision with root package name */
    public ak0.a<u10.a0> f47930u0;
    @Inject

    /* renamed from: v  reason: collision with root package name */
    public com.google.android.play.core.appupdate.b f47931v;
    @Inject

    /* renamed from: v0  reason: collision with root package name */
    public ak0.a<Webservices> f47932v0;
    @Inject

    /* renamed from: w  reason: collision with root package name */
    public lb0.d f47933w;
    @Inject

    /* renamed from: w0  reason: collision with root package name */
    public ak0.a<AccountSessionRepository> f47934w0;
    @Inject

    /* renamed from: x  reason: collision with root package name */
    public lb0.h f47935x;
    @Inject

    /* renamed from: x0  reason: collision with root package name */
    public ak0.a<kn.e> f47936x0;
    @Inject

    /* renamed from: y  reason: collision with root package name */
    public gw.b f47937y;
    @Inject

    /* renamed from: y0  reason: collision with root package name */
    public ak0.a<iy.e> f47938y0;
    @Inject

    /* renamed from: z  reason: collision with root package name */
    public ak0.a<ub0.u> f47939z;
    @Inject

    /* renamed from: z0  reason: collision with root package name */
    public ak0.a<lj0.h0> f47940z0;

    private void c() {
        Zendesk zendesk2 = Zendesk.INSTANCE;
        zendesk2.init(this, "https://withings.zendesk.com", "bf0731a9a44bba5ec1f763cf1899af73c35839dd5c022e22", "mobile_sdk_client_6ff04728c51bb8d30c41");
        zendesk2.setIdentity(new AnonymousIdentity());
        Support.INSTANCE.init(zendesk2);
        ZendeskManager.INSTANCE.get(this);
    }

    @Override // w9.h
    public final w9.i a() {
        return fj0.b.a(this);
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        q8.a.e(this);
    }

    @Override // androidx.work.b.InterfaceC0174b
    public final androidx.work.b b() {
        b.a aVar = new b.a();
        aVar.c();
        aVar.d(this.A);
        return new androidx.work.b(aVar);
    }

    @Override // androidx.camera.core.w.b
    public final androidx.camera.core.w getCameraXConfig() {
        return Camera2Config.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v59, types: [x70.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v153, types: [ww.b$e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v154, types: [ww.b$e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v165, types: [ww.b$e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [vh.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [vh.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [xr.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, ka0.c] */
    /* JADX WARN: Type inference failed for: r9v13, types: [ax.h$a, java.lang.Object] */
    @Override // com.withings.wiscale2.u1, android.app.Application
    public final void onCreate() {
        Object obj;
        int d11;
        char c11;
        final fl.e eVar;
        int i11;
        Long l5;
        super.onCreate();
        System.loadLibrary("healthmate");
        dx.a.f64529a.getClass();
        dx.a.d();
        int i12 = OnUpgradeReceiver.f50045m;
        OnUpgradeReceiver.a.a(this);
        FirebaseApp.initializeApp(this);
        mm.a.d(this);
        mm.a aVar = mm.a.f82252a;
        boolean a11 = aVar.a();
        wr.b.b(new Object());
        if (a11) {
            wr.b.b(new pf0.j());
        }
        GlobalScope scope = GlobalScope.INSTANCE;
        kotlin.jvm.internal.u.j(scope, "scope");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new eb0.e(this));
        if (aVar.b()) {
            arrayList.add(new eb0.d(this));
        }
        if (aVar.a()) {
            arrayList.add(new Object());
        }
        if (wr.b.c(InternalSetting.f39150i)) {
            arrayList.add(new eb0.a(scope, this));
        }
        int i13 = v70.a.f103433b;
        v70.a.a().addAll(arrayList);
        if (aVar.b() && !aVar.a()) {
            MapsInitializer.setApiKey("CgB6e3x9u5mY8em+36Pzp+WAXgP/+c5ZAVrrrb6upMzKerf1DlFwgVlZJVfOdTc2+jPov/wQznAMbNIEQCgDZf15");
        }
        if (aVar.a()) {
            FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
            firebaseRemoteConfig.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(3600L).build());
            firebaseRemoteConfig.setDefaultsAsync(C1987R.xml.remote_config_defaults);
            firebaseRemoteConfig.fetchAndActivate();
        }
        new rb0.a(this).a();
        try {
            FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).setCrashlyticsCollectionEnabled(!aVar.b());
            AGConnectCrash.getInstance().enableCrashCollection(!aVar.a());
            nm0.y yVar = nm0.y.f85009a;
        } catch (Throwable th2) {
            nm0.l.a(th2);
        }
        if (wr.b.c(InternalSetting.f39148g)) {
            x70.b.a(new Object());
        }
        vh.h.c().e(new Object());
        vh.h.h().e(new Object());
        vh.h.l().e(new WsFailer.ErrorCallback());
        mm.a aVar2 = mm.a.f82252a;
        if (aVar2.a()) {
            com.withings.wiscale2.utils.fcmlegacy.a.d(new com.withings.wiscale2.utils.fcmlegacy.a());
            if (com.withings.wiscale2.utils.fcmlegacy.a.c() == null) {
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
        } else if (aVar2.b()) {
            androidx.work.impl.n0 n11 = androidx.work.impl.n0.n(this);
            n11.getClass();
            n11.a("requestHMSToken", Collections.singletonList((androidx.work.r) new w.a(RequestNewToken.class).b())).y(Collections.singletonList((androidx.work.r) new w.a(RegisterHMSPushToken.class).b())).m();
        }
        androidx.core.content.a.registerReceiver(this, new DeletePlatformNotificationReceiver(), new IntentFilter("DeletePlatformNotificationReceiver.ACTION_DELETE"), 4);
        IntentFilter intentFilter = new IntentFilter("LeaderboardNotificationManager.ACTION_CHEER");
        intentFilter.addAction("LeaderboardNotificationManager.ACTION_MESSAGE");
        intentFilter.addAction("LeaderboardNotificationManager.ACTION_TAUNT");
        androidx.core.content.a.registerReceiver(this, new LeaderboardNotificationActionReceiver(), intentFilter, 4);
        androidx.core.content.a.registerReceiver(this, new DeleteLeaderboardNotificationReceiver(), new IntentFilter("LeaderboardNotificationManager.ACTION_DELETE"), 4);
        u70.l.a(this, "withings-library", true);
        u70.l.a(this, "withings-library-temp", false);
        u70.l.a(this, "Withings", false);
        if (wr.b.c(FeatureFlag.f39117m)) {
            Lokalise.init(this, "ce1281f92492034f7d5876c5cf6e526f925d1fc7", "137643365ea0bc15097ee5.68886615", LokaliseFallbackStrategy.DEFAULT, Collections.emptyList(), Collections.emptyList());
            Lokalise.updateTranslations();
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(com.withings.wiscale2.device.hwa.a.o());
        arrayList2.add(com.withings.wiscale2.device.hwa.a.q());
        arrayList2.add(new bd0.a(this));
        arrayList2.add(new ed0.a(this));
        arrayList2.add(new fd0.a(this));
        arrayList2.add(new Object());
        arrayList2.add(new qd0.b(this));
        arrayList2.add(new rd0.b(this));
        arrayList2.add(new Object());
        arrayList2.add(new td0.b(this));
        arrayList2.add(new Object());
        arrayList2.add(new Object());
        arrayList2.add(new Object());
        arrayList2.add(new vd0.b());
        arrayList2.add(new Object());
        arrayList2.add(new Object());
        arrayList2.add(new Object());
        arrayList2.add(new Object());
        arrayList2.add(new Object());
        arrayList2.add(new ge0.e(this));
        arrayList2.add(new ie0.a());
        arrayList2.add(new ke0.b(this));
        arrayList2.add(new com.withings.wiscale2.device.wpm.wpm04.b(this));
        arrayList2.add(new com.withings.wiscale2.device.wpm.wpm05.b(this));
        arrayList2.add(new Object());
        if (wr.b.c(FeatureFlag.f39131t)) {
            arrayList2.add(new if0.b(this));
        }
        arrayList2.add(new we0.d(42, 7, "WPM02"));
        arrayList2.add(new we0.d(43, 21, "WPM03"));
        arrayList2.add(new kf0.b());
        arrayList2.add(new Object());
        arrayList2.add(new of0.a());
        arrayList2.add(new be0.a());
        if (wr.b.c(FeatureFlag.f39113j)) {
            arrayList2.add(new Object());
        }
        arrayList2.add(new hd0.a(this));
        arrayList2.add(new kd0.a(this));
        arrayList2.add(new md0.a(this));
        arrayList2.add(new le0.a());
        arrayList2.add(new fl.v());
        fl.p.f67673c = new fl.p(arrayList2);
        fl.p pVar = fl.p.f67673c;
        if (pVar != null) {
            th0.g.b(new th0.g(this));
            String string = androidx.preference.b.a(this).getString("app-theme", Theme.f47982d.e());
            Iterator it = ((kotlin.collections.c) Theme.a()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.jvm.internal.u.e(((Theme) obj).e(), string)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Theme theme = (Theme) obj;
            if (theme != null) {
                d11 = theme.d();
            } else {
                d11 = Theme.f47982d.d();
            }
            if (androidx.appcompat.app.f.j() != d11) {
                androidx.appcompat.app.f.F(d11);
            }
            c.a.a(this.f47902g);
            new rb0.a(this).a();
            c();
            this.S.get().registerListener(new com.withings.wiscale2.device.common.feature.v(this));
            try {
                this.f47922q0.e().f("VACUUM");
                c11 = 0;
            } catch (SQLiteException | WiscaleDBH.CorruptedDB unused) {
                this.f47922q0.a();
                c11 = 0;
                z90.c.a(this, this.f47898e, this.f47904h, this.f47912l0.get(), this.f47918o0.get(), this.f47929u.get(), this.B.get(), this.F.get(), this.G.get(), this.P, this.Q.get(), this.J0, this.R0.get(), this.T0.get(), this.U0.get(), this.V0.get(), this.W0.get(), this.Z0.get(), this.f47892a1.get(), this.f47914m0.get(), this.f47916n0.get());
            }
            if (wr.b.c(TestSetting.f39179n)) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().penaltyDeathOnNetwork().penaltyFlashScreen().build());
                StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
                int i14 = FragmentStrictMode.f13513b;
                FragmentStrictMode.a.C0121a c0121a = new FragmentStrictMode.a.C0121a();
                c0121a.b();
                c0121a.c();
                c0121a.f();
                c0121a.g();
                c0121a.d();
                c0121a.e();
                c0121a.h();
                FragmentStrictMode.n(c0121a.a());
            }
            WiscaleDBH wiscaleDBH = this.f47922q0;
            ReminderModule.init(this, new SQLiteReminderRepository(new SQLiteReminderTypeDAO(wiscaleDBH), new SQLiteReminderDAO(wiscaleDBH), new AssetDefaultReminderTypesProvider(this)), new AndroidReminderScheduler(this));
            t.l.e(new tm.b(this.f47922q0));
            mw.a.b(this);
            if (wr.b.c(TestSetting.f39175j)) {
                fg.a.a(AuthenticationService.Companion.getAuthenticationService());
                fg.c.a(Setup2FAService.Companion.getSetup2FAService());
                fg.b.a(SensitiveActionService.Companion.getSensitiveActionService());
            }
            GpsLocationRepository.Companion.init(this.f47913m.get());
            vf.c accountManager = this.f47926s0.get();
            m70.i userManager = this.f47924r0.get();
            kn.e deviceManager = this.f47936x0.get();
            kotlin.jvm.internal.u.j(accountManager, "accountManager");
            kotlin.jvm.internal.u.j(userManager, "userManager");
            kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
            if (mm.a.f82252a.c()) {
                x70.b.a(new zh0.e(deviceManager));
                new zh0.b(this, accountManager, userManager, deviceManager).d();
            }
            this.f47936x0.get().q(new uh0.a(this, pVar));
            this.f47936x0.get().q(this.f47899e1.get());
            this.f47932v0.get().registerTypeAdapter(MeasureGroupResponse.class, new MeasureGroupResponse.Deserializer());
            this.f47932v0.get().registerTypeAdapter(StoreMeasureResponse.class, new StoreMeasureResponse.Deserializer());
            WiscaleDBH dbHelper = this.f47922q0;
            kotlin.jvm.internal.u.j(dbHelper, "dbHelper");
            sw.a z5 = sw.a.z();
            kotlin.jvm.internal.u.i(z5, "get(...)");
            zx.v vVar = new zx.v(z5);
            j.a aVar3 = zx.j.f111082d;
            fy.v vVar2 = new fy.v(vVar, dbHelper, aVar3.a());
            cy.a aVar4 = new cy.a(aVar3.a());
            aVar4.a(new com.withings.wiscale2.heart.afib.l0(this));
            m70.i iVar = this.f47924r0.get();
            final ej0.b f11 = ej0.b.f(iVar, this.f47896d);
            iVar.o(f11);
            aVar4.a(f11);
            vh.h.g(new vh.a() { // from class: com.withings.wiscale2.k1
                @Override // vh.a
                public final void run() {
                    ej0.b.this.a();
                }
            });
            NoteRepository noteRepository = this.L0.get();
            kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
            ah.i.f781a = noteRepository;
            ww.b bVar = this.f47907i1.get();
            bVar.a(new yi0.a());
            bVar.a(this.f47897d1.get());
            bVar.a(new Object());
            bVar.a(new Object());
            bVar.a(new ChangeLogTimelineDelegate());
            bVar.a(this.f47895c1.get());
            bVar.a(this.f47893b1.get());
            bVar.a(this.f47899e1.get());
            bVar.a(new Object());
            jq.f.f74749d = new jq.f();
            u70.a aVar5 = this.X;
            androidx.compose.foundation.lazy.layout.d.e(this.f47927t, new LiveEcgMeasurementRepositoryImpl(this, new EcgSignalSaver(this)), new jq.k(this.f47924r0.get()));
            com.withings.ecg.live.j0 j0Var = new com.withings.ecg.live.j0(this, aVar5);
            androidx.lifecycle.l0<? super LiveEcgStatus>[] l0VarArr = new androidx.lifecycle.l0[1];
            l0VarArr[c11] = j0Var;
            androidx.lifecycle.l0<? super LiveEcgStatus> l0Var = l0VarArr[c11];
            LiveEcgMeasurementRepository liveEcgMeasurementRepository = androidx.compose.foundation.lazy.layout.d.f4444c;
            if (liveEcgMeasurementRepository != null) {
                liveEcgMeasurementRepository.getLiveStatus().observeForever(l0Var);
                lb0.g.c(bVar, this.f47931v, this.f47933w, this.f47935x);
                c.a.b(new vb0.c(this.f47926s0.get()));
                u70.a aVar6 = this.X;
                ej.w F = ej.w.F(aVar6, new vb0.i(this, aVar6, this.f47926s0.get(), this.f47936x0.get(), pVar, this.f47924r0.get(), this.f47934w0.get(), vVar2, this.Y), !wr.b.c(TestSetting.f39174i));
                com.withings.wiscale2.device.common.feature.c deviceScreenModifier = this.f47915n.get();
                kotlin.jvm.internal.u.j(deviceScreenModifier, "deviceScreenModifier");
                com.withings.wiscale2.device.common.feature.c.c(deviceScreenModifier);
                m70.i userManager2 = this.f47924r0.get();
                this.f47936x0.get();
                kn.e deviceManager2 = kn.e.c();
                e2.m mVar = new e2.m(this);
                kotlin.jvm.internal.u.j(deviceManager2, "deviceManager");
                kotlin.jvm.internal.u.j(userManager2, "userManager");
                fl.e.f67637h = new fl.e(this, deviceManager2, userManager2, pVar, mVar);
                eVar = fl.e.f67637h;
                if (eVar != null) {
                    lj0.h0 vasistasManager = this.f47940z0.get();
                    VasistasRepository.Companion.init(this.f47908j.get());
                    fy.m getMeasureGroupWithDeviceIdAndTimestampUseCase = this.f47894c;
                    m70.i userManager3 = this.f47924r0.get();
                    sw.a z11 = sw.a.z();
                    kotlin.jvm.internal.u.i(z11, "get(...)");
                    zx.v vVar3 = new zx.v(z11);
                    zx.j a12 = aVar3.a();
                    fy.a aVar7 = new fy.a(vVar3, new fy.d(vVar3, a12), new ey.a(new fy.x(new ey.b(vVar3))), a12);
                    iy.e measuresGroupRepositoryV2 = this.f47938y0.get();
                    kotlin.jvm.internal.u.j(vasistasManager, "vasistasManager");
                    kotlin.jvm.internal.u.j(getMeasureGroupWithDeviceIdAndTimestampUseCase, "getMeasureGroupWithDeviceIdAndTimestampUseCase");
                    kotlin.jvm.internal.u.j(userManager3, "userManager");
                    kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
                    mg0.c.f82024g = new mg0.c(vasistasManager, vVar2, getMeasureGroupWithDeviceIdAndTimestampUseCase, userManager3, aVar7, measuresGroupRepositoryV2);
                    lj0.l0 dao = this.R.get().O();
                    kn.e deviceManager3 = this.f47936x0.get();
                    m70.i userManager4 = this.f47924r0.get();
                    kotlin.jvm.internal.u.j(dao, "dao");
                    kotlin.jvm.internal.u.j(deviceManager3, "deviceManager");
                    kotlin.jvm.internal.u.j(userManager4, "userManager");
                    lj0.n0 n0Var = new lj0.n0(dao, userManager4);
                    lj0.n0.f79890b = n0Var;
                    deviceManager3.q(n0Var);
                    if (lj0.n0.f79890b != null) {
                        WorkoutCategoryManager workoutCategoryManager = this.F0.get();
                        ?? obj2 = new Object();
                        lj0.w wVar = this.A0.get();
                        lj0.g gVar = this.B0.get();
                        lj0.r rVar = this.C0.get();
                        lj0.b bVar2 = this.D0.get();
                        WorkoutDataBuilder workoutDataBuilder = new WorkoutDataBuilder(vasistasManager, wVar, this.f47924r0.get(), workoutCategoryManager, obj2);
                        WorkoutManager workoutManager = this.G0.get();
                        ei0.q qVar = this.E0.get();
                        new com.withings.wiscale2.activity.model.builder.b(this, this.f47924r0.get(), vasistasManager, aVar4, workoutManager, qVar, this.f47936x0.get(), wVar, rVar, bVar2, gVar, this.f47917o.get(), new lj0.l(), workoutDataBuilder, this.M.get()).u();
                        ActivityAggregateManager activityAggregateManager = this.f47920p0.get();
                        activityAggregateManager.addListener(new lj0.u(this));
                        int[] initThresholds = HearRateThresholdsAlgo.f57620a.initThresholds();
                        TargetRepository init = LocalTargetRepository.init(this, this.R.get().L(), initThresholds[c11], initThresholds[1]);
                        TargetObserverKt.observeStepTargetUpdateForTrackerSync(init, new ym0.l() { // from class: com.withings.wiscale2.l1
                            @Override // ym0.l
                            public final Object invoke(Object obj3) {
                                kn.e deviceManager4 = HealthmateApplication.this.f47936x0.get();
                                long longValue = ((Long) obj3).longValue();
                                kotlin.jvm.internal.u.j(deviceManager4, "deviceManager");
                                fl.e deviceConnectorManager = eVar;
                                kotlin.jvm.internal.u.j(deviceConnectorManager, "deviceConnectorManager");
                                ArrayList k11 = deviceManager4.k(16, longValue);
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it2 = k11.iterator();
                                while (it2.hasNext()) {
                                    e.c f12 = deviceConnectorManager.f((Device) it2.next());
                                    if (f12 != null) {
                                        arrayList3.add(f12);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    Object next = it3.next();
                                    if (next instanceof e.d) {
                                        arrayList4.add(next);
                                    }
                                }
                                Iterator it4 = arrayList4.iterator();
                                while (it4.hasNext()) {
                                    ((e.d) it4.next()).d();
                                }
                                return null;
                            }
                        });
                        x90.a a13 = this.I0.a(init);
                        activityAggregateManager.addListener(new w90.u(a13));
                        new StepWidgetReceiver();
                        getPackageManager().setComponentEnabledSetting(new ComponentName(this, StepWidgetReceiver.class), 1, 1);
                        a13.e();
                        FoodManager.init(this.R.get().t(), this.R.get().u(), activityAggregateManager, init);
                        aVar4.a(new com.withings.wiscale2.heart.afib.l0(this));
                        bVar.a(this.f47901f1.get());
                        aVar4.a(this.f47901f1.get());
                        bVar.a(this.f47903g1.get());
                        this.f47936x0.get().q(this.f47903g1.get());
                        ui0.a aVar8 = new ui0.a(getApplicationContext(), this.f47924r0.get());
                        bVar.a(aVar8);
                        bVar.l(aVar8);
                        u70.a aVar9 = this.X;
                        com.withings.comm.trace.e C = F.C();
                        ax.e eVar2 = new ax.e(this.f47924r0.get(), this.f47936x0.get(), F, this.f47913m.get(), this.f47912l0.get(), this.f47919p.get(), this.f47921q.get(), this.f47923r.get());
                        ra0.d dVar = new ra0.d(this.f47936x0.get(), this.f47924r0.get(), F, workoutCategoryManager, aVar9, this.f47913m.get(), this.f47912l0.get(), this.f47923r.get(), this.f47919p.get(), this.f47921q.get());
                        ax.i repository = this.H0.get();
                        m70.i userManager5 = this.f47924r0.get();
                        kn.e deviceManager4 = this.f47936x0.get();
                        ax.c liveWorkoutCommandSender = this.T.get();
                        bx.a sharedLiveWorkoutInfo = this.W.get();
                        kotlin.jvm.internal.u.j(repository, "repository");
                        kotlin.jvm.internal.u.j(userManager5, "userManager");
                        kotlin.jvm.internal.u.j(deviceManager4, "deviceManager");
                        kotlin.jvm.internal.u.j(liveWorkoutCommandSender, "liveWorkoutCommandSender");
                        kotlin.jvm.internal.u.j(sharedLiveWorkoutInfo, "sharedLiveWorkoutInfo");
                        final ax.h hVar = new ax.h(repository, userManager5, deviceManager4, liveWorkoutCommandSender, eVar2, sharedLiveWorkoutInfo);
                        ax.h.f19725i = hVar;
                        com.withings.wiscale2.activity.workout.live.ui.e eVar3 = new com.withings.wiscale2.activity.workout.live.ui.e(this, this.f47924r0.get(), aVar9, workoutManager);
                        workoutManager.registerListener(eVar3);
                        ui.d dVar2 = new ui.d(this, (LocationManager) getSystemService("location"));
                        LiveWorkoutActivityStarter liveWorkoutActivityStarter = new LiveWorkoutActivityStarter(this, aVar9, this.W.get());
                        oa0.a aVar10 = new oa0.a(this, dVar2, workoutCategoryManager);
                        LiveWorkoutNotificationManager liveWorkoutNotificationManager = new LiveWorkoutNotificationManager(this);
                        com.withings.wiscale2.activity.workout.gps.model.f fVar = new com.withings.wiscale2.activity.workout.gps.model.f(this, dVar2, aVar9);
                        sa0.a aVar11 = new sa0.a(this.f47924r0.get(), this.f47917o.get(), this);
                        pa0.b bVar3 = new pa0.b(this);
                        qa0.b bVar4 = new qa0.b(C, this.f47924r0.get(), this.f47913m.get(), dVar2);
                        ?? obj3 = new Object();
                        ra0.a aVar12 = new ra0.a(dVar2, this.f47936x0.get(), F, aVar9);
                        pa0.a aVar13 = new pa0.a(this.f47936x0.get(), eVar);
                        cx.a aVar14 = new cx.a(this.W.get());
                        hVar.c(new ax.j(this));
                        hVar.c(eVar3);
                        hVar.c(liveWorkoutActivityStarter);
                        hVar.c(aVar10);
                        hVar.c(liveWorkoutNotificationManager);
                        hVar.c(fVar);
                        hVar.c(aVar11);
                        hVar.c(aVar14);
                        hVar.c(bVar3);
                        hVar.c(bVar4);
                        hVar.c(obj3);
                        hVar.c(aVar12);
                        hVar.c(aVar13);
                        hVar.a(eVar3);
                        hVar.a(liveWorkoutActivityStarter);
                        hVar.a(aVar10);
                        hVar.a(liveWorkoutNotificationManager);
                        hVar.a(fVar);
                        hVar.a(aVar11);
                        hVar.a(bVar3);
                        hVar.d(dVar);
                        hVar.d(eVar2);
                        hVar.b(eVar2);
                        vh.h.g(new vh.a() { // from class: com.withings.wiscale2.j1
                            @Override // vh.a
                            public final void run() {
                                ax.h.this.i();
                            }
                        });
                        new zh0.a(this, this.f47924r0.get()).a();
                        androidx.camera.camera2.internal.s2.m(this.f47937y, new si.a(getPackageName(), this.f47924r0.get(), this.f47906i.get()));
                        u70.a aVar15 = this.X;
                        vf.c cVar = this.f47926s0.get();
                        if (wr.b.c(InternalSetting.f39147f)) {
                            Account i15 = cVar.i();
                            if (i15 != null) {
                                l5 = Long.valueOf(i15.i().b());
                            } else {
                                l5 = null;
                            }
                            WebActivity.a aVar16 = new WebActivity.a(getApplicationContext(), l5, HMWebActivity.class);
                            aVar16.c(new HMWebViewDelegate());
                            i11 = 4;
                            t.u uVar = new t.u(cVar, 4);
                            sm0.a<FeatureFlag> aVar17 = pf0.a.f91182a;
                            int h11 = kotlin.collections.s0.h(kotlin.collections.x.y(aVar17, 10));
                            if (h11 < 16) {
                                h11 = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                            Iterator it2 = ((kotlin.collections.c) aVar17).iterator();
                            while (it2.hasNext()) {
                                FeatureFlag featureFlag = (FeatureFlag) it2.next();
                                nm0.j jVar = new nm0.j(featureFlag.getTitle(), Boolean.valueOf(wr.b.c(featureFlag)));
                                linkedHashMap.put(jVar.c(), jVar.d());
                            }
                            iq.b.d(this, aVar15, aVar16, uVar, linkedHashMap, new androidx.camera.lifecycle.b(this, 3));
                        } else {
                            i11 = 4;
                        }
                        fb0.c a14 = fb0.c.a();
                        if (a14 == null) {
                            a14 = new fb0.c();
                            fb0.c.b(a14);
                        }
                        s20.c getPopularAppsWithPackageNameUseCase = this.f47900f;
                        kn.e deviceManager5 = this.f47936x0.get();
                        kotlin.jvm.internal.u.j(getPopularAppsWithPackageNameUseCase, "getPopularAppsWithPackageNameUseCase");
                        kotlin.jvm.internal.u.j(deviceManager5, "deviceManager");
                        fb0.b.h(new fb0.b(this, a14, getPopularAppsWithPackageNameUseCase, deviceManager5, F));
                        wg.a.d();
                        this.Z.get();
                        yb0.c eventRepository = this.X0.get();
                        kotlin.jvm.internal.u.j(eventRepository, "eventRepository");
                        c.a.f108754a = eventRepository;
                        PatientSessionRepository.Companion.init(this.f47911l.get());
                        h.a.b(new h1(init));
                        v.a aVar18 = new v.a(this, 3);
                        com.withings.webview.b.f46889a.getClass();
                        Context applicationContext = getApplicationContext();
                        kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
                        com.withings.webview.b.c(new p80.b(applicationContext, aVar18));
                        com.withings.webview.b.c(new p80.a());
                        l30.c programTaskRepository = this.f47925s.get();
                        kotlin.jvm.internal.u.j(programTaskRepository, "programTaskRepository");
                        w30.d.f104465b = new w30.d(programTaskRepository);
                        rg.b deviceAlarmManager = this.f47909j1.get();
                        rg.b.f(deviceAlarmManager);
                        kotlin.jvm.internal.u.j(deviceAlarmManager, "deviceAlarmManager");
                        lf0.d.b(new lf0.d());
                        lf0.d a15 = lf0.d.a();
                        if (a15 != null) {
                            deviceAlarmManager.g(a15);
                            if (lf0.d.a() != null) {
                                if (this.f47926s0.get().j()) {
                                    eVar.g();
                                }
                                this.f47905h1.get().g();
                                new sf0.h(this, workoutManager, vasistasManager, gVar, aVar4, this.X, qVar, this.f47924r0.get(), this.f47926s0.get(), this.f47928t0.get(), this.f47930u0.get());
                                ub0.u healthmateDeepLinkHandlerProvider = this.f47939z.get();
                                kotlin.jvm.internal.u.j(healthmateDeepLinkHandlerProvider, "healthmateDeepLinkHandlerProvider");
                                ub0.u.c(healthmateDeepLinkHandlerProvider);
                                hm.b b10 = ub0.u.b();
                                if (b10 != null) {
                                    f7.e.i(b10);
                                    new th0.h(this).a();
                                    androidx.core.content.a.registerReceiver(this, new BluetoothBondReceiver(), new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"), 2);
                                    androidx.core.content.a.registerReceiver(this, new SetupStartBroadcastReceiver(), new IntentFilter("SETUP_STARTING"), i11);
                                    androidx.core.content.a.registerReceiver(this, new SetupStopBroadcastReceiver(), new IntentFilter("SETUP_ENDING"), i11);
                                    new zh0.a(this, this.f47924r0.get()).a();
                                    c();
                                    if (this.f47926s0.get().j()) {
                                        eVar.g();
                                    }
                                    t.a aVar19 = new t.a(CleanVasistasData.class, 6L, TimeUnit.HOURS);
                                    e.a aVar20 = new e.a();
                                    aVar20.d();
                                    androidx.work.impl.n0.n(this).d("CleanVasistasData", ExistingPeriodicWorkPolicy.f19028c, aVar19.h(aVar20.a()).b());
                                    t.a aVar21 = new t.a(CleanDeletedSignals.class, 1L, TimeUnit.DAYS);
                                    e.a aVar22 = new e.a();
                                    aVar22.d();
                                    androidx.work.impl.n0.n(this).d("CleanDeletedSignals", ExistingPeriodicWorkPolicy.f19026a, aVar21.h(aVar22.a()).b());
                                    LeaderboardManager.init(this.R.get().s()).addListener(new a());
                                    ah.c0.f();
                                    l2.d.f();
                                    p004do.a.b();
                                    androidx.compose.foundation.lazy.layout.d.k(new e2.e(6));
                                    SleepScoreHelperKt.setSleepScoreConstants(new SleepLib().getGenericConstants());
                                    wt.l lVar = new wt.l(this.P0, this.O0.get(), this.M0.get(), this.N0.get(), this.K0, this.f47924r0.get(), this.Q0);
                                    activityAggregateManager.addListener(lVar);
                                    aVar4.a(lVar);
                                    this.S0.get().m();
                                    return;
                                }
                                kotlin.jvm.internal.u.s("deepLinkHandlerProvider");
                                throw null;
                            }
                            kotlin.jvm.internal.u.s("instance");
                            throw null;
                        }
                        kotlin.jvm.internal.u.s("instance");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("instance");
                    throw null;
                }
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
            kotlin.jvm.internal.u.s("liveEcgMeasurementRepository");
            throw null;
        }
        kotlin.jvm.internal.u.s("instance");
        throw null;
    }

    /* loaded from: classes4.dex */
    final class a implements LeaderboardManager.Listener {
        a() {
        }

        @Override // com.withings.leaderboard.domain.LeaderboardManager.Listener
        public final void onLeaderboardUpdated(long j5, DateTime dateTime, List<LeaderboardEntry> list) {
            HealthmateApplication.this.f47897d1.get().b(j5, dateTime, list);
        }

        @Override // com.withings.leaderboard.domain.LeaderboardManager.Listener
        public final void onFriendDeleted(long j5) {
        }
    }
}
