package com.withings.wiscale2;

import android.app.Application;
import android.content.Context;
import com.google.common.collect.x;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.account.models.AndroidKeyStoreCipher;
import com.withings.account.models.KeyStoreCipher;
import com.withings.account.network.GenerateAccountSession;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.account.network.ws.RetrofitAccountRemoteRepository;
import com.withings.account.network.ws.RetrofitSessionRemoteRepository;
import com.withings.account.network.ws.SessionRemoteRepository;
import com.withings.clinicalstudy.repository.ClinicalStudySuggestionRepository;
import com.withings.clinicalstudy.repository.JsonApiSuggestionRepository;
import com.withings.clinicalstudy.repository.JsonClinicalStudySuggestionRepository;
import com.withings.clinicalstudy.repository.PatientSessionDao;
import com.withings.clinicalstudy.repository.PatientSessionRepository;
import com.withings.clinicalstudy.repository.RoomPatientSessionRepository;
import com.withings.core.data.aggregate.ActivityAggregateDAO;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.core.data.aggregate.GetActiveMinutesUseCase;
import com.withings.core.data.aggregate.GetDailyUserProgressionForMeasureTypeUseCase;
import com.withings.core.data.aggregate.GetStepsUseCase;
import com.withings.core.data.aggregate.ws.ActivityAggregateRemoteRepository;
import com.withings.core.data.aggregate.ws.RetrofitActivityAggregateRemoteRepository;
import com.withings.device.Device;
import com.withings.device.ws.DeviceRemoteRepository;
import com.withings.device.ws.RetrofitDeviceRemoteRepository;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.ecg.model.RoomHeartSignalRepository;
import com.withings.ecg.webservices.EcgReviewRemoteRepository;
import com.withings.ecg.webservices.RetrofitEcgReviewRemoteRepository;
import com.withings.ecg.webservices.RetrofitSignalRemoteRepository;
import com.withings.ecg.webservices.SignalRemoteRepository;
import com.withings.factor.local.dao.FactorDao;
import com.withings.factor.remote.repository.RetrofitRemoteFactorRepository;
import com.withings.features.FeatureFlag;
import com.withings.features.platform.PlatformFeatureModule_ProvideFeatureTagsLastUpdateRepositoryFactory;
import com.withings.features.platform.PlatformFeatureModule_ProvidePlatformFeatureApiFactory;
import com.withings.features.platform.model.PlatformFeatureDao;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.features.platform.model.RoomPlatformFeatureRepository;
import com.withings.health.score.android.webservices.repository.RetrofitHealthScoreRemoteRepository;
import com.withings.leaderboard.di.LeaderboardModule;
import com.withings.leaderboard.di.LeaderboardModule_ProvideLeaderboardRemoteRepositoryFactory;
import com.withings.leaderboard.domain.LeaderboardSyncJobFactory;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.authentication.login.AuthenticationService;
import com.withings.library.authentication.sensitiveaction.SensitiveActionService;
import com.withings.library.healthscore.HealthScoreService;
import com.withings.location.di.LocationProviderModule_ProvideComputeGpsDistanceFactory;
import com.withings.location.di.LocationProviderModule_ProvideComputeGpsSummaryFactory;
import com.withings.location.di.LocationProviderModule_ProvideComputePaceFactory;
import com.withings.location.di.LocationProviderModule_ProvideComputeSpeedFactory;
import com.withings.location.di.LocationProviderModule_ProvideComputeSplitFactory;
import com.withings.location.di.LocationProviderModule_ProvideCountTotalGapDurationFactory;
import com.withings.location.di.LocationProviderModule_ProvideFilterGpsLocationWithPauseFactory;
import com.withings.location.di.LocationProviderModule_ProvideGpsLocationFilterFactory;
import com.withings.location.di.LocationProviderModule_ProvideGpsLocationRemoteRepositoryFactory;
import com.withings.location.di.LocationProviderModule_ProvideHasEnoughGpsLocationsFactory;
import com.withings.location.domain.AndroidGpsDistanceComputer;
import com.withings.location.domain.uc.ComputeGpsDistance;
import com.withings.location.domain.uc.ComputeGpsSummary;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSpeed;
import com.withings.location.domain.uc.ComputeSplits;
import com.withings.location.domain.uc.GpsLocationFilter;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import com.withings.location.repository.GpsLocationRemoteRepository;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.location.repository.RoomGpsLocationRepository;
import com.withings.location.repository.data.db.GpsLocationDao;
import com.withings.location.repository.data.db.RoomGpsLocationDao;
import com.withings.location.repository.data.mapper.GpsLocationEntityMapper;
import com.withings.location.repository.data.uc.DeleteGpsLocations;
import com.withings.location.repository.data.uc.GetFirstAndLastGpsLocationNotSyncedDates;
import com.withings.location.repository.data.uc.GetGpsLocationsNotSynced;
import com.withings.location.repository.data.uc.GetLastGpsLocationSyncedDate;
import com.withings.location.repository.data.uc.SaveGpsLocations;
import com.withings.location.repository.ws.GetLastLocationVasistas;
import com.withings.location.repository.ws.GetLocationVasistas;
import com.withings.location.repository.ws.PartitionOneLocationPerSeconds;
import com.withings.location.repository.ws.SendLocationVasistas;
import com.withings.location.repository.ws.SynchronizeLocationVasistas;
import com.withings.location.repository.ws.model.GpsLocationSerializer;
import com.withings.manualLogging.data.webservice.healthAttribute.HealthAttributeRemoteRepository;
import com.withings.manualLogging.data.webservice.healthAttribute.HealthAttributeWebServiceMapper;
import com.withings.manualLogging.data.webservice.healthAttribute.RetrofitHealthAttributeRemoteRepository;
import com.withings.manualLogging.data.webservice.note.NoteRemoteRepository;
import com.withings.manualLogging.data.webservice.note.NoteWebServiceMapper;
import com.withings.manualLogging.data.webservice.note.RetrofitNoteRemoteRepository;
import com.withings.medicalreport.webservices.MedicalReportRemoteRepository;
import com.withings.medicalreport.webservices.RetrofitMedicalReportRemoteRepository;
import com.withings.nervehealth.android.usecases.GetNeuropathyDiagnostics;
import com.withings.nervehealthscore.NerveHealthNative;
import com.withings.network.android.interceptors.BlockBackgroundCallsInterceptor;
import com.withings.network.android.interceptors.BlockBackgroundCallsInterceptorImpl;
import com.withings.network.android.interceptors.MutexCallsCallsInterceptor;
import com.withings.network.android.interceptors.MutexCallsCallsInterceptorImpl;
import com.withings.note.model.NoteRepository;
import com.withings.note.model.RoomNoteRepository;
import com.withings.partner.ws.PartnerRemoteRepository;
import com.withings.partner.ws.RetrofitPartnerRemoteRepository;
import com.withings.prediction.local.dao.PredictionDao;
import com.withings.prediction.remote.repository.RetrofitRemotePredictionRepository;
import com.withings.reminder.di.RemindersBinderModule_ProvideReminderRepositoryFactory;
import com.withings.reminder.model.ReminderRepository;
import com.withings.screen.di.DeviceScreenModule_ProvideGetMissingFeatureTagUseCaseFactory;
import com.withings.screen.di.DeviceScreenModule_ProvideRemoteRepositoryFactory;
import com.withings.screen.domain.uc.GetMissingFeatureTagUseCase;
import com.withings.screen.repository.DeviceScreensRemoteRepository;
import com.withings.screen.repository.DeviceScreensRepository;
import com.withings.screen.repository.RoomDeviceScreensRepository;
import com.withings.screen.repository.data.GetDeviceScreensLastUpdate;
import com.withings.screen.repository.data.RoomDeviceScreenContentDao;
import com.withings.screen.repository.data.RoomDeviceScreenDao;
import com.withings.screen.repository.data.RoomDeviceScreensGroupDao;
import com.withings.screen.repository.data.UpdateScreensStateAndOrder;
import com.withings.screen.repository.data.db.DeviceScreenContentDao;
import com.withings.screen.repository.data.db.DeviceScreenDao;
import com.withings.screen.repository.data.db.DeviceScreensGroupDao;
import com.withings.screen.repository.ws.GetDeviceScreens;
import com.withings.screen.repository.ws.GetDeviceScreensContents;
import com.withings.screen.repository.ws.SendDeviceScreens;
import com.withings.screen.repository.ws.SynchronizeDeviceScreens;
import com.withings.target.data.TargetRepository;
import com.withings.target.data.api.TargetRemoteRepository;
import com.withings.target.data.di.TargetModule_ProvideTargetRemoteRepositoryFactory;
import com.withings.vasistas.di.VasistasModule;
import com.withings.vasistas.di.VasistasModule_ProvideVasistasRemoteRepositoryFactory;
import com.withings.vasistas.v2.repository.SqlVasistasRepository;
import com.withings.vasistas.v2.repository.VasistasRepository;
import com.withings.vasistas.ws.VasistasRemoteRepository;
import com.withings.webradio.di.WebRadiosModule_ProvideWebRadiosRemoteRepositoryFactory;
import com.withings.webradio.network.WebRadiosRemoteRepository;
import com.withings.webservices.legacy.Webservices;
import com.withings.webservices.legacy.lastupdate.LastUpdateApi;
import com.withings.webservices.legacy.sync.SyncJobManager;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.activity.workout.recognition.model.RecognitionManager;
import com.withings.wiscale2.activity.workout.recognition.webservices.RecognitionRemoteRepository;
import com.withings.wiscale2.activity.workout.recognition.webservices.RetrofitRecognitionRemoteRepository;
import com.withings.wiscale2.appupgrade.OnUpgradeReceiver;
import com.withings.wiscale2.data.WiscaleDBH;
import com.withings.wiscale2.device.consumable.webservices.ConsumableRemoteRepository;
import com.withings.wiscale2.device.consumable.webservices.RetrofitConsumableRemoteRepository;
import com.withings.wiscale2.food.model.FoodManager;
import com.withings.wiscale2.food.ws.FoodRemoteRepository;
import com.withings.wiscale2.food.ws.RetrofitFoodRemoteRepository;
import com.withings.wiscale2.locale.LocaleChangedReceiver;
import com.withings.wiscale2.notification.LeaderboardNotificationActionReceiver;
import com.withings.wiscale2.track.ws.RetrofitTrackRemoteRepository;
import com.withings.wiscale2.track.ws.TrackRemoteRepository;
import com.withings.workout.category.model.HealthMateWorkoutCategoryStringProvider;
import com.withings.workout.category.model.WorkoutCategoryManager;
import com.withings.workout.category.webservices.RetrofitWorkoutCategoryRemoteRepository;
import com.withings.workout.category.webservices.WorkoutCategoryRemoteRepository;
import fl.p;
import ij.e;
import java.util.Set;
import jm.a;
import kotlin.jvm.internal.u;
import l70.w;
import q00.g;
import s00.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class b0 extends r1 {

    /* renamed from: a  reason: collision with root package name */
    private final gk0.a f50131a;

    /* renamed from: b  reason: collision with root package name */
    private final ay.a f50137b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.compose.material.i1 f50143c;

    /* renamed from: d  reason: collision with root package name */
    private final com.withings.wiscale2.account.password.b f50149d;

    /* renamed from: e  reason: collision with root package name */
    private final jx.a f50155e;

    /* renamed from: f  reason: collision with root package name */
    private final a3.p f50161f;

    /* renamed from: g  reason: collision with root package name */
    private final LeaderboardModule f50167g;

    /* renamed from: h  reason: collision with root package name */
    private final VasistasModule f50173h;

    /* renamed from: i  reason: collision with root package name */
    private final a3.b f50179i;

    /* renamed from: j  reason: collision with root package name */
    private final kt.a f50185j;

    /* renamed from: k  reason: collision with root package name */
    private final com.withings.wiscale2.measure.accountmeasure.ui.add.g0 f50191k;

    /* renamed from: l  reason: collision with root package name */
    private final ah.b f50197l;

    /* renamed from: m  reason: collision with root package name */
    private final df.d f50203m;

    /* renamed from: n  reason: collision with root package name */
    private final im.a f50209n;

    /* renamed from: o  reason: collision with root package name */
    private final ay.a f50215o;

    /* renamed from: p  reason: collision with root package name */
    private final bj0.d f50221p;

    /* renamed from: q  reason: collision with root package name */
    private final ah.x f50227q;

    /* renamed from: r  reason: collision with root package name */
    private final ah.t f50233r;

    /* renamed from: s  reason: collision with root package name */
    private final b0 f50239s = this;

    /* renamed from: t  reason: collision with root package name */
    private dagger.internal.d<WiscaleDBH> f50245t = dagger.internal.a.c(new a(this, 1));

    /* renamed from: u  reason: collision with root package name */
    private dagger.internal.d<kn.e> f50251u = dagger.internal.a.c(new a(this, 0));

    /* renamed from: v  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.data.s> f50257v = new a(this, 4);

    /* renamed from: w  reason: collision with root package name */
    private dagger.internal.d<PlatformFeatureRepository> f50263w = dagger.internal.a.c(new a(this, 3));

    /* renamed from: x  reason: collision with root package name */
    private dagger.internal.d<s00.c> f50269x = dagger.internal.a.c(new a(this, 6));

    /* renamed from: y  reason: collision with root package name */
    private dagger.internal.d<g1> f50275y = dagger.internal.a.c(new a(this, 8));

    /* renamed from: z  reason: collision with root package name */
    private dagger.internal.d<AndroidKeyStoreCipher> f50281z = dagger.internal.a.c(new a(this, 12));
    private dagger.internal.d<vf.a> A = dagger.internal.a.c(new a(this, 11));
    private dagger.internal.d<tf.a> B = dagger.internal.a.c(new a(this, 10));
    private dagger.internal.d<wf.d> C = dagger.internal.a.c(new a(this, 14));
    private dagger.internal.d<tf.c> D = dagger.internal.a.c(new a(this, 13));
    private dagger.internal.d<o20.a> E = dagger.internal.a.c(new a(this, 16));
    private dagger.internal.d<ti.a> F = dagger.internal.a.c(new a(this, 18));
    private dagger.internal.d<ti.d> G = dagger.internal.a.c(new a(this, 17));
    private dagger.internal.d<l70.w> H = dagger.internal.a.c(new a(this, 19));
    private dagger.internal.d<f10.a> I = dagger.internal.a.c(new a(this, 21));
    private dagger.internal.d<h10.a> J = dagger.internal.a.c(new a(this, 20));
    private dagger.internal.d<o60.a> K = dagger.internal.a.c(new a(this, 22));
    private dagger.internal.d<j90.e> L = dagger.internal.a.c(new a(this, 23));
    private dagger.internal.d<j90.c> M = dagger.internal.a.c(new a(this, 24));
    private dagger.internal.d<h00.b> N = dagger.internal.a.c(new a(this, 25));
    private dagger.internal.d<c90.a> O = dagger.internal.a.c(new a(this, 26));
    private dagger.internal.d<vr.c> P = dagger.internal.a.c(new a(this, 27));
    private dagger.internal.d<fs.a> Q = dagger.internal.a.c(new a(this, 28));
    private dagger.internal.d<x60.a> R = dagger.internal.a.c(new a(this, 29));
    private dagger.internal.d<nw.b> S = dagger.internal.a.c(new a(this, 31));
    private dagger.internal.d<pw.a> T = new a(this, 30);
    private dagger.internal.d<ot.b> U = dagger.internal.a.c(new a(this, 32));
    private dagger.internal.d<v20.b> V = dagger.internal.a.c(new a(this, 33));
    private dagger.internal.d<cz.l> W = dagger.internal.a.c(new a(this, 34));
    private dagger.internal.d<ex.a> X = new a(this, 35);
    private dagger.internal.d<qg0.a> Y = dagger.internal.a.c(new a(this, 36));
    private dagger.internal.d<hw.a> Z = dagger.internal.a.c(new a(this, 37));

    /* renamed from: a0  reason: collision with root package name */
    private dagger.internal.d<p60.c> f50132a0 = dagger.internal.a.c(new a(this, 38));

    /* renamed from: b0  reason: collision with root package name */
    private dagger.internal.d<z90.b> f50138b0 = dagger.internal.a.c(new a(this, 15));

    /* renamed from: c0  reason: collision with root package name */
    private dagger.internal.d<vf.c> f50144c0 = dagger.internal.a.c(new a(this, 9));

    /* renamed from: d0  reason: collision with root package name */
    private dagger.internal.d<u70.a> f50150d0 = dagger.internal.a.c(new a(this, 43));

    /* renamed from: e0  reason: collision with root package name */
    private dagger.internal.d<Webservices> f50156e0 = dagger.internal.a.c(new a(this, 42));

    /* renamed from: f0  reason: collision with root package name */
    private dagger.internal.d<yf.a> f50162f0 = dagger.internal.a.c(new a(this, 41));

    /* renamed from: g0  reason: collision with root package name */
    private dagger.internal.d<yf.f> f50168g0 = dagger.internal.a.c(new a(this, 40));

    /* renamed from: h0  reason: collision with root package name */
    private dagger.internal.d<AuthenticationService> f50174h0 = new a(this, 44);

    /* renamed from: i0  reason: collision with root package name */
    private dagger.internal.d<BlockBackgroundCallsInterceptor> f50180i0 = dagger.internal.a.c(new a(this, 47));

    /* renamed from: j0  reason: collision with root package name */
    private dagger.internal.d<s00.d> f50186j0 = dagger.internal.a.c(new a(this, 46));

    /* renamed from: k0  reason: collision with root package name */
    private dagger.internal.d<MutexCallsCallsInterceptor> f50192k0 = dagger.internal.a.c(new a(this, 49));

    /* renamed from: l0  reason: collision with root package name */
    private dagger.internal.d<s00.d> f50198l0 = dagger.internal.a.c(new a(this, 48));

    /* renamed from: m0  reason: collision with root package name */
    private dagger.internal.d<SessionRemoteRepository> f50204m0 = dagger.internal.a.c(new a(this, 45));

    /* renamed from: n0  reason: collision with root package name */
    private dagger.internal.d<vf.d> f50210n0 = dagger.internal.a.c(new a(this, 50));

    /* renamed from: o0  reason: collision with root package name */
    private dagger.internal.d<AccountSessionRepository> f50216o0 = dagger.internal.a.c(new a(this, 39));

    /* renamed from: p0  reason: collision with root package name */
    private dagger.internal.d<fj0.e> f50222p0 = dagger.internal.a.c(new a(this, 51));

    /* renamed from: q0  reason: collision with root package name */
    private dagger.internal.d<o2> f50228q0 = dagger.internal.a.c(new a(this, 7));

    /* renamed from: r0  reason: collision with root package name */
    private dagger.internal.d<s00.d> f50234r0 = dagger.internal.a.c(new a(this, 5));

    /* renamed from: s0  reason: collision with root package name */
    private dagger.internal.d<s00.d> f50240s0 = dagger.internal.a.c(new a(this, 52));

    /* renamed from: t0  reason: collision with root package name */
    private dagger.internal.d<vr.e> f50246t0 = dagger.internal.a.c(new a(this, 2));

    /* renamed from: u0  reason: collision with root package name */
    private dagger.internal.d<t70.e> f50252u0 = dagger.internal.a.c(new a(this, 54));

    /* renamed from: v0  reason: collision with root package name */
    private dagger.internal.d<m70.i> f50258v0 = dagger.internal.a.c(new a(this, 53));

    /* renamed from: w0  reason: collision with root package name */
    private dagger.internal.d<sw.a> f50264w0 = dagger.internal.a.c(new a(this, 55));

    /* renamed from: x0  reason: collision with root package name */
    private dagger.internal.d<zx.j> f50270x0 = dagger.internal.a.c(new a(this, 56));

    /* renamed from: y0  reason: collision with root package name */
    private dagger.internal.d<iy.d> f50276y0 = dagger.internal.a.c(new a(this, 57));

    /* renamed from: z0  reason: collision with root package name */
    private dagger.internal.d<ql.b> f50282z0 = dagger.internal.a.c(new a(this, 58));
    private dagger.internal.d<RoomDeviceScreenDao> A0 = dagger.internal.a.c(new a(this, 60));
    private dagger.internal.d<RoomDeviceScreenContentDao> B0 = dagger.internal.a.c(new a(this, 61));
    private dagger.internal.d<RoomDeviceScreensGroupDao> C0 = dagger.internal.a.c(new a(this, 62));
    private dagger.internal.d<DeviceScreensRemoteRepository> D0 = dagger.internal.a.c(new a(this, 63));
    private dagger.internal.d<RoomDeviceScreensRepository> E0 = dagger.internal.a.c(new a(this, 59));
    private dagger.internal.d<HealthAttributeRemoteRepository> F0 = dagger.internal.a.c(new a(this, 65));
    private dagger.internal.d<NoteRemoteRepository> G0 = dagger.internal.a.c(new a(this, 66));
    private dagger.internal.d<ex.b> H0 = dagger.internal.a.c(new a(this, 64));
    private dagger.internal.d<FactorDao> I0 = dagger.internal.a.c(new a(this, 68));
    private dagger.internal.d<gr.a> J0 = dagger.internal.a.c(new a(this, 67));
    private dagger.internal.d<xw.b> K0 = dagger.internal.a.c(new a(this, 70));
    private dagger.internal.d<iy.e> L0 = dagger.internal.a.c(new a(this, 69));
    private dagger.internal.d<PredictionDao> M0 = dagger.internal.a.c(new a(this, 72));
    private dagger.internal.d<v20.e> N0 = dagger.internal.a.c(new a(this, 71));
    private dagger.internal.d<xm.b> O0 = dagger.internal.a.c(new a(this, 73));
    private dagger.internal.d<er.a> P0 = dagger.internal.a.c(new a(this, 74));
    private dagger.internal.d<ah.n> Q0 = new a(this, 75);
    private dagger.internal.d<jq.b> R0 = dagger.internal.a.c(new a(this, 76));
    private dagger.internal.d<ww.b> S0 = dagger.internal.a.c(new a(this, 77));
    private dagger.internal.d<r70.c> T0 = dagger.internal.a.c(new a(this, 78));
    private dagger.internal.d<c70.e> U0 = dagger.internal.f.b(new a(this, 79));
    private dagger.internal.d<ew.a> V0 = dagger.internal.a.c(new a(this, 80));
    private dagger.internal.d<lj0.h0> W0 = dagger.internal.a.c(new a(this, 82));
    private dagger.internal.d<SqlVasistasRepository> X0 = new a(this, 81);
    private dagger.internal.d<RoomPatientSessionRepository> Y0 = new a(this, 83);
    private dagger.internal.d<GpsLocationDao> Z0 = dagger.internal.a.c(new a(this, 85));

    /* renamed from: a1  reason: collision with root package name */
    private dagger.internal.d<GpsLocationRemoteRepository> f50133a1 = dagger.internal.a.c(new a(this, 86));

    /* renamed from: b1  reason: collision with root package name */
    private dagger.internal.d<RoomGpsLocationRepository> f50139b1 = dagger.internal.a.c(new a(this, 84));

    /* renamed from: c1  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.device.common.feature.c> f50145c1 = dagger.internal.a.c(new a(this, 87));

    /* renamed from: d1  reason: collision with root package name */
    private dagger.internal.d<ComputeGpsDistance> f50151d1 = new a(this, 89);

    /* renamed from: e1  reason: collision with root package name */
    private dagger.internal.d<ua0.a> f50157e1 = new a(this, 88);

    /* renamed from: f1  reason: collision with root package name */
    private dagger.internal.d<ComputeSpeed> f50163f1 = new a(this, 90);

    /* renamed from: g1  reason: collision with root package name */
    private dagger.internal.d<ComputePace> f50169g1 = new a(this, 91);

    /* renamed from: h1  reason: collision with root package name */
    private dagger.internal.d<l30.c> f50175h1 = new a(this, 92);

    /* renamed from: i1  reason: collision with root package name */
    private dagger.internal.d<HeartSignalRepository> f50181i1 = dagger.internal.a.c(new a(this, 93));

    /* renamed from: j1  reason: collision with root package name */
    private dagger.internal.d<com.google.android.play.core.appupdate.b> f50187j1 = dagger.internal.a.c(new a(this, 94));

    /* renamed from: k1  reason: collision with root package name */
    private dagger.internal.d<lb0.d> f50193k1 = dagger.internal.a.c(new a(this, 95));

    /* renamed from: l1  reason: collision with root package name */
    private dagger.internal.d<lb0.h> f50199l1 = dagger.internal.a.c(new a(this, 96));

    /* renamed from: m1  reason: collision with root package name */
    private dagger.internal.d<gw.b> f50205m1 = dagger.internal.a.c(new a(this, 97));

    /* renamed from: n1  reason: collision with root package name */
    private dagger.internal.d<PartnerRemoteRepository> f50211n1 = dagger.internal.a.c(new a(this, 100));

    /* renamed from: o1  reason: collision with root package name */
    private dagger.internal.d<t10.e> f50217o1 = dagger.internal.a.c(new a(this, 99));

    /* renamed from: p1  reason: collision with root package name */
    private dagger.internal.d<WorkoutManager> f50223p1 = dagger.internal.a.c(new a(this, 101));

    /* renamed from: q1  reason: collision with root package name */
    private dagger.internal.d<SyncJobManager> f50229q1 = dagger.internal.a.c(new a(this, 104));

    /* renamed from: r1  reason: collision with root package name */
    private dagger.internal.d<AccountRemoteRepository> f50235r1 = dagger.internal.a.c(new a(this, 105));

    /* renamed from: s1  reason: collision with root package name */
    private dagger.internal.d<wf.c> f50241s1 = dagger.internal.a.c(new a(this, 106));

    /* renamed from: t1  reason: collision with root package name */
    private dagger.internal.d<m20.c> f50247t1 = dagger.internal.a.c(new a(this, 107));

    /* renamed from: u1  reason: collision with root package name */
    private dagger.internal.d<m20.a> f50253u1 = dagger.internal.a.c(new a(this, 108));

    /* renamed from: v1  reason: collision with root package name */
    private dagger.internal.d<e.a> f50259v1 = dagger.internal.a.c(new a(this, 109));

    /* renamed from: w1  reason: collision with root package name */
    private dagger.internal.d<bh0.a> f50265w1 = dagger.internal.a.c(new a(this, 110));

    /* renamed from: x1  reason: collision with root package name */
    private dagger.internal.d<ug0.c> f50271x1 = new a(this, 111);

    /* renamed from: y1  reason: collision with root package name */
    private dagger.internal.d<yb0.c> f50277y1 = dagger.internal.a.c(new a(this, 112));

    /* renamed from: z1  reason: collision with root package name */
    private dagger.internal.d<kl.a> f50283z1 = dagger.internal.a.c(new a(this, 113));
    private dagger.internal.d<SignalRemoteRepository> A1 = dagger.internal.a.c(new a(this, 114));
    private dagger.internal.d<NoteRepository> B1 = dagger.internal.a.c(new a(this, 115));
    private dagger.internal.d<RecognitionRemoteRepository> C1 = dagger.internal.a.c(new a(this, 116));
    private dagger.internal.d<LeaderboardRemoteRepository> D1 = dagger.internal.a.c(new a(this, 117));
    private dagger.internal.d<lj0.n0> E1 = new a(this, 118);
    private dagger.internal.d<ActivityAggregateManager> F1 = dagger.internal.a.c(new a(this, 119));
    private dagger.internal.d<VasistasRemoteRepository> G1 = dagger.internal.a.c(new a(this, 120));
    private dagger.internal.d<ActivityAggregateRemoteRepository> H1 = dagger.internal.a.c(new a(this, 121));
    private dagger.internal.d<TrackRemoteRepository> I1 = dagger.internal.a.c(new a(this, 122));
    private dagger.internal.d<ei0.q> J1 = dagger.internal.a.c(new a(this, 123));
    private dagger.internal.d<WorkoutCategoryManager> K1 = dagger.internal.a.c(new a(this, 124));
    private dagger.internal.d<WorkoutCategoryRemoteRepository> L1 = dagger.internal.a.c(new a(this, 125));
    private dagger.internal.d<x30.c> M1 = dagger.internal.a.c(new a(this, 126));
    private dagger.internal.d<cv.a> N1 = dagger.internal.a.c(new a(this, 127));
    private dagger.internal.d<c00.a> O1 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY));
    private dagger.internal.d<c00.b> P1 = dagger.internal.a.c(new a(this, 128));
    private dagger.internal.d<vl.f> Q1 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_VHD_RESULT));
    private dagger.internal.d<rl.c> R1 = dagger.internal.f.b(new a(this, 130));
    private dagger.internal.d<zh.a> S1 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX));
    private dagger.internal.d<zh.b> T1 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_PAUSE));
    private dagger.internal.d<FoodRemoteRepository> U1 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT));
    private dagger.internal.d<TargetRemoteRepository> V1 = dagger.internal.a.c(new a(this, 135));
    private dagger.internal.d<qt.b> W1 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_ECG_PR_INTERVAL_DURATION));
    private dagger.internal.d<nt.b> X1 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION));
    private dagger.internal.d<qt.a> Y1 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_ECG_QT_INTERVAL_DURATION));
    private dagger.internal.d<qt.c> Z1 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT));

    /* renamed from: a2  reason: collision with root package name */
    private dagger.internal.d<iw.a> f50134a2 = dagger.internal.a.c(new a(this, 140));

    /* renamed from: b2  reason: collision with root package name */
    private dagger.internal.d<iw.b> f50140b2 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_HR_STATE));

    /* renamed from: c2  reason: collision with root package name */
    private dagger.internal.d<t00.d> f50146c2 = dagger.internal.a.c(new a(this, 103));

    /* renamed from: d2  reason: collision with root package name */
    private dagger.internal.d<oi0.b> f50152d2 = dagger.internal.a.c(new a(this, 102));

    /* renamed from: e2  reason: collision with root package name */
    private dagger.internal.d<hx.l> f50158e2 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_HR_LEVEL));

    /* renamed from: f2  reason: collision with root package name */
    private dagger.internal.d<x30.j> f50164f2 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN));

    /* renamed from: g2  reason: collision with root package name */
    private dagger.internal.d<EcgReviewRemoteRepository> f50170g2 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX));

    /* renamed from: h2  reason: collision with root package name */
    private dagger.internal.d<ub0.u> f50176h2 = new a(this, 98);

    /* renamed from: i2  reason: collision with root package name */
    private dagger.internal.d<Object> f50182i2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_IRREGULAR_HEART_BEAT));

    /* renamed from: j2  reason: collision with root package name */
    private dagger.internal.d<Object> f50188j2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2));

    /* renamed from: k2  reason: collision with root package name */
    private dagger.internal.d<Object> f50194k2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_PH));

    /* renamed from: l2  reason: collision with root package name */
    private dagger.internal.d<u10.c0> f50200l2 = dagger.internal.a.c(new a(this, 150));

    /* renamed from: m2  reason: collision with root package name */
    private dagger.internal.d<u10.f0> f50206m2 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_NITRITES));

    /* renamed from: n2  reason: collision with root package name */
    private dagger.internal.d<u10.a0> f50212n2 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_LUTEINIZING_HORMONE));

    /* renamed from: o2  reason: collision with root package name */
    private dagger.internal.d<Object> f50218o2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_SPECIFIC_GRAVITY));

    /* renamed from: p2  reason: collision with root package name */
    private dagger.internal.d<Object> f50224p2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_LEUKOCYTES));

    /* renamed from: q2  reason: collision with root package name */
    private dagger.internal.d<Object> f50230q2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_HR_SD_NN));

    /* renamed from: r2  reason: collision with root package name */
    private dagger.internal.d<Object> f50236r2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_HR_RMS_SD));

    /* renamed from: s2  reason: collision with root package name */
    private dagger.internal.d<Object> f50242s2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_VASCULAR_AGE));

    /* renamed from: t2  reason: collision with root package name */
    private dagger.internal.d<Object> f50248t2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_PWV_REACHED_COUNT));

    /* renamed from: u2  reason: collision with root package name */
    private dagger.internal.d<Object> f50254u2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_VA_REACHED_COUNT));

    /* renamed from: v2  reason: collision with root package name */
    private dagger.internal.d<Object> f50260v2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_NHS_LEFT_FOOT));

    /* renamed from: w2  reason: collision with root package name */
    private dagger.internal.d<Object> f50266w2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_NHS_RIGHT_FOOT));

    /* renamed from: x2  reason: collision with root package name */
    private dagger.internal.d<Object> f50272x2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_BLOOD_GLUCOSE));

    /* renamed from: y2  reason: collision with root package name */
    private dagger.internal.d<Object> f50278y2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_GLUCOSE_PERIOD));

    /* renamed from: z2  reason: collision with root package name */
    private dagger.internal.d<Object> f50284z2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_HR_BCGIPG));
    private dagger.internal.d<Object> A2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_HR_ECG));
    private dagger.internal.d<Object> B2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_CAN));
    private dagger.internal.d<Object> C2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_NEPHRO));
    private dagger.internal.d<Object> D2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_VO2MAX_HR_MAX));
    private dagger.internal.d<Object> E2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_NHS_FEET));
    private dagger.internal.d<Object> F2 = dagger.internal.f.b(new a(this, 168));
    private dagger.internal.d<Object> G2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_INTRACELLULAR_WATER));
    private dagger.internal.d<Object> H2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_VISCERAL_FAT_RATING));
    private dagger.internal.d<Object> I2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_VASISTAS_WALKING_DOUBLE_SUPPORT));
    private dagger.internal.d<Object> J2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_VASISTAS_TYPE_WALKING_ASYMETRY));
    private dagger.internal.d<Object> K2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_FAT_FREE_MASS_SEGMENT));
    private dagger.internal.d<Object> L2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_FAT_MASS_SEGMENT));
    private dagger.internal.d<Object> M2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_MUSCLE_MASS_SEGMENT));
    private dagger.internal.d<com.withings.wiscale2.device.common.feature.u> N2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_R50KHZ_SEGMENT));
    private dagger.internal.d<Object> O2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_R5KHZ_SEGMENT));
    private dagger.internal.d<Object> P2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_R250KHZ_SEGMENT));
    private dagger.internal.d<lj0.r> Q2 = dagger.internal.a.c(new a(this, 180));
    private dagger.internal.d<lj0.g> R2 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_WALKING_STEADINESS_CLASSIFICATION));
    private dagger.internal.d<Object> S2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_SNORING_INTENSITY));
    private dagger.internal.d<Object> T2 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_IGLUCOSE_BLOOD_GLUCOSE));
    private dagger.internal.d<com.withings.device.details.automatic.activity.detection.d> U2 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_MENSTRUATION_FLOW));
    private dagger.internal.d<ax.a> V2 = new a(this, ConstantsWs.MEASURE_TYPE_CYCLE_DURATION);
    private dagger.internal.d<bx.a> W2 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_MENSTRUATION_DURATION));
    private dagger.internal.d<lj0.w> X2 = dagger.internal.a.c(new a(this, 186));
    private dagger.internal.d<lj0.b> Y2 = dagger.internal.a.c(new a(this, 187));
    private dagger.internal.d<ax.i> Z2 = dagger.internal.a.c(new a(this, 188));

    /* renamed from: a3  reason: collision with root package name */
    private dagger.internal.d<GetStepsUseCase> f50135a3 = dagger.internal.a.c(new a(this, ConstantsWs.MEASURE_TYPE_WAIST));

    /* renamed from: b3  reason: collision with root package name */
    private dagger.internal.d<x90.b> f50141b3 = dagger.internal.f.b(new a(this, ConstantsWs.MEASURE_TYPE_R6_25KHZ_SEGMENT));

    /* renamed from: c3  reason: collision with root package name */
    private dagger.internal.d<GetActiveMinutesUseCase> f50147c3 = dagger.internal.a.c(new a(this, 192));

    /* renamed from: d3  reason: collision with root package name */
    private dagger.internal.d<GetDailyUserProgressionForMeasureTypeUseCase> f50153d3 = dagger.internal.a.c(new a(this, 191));

    /* renamed from: e3  reason: collision with root package name */
    private dagger.internal.d<tt.c> f50159e3 = new a(this, 195);

    /* renamed from: f3  reason: collision with root package name */
    private dagger.internal.d<v30.g> f50165f3 = dagger.internal.a.c(new a(this, 194));

    /* renamed from: g3  reason: collision with root package name */
    private dagger.internal.d<v30.f> f50171g3 = dagger.internal.a.c(new a(this, 193));

    /* renamed from: h3  reason: collision with root package name */
    private dagger.internal.d<ft.a> f50177h3 = new a(this, 196);

    /* renamed from: i3  reason: collision with root package name */
    private dagger.internal.d<lb0.l> f50183i3 = new a(this, ConstantsWs.MEASURE_TYPE_EDA_LEFT_FOOT);

    /* renamed from: j3  reason: collision with root package name */
    private dagger.internal.d<ch0.g> f50189j3 = new a(this, ConstantsWs.MEASURE_TYPE_EDA_RIGHT_FOOT);

    /* renamed from: k3  reason: collision with root package name */
    private dagger.internal.d<wi0.c> f50195k3 = new a(this, ConstantsWs.MEASURE_TYPE_DURATION_MEDIUM_HIGH_ACTIVITY);

    /* renamed from: l3  reason: collision with root package name */
    private dagger.internal.d<ih0.e> f50201l3 = new a(this, 200);

    /* renamed from: m3  reason: collision with root package name */
    private dagger.internal.d<il.a> f50207m3 = dagger.internal.a.c(new a(this, 202));

    /* renamed from: n3  reason: collision with root package name */
    private dagger.internal.d<mc0.b> f50213n3 = new a(this, 201);

    /* renamed from: o3  reason: collision with root package name */
    private dagger.internal.d<vh0.d> f50219o3 = new a(this, 203);

    /* renamed from: p3  reason: collision with root package name */
    private dagger.internal.d<rg.b> f50225p3 = dagger.internal.a.c(new a(this, 204));

    /* renamed from: q3  reason: collision with root package name */
    private dagger.internal.d<c90.b> f50231q3 = dagger.internal.a.c(new a(this, 205));

    /* renamed from: r3  reason: collision with root package name */
    private dagger.internal.d<zi0.a> f50237r3 = dagger.internal.a.c(new a(this, 206));

    /* renamed from: s3  reason: collision with root package name */
    private dagger.internal.d<xg0.b> f50243s3 = dagger.internal.a.c(new a(this, 207));

    /* renamed from: t3  reason: collision with root package name */
    private dagger.internal.d<fh0.g> f50249t3 = dagger.internal.f.b(new a(this, 208));

    /* renamed from: u3  reason: collision with root package name */
    private dagger.internal.d<ClinicalStudySuggestionRepository> f50255u3 = dagger.internal.a.c(new a(this, 209));

    /* renamed from: v3  reason: collision with root package name */
    private dagger.internal.d<WebRadiosRemoteRepository> f50261v3 = dagger.internal.a.c(new a(this, 210));

    /* renamed from: w3  reason: collision with root package name */
    private dagger.internal.d<com.withings.device.setup.android.setup.a> f50267w3 = dagger.internal.a.c(new a(this, 212));

    /* renamed from: x3  reason: collision with root package name */
    private dagger.internal.d<jo.q0> f50273x3 = dagger.internal.a.c(new a(this, 211));

    /* renamed from: y3  reason: collision with root package name */
    private dagger.internal.d<DeviceRemoteRepository> f50279y3 = dagger.internal.a.c(new a(this, 213));

    /* renamed from: z3  reason: collision with root package name */
    private dagger.internal.d<NerveHealthNative> f50285z3 = dagger.internal.a.c(new a(this, 214));
    private dagger.internal.d<th0.k> A3 = dagger.internal.a.c(new a(this, 215));
    private dagger.internal.d<ax.h> B3 = dagger.internal.a.c(new a(this, 216));
    private dagger.internal.d<ConsumableRemoteRepository> C3 = dagger.internal.a.c(new a(this, 217));
    private dagger.internal.d<fl.i> D3 = dagger.internal.a.c(new a(this, 218));
    private dagger.internal.d<r70.a> E3 = dagger.internal.a.c(new a(this, 219));
    private dagger.internal.d<com.withings.device.details.scale.b> F3 = dagger.internal.a.c(new a(this, 220));
    private dagger.internal.d<MedicalReportRemoteRepository> G3 = dagger.internal.a.c(new a(this, 221));
    private dagger.internal.d<u60.a> H3 = dagger.internal.a.c(new a(this, 222));
    private dagger.internal.d<hx.c> I3 = dagger.internal.a.c(new a(this, 223));
    private dagger.internal.d<om.b> J3 = dagger.internal.a.c(new a(this, 224));
    private dagger.internal.d<hi.a> K3 = dagger.internal.a.c(new a(this, 226));
    private dagger.internal.d<mi.a> L3 = dagger.internal.a.c(new a(this, 225));
    private dagger.internal.d<cz.f0> M3 = dagger.internal.a.c(new a(this, 228));
    private dagger.internal.d<cz.d> N3 = dagger.internal.a.c(new a(this, 229));
    private dagger.internal.d<cz.y> O3 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGSHAREID));
    private dagger.internal.d<cz.t> P3 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_SHARINGDELERROR));
    private dagger.internal.d<cz.v> Q3 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_SHARINGGETERROR));
    private dagger.internal.d<cz.i> R3 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_ACCOUNTCREATERROR));
    private dagger.internal.d<cz.a> S3 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGACCOUNTPARAMS));
    private dagger.internal.d<cz.p> T3 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGMACADDRESS));
    private dagger.internal.d<cz.m> U3 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN));
    private dagger.internal.d<cz.f> V3 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_DEVASSOCERROR));
    private dagger.internal.d<cz.x> W3 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGACCOUNTID));
    private dagger.internal.d<cz.a0> X3 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_UNVERIFIED_SESSION));
    private dagger.internal.d<cz.b0> Y3 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGASSOCID));
    private dagger.internal.d<cz.c0> Z3 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGTZNAME));

    /* renamed from: a4  reason: collision with root package name */
    private dagger.internal.d<cz.g0> f50136a4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGOFFSET));

    /* renamed from: b4  reason: collision with root package name */
    private dagger.internal.d<cz.n> f50142b4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGDEVICEID));

    /* renamed from: c4  reason: collision with root package name */
    private dagger.internal.d<cz.d0> f50148c4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGLIMIT));

    /* renamed from: d4  reason: collision with root package name */
    private dagger.internal.d<cz.q> f50154d4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_MISSING));

    /* renamed from: e4  reason: collision with root package name */
    private dagger.internal.d<cz.u> f50160e4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGMEASTYPE));

    /* renamed from: f4  reason: collision with root package name */
    private dagger.internal.d<cz.z> f50166f4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGUSERID));

    /* renamed from: g4  reason: collision with root package name */
    private dagger.internal.d<cz.e0> f50172g4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGDEVICETYPE));

    /* renamed from: h4  reason: collision with root package name */
    private dagger.internal.d<cz.c> f50178h4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT));

    /* renamed from: i4  reason: collision with root package name */
    private dagger.internal.d<dz.b> f50184i4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_NODATAFOUND));

    /* renamed from: j4  reason: collision with root package name */
    private dagger.internal.d<cz.w> f50190j4 = dagger.internal.a.c(new a(this, 250));

    /* renamed from: k4  reason: collision with root package name */
    private dagger.internal.d<cz.e> f50196k4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGBATTERYLVL));

    /* renamed from: l4  reason: collision with root package name */
    private dagger.internal.d<cz.s> f50202l4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED));

    /* renamed from: m4  reason: collision with root package name */
    private dagger.internal.d<cz.k> f50208m4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_NOREPOUSER));

    /* renamed from: n4  reason: collision with root package name */
    private dagger.internal.d<cz.j> f50214n4 = dagger.internal.a.c(new a(this, 255));

    /* renamed from: o4  reason: collision with root package name */
    private dagger.internal.d<cz.b> f50220o4 = dagger.internal.a.c(new a(this, 256));

    /* renamed from: p4  reason: collision with root package name */
    private dagger.internal.d<cz.g> f50226p4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_ALREADYACTIVATED));

    /* renamed from: q4  reason: collision with root package name */
    private dagger.internal.d<cz.o> f50232q4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGMAINTDATA));

    /* renamed from: r4  reason: collision with root package name */
    private dagger.internal.d<cz.h> f50238r4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_TOOMANYASSOCIATIONS));

    /* renamed from: s4  reason: collision with root package name */
    private dagger.internal.d<iz.c> f50244s4 = dagger.internal.a.c(new a(this, 227));

    /* renamed from: t4  reason: collision with root package name */
    private dagger.internal.d<nu.a> f50250t4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGDEVTYPE));

    /* renamed from: u4  reason: collision with root package name */
    private dagger.internal.d<gu.b> f50256u4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGSESSIONTYPE));

    /* renamed from: v4  reason: collision with root package name */
    private dagger.internal.d<hu.a> f50262v4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_USERISPRIMARY));

    /* renamed from: w4  reason: collision with root package name */
    private dagger.internal.d<nu.c> f50268w4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_NOPRIMARYUSER));

    /* renamed from: x4  reason: collision with root package name */
    private dagger.internal.d<ax.e> f50274x4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGEMAIL));

    /* renamed from: y4  reason: collision with root package name */
    private dagger.internal.d<t20.a> f50280y4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_TOOBIG));

    /* renamed from: z4  reason: collision with root package name */
    private dagger.internal.d<h70.c> f50286z4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGSECRET));
    private dagger.internal.d<ch0.a> A4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGFW));
    private dagger.internal.d<qh0.r> B4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_USERCREATEERROR));
    private dagger.internal.d<th0.i> C4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGBLINDCODE));
    private dagger.internal.d<qh0.i> D4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_USERUPDATEERROR));
    private dagger.internal.d<qh0.h> E4 = dagger.internal.a.c(new a(this, 272));
    private dagger.internal.d<qh0.a> F4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_NOPWDUPDATECODE));
    private dagger.internal.d<qh0.q> G4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_MEASNOTSHARED));
    private dagger.internal.d<qh0.t> H4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGSESSIONDURATION));
    private dagger.internal.d<qh0.o> I4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGASSOCNAME));
    private dagger.internal.d<qh0.g> J4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_UNAUTHORIZED));
    private dagger.internal.d<qh0.p> K4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_FILEERROR));
    private dagger.internal.d<qh0.b> L4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_NOHEIGHT));
    private dagger.internal.d<qh0.u> M4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_ACCOUNTUPDATEERROR));
    private dagger.internal.d<qh0.j> N4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_MEASUPDATEERROR));
    private dagger.internal.d<qh0.e> O4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_ASSOCUPDATEERROR));
    private dagger.internal.d<qh0.s> P4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGTOKEN));
    private dagger.internal.d<qh0.f> Q4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGAPPLI));
    private dagger.internal.d<qh0.n> R4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGVERSION));
    private dagger.internal.d<qh0.v> S4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGRELATION));
    private dagger.internal.d<qh0.k> T4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_ACCOUNTACTIVATIONERROR));
    private dagger.internal.d<y60.c> U4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGAPPLICATIONTYPE));
    private dagger.internal.d<w60.a> V4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGAPPLICATIONCTX));
    private dagger.internal.d<w60.b> W4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_TOOMANYSHARINGS));
    private dagger.internal.d<com.withings.paywall.a> X4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_IPUSHERROR));
    private dagger.internal.d<com.withings.paywall.t> Y4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_WRONGCONTEXT));
    private dagger.internal.d<com.withings.paywall.c> Z4 = dagger.internal.a.c(new a(this, ConstantsWs.WS_STATUS_TWITTERROR));

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
    /* loaded from: classes4.dex */
    public static final class a<T> implements dagger.internal.d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final b0 f50287a;

        /* renamed from: b  reason: collision with root package name */
        private final int f50288b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* renamed from: com.withings.wiscale2.b0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C0680a implements c70.e {
            C0680a() {
            }

            @Override // c70.e
            public final c70.c a(Device device) {
                a aVar = a.this;
                return new c70.c(device, (vr.d) aVar.f50287a.f50246t0.get(), (r70.c) aVar.f50287a.T0.get(), bg.a.a());
            }
        }

        a(b0 b0Var, int i11) {
            this.f50287a = b0Var;
            this.f50288b = i11;
        }

        /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, ah.g] */
        /* JADX WARN: Type inference failed for: r11v10, types: [ah.f, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, ah.h] */
        /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, ah.i] */
        /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, ah.j] */
        /* JADX WARN: Type inference failed for: r15v6, types: [ah.k, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r16v24, types: [ah.l, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r17v5, types: [java.lang.Object, ah.m] */
        /* JADX WARN: Type inference failed for: r18v4, types: [ah.o, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r19v3, types: [ah.p, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v231, types: [t10.e, T] */
        /* JADX WARN: Type inference failed for: r20v1, types: [ah.q, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r21v2, types: [ah.r, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r22v1, types: [ah.s, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r22v2, types: [ah.u, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r23v1, types: [ah.t, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r24v1, types: [ah.u, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r25v1, types: [ah.v, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.Object, ah.w] */
        /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.Object, ah.y] */
        /* JADX WARN: Type inference failed for: r28v1, types: [ah.b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r29v1, types: [ah.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v111, types: [java.lang.Object, com.withings.wiscale2.account.password.b] */
        /* JADX WARN: Type inference failed for: r2v115, types: [java.lang.Object, com.android.billingclient.api.v] */
        /* JADX WARN: Type inference failed for: r2v119, types: [java.lang.Object, com.withings.wiscale2.account.password.b] */
        /* JADX WARN: Type inference failed for: r2v3, types: [rr.a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v39, types: [T, l70.w$b] */
        /* JADX WARN: Type inference failed for: r2v94, types: [T, m70.i] */
        /* JADX WARN: Type inference failed for: r30v1, types: [ah.a0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r32v1, types: [ah.b0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r33v0, types: [ah.d, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r34v0, types: [ah.e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r35v0, types: [ah.f, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r36v0, types: [java.lang.Object, ah.g] */
        /* JADX WARN: Type inference failed for: r37v0, types: [java.lang.Object, ah.h] */
        /* JADX WARN: Type inference failed for: r38v0, types: [java.lang.Object, ah.i] */
        /* JADX WARN: Type inference failed for: r39v0, types: [ah.k, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v10, types: [vf.c, T] */
        /* JADX WARN: Type inference failed for: r3v19, types: [com.withings.account.core.repositories.AccountSessionRepository, ag.g, T] */
        /* JADX WARN: Type inference failed for: r3v20, types: [com.withings.account.core.repositories.AccountSessionRepository, ag.a, T] */
        /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object, jq.a] */
        /* JADX WARN: Type inference failed for: r40v0, types: [ah.l, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r41v0, types: [java.lang.Object, ah.m] */
        /* JADX WARN: Type inference failed for: r42v0, types: [ah.c0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r44v0, types: [java.lang.Object, a3.b] */
        /* JADX WARN: Type inference failed for: r45v0, types: [ah.e0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r46v0, types: [ah.o, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r47v0, types: [ah.p, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v22, types: [ah.b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v22, types: [ah.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v20, types: [ah.d, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v11, types: [ah.e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, ah.x] */
        private T b() {
            com.withings.wiscale2.utils.fcmlegacy.a aVar;
            p.a aVar2 = fl.p.f67672b;
            b0 b0Var = this.f50287a;
            int i11 = this.f50288b;
            switch (i11) {
                case 0:
                    WiscaleDBH wiscaleDBH = (WiscaleDBH) b0Var.f50245t.get();
                    kotlin.jvm.internal.u.j(wiscaleDBH, "wiscaleDBH");
                    return (T) kn.e.o(new mn.a(new mn.c(wiscaleDBH)));
                case 1:
                    return (T) WiscaleDBH.m(gk0.c.a(b0Var.f50131a));
                case 2:
                    return (T) new vr.e((PlatformFeatureRepository) b0Var.f50263w.get(), new Object(), b0.T4(b0Var), b0.S4(b0Var));
                case 3:
                    T t11 = (T) RoomPlatformFeatureRepository.Companion.init(b0.i7(b0Var));
                    ah.p.d(t11);
                    return t11;
                case 4:
                    return (T) new com.withings.wiscale2.data.s(gk0.c.a(b0Var.f50131a));
                case 5:
                    final s00.c gsonHandler = (s00.c) b0Var.f50269x.get();
                    final d.a wsDelegate = (d.a) b0Var.f50228q0.get();
                    final u70.a backgroundManager = (u70.a) b0Var.f50150d0.get();
                    s00.e sessionIdProvider = (s00.e) b0Var.f50228q0.get();
                    final BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor = (BlockBackgroundCallsInterceptor) b0Var.f50180i0.get();
                    kotlin.jvm.internal.u.j(gsonHandler, "gsonHandler");
                    kotlin.jvm.internal.u.j(wsDelegate, "wsDelegate");
                    kotlin.jvm.internal.u.j(backgroundManager, "backgroundManager");
                    kotlin.jvm.internal.u.j(sessionIdProvider, "sessionIdProvider");
                    kotlin.jvm.internal.u.j(blockBackgroundCallsInterceptor, "blockBackgroundCallsInterceptor");
                    return (T) new q00.g(gsonHandler, wsDelegate, new g.b() { // from class: r00.e
                        @Override // q00.g.b
                        public final g.a a() {
                            d.a wsDelegate2 = wsDelegate;
                            u.j(wsDelegate2, "$wsDelegate");
                            s00.c gsonHandler2 = gsonHandler;
                            u.j(gsonHandler2, "$gsonHandler");
                            u70.a backgroundManager2 = backgroundManager;
                            u.j(backgroundManager2, "$backgroundManager");
                            BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor2 = blockBackgroundCallsInterceptor;
                            u.j(blockBackgroundCallsInterceptor2, "$blockBackgroundCallsInterceptor");
                            return new q00.c(blockBackgroundCallsInterceptor2, gsonHandler2, wsDelegate2, backgroundManager2);
                        }
                    }, sessionIdProvider);
                case 6:
                    return (T) new q00.a(0);
                case 7:
                    return (T) new o2((g1) b0Var.f50275y.get(), (vf.c) b0Var.f50144c0.get(), (dg.c) b0Var.getActiveSessionProvider(), (AccountSessionRepository) b0Var.f50216o0.get(), b0Var.R8());
                case 8:
                    return (T) new g1(b0.W4(b0Var), gk0.c.a(b0Var.f50131a));
                case 9:
                    tf.a accountRepository = (tf.a) b0Var.B.get();
                    tf.c temporaryLoginAccountRepository = (tf.c) b0Var.D.get();
                    z90.b accountManagerListener = (z90.b) b0Var.f50138b0.get();
                    kotlin.jvm.internal.u.j(accountRepository, "accountRepository");
                    kotlin.jvm.internal.u.j(temporaryLoginAccountRepository, "temporaryLoginAccountRepository");
                    kotlin.jvm.internal.u.j(accountManagerListener, "accountManagerListener");
                    ?? r32 = (T) new vf.c(temporaryLoginAccountRepository, accountRepository);
                    vf.c.f103617d = r32;
                    r32.l(accountManagerListener);
                    return r32;
                case 10:
                    return (T) b0.n4(b0Var);
                case 11:
                    return (T) b0.l7(b0Var);
                case 12:
                    return (T) new AndroidKeyStoreCipher();
                case 13:
                    T localTemporaryLoginAccountRepository = (T) ((wf.d) b0Var.C.get());
                    kotlin.jvm.internal.u.j(localTemporaryLoginAccountRepository, "localTemporaryLoginAccountRepository");
                    return localTemporaryLoginAccountRepository;
                case 14:
                    return (T) new wf.d();
                case 15:
                    Context a11 = gk0.c.a(b0Var.f50131a);
                    s20.a w42 = b0.w4(b0Var);
                    ti.d insightStateRepository = (ti.d) b0Var.G.get();
                    l70.w unitPreferencesRepository = (l70.w) b0Var.H.get();
                    h10.a notificationsPreferencesRepository = (h10.a) b0Var.J.get();
                    o60.g setupTutorialRepository = (o60.g) b0Var.K.get();
                    j90.h weightOptionsRepository = (j90.h) b0Var.L.get();
                    j90.b bodyCompOptionsRepository = (j90.b) b0Var.M.get();
                    k00.b nerveHealthOptionsRepository = (k00.b) b0Var.N.get();
                    c90.a bodyCompositionRangeRawRepository = (c90.a) b0Var.O.get();
                    vr.c featureTagsLastUpdateRepository = (vr.c) b0Var.P.get();
                    com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
                    is.a v42 = b0.v4(b0Var);
                    x60.a tabsIndicationStateRepository = (x60.a) b0Var.R.get();
                    pw.a clearRemoteLastUpdateUseCase = (pw.a) ((a) b0Var.T).get();
                    ot.k healthScoreLocalLastUpdateRepository = (ot.k) b0Var.U.get();
                    v20.d predictionLocalLastUpdateRepository = (v20.d) b0Var.V.get();
                    cz.l healthScoreInfoCardRepository = (cz.l) b0Var.W.get();
                    ex.a lastCycleSyncDataStoreRepository = (ex.a) ((a) b0Var.X).get();
                    qg0.a heroRepository = (qg0.a) b0Var.Y.get();
                    hw.a healthInsightsDatastore = (hw.a) b0Var.Z.get();
                    p60.c explanationsRepository = (p60.c) b0Var.f50132a0.get();
                    kotlin.jvm.internal.u.j(insightStateRepository, "insightStateRepository");
                    kotlin.jvm.internal.u.j(unitPreferencesRepository, "unitPreferencesRepository");
                    kotlin.jvm.internal.u.j(notificationsPreferencesRepository, "notificationsPreferencesRepository");
                    kotlin.jvm.internal.u.j(setupTutorialRepository, "setupTutorialRepository");
                    kotlin.jvm.internal.u.j(weightOptionsRepository, "weightOptionsRepository");
                    kotlin.jvm.internal.u.j(bodyCompOptionsRepository, "bodyCompOptionsRepository");
                    kotlin.jvm.internal.u.j(nerveHealthOptionsRepository, "nerveHealthOptionsRepository");
                    kotlin.jvm.internal.u.j(bodyCompositionRangeRawRepository, "bodyCompositionRangeRawRepository");
                    kotlin.jvm.internal.u.j(featureTagsLastUpdateRepository, "featureTagsLastUpdateRepository");
                    kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
                    kotlin.jvm.internal.u.j(tabsIndicationStateRepository, "tabsIndicationStateRepository");
                    kotlin.jvm.internal.u.j(clearRemoteLastUpdateUseCase, "clearRemoteLastUpdateUseCase");
                    kotlin.jvm.internal.u.j(healthScoreLocalLastUpdateRepository, "healthScoreLocalLastUpdateRepository");
                    kotlin.jvm.internal.u.j(predictionLocalLastUpdateRepository, "predictionLocalLastUpdateRepository");
                    kotlin.jvm.internal.u.j(healthScoreInfoCardRepository, "healthScoreInfoCardRepository");
                    kotlin.jvm.internal.u.j(lastCycleSyncDataStoreRepository, "lastCycleSyncDataStoreRepository");
                    kotlin.jvm.internal.u.j(heroRepository, "heroRepository");
                    kotlin.jvm.internal.u.j(healthInsightsDatastore, "healthInsightsDatastore");
                    kotlin.jvm.internal.u.j(explanationsRepository, "explanationsRepository");
                    return (T) new z90.b(a11, w42, insightStateRepository, unitPreferencesRepository, notificationsPreferencesRepository, setupTutorialRepository, weightOptionsRepository, bodyCompOptionsRepository, nerveHealthOptionsRepository, bodyCompositionRangeRawRepository, featureTagsLastUpdateRepository, roomDaoProvider, v42, tabsIndicationStateRepository, clearRemoteLastUpdateUseCase, healthScoreLocalLastUpdateRepository, predictionLocalLastUpdateRepository, healthScoreInfoCardRepository, lastCycleSyncDataStoreRepository, heroRepository, healthInsightsDatastore, explanationsRepository);
                case 16:
                    return (T) new o20.a(gk0.c.a(b0Var.f50131a));
                case 17:
                    return (T) new ti.e((ti.a) b0Var.F.get());
                case 18:
                    androidx.compose.material.i1 i1Var = b0Var.f50143c;
                    Context a12 = gk0.c.a(b0Var.f50131a);
                    i1Var.getClass();
                    return (T) new ti.a(a12);
                case 19:
                    Context a13 = gk0.c.a(b0Var.f50131a);
                    int i12 = w.c.f78849i;
                    ?? r22 = (T) new w.b(w.c.b.a(a13));
                    w.a.b(r22);
                    return r22;
                case 20:
                    T notificationsPreferencesRepository2 = (T) ((f10.a) b0Var.I.get());
                    kotlin.jvm.internal.u.j(notificationsPreferencesRepository2, "notificationsPreferencesRepository");
                    return notificationsPreferencesRepository2;
                case 21:
                    return (T) new f10.a(gk0.c.a(b0Var.f50131a));
                case 22:
                    return (T) new o60.a(gk0.c.a(b0Var.f50131a));
                case 23:
                    return (T) new j90.e(gk0.c.a(b0Var.f50131a));
                case 24:
                    return (T) new j90.c(gk0.c.a(b0Var.f50131a));
                case 25:
                    return (T) new h00.b(gk0.c.a(b0Var.f50131a));
                case 26:
                    return (T) new t80.a(gk0.c.a(b0Var.f50131a));
                case 27:
                    return (T) PlatformFeatureModule_ProvideFeatureTagsLastUpdateRepositoryFactory.provideFeatureTagsLastUpdateRepository(gk0.c.a(b0Var.f50131a), (PlatformFeatureRepository) b0Var.f50263w.get());
                case 28:
                    return (T) new cs.a(gk0.c.a(b0Var.f50131a));
                case 29:
                    return (T) new p60.a(gk0.c.a(b0Var.f50131a));
                case 30:
                    return (T) new pw.a((ow.a) b0Var.S.get());
                case 31:
                    return (T) new nw.b(gk0.c.a(b0Var.f50131a));
                case 32:
                    return (T) new ot.b(gk0.c.a(b0Var.f50131a));
                case 33:
                    return (T) new v20.b(gk0.c.a(b0Var.f50131a));
                case 34:
                    return (T) new az.s(gk0.c.a(b0Var.f50131a));
                case 35:
                    com.withings.wiscale2.account.password.b bVar = b0Var.f50149d;
                    Context a14 = gk0.c.a(b0Var.f50131a);
                    bVar.getClass();
                    return (T) new kx.a(a14);
                case 36:
                    return (T) new qg0.b(gk0.c.a(b0Var.f50131a));
                case 37:
                    return (T) new hw.a(gk0.c.a(b0Var.f50131a));
                case 38:
                    return (T) new p60.d(gk0.c.a(b0Var.f50131a));
                case 39:
                    vf.c accountManager = (vf.c) b0Var.f50144c0.get();
                    yf.d healthmateSessionDAO = (yf.d) b0Var.f50168g0.get();
                    ak0.a authenticationService = dagger.internal.a.a(b0Var.f50174h0);
                    ag.f L6 = b0.L6(b0Var);
                    y90.b q42 = b0.q4(b0Var);
                    cg.l P8 = b0Var.P8();
                    kotlin.jvm.internal.u.j(accountManager, "accountManager");
                    kotlin.jvm.internal.u.j(healthmateSessionDAO, "healthmateSessionDAO");
                    kotlin.jvm.internal.u.j(authenticationService, "authenticationService");
                    if (wr.b.c(FeatureFlag.f39120n0)) {
                        Object obj = authenticationService.get();
                        kotlin.jvm.internal.u.i(obj, "get(...)");
                        ?? r33 = (T) new ag.a(new ag.c(healthmateSessionDAO, accountManager, (AuthenticationService) obj, q42, P8), L6, c.f50304a);
                        AccountSessionRepository.a.b(r33);
                        return r33;
                    }
                    ?? r34 = (T) new ag.g(L6);
                    AccountSessionRepository.a.b(r34);
                    return r34;
                case 40:
                    return (T) new yf.f(b0.y7(b0Var), (yf.a) b0Var.f50162f0.get());
                case 41:
                    return (T) new yf.a(gk0.c.a(b0Var.f50131a), dagger.internal.a.a(b0Var.f50156e0), dagger.internal.a.a(b0Var.f50144c0), (KeyStoreCipher) b0Var.f50281z.get());
                case 42:
                    x1 M6 = b0.M6(b0Var);
                    u70.a backgroundManager2 = (u70.a) b0Var.f50150d0.get();
                    kotlin.jvm.internal.u.j(backgroundManager2, "backgroundManager");
                    T t12 = (T) Webservices.init(M6, backgroundManager2);
                    kotlin.jvm.internal.u.i(t12, "init(...)");
                    return t12;
                case 43:
                    T t13 = (T) u70.a.c(gk0.b.a(b0Var.f50131a));
                    kotlin.jvm.internal.u.i(t13, "init(...)");
                    return t13;
                case 44:
                    mw.a.b(gk0.c.a(b0Var.f50131a));
                    T t14 = (T) AuthenticationService.Companion.getAuthenticationService();
                    ah.p.d(t14);
                    return t14;
                case 45:
                    s00.d wsRetrofit1NoAuth = (s00.d) b0Var.f50186j0.get();
                    s00.d wsRetrofit2NoAuth = (s00.d) b0Var.f50198l0.get();
                    kotlin.jvm.internal.u.j(wsRetrofit1NoAuth, "wsRetrofit1NoAuth");
                    kotlin.jvm.internal.u.j(wsRetrofit2NoAuth, "wsRetrofit2NoAuth");
                    return (T) new RetrofitSessionRemoteRepository(wsRetrofit1NoAuth, wsRetrofit2NoAuth, null, 4, null);
                case 46:
                    s00.c gsonHandler2 = (s00.c) b0Var.f50269x.get();
                    d.a wsDelegate2 = (d.a) b0Var.f50275y.get();
                    u70.a backgroundManager3 = (u70.a) b0Var.f50150d0.get();
                    BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor2 = (BlockBackgroundCallsInterceptor) b0Var.f50180i0.get();
                    kotlin.jvm.internal.u.j(gsonHandler2, "gsonHandler");
                    kotlin.jvm.internal.u.j(wsDelegate2, "wsDelegate");
                    kotlin.jvm.internal.u.j(backgroundManager3, "backgroundManager");
                    kotlin.jvm.internal.u.j(blockBackgroundCallsInterceptor2, "blockBackgroundCallsInterceptor");
                    return (T) new q00.g(gsonHandler2, wsDelegate2, new r00.a(wsDelegate2, gsonHandler2, backgroundManager3, blockBackgroundCallsInterceptor2), null);
                case 47:
                    u70.a backgroundManager4 = (u70.a) b0Var.f50150d0.get();
                    kotlin.jvm.internal.u.j(backgroundManager4, "backgroundManager");
                    return (T) new BlockBackgroundCallsInterceptorImpl(backgroundManager4);
                case 48:
                    final s00.c gsonHandler3 = (s00.c) b0Var.f50269x.get();
                    final d.a wsDelegate3 = (d.a) b0Var.f50275y.get();
                    final u70.a backgroundManager5 = (u70.a) b0Var.f50150d0.get();
                    final BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor3 = (BlockBackgroundCallsInterceptor) b0Var.f50180i0.get();
                    final MutexCallsCallsInterceptor mutexCallsCallsInterceptor = (MutexCallsCallsInterceptor) b0Var.f50192k0.get();
                    kotlin.jvm.internal.u.j(gsonHandler3, "gsonHandler");
                    kotlin.jvm.internal.u.j(wsDelegate3, "wsDelegate");
                    kotlin.jvm.internal.u.j(backgroundManager5, "backgroundManager");
                    kotlin.jvm.internal.u.j(blockBackgroundCallsInterceptor3, "blockBackgroundCallsInterceptor");
                    kotlin.jvm.internal.u.j(mutexCallsCallsInterceptor, "mutexCallsCallsInterceptor");
                    return (T) new q00.g(gsonHandler3, wsDelegate3, new g.b() { // from class: r00.b
                        @Override // q00.g.b
                        public final g.a a() {
                            d.a wsDelegate4 = wsDelegate3;
                            u.j(wsDelegate4, "$wsDelegate");
                            s00.c gsonHandler4 = gsonHandler3;
                            u.j(gsonHandler4, "$gsonHandler");
                            u70.a backgroundManager6 = backgroundManager5;
                            u.j(backgroundManager6, "$backgroundManager");
                            BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor4 = blockBackgroundCallsInterceptor3;
                            u.j(blockBackgroundCallsInterceptor4, "$blockBackgroundCallsInterceptor");
                            MutexCallsCallsInterceptor mutexCallsCallsInterceptor2 = mutexCallsCallsInterceptor;
                            u.j(mutexCallsCallsInterceptor2, "$mutexCallsCallsInterceptor");
                            return new q00.e(blockBackgroundCallsInterceptor4, mutexCallsCallsInterceptor2, gsonHandler4, wsDelegate4, backgroundManager6);
                        }
                    }, null);
                case 49:
                    return (T) new MutexCallsCallsInterceptorImpl();
                case 50:
                    com.withings.wiscale2.utils.fcmlegacy.a.f62171d = new com.withings.wiscale2.utils.fcmlegacy.a();
                    aVar = com.withings.wiscale2.utils.fcmlegacy.a.f62171d;
                    T t15 = (T) aVar;
                    if (t15 != null) {
                        return t15;
                    }
                    kotlin.jvm.internal.u.s("instance");
                    throw null;
                case 51:
                    return (T) new fj0.e(gk0.b.a(b0Var.f50131a));
                case 52:
                    final s00.c gsonHandler4 = (s00.c) b0Var.f50269x.get();
                    final d.a wsDelegate4 = (d.a) b0Var.f50228q0.get();
                    final u70.a backgroundManager6 = (u70.a) b0Var.f50150d0.get();
                    s00.e sessionIdProvider2 = (s00.e) b0Var.f50228q0.get();
                    final BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor4 = (BlockBackgroundCallsInterceptor) b0Var.f50180i0.get();
                    final MutexCallsCallsInterceptor mutexCallsCallsInterceptor2 = (MutexCallsCallsInterceptor) b0Var.f50192k0.get();
                    kotlin.jvm.internal.u.j(gsonHandler4, "gsonHandler");
                    kotlin.jvm.internal.u.j(wsDelegate4, "wsDelegate");
                    kotlin.jvm.internal.u.j(backgroundManager6, "backgroundManager");
                    kotlin.jvm.internal.u.j(sessionIdProvider2, "sessionIdProvider");
                    kotlin.jvm.internal.u.j(blockBackgroundCallsInterceptor4, "blockBackgroundCallsInterceptor");
                    kotlin.jvm.internal.u.j(mutexCallsCallsInterceptor2, "mutexCallsCallsInterceptor");
                    return (T) new q00.g(gsonHandler4, wsDelegate4, new g.b() { // from class: r00.d
                        @Override // q00.g.b
                        public final g.a a() {
                            d.a wsDelegate5 = wsDelegate4;
                            u.j(wsDelegate5, "$wsDelegate");
                            s00.c gsonHandler5 = gsonHandler4;
                            u.j(gsonHandler5, "$gsonHandler");
                            u70.a backgroundManager7 = backgroundManager6;
                            u.j(backgroundManager7, "$backgroundManager");
                            BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor5 = blockBackgroundCallsInterceptor4;
                            u.j(blockBackgroundCallsInterceptor5, "$blockBackgroundCallsInterceptor");
                            MutexCallsCallsInterceptor mutexCallsCallsInterceptor3 = mutexCallsCallsInterceptor2;
                            u.j(mutexCallsCallsInterceptor3, "$mutexCallsCallsInterceptor");
                            return new q00.e(blockBackgroundCallsInterceptor5, mutexCallsCallsInterceptor3, gsonHandler5, wsDelegate5, backgroundManager7);
                        }
                    }, sessionIdProvider2);
                case 53:
                    Context a15 = gk0.c.a(b0Var.f50131a);
                    t70.e userDao = (t70.e) b0Var.f50252u0.get();
                    kotlin.jvm.internal.u.j(userDao, "userDao");
                    ?? r23 = (T) m70.i.j(a15, userDao);
                    r23.o(new cm.b(a15));
                    return r23;
                case 54:
                    WiscaleDBH wiscaleDBH2 = (WiscaleDBH) b0Var.f50245t.get();
                    kotlin.jvm.internal.u.j(wiscaleDBH2, "wiscaleDBH");
                    return (T) new t70.c(new t70.d(wiscaleDBH2));
                case 55:
                    T t16 = (T) sw.a.z();
                    kotlin.jvm.internal.u.i(t16, "get(...)");
                    return t16;
                case 56:
                    return (T) zx.j.f111082d.a();
                case 57:
                    return (T) new zx.m(b0Var.q8(), null, null);
                case 58:
                    return (T) new ql.b(gk0.c.a(b0Var.f50131a));
                case 59:
                    return (T) new RoomDeviceScreensRepository((RoomDeviceScreenDao) b0Var.A0.get(), (RoomDeviceScreenContentDao) b0Var.B0.get(), (RoomDeviceScreensGroupDao) b0Var.C0.get(), b0.R7(b0Var), new UpdateScreensStateAndOrder());
                case 60:
                    return (T) new RoomDeviceScreenDao(b0.P4(b0Var));
                case 61:
                    return (T) new RoomDeviceScreenContentDao(b0.O4(b0Var));
                case 62:
                    return (T) new RoomDeviceScreensGroupDao(b0.R4(b0Var));
                case 63:
                    return (T) DeviceScreenModule_ProvideRemoteRepositoryFactory.provideRemoteRepository(b0Var.q8());
                case 64:
                    jx.a aVar3 = b0Var.f50155e;
                    mx.a q62 = b0.q6(b0Var);
                    sw.a measureDAO = (sw.a) b0Var.f50264w0.get();
                    nx.b b72 = b0.b7(b0Var);
                    sh0.a m62 = b0.m6(b0Var);
                    HealthAttributeRemoteRepository healthAttributeRemoteRepository = (HealthAttributeRemoteRepository) b0Var.F0.get();
                    NoteRemoteRepository noteRemoteRepository = (NoteRemoteRepository) b0Var.G0.get();
                    aVar3.getClass();
                    kotlin.jvm.internal.u.j(measureDAO, "measureDAO");
                    kotlin.jvm.internal.u.j(healthAttributeRemoteRepository, "healthAttributeRemoteRepository");
                    kotlin.jvm.internal.u.j(noteRemoteRepository, "noteRemoteRepository");
                    return (T) new kx.c(noteRemoteRepository, healthAttributeRemoteRepository, q62, new mx.e(), new HealthAttributeWebServiceMapper(q62), b72, new nx.f(measureDAO, q62, b72), new NoteWebServiceMapper(measureDAO, q62, b72), m62);
                case 65:
                    jx.a aVar4 = b0Var.f50155e;
                    r00.f q82 = b0Var.q8();
                    aVar4.getClass();
                    return (T) new RetrofitHealthAttributeRemoteRepository(q82, null, 2, null);
                case 66:
                    jx.a aVar5 = b0Var.f50155e;
                    r00.f q83 = b0Var.q8();
                    aVar5.getClass();
                    return (T) new RetrofitNoteRemoteRepository(q83, null, 2, null);
                case 67:
                    FactorDao factorDao = (FactorDao) b0Var.I0.get();
                    ?? obj2 = new Object();
                    kotlin.jvm.internal.u.j(factorDao, "factorDao");
                    return (T) new gr.d(factorDao, obj2);
                case 68:
                    com.withings.wiscale2.data.s roomDaoProvider2 = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
                    kotlin.jvm.internal.u.j(roomDaoProvider2, "roomDaoProvider");
                    T t17 = (T) roomDaoProvider2.j();
                    ah.p.d(t17);
                    return t17;
                case 69:
                    sw.a measureDAO2 = (sw.a) b0Var.f50264w0.get();
                    xw.b dispatchers = (xw.b) b0Var.K0.get();
                    kotlin.jvm.internal.u.j(measureDAO2, "measureDAO");
                    kotlin.jvm.internal.u.j(dispatchers, "dispatchers");
                    return (T) new zx.w(measureDAO2, dispatchers);
                case 70:
                    return (T) new xw.b();
                case 71:
                    PredictionDao predictionDao = (PredictionDao) b0Var.M0.get();
                    ?? obj3 = new Object();
                    x20.e T7 = b0.T7(b0Var);
                    kotlin.jvm.internal.u.j(predictionDao, "predictionDao");
                    return (T) new v20.h(predictionDao, obj3, T7);
                case 72:
                    com.withings.wiscale2.data.s roomDaoProvider3 = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
                    kotlin.jvm.internal.u.j(roomDaoProvider3, "roomDaoProvider");
                    T t18 = (T) roomDaoProvider3.D();
                    ah.p.d(t18);
                    return t18;
                case 73:
                    return (T) zm.c.a(gk0.c.a(b0Var.f50131a), (v20.e) b0Var.N0.get());
                case 74:
                    FactorDao dao = (FactorDao) b0Var.I0.get();
                    ?? obj4 = new Object();
                    RetrofitRemoteFactorRepository v72 = b0.v7(b0Var);
                    v20.d predictionLocalLastUpdateRepository2 = (v20.d) b0Var.V.get();
                    kotlin.jvm.internal.u.j(dao, "dao");
                    kotlin.jvm.internal.u.j(predictionLocalLastUpdateRepository2, "predictionLocalLastUpdateRepository");
                    return (T) new jr.d(dao, v72, obj4, predictionLocalLastUpdateRepository2);
                case 75:
                    return (T) new ah.n(new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), b0.y6(b0Var), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), b0.C6(b0Var), new Object(), new Object(), new Object(), new Object());
                case 76:
                    return (T) new wb0.c(aVar2.a(), new Object());
                case 77:
                    kotlin.jvm.internal.u.j((WiscaleDBH) b0Var.f50245t.get(), "wiscaleDBH");
                    return (T) ww.b.j(ww.c.m());
                case 78:
                    m70.i userManager = (m70.i) b0Var.f50258v0.get();
                    t70.e userDAO = (t70.e) b0Var.f50252u0.get();
                    kotlin.jvm.internal.u.j(userManager, "userManager");
                    kotlin.jvm.internal.u.j(userDAO, "userDAO");
                    return (T) new n70.a(userManager, userDAO);
                case 79:
                    return (T) new C0680a();
                case 80:
                    return (T) new gw.f(b0Var.q8(), null);
                case 81:
                    return (T) new SqlVasistasRepository(b0.K7(b0Var));
                case 82:
                    WiscaleDBH wiscaleDBH3 = (WiscaleDBH) b0Var.f50245t.get();
                    kotlin.jvm.internal.u.j(wiscaleDBH3, "wiscaleDBH");
                    return (T) lj0.h0.w(new lj0.m(wiscaleDBH3), new lj0.l());
                case 83:
                    return (T) new RoomPatientSessionRepository(b0.e7(b0Var));
                case 84:
                    return (T) new RoomGpsLocationRepository((GpsLocationDao) b0Var.Z0.get(), new GpsLocationEntityMapper(), b0.S7(b0Var));
                case 85:
                    return (T) new GpsLocationDao(b0.x7(b0Var));
                case 86:
                    return (T) LocationProviderModule_ProvideGpsLocationRemoteRepositoryFactory.provideGpsLocationRemoteRepository(b0Var.q8());
                case 87:
                    return (T) new com.withings.wiscale2.device.common.feature.c(gk0.c.a(b0Var.f50131a), (DeviceScreensRepository) b0Var.E0.get(), (m70.i) b0Var.f50258v0.get(), (kn.e) b0Var.f50251u.get(), bg.a.a());
                case 88:
                    return (T) new ua0.a((GpsLocationRepository) b0Var.f50139b1.get(), (lj0.h0) b0Var.W0.get(), b0.B4(b0Var));
                case 89:
                    return (T) LocationProviderModule_ProvideComputeGpsDistanceFactory.provideComputeGpsDistance(new AndroidGpsDistanceComputer(), b0.l6(b0Var), LocationProviderModule_ProvideFilterGpsLocationWithPauseFactory.provideFilterGpsLocationWithPause());
                case 90:
                    return (T) LocationProviderModule_ProvideComputeSpeedFactory.provideComputeSpeed((ComputeGpsDistance) ((a) b0Var.f50151d1).get());
                case 91:
                    return (T) LocationProviderModule_ProvideComputePaceFactory.provideComputePace((ComputeSpeed) ((a) b0Var.f50163f1).get());
                case 92:
                    return (T) new o30.f(b0Var.V8(), b0.q7(b0Var));
                case 93:
                    com.withings.wiscale2.data.s roomDaoProvider4 = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
                    kotlin.jvm.internal.u.j(roomDaoProvider4, "roomDaoProvider");
                    return (T) new RoomHeartSignalRepository(roomDaoProvider4.g());
                case 94:
                    T t19 = (T) com.google.android.play.core.appupdate.c.a(gk0.c.a(b0Var.f50131a));
                    kotlin.jvm.internal.u.i(t19, "create(...)");
                    return t19;
                case 95:
                    com.google.android.play.core.appupdate.b manager = (com.google.android.play.core.appupdate.b) b0Var.f50187j1.get();
                    kotlin.jvm.internal.u.j(manager, "manager");
                    return (T) new lb0.d(manager);
                case ConstantsWs.MEASURE_TYPE_HORIZONTAL_RADIUS /* 96 */:
                    com.google.android.play.core.appupdate.b manager2 = (com.google.android.play.core.appupdate.b) b0Var.f50187j1.get();
                    lb0.d infoLiveData = (lb0.d) b0Var.f50193k1.get();
                    kotlin.jvm.internal.u.j(manager2, "manager");
                    kotlin.jvm.internal.u.j(infoLiveData, "infoLiveData");
                    return (T) new lb0.h(manager2, infoLiveData);
                case 97:
                    Context a16 = gk0.c.a(b0Var.f50131a);
                    com.withings.wiscale2.data.s roomDaoProvider5 = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
                    kotlin.jvm.internal.u.j(roomDaoProvider5, "roomDaoProvider");
                    return (T) new gw.j(roomDaoProvider5.r(), a16);
                case 98:
                    Context a17 = gk0.c.a(b0Var.f50131a);
                    kn.e eVar = (kn.e) b0Var.f50251u.get();
                    fl.p a18 = aVar2.a();
                    m70.i iVar = (m70.i) b0Var.f50258v0.get();
                    ReminderRepository provideReminderRepository = RemindersBinderModule_ProvideReminderRepositoryFactory.provideReminderRepository();
                    fl.p a19 = aVar2.a();
                    h70.b w52 = b0.w5(b0Var);
                    PlatformFeatureRepository platformFeatureRepository = (PlatformFeatureRepository) b0Var.f50263w.get();
                    hx.l lVar = (hx.l) b0Var.f50158e2.get();
                    x30.j jVar = (x30.j) b0Var.f50164f2.get();
                    x30.e o52 = b0.o5(b0Var);
                    u30.b V5 = b0.V5(b0Var);
                    x30.f v52 = b0.v5(b0Var);
                    ah.d0 C6 = b0.C6(b0Var);
                    ?? obj5 = new Object();
                    PartnerRemoteRepository partnerRemoteRepository = (PartnerRemoteRepository) b0Var.f50211n1.get();
                    n20.f t72 = b0.t7(b0Var);
                    n20.b Y5 = b0.Y5(b0Var);
                    return (T) new ub0.u(a17, (ch.d) ((a) b0Var.Q0).get(), obj5, C6, a18, a19, eVar, b0.u5(b0Var), (EcgReviewRemoteRepository) b0Var.f50170g2.get(), platformFeatureRepository, lVar, (t10.e) b0Var.f50217o1.get(), partnerRemoteRepository, Y5, t72, V5, o52, v52, jVar, provideReminderRepository, w52, iVar, (WorkoutManager) b0Var.f50223p1.get(), (oi0.b) b0Var.f50152d2.get(), (WorkoutCategoryManager) b0Var.K1.get());
                case 99:
                    WiscaleDBH wiscaleDBH4 = (WiscaleDBH) b0Var.f50245t.get();
                    m70.i userManager2 = (m70.i) b0Var.f50258v0.get();
                    vf.c accountManager2 = (vf.c) b0Var.f50144c0.get();
                    PartnerRemoteRepository partnerRemoteRepository2 = (PartnerRemoteRepository) b0Var.f50211n1.get();
                    Webservices webservices = (Webservices) b0Var.f50156e0.get();
                    fy.c M4 = b0.M4(b0Var);
                    kotlin.jvm.internal.u.j(wiscaleDBH4, "wiscaleDBH");
                    kotlin.jvm.internal.u.j(userManager2, "userManager");
                    kotlin.jvm.internal.u.j(accountManager2, "accountManager");
                    kotlin.jvm.internal.u.j(partnerRemoteRepository2, "partnerRemoteRepository");
                    kotlin.jvm.internal.u.j(webservices, "webservices");
                    ?? r12 = (T) new t10.e(new t10.n(new z10.b(wiscaleDBH4), userManager2), partnerRemoteRepository2, accountManager2, webservices, M4);
                    t10.e.f97966j = r12;
                    return r12;
                default:
                    throw new AssertionError(i11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // javax.inject.Provider
        public final T get() {
            t00.a aVar;
            lj0.b bVar;
            Object obj;
            T mutableSetupStateRepository;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            int i11 = this.f50288b;
            int i12 = i11 / 100;
            if (i12 != 0) {
                p.a aVar2 = fl.p.f67672b;
                b0 b0Var = this.f50287a;
                if (i12 == 1) {
                    switch (i11) {
                        case 100:
                            bVar = new RetrofitPartnerRemoteRepository(b0Var.q8(), null, 2, null);
                            return bVar;
                        case 101:
                            Context a11 = gk0.c.a(b0Var.f50131a);
                            com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
                            kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
                            T t11 = (T) WorkoutManager.Companion.init(a11, roomDaoProvider.N());
                            ah.p.d(t11);
                            return t11;
                        case 102:
                            r00.c J6 = b0.J6(b0Var);
                            qi0.i i92 = b0Var.i9();
                            qi0.h u72 = b0.u7(b0Var);
                            lg.a o82 = b0Var.o8();
                            b0Var.p8();
                            qi0.e K8 = b0Var.K8();
                            b0Var.O8();
                            return (T) new oi0.b((t00.d) b0Var.f50146c2.get(), J6, i92, u72, o82, b0.Q4(b0Var), b0Var.z8(), b0.r4(b0Var), (u70.a) b0Var.f50150d0.get(), K8, b0Var.W8(), b0.k7(b0Var));
                        case 103:
                            SyncJobManager syncJobManager = (SyncJobManager) b0Var.f50229q1.get();
                            f h62 = b0.h6(b0Var);
                            g Q6 = b0.Q6(b0Var);
                            kotlin.jvm.internal.u.j(syncJobManager, "syncJobManager");
                            aVar = new t00.a(syncJobManager, h62, Q6);
                            return aVar;
                        case 104:
                            bVar = new SyncJobManager(vh.h.l(), b0.J6(b0Var), new m6.u(6));
                            return bVar;
                        case 105:
                            return (T) new RetrofitAccountRemoteRepository(b0Var.q8(), b0.D7(b0Var), null, 4, null);
                        case 106:
                            return (T) new wf.c(gk0.c.a(b0Var.f50131a));
                        case 107:
                            return (T) b0.g7(b0Var);
                        case 108:
                            return (T) b0.f7(b0Var);
                        case 109:
                            bVar = new e.a(new ij.f(b0.Y7(b0Var)));
                            return bVar;
                        case 110:
                            bVar = new bh0.c(b0Var.q8(), null);
                            return bVar;
                        case 111:
                            return (T) new ug0.c(b0Var.S8(), b0.F6(b0Var), (r70.c) b0Var.T0.get(), (kn.e) b0Var.f50251u.get(), (PlatformFeatureRepository) b0Var.f50263w.get(), aVar2.a());
                        case 112:
                            com.withings.wiscale2.data.s roomDaoProvider2 = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
                            kotlin.jvm.internal.u.j(roomDaoProvider2, "roomDaoProvider");
                            bVar = new yb0.e(roomDaoProvider2.i());
                            return bVar;
                        case 113:
                            bVar = new kl.c(b0Var.q8(), null);
                            return bVar;
                        case 114:
                            a3.p pVar = b0Var.f50161f;
                            r00.f q82 = b0Var.q8();
                            pVar.getClass();
                            return (T) new RetrofitSignalRemoteRepository(q82, null, 2, null);
                        case 115:
                            com.withings.wiscale2.data.s roomDaoProvider3 = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
                            kotlin.jvm.internal.u.j(roomDaoProvider3, "roomDaoProvider");
                            bVar = new RoomNoteRepository(roomDaoProvider3.y());
                            return bVar;
                        case 116:
                            obj = new RetrofitRecognitionRemoteRepository(b0Var.q8(), null, 2, null);
                            return obj;
                        case 117:
                            return (T) LeaderboardModule_ProvideLeaderboardRemoteRepositoryFactory.provideLeaderboardRemoteRepository(b0Var.f50167g, b0Var.q8());
                        case 118:
                            T t12 = (T) lj0.n0.f79890b;
                            if (t12 != null) {
                                return t12;
                            }
                            kotlin.jvm.internal.u.s("instance");
                            throw null;
                        case 119:
                            WiscaleDBH wiscaleDBH = (WiscaleDBH) b0Var.f50245t.get();
                            kotlin.jvm.internal.u.j(wiscaleDBH, "wiscaleDBH");
                            ActivityAggregateManager.Companion companion = ActivityAggregateManager.Companion;
                            com.withings.util.database.b b10 = wiscaleDBH.b(ActivityAggregateDAO.class);
                            kotlin.jvm.internal.u.i(b10, "getDAO(...)");
                            T t13 = (T) companion.init((ActivityAggregateDAO) b10);
                            ah.p.d(t13);
                            return t13;
                        case 120:
                            return (T) VasistasModule_ProvideVasistasRemoteRepositoryFactory.provideVasistasRemoteRepository(b0Var.f50173h, b0Var.q8());
                        case 121:
                            bVar = new RetrofitActivityAggregateRemoteRepository(b0Var.q8(), null, 2, null);
                            return bVar;
                        case 122:
                            bVar = new RetrofitTrackRemoteRepository(b0Var.q8(), null, 2, null);
                            return bVar;
                        case 123:
                            com.withings.wiscale2.data.s roomDaoProvider4 = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
                            kotlin.jvm.internal.u.j(roomDaoProvider4, "roomDaoProvider");
                            ei0.m trackDao = roomDaoProvider4.K();
                            kotlin.jvm.internal.u.j(trackDao, "trackDao");
                            ei0.q qVar = new ei0.q(trackDao);
                            ei0.q.f65441d = qVar;
                            bVar = qVar;
                            return bVar;
                        case 124:
                            Context a12 = gk0.c.a(b0Var.f50131a);
                            WiscaleDBH wiscaleDBH2 = (WiscaleDBH) b0Var.f50245t.get();
                            kotlin.jvm.internal.u.j(wiscaleDBH2, "wiscaleDBH");
                            T t14 = (T) WorkoutCategoryManager.init(new sj0.a(wiscaleDBH2), new HealthMateWorkoutCategoryStringProvider(a12));
                            kotlin.jvm.internal.u.i(t14, "init(...)");
                            return t14;
                        case 125:
                            a3.b bVar2 = b0Var.f50179i;
                            r00.f q83 = b0Var.q8();
                            bVar2.getClass();
                            return (T) new RetrofitWorkoutCategoryRemoteRepository(q83, null, 2, null);
                        case 126:
                            bVar = new x30.c(b0Var.U8());
                            return bVar;
                        case 127:
                            return (T) new cv.a(gk0.c.a(b0Var.f50131a));
                        case 128:
                            return (T) b0.Y6(b0Var);
                        case ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY /* 129 */:
                            bVar = new yz.d(b0Var.q8(), null);
                            return bVar;
                        case 130:
                            return (T) new m0(this);
                        case ConstantsWs.MEASURE_TYPE_VHD_RESULT /* 131 */:
                            obj = new vl.h(b0.F4(b0Var), b0.G4(b0Var));
                            return obj;
                        case ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX /* 132 */:
                            WiscaleDBH wiscaleDBH3 = (WiscaleDBH) b0Var.f50245t.get();
                            kotlin.jvm.internal.u.j(wiscaleDBH3, "wiscaleDBH");
                            return (T) new wh.b(new wh.a(wiscaleDBH3));
                        case ConstantsWs.MEASURE_TYPE_PAUSE /* 133 */:
                            bVar = new xh.e(b0Var.q8());
                            return bVar;
                        case ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT /* 134 */:
                            bVar = new RetrofitFoodRemoteRepository(b0Var.q8(), null, 2, null);
                            return bVar;
                        case 135:
                            return (T) TargetModule_ProvideTargetRemoteRepositoryFactory.provideTargetRemoteRepository(b0Var.q8());
                        case ConstantsWs.MEASURE_TYPE_ECG_PR_INTERVAL_DURATION /* 136 */:
                            kt.a aVar3 = b0Var.f50185j;
                            gt.a u62 = b0.u6(b0Var);
                            aVar3.getClass();
                            return (T) new jt.a(u62);
                        case ConstantsWs.MEASURE_TYPE_ECG_QT_INTERVAL_DURATION /* 137 */:
                            kt.a aVar4 = b0Var.f50185j;
                            lt.a v62 = b0.v6(b0Var);
                            aVar4.getClass();
                            return (T) new nt.a(HealthScoreService.Companion.create(v62));
                        case ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION /* 138 */:
                            ei0.q sleepTrackManager = (ei0.q) b0Var.J1.get();
                            kotlin.jvm.internal.u.j(sleepTrackManager, "sleepTrackManager");
                            bVar = new ei0.a(sleepTrackManager);
                            return bVar;
                        case ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT /* 139 */:
                            kt.a aVar5 = b0Var.f50185j;
                            r00.f q84 = b0Var.q8();
                            s00.c gsonHandler = (s00.c) b0Var.f50269x.get();
                            aVar5.getClass();
                            kotlin.jvm.internal.u.j(gsonHandler, "gsonHandler");
                            return (T) new RetrofitHealthScoreRemoteRepository(q84, gsonHandler, null, 4, null);
                        case 140:
                            fw.a r62 = b0.r6(b0Var);
                            hw.a datastore = (hw.a) b0Var.Z.get();
                            kotlin.jvm.internal.u.j(datastore, "datastore");
                            obj = new gw.h(r62, datastore);
                            return obj;
                        case ConstantsWs.MEASURE_TYPE_HR_STATE /* 141 */:
                            bVar = new gw.e(b0Var.q8(), null);
                            return bVar;
                        case ConstantsWs.MEASURE_TYPE_HR_LEVEL /* 142 */:
                            bVar = new hx.l(b0.m4(b0Var));
                            return bVar;
                        case ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN /* 143 */:
                            bVar = new x30.j(b0Var.U8());
                            return bVar;
                        case ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX /* 144 */:
                            a3.p pVar2 = b0Var.f50161f;
                            r00.f q85 = b0Var.q8();
                            pVar2.getClass();
                            return (T) new RetrofitEcgReviewRemoteRepository(q85, null, 2, null);
                        case ConstantsWs.MEASURE_TYPE_IRREGULAR_HEART_BEAT /* 145 */:
                            return (T) new v0(this);
                        case ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2 /* 146 */:
                            return (T) new w0(this);
                        case ConstantsWs.MEASURE_TYPE_PH /* 147 */:
                            return (T) new x0(this);
                        case ConstantsWs.MEASURE_TYPE_SPECIFIC_GRAVITY /* 148 */:
                            return (T) new y0(this);
                        case ConstantsWs.MEASURE_TYPE_LUTEINIZING_HORMONE /* 149 */:
                            com.withings.wiscale2.data.s roomDaoProvider5 = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
                            u10.c0 partnerGrantedPermissionsRepository = (u10.c0) b0Var.f50200l2.get();
                            u10.f0 partnerReimportDataRepository = (u10.f0) b0Var.f50206m2.get();
                            kotlin.jvm.internal.u.j(roomDaoProvider5, "roomDaoProvider");
                            kotlin.jvm.internal.u.j(partnerGrantedPermissionsRepository, "partnerGrantedPermissionsRepository");
                            kotlin.jvm.internal.u.j(partnerReimportDataRepository, "partnerReimportDataRepository");
                            u10.x dao = roomDaoProvider5.z();
                            kotlin.jvm.internal.u.j(dao, "dao");
                            u10.a0 a0Var = new u10.a0(dao, partnerGrantedPermissionsRepository, partnerReimportDataRepository);
                            u10.a0.f101222d = a0Var;
                            aVar = a0Var;
                            return aVar;
                        case 150:
                            bVar = new u10.d0(gk0.c.a(b0Var.f50131a));
                            return bVar;
                        case ConstantsWs.MEASURE_TYPE_NITRITES /* 151 */:
                            bVar = new u10.g0(gk0.c.a(b0Var.f50131a));
                            return bVar;
                        case ConstantsWs.MEASURE_TYPE_LEUKOCYTES /* 152 */:
                            return (T) new z0(this);
                        case ConstantsWs.MEASURE_TYPE_HR_SD_NN /* 153 */:
                            return (T) new a1(this);
                        case ConstantsWs.MEASURE_TYPE_HR_RMS_SD /* 154 */:
                            return (T) new b1(this);
                        case ConstantsWs.MEASURE_TYPE_VASCULAR_AGE /* 155 */:
                            return (T) new r(this);
                        case ConstantsWs.MEASURE_TYPE_PWV_REACHED_COUNT /* 156 */:
                            return (T) new s(this);
                        case ConstantsWs.MEASURE_TYPE_VA_REACHED_COUNT /* 157 */:
                            return (T) new t(this);
                        case ConstantsWs.MEASURE_TYPE_NHS_LEFT_FOOT /* 158 */:
                            return (T) new u(this);
                        case ConstantsWs.MEASURE_TYPE_NHS_RIGHT_FOOT /* 159 */:
                            return (T) new v(this);
                        case ConstantsWs.MEASURE_TYPE_BLOOD_GLUCOSE /* 160 */:
                            return (T) new w(this);
                        case ConstantsWs.MEASURE_TYPE_GLUCOSE_PERIOD /* 161 */:
                            return (T) new x(this);
                        case ConstantsWs.MEASURE_TYPE_HR_BCGIPG /* 162 */:
                            return (T) new y(this);
                        case ConstantsWs.MEASURE_TYPE_HR_ECG /* 163 */:
                            return (T) new z(this);
                        case ConstantsWs.MEASURE_TYPE_CAN /* 164 */:
                            return (T) new a0(this);
                        case ConstantsWs.MEASURE_TYPE_NEPHRO /* 165 */:
                            return (T) new c0(this);
                        case ConstantsWs.MEASURE_TYPE_VO2MAX_HR_MAX /* 166 */:
                            return (T) new d0(this);
                        case ConstantsWs.MEASURE_TYPE_NHS_FEET /* 167 */:
                            return (T) new e0(this);
                        case 168:
                            return (T) new f0(this);
                        case ConstantsWs.MEASURE_TYPE_INTRACELLULAR_WATER /* 169 */:
                            return (T) new g0(this);
                        case ConstantsWs.MEASURE_TYPE_VISCERAL_FAT_RATING /* 170 */:
                            return (T) new h0(this);
                        case ConstantsWs.MEASURE_TYPE_VASISTAS_WALKING_DOUBLE_SUPPORT /* 171 */:
                            return (T) new i0(this);
                        case ConstantsWs.MEASURE_TYPE_VASISTAS_TYPE_WALKING_ASYMETRY /* 172 */:
                            return (T) new j0(this);
                        case ConstantsWs.MEASURE_TYPE_FAT_FREE_MASS_SEGMENT /* 173 */:
                            return (T) new k0(this);
                        case ConstantsWs.MEASURE_TYPE_FAT_MASS_SEGMENT /* 174 */:
                            return (T) new l0(this);
                        case ConstantsWs.MEASURE_TYPE_MUSCLE_MASS_SEGMENT /* 175 */:
                            return (T) new n0(this);
                        case ConstantsWs.MEASURE_TYPE_R5KHZ_SEGMENT /* 176 */:
                            return (T) new o0(this);
                        case ConstantsWs.MEASURE_TYPE_R50KHZ_SEGMENT /* 177 */:
                            return (T) new p0(this);
                        case ConstantsWs.MEASURE_TYPE_R250KHZ_SEGMENT /* 178 */:
                            return (T) new q0(this);
                        case ConstantsWs.MEASURE_TYPE_SNORING_INTENSITY /* 179 */:
                            return (T) new r0(this);
                        case 180:
                            lj0.h0 vasistasManager = (lj0.h0) b0Var.W0.get();
                            kotlin.jvm.internal.u.j(vasistasManager, "vasistasManager");
                            lj0.r rVar = new lj0.r(vasistasManager);
                            lj0.r.f79913c = rVar;
                            bVar = rVar;
                            return bVar;
                        case ConstantsWs.MEASURE_TYPE_WALKING_STEADINESS_CLASSIFICATION /* 181 */:
                            lj0.h0 vasistasManager2 = (lj0.h0) b0Var.W0.get();
                            kotlin.jvm.internal.u.j(vasistasManager2, "vasistasManager");
                            bVar = new lj0.g(vasistasManager2);
                            return bVar;
                        case ConstantsWs.MEASURE_TYPE_IGLUCOSE_BLOOD_GLUCOSE /* 182 */:
                            return (T) new s0(this);
                        case ConstantsWs.MEASURE_TYPE_MENSTRUATION_FLOW /* 183 */:
                            com.withings.wiscale2.data.s roomDaoProvider6 = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
                            kotlin.jvm.internal.u.j(roomDaoProvider6, "roomDaoProvider");
                            bVar = new com.withings.device.details.automatic.activity.detection.d(roomDaoProvider6.b());
                            return bVar;
                        case ConstantsWs.MEASURE_TYPE_CYCLE_DURATION /* 184 */:
                            return (T) new ax.a((kn.e) b0Var.f50251u.get(), bg.a.a(), aVar2.a(), (VasistasRepository) ((a) b0Var.X0).get());
                        case ConstantsWs.MEASURE_TYPE_MENSTRUATION_DURATION /* 185 */:
                            return (T) new bx.a();
                        case 186:
                            lj0.h0 vasistasManager3 = (lj0.h0) b0Var.W0.get();
                            kotlin.jvm.internal.u.j(vasistasManager3, "vasistasManager");
                            lj0.w wVar = new lj0.w(vasistasManager3);
                            lj0.w.f79924c = wVar;
                            bVar = wVar;
                            return bVar;
                        case 187:
                            lj0.h0 vasistasManager4 = (lj0.h0) b0Var.W0.get();
                            kotlin.jvm.internal.u.j(vasistasManager4, "vasistasManager");
                            lj0.b bVar3 = new lj0.b(vasistasManager4);
                            lj0.b.f79769c = bVar3;
                            bVar = bVar3;
                            return bVar;
                        case 188:
                            bVar = new ax.j(gk0.c.a(b0Var.f50131a));
                            return bVar;
                        case ConstantsWs.MEASURE_TYPE_R6_25KHZ_SEGMENT /* 189 */:
                            return (T) new t0(this);
                        case ConstantsWs.MEASURE_TYPE_WAIST /* 190 */:
                            ActivityAggregateManager activityAggregateManager = (ActivityAggregateManager) b0Var.F1.get();
                            kotlin.jvm.internal.u.j(activityAggregateManager, "activityAggregateManager");
                            return (T) new GetStepsUseCase(activityAggregateManager);
                        case 191:
                            GetActiveMinutesUseCase getActiveMinutesUseCase = (GetActiveMinutesUseCase) b0Var.f50147c3.get();
                            GetStepsUseCase getStepsUseCase = (GetStepsUseCase) b0Var.f50135a3.get();
                            kotlin.jvm.internal.u.j(getActiveMinutesUseCase, "getActiveMinutesUseCase");
                            kotlin.jvm.internal.u.j(getStepsUseCase, "getStepsUseCase");
                            obj = new GetDailyUserProgressionForMeasureTypeUseCase(getActiveMinutesUseCase, getStepsUseCase);
                            return obj;
                        case 192:
                            ActivityAggregateManager activityAggregateManager2 = (ActivityAggregateManager) b0Var.F1.get();
                            kotlin.jvm.internal.u.j(activityAggregateManager2, "activityAggregateManager");
                            return (T) new GetActiveMinutesUseCase(activityAggregateManager2);
                        case 193:
                            v30.g getTasksProgramByIdUseCase = (v30.g) b0Var.f50165f3.get();
                            x30.j getProgramByIdUseCase = (x30.j) b0Var.f50164f2.get();
                            kotlin.jvm.internal.u.j(getTasksProgramByIdUseCase, "getTasksProgramByIdUseCase");
                            kotlin.jvm.internal.u.j(getProgramByIdUseCase, "getProgramByIdUseCase");
                            obj = new v30.f(getTasksProgramByIdUseCase, getProgramByIdUseCase);
                            return obj;
                        case 194:
                            l30.c programTaskRepository = (l30.c) ((a) b0Var.f50175h1).get();
                            GetDailyUserProgressionForMeasureTypeUseCase getDailyUserProgressionForMeasureTypeUseCase = (GetDailyUserProgressionForMeasureTypeUseCase) b0Var.f50153d3.get();
                            tt.a r82 = b0Var.r8();
                            tt.c completeTasksUseCase = (tt.c) ((a) b0Var.f50159e3).get();
                            w30.b d62 = b0.d6(b0Var);
                            kotlin.jvm.internal.u.j(programTaskRepository, "programTaskRepository");
                            kotlin.jvm.internal.u.j(getDailyUserProgressionForMeasureTypeUseCase, "getDailyUserProgressionForMeasureTypeUseCase");
                            kotlin.jvm.internal.u.j(completeTasksUseCase, "completeTasksUseCase");
                            return (T) new v30.g(programTaskRepository, getDailyUserProgressionForMeasureTypeUseCase, r82, completeTasksUseCase, d62);
                        case 195:
                            xt.b n72 = b0.n7(b0Var);
                            c00.b missionRepository = (c00.b) b0Var.P1.get();
                            kotlin.jvm.internal.u.j(missionRepository, "missionRepository");
                            obj = new tt.c(n72, missionRepository);
                            return obj;
                        case 196:
                            return (T) new ft.a((qt.b) b0Var.W1.get(), b0.X6(b0Var), (ActivityAggregateManager) b0Var.F1.get(), b0.t6(b0Var), b0Var.j9());
                        case ConstantsWs.MEASURE_TYPE_EDA_LEFT_FOOT /* 197 */:
                            return (T) new lb0.l(b0Var.S8(), b0.F6(b0Var));
                        case ConstantsWs.MEASURE_TYPE_EDA_RIGHT_FOOT /* 198 */:
                            return (T) new ch0.g(b0Var.S8(), b0.F6(b0Var));
                        case ConstantsWs.MEASURE_TYPE_DURATION_MEDIUM_HIGH_ACTIVITY /* 199 */:
                            return (T) new wi0.c(b0.F6(b0Var));
                        default:
                            throw new AssertionError(i11);
                    }
                } else if (i12 == 2) {
                    switch (i11) {
                        case 200:
                            return (T) new ih0.e(b0Var.S8(), b0.F6(b0Var), (r70.c) b0Var.T0.get());
                        case 201:
                            return (T) new mc0.b(gk0.c.a(b0Var.f50131a), (m70.i) b0Var.f50258v0.get(), aVar2.a(), b0Var.S8(), b0.F6(b0Var), (il.a) b0Var.f50207m3.get());
                        case 202:
                            vr.d featureTagsRepository = (vr.d) b0Var.f50246t0.get();
                            r70.c userRepository = (r70.c) b0Var.T0.get();
                            kotlin.jvm.internal.u.j(featureTagsRepository, "featureTagsRepository");
                            kotlin.jvm.internal.u.j(userRepository, "userRepository");
                            obj2 = new il.c(featureTagsRepository, userRepository);
                            return obj2;
                        case 203:
                            return (T) new vh0.d(gk0.c.a(b0Var.f50131a), (t10.e) b0Var.f50217o1.get(), b0Var.S8(), b0.F6(b0Var), (r70.c) b0Var.T0.get(), (u70.a) b0Var.f50150d0.get(), (vf.c) b0Var.f50144c0.get());
                        case 204:
                            WiscaleDBH wiscaleDBH4 = (WiscaleDBH) b0Var.f50245t.get();
                            kotlin.jvm.internal.u.j(wiscaleDBH4, "wiscaleDBH");
                            return (T) new rg.b(new rg.c(wiscaleDBH4));
                        case 205:
                            Application a13 = gk0.b.a(b0Var.f50131a);
                            m70.i userManager = (m70.i) b0Var.f50258v0.get();
                            kotlin.jvm.internal.u.j(userManager, "userManager");
                            obj2 = new t80.e(a13, userManager);
                            return obj2;
                        case 206:
                            return (T) new zi0.a(gk0.c.a(b0Var.f50131a));
                        case 207:
                            return (T) new xg0.d(b0Var.q8());
                        case 208:
                            return (T) new u0(this);
                        case 209:
                            mutableSetupStateRepository = (T) new JsonApiSuggestionRepository(new JsonClinicalStudySuggestionRepository(), b0.X5(b0Var));
                            return mutableSetupStateRepository;
                        case 210:
                            mutableSetupStateRepository = (T) WebRadiosModule_ProvideWebRadiosRemoteRepositoryFactory.provideWebRadiosRemoteRepository(b0Var.q8());
                            return mutableSetupStateRepository;
                        case 211:
                            mutableSetupStateRepository = (T) ((jo.a) b0Var.f50267w3.get());
                            kotlin.jvm.internal.u.j(mutableSetupStateRepository, "mutableSetupStateRepository");
                            return mutableSetupStateRepository;
                        case 212:
                            mutableSetupStateRepository = (T) new com.withings.device.setup.android.setup.a();
                            return mutableSetupStateRepository;
                        case 213:
                            mutableSetupStateRepository = (T) new RetrofitDeviceRemoteRepository(b0Var.q8(), b0.D7(b0Var), null, null, 12, null);
                            return mutableSetupStateRepository;
                        case 214:
                            b0Var.f50191k.getClass();
                            mutableSetupStateRepository = (T) new NerveHealthNative();
                            return mutableSetupStateRepository;
                        case 215:
                            mutableSetupStateRepository = (T) new th0.k(b0.g5(b0Var), b0.U5(b0Var), b0Var.getMostRecentEnrolledProgramLastUpdateUseCase(), b0Var.b9(), b0Var.fetchTasksProgramByIdUseCase(), (i30.b) b0Var.enrolledRepository(), b0Var.U8(), b0.K6(b0Var), b0Var.e9(), (vf.c) b0Var.f50144c0.get(), b0.f6(b0Var), (m70.i) b0Var.f50258v0.get(), b0.l5(b0Var), b0.m7(b0Var), (oi0.b) b0Var.f50152d2.get(), (kn.e) b0Var.f50251u.get(), aVar2.a(), b0Var.L8(), b0Var.h(), b0.j8(b0Var));
                            return mutableSetupStateRepository;
                        case 216:
                            mutableSetupStateRepository = (T) ax.h.f19725i;
                            if (mutableSetupStateRepository == null) {
                                kotlin.jvm.internal.u.s("instance");
                                throw null;
                            }
                            return mutableSetupStateRepository;
                        case 217:
                            mutableSetupStateRepository = (T) new RetrofitConsumableRemoteRepository(b0Var.q8(), null, 2, null);
                            return mutableSetupStateRepository;
                        case 218:
                            fl.p a14 = aVar2.a();
                            kn.e deviceManager = (kn.e) b0Var.f50251u.get();
                            kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
                            obj6 = new fl.i(a14, deviceManager);
                            mutableSetupStateRepository = (T) obj6;
                            return mutableSetupStateRepository;
                        case 219:
                            r70.c userRepository2 = (r70.c) b0Var.T0.get();
                            kotlin.jvm.internal.u.j(userRepository2, "userRepository");
                            mutableSetupStateRepository = (T) new r70.a(userRepository2);
                            return mutableSetupStateRepository;
                        case 220:
                            mutableSetupStateRepository = (T) new com.withings.device.details.scale.a((m70.i) b0Var.f50258v0.get());
                            return mutableSetupStateRepository;
                        case 221:
                            mutableSetupStateRepository = (T) new RetrofitMedicalReportRemoteRepository(b0Var.q8(), null, 2, null);
                            return mutableSetupStateRepository;
                        case 222:
                            mutableSetupStateRepository = (T) new zb0.c((com.withings.wiscale2.device.common.feature.u) b0Var.N2.get(), (kn.e) b0Var.f50251u.get(), (PlatformFeatureRepository) b0Var.f50263w.get());
                            return mutableSetupStateRepository;
                        case 223:
                            mutableSetupStateRepository = (T) new hx.c();
                            return mutableSetupStateRepository;
                        case 224:
                            im.a aVar6 = b0Var.f50209n;
                            Context a15 = gk0.c.a(b0Var.f50131a);
                            l70.w unitPreferencesRepository = (l70.w) b0Var.H.get();
                            m70.i userManager2 = (m70.i) b0Var.f50258v0.get();
                            aVar6.getClass();
                            kotlin.jvm.internal.u.j(unitPreferencesRepository, "unitPreferencesRepository");
                            kotlin.jvm.internal.u.j(userManager2, "userManager");
                            obj5 = new om.b(a15, unitPreferencesRepository, userManager2);
                            return obj5;
                        case 225:
                            hi.a capabilityAssetDataSource = (hi.a) b0Var.K3.get();
                            kotlin.jvm.internal.u.j(capabilityAssetDataSource, "capabilityAssetDataSource");
                            mutableSetupStateRepository = (T) new mi.b(capabilityAssetDataSource);
                            return mutableSetupStateRepository;
                        case 226:
                            mutableSetupStateRepository = (T) new hi.a(gk0.c.a(b0Var.f50131a));
                            return mutableSetupStateRepository;
                        case 227:
                            mutableSetupStateRepository = (T) new iz.c((cz.f0) b0Var.M3.get(), (cz.d) b0Var.N3.get(), (cz.y) b0Var.O3.get(), (cz.t) b0Var.P3.get(), (cz.v) b0Var.Q3.get(), (cz.i) b0Var.R3.get(), (cz.a) b0Var.S3.get(), (cz.p) b0Var.T3.get(), (cz.m) b0Var.U3.get(), (cz.f) b0Var.V3.get(), (cz.x) b0Var.W3.get(), (cz.a0) b0Var.X3.get(), (cz.c0) b0Var.Z3.get(), (cz.g0) b0Var.f50136a4.get(), (cz.n) b0Var.f50142b4.get(), (cz.d0) b0Var.f50148c4.get(), (cz.q) b0Var.f50154d4.get(), (cz.u) b0Var.f50160e4.get(), (cz.z) b0Var.f50166f4.get(), (cz.e0) b0Var.f50172g4.get(), (cz.c) b0Var.f50178h4.get(), (cz.w) b0Var.f50190j4.get(), (cz.e) b0Var.f50196k4.get(), (cz.s) b0Var.f50202l4.get(), (cz.k) b0Var.f50208m4.get(), (cz.j) b0Var.f50214n4.get(), (cz.b) b0Var.f50220o4.get(), (cz.g) b0Var.f50226p4.get(), (cz.o) b0Var.f50232q4.get(), (cz.h) b0Var.f50238r4.get(), (r70.a) b0Var.E3.get());
                            return mutableSetupStateRepository;
                        case 228:
                            iy.e measuresGroupRepositoryV2 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager = (ky.c) b0Var.f50270x0.get();
                            ah.c0 c0Var = new ah.c0();
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager, "measureListenerManager");
                            obj5 = new az.w0(measuresGroupRepositoryV2, measureListenerManager, c0Var);
                            return obj5;
                        case 229:
                            iy.e measuresGroupRepositoryV22 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager2 = (ky.c) b0Var.f50270x0.get();
                            m70.i userManager3 = (m70.i) b0Var.f50258v0.get();
                            yr.a aVar7 = new yr.a();
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV22, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager2, "measureListenerManager");
                            kotlin.jvm.internal.u.j(userManager3, "userManager");
                            obj5 = new az.f(measuresGroupRepositoryV22, measureListenerManager2, userManager3, aVar7);
                            return obj5;
                        case ConstantsWs.WS_STATUS_WRONGSHAREID /* 230 */:
                            iy.e measuresGroupRepositoryV23 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager3 = (ky.c) b0Var.f50270x0.get();
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV23, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager3, "measureListenerManager");
                            obj5 = new az.m0(measuresGroupRepositoryV23, measureListenerManager3);
                            return obj5;
                        case ConstantsWs.WS_STATUS_SHARINGDELERROR /* 231 */:
                            cj0.i Z8 = b0Var.Z8();
                            m70.i userManager4 = (m70.i) b0Var.f50258v0.get();
                            kotlin.jvm.internal.u.j(userManager4, "userManager");
                            obj6 = new az.c0(Z8, userManager4);
                            mutableSetupStateRepository = (T) obj6;
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_SHARINGGETERROR /* 232 */:
                            iy.e measuresGroupRepositoryV24 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager4 = (ky.c) b0Var.f50270x0.get();
                            e40.a Q = b0Var.Q();
                            m70.i userManager5 = (m70.i) b0Var.f50258v0.get();
                            n20.f t72 = b0.t7(b0Var);
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV24, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager4, "measureListenerManager");
                            kotlin.jvm.internal.u.j(userManager5, "userManager");
                            mutableSetupStateRepository = (T) new az.f0(measuresGroupRepositoryV24, measureListenerManager4, Q, userManager5, t72);
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_ACCOUNTCREATERROR /* 233 */:
                            HeartSignalRepository heartSignalRepository = (HeartSignalRepository) b0Var.f50181i1.get();
                            sq.a j5 = b0Var.j();
                            pi.i H6 = b0.H6(b0Var);
                            vf.c accountManager = (vf.c) b0Var.f50144c0.get();
                            NoteRepository noteRepository = (NoteRepository) b0Var.B1.get();
                            kotlin.jvm.internal.u.j(heartSignalRepository, "heartSignalRepository");
                            kotlin.jvm.internal.u.j(accountManager, "accountManager");
                            kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
                            mutableSetupStateRepository = (T) new az.p(accountManager, H6, heartSignalRepository, j5, noteRepository);
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGACCOUNTPARAMS /* 234 */:
                            kn.e deviceManager2 = (kn.e) b0Var.f50251u.get();
                            iy.e measuresGroupRepositoryV25 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager5 = (ky.c) b0Var.f50270x0.get();
                            PlatformFeatureRepository platformFeatureRepository = (PlatformFeatureRepository) b0Var.f50263w.get();
                            kotlin.jvm.internal.u.j(deviceManager2, "deviceManager");
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV25, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager5, "measureListenerManager");
                            kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
                            obj5 = new az.a(deviceManager2, measuresGroupRepositoryV25, measureListenerManager5, platformFeatureRepository);
                            return obj5;
                        case ConstantsWs.WS_STATUS_WRONGMACADDRESS /* 235 */:
                            iy.e measuresGroupRepositoryV26 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager6 = (ky.c) b0Var.f50270x0.get();
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV26, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager6, "measureListenerManager");
                            obj5 = new az.y(measuresGroupRepositoryV26, measureListenerManager6);
                            return obj5;
                        case ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN /* 236 */:
                            iy.e measuresGroupRepositoryV27 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager7 = (ky.c) b0Var.f50270x0.get();
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV27, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager7, "measureListenerManager");
                            obj5 = new az.v(measuresGroupRepositoryV27, measureListenerManager7);
                            return obj5;
                        case ConstantsWs.WS_STATUS_DEVASSOCERROR /* 237 */:
                            ActivityAggregateManager activityAggregateManager3 = (ActivityAggregateManager) b0Var.F1.get();
                            cj0.i Z82 = b0Var.Z8();
                            VasistasRepository vasistasRepository = (VasistasRepository) ((a) b0Var.X0).get();
                            m60.b a72 = b0.a7(b0Var);
                            kotlin.jvm.internal.u.j(activityAggregateManager3, "activityAggregateManager");
                            kotlin.jvm.internal.u.j(vasistasRepository, "vasistasRepository");
                            obj5 = new az.i(activityAggregateManager3, Z82, vasistasRepository, a72);
                            return obj5;
                        case ConstantsWs.WS_STATUS_WRONGACCOUNTID /* 238 */:
                            obj6 = new az.k0(b0.I7(b0Var), b0Var.Z8());
                            mutableSetupStateRepository = (T) obj6;
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_UNVERIFIED_SESSION /* 239 */:
                            ActivityAggregateManager activityAggregateManager4 = (ActivityAggregateManager) b0Var.F1.get();
                            TargetRepository a16 = dl.a.a();
                            bz.b N7 = b0.N7(b0Var);
                            VasistasRepository vasistasRepository2 = (VasistasRepository) ((a) b0Var.X0).get();
                            Context a17 = gk0.c.a(b0Var.f50131a);
                            kotlin.jvm.internal.u.j(activityAggregateManager4, "activityAggregateManager");
                            kotlin.jvm.internal.u.j(vasistasRepository2, "vasistasRepository");
                            mutableSetupStateRepository = (T) new az.p0(activityAggregateManager4, a16, N7, vasistasRepository2, a17);
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGTZNAME /* 240 */:
                            iy.e measuresGroupRepositoryV28 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager8 = (ky.c) b0Var.f50270x0.get();
                            m70.i userManager6 = (m70.i) b0Var.f50258v0.get();
                            b0Var.f50197l.getClass();
                            a80.c cVar = new a80.c();
                            cz.b0 temporaryAnnexRepository = (cz.b0) b0Var.Y3.get();
                            n20.f t73 = b0.t7(b0Var);
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV28, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager8, "measureListenerManager");
                            kotlin.jvm.internal.u.j(userManager6, "userManager");
                            kotlin.jvm.internal.u.j(temporaryAnnexRepository, "temporaryAnnexRepository");
                            obj5 = new az.q0(measuresGroupRepositoryV28, measureListenerManager8, userManager6, cVar, temporaryAnnexRepository, t73);
                            return obj5;
                        case ConstantsWs.WS_STATUS_WRONGASSOCID /* 241 */:
                            mutableSetupStateRepository = (T) new zy.b(gk0.c.a(b0Var.f50131a));
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGOFFSET /* 242 */:
                            cj0.l n82 = b0.n8(b0Var);
                            WorkoutCategoryManager workoutCategoryManager = (WorkoutCategoryManager) b0Var.K1.get();
                            l70.w unitPreferencesRepository2 = (l70.w) b0Var.H.get();
                            b0Var.f50215o.getClass();
                            m60.e eVar = new m60.e();
                            rj0.e m82 = b0.m8(b0Var);
                            GpsLocationRepository gpsLocationRepository = (GpsLocationRepository) b0Var.f50139b1.get();
                            kotlin.jvm.internal.u.j(workoutCategoryManager, "workoutCategoryManager");
                            kotlin.jvm.internal.u.j(unitPreferencesRepository2, "unitPreferencesRepository");
                            kotlin.jvm.internal.u.j(gpsLocationRepository, "gpsLocationRepository");
                            mutableSetupStateRepository = (T) new az.y0(n82, workoutCategoryManager, unitPreferencesRepository2, eVar, m82, gpsLocationRepository);
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGDEVICEID /* 243 */:
                            HeartSignalRepository heartSignalRepository2 = (HeartSignalRepository) b0Var.f50181i1.get();
                            sq.a j11 = b0Var.j();
                            kotlin.jvm.internal.u.j(heartSignalRepository2, "heartSignalRepository");
                            obj6 = new az.w(heartSignalRepository2, j11);
                            mutableSetupStateRepository = (T) obj6;
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGLIMIT /* 244 */:
                            iy.e measuresGroupRepositoryV29 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager9 = (ky.c) b0Var.f50270x0.get();
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV29, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager9, "measureListenerManager");
                            obj5 = new az.u0(measuresGroupRepositoryV29, measureListenerManager9);
                            return obj5;
                        case ConstantsWs.WS_STATUS_MISSING /* 245 */:
                            iy.e measuresGroupRepositoryV210 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager10 = (ky.c) b0Var.f50270x0.get();
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV210, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager10, "measureListenerManager");
                            obj5 = new az.a0(measuresGroupRepositoryV210, measureListenerManager10);
                            return obj5;
                        case ConstantsWs.WS_STATUS_WRONGMEASTYPE /* 246 */:
                            iy.e measuresGroupRepositoryV211 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager11 = (ky.c) b0Var.f50270x0.get();
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV211, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager11, "measureListenerManager");
                            obj5 = new az.e0(measuresGroupRepositoryV211, measureListenerManager11);
                            return obj5;
                        case ConstantsWs.WS_STATUS_WRONGUSERID /* 247 */:
                            iy.e measuresGroupRepositoryV212 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager12 = (ky.c) b0Var.f50270x0.get();
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV212, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager12, "measureListenerManager");
                            obj5 = new az.o0(measuresGroupRepositoryV212, measureListenerManager12);
                            return obj5;
                        case ConstantsWs.WS_STATUS_WRONGDEVICETYPE /* 248 */:
                            iy.e measuresGroupRepositoryV213 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager13 = (ky.c) b0Var.f50270x0.get();
                            m70.i userManager7 = (m70.i) b0Var.f50258v0.get();
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV213, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager13, "measureListenerManager");
                            kotlin.jvm.internal.u.j(userManager7, "userManager");
                            obj5 = new az.v0(measuresGroupRepositoryV213, measureListenerManager13, userManager7);
                            return obj5;
                        case ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT /* 249 */:
                            iy.e measuresGroupRepositoryV214 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager14 = (ky.c) b0Var.f50270x0.get();
                            n90.d A4 = b0.A4(b0Var);
                            v80.g A5 = b0.A5(b0Var);
                            fl.p a18 = aVar2.a();
                            r70.c userRepository3 = (r70.c) b0Var.T0.get();
                            cz.b0 temporaryAnnexRepository2 = (cz.b0) b0Var.Y3.get();
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV214, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager14, "measureListenerManager");
                            kotlin.jvm.internal.u.j(userRepository3, "userRepository");
                            kotlin.jvm.internal.u.j(temporaryAnnexRepository2, "temporaryAnnexRepository");
                            obj5 = new az.d(measuresGroupRepositoryV214, measureListenerManager14, A4, A5, a18, userRepository3, temporaryAnnexRepository2);
                            return obj5;
                        case 250:
                            dz.b sleepApneaRepository = (dz.b) b0Var.f50184i4.get();
                            kotlin.jvm.internal.u.j(sleepApneaRepository, "sleepApneaRepository");
                            mutableSetupStateRepository = (T) new az.j0(sleepApneaRepository);
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_NODATAFOUND /* 251 */:
                            mutableSetupStateRepository = (T) new dz.c(b0Var.Z8());
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGBATTERYLVL /* 252 */:
                            obj6 = new az.g(b0Var.Z8(), aVar2.a());
                            mutableSetupStateRepository = (T) obj6;
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED /* 253 */:
                            mutableSetupStateRepository = (T) new az.b0(b0.P6(b0Var));
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_NOREPOUSER /* 254 */:
                            mutableSetupStateRepository = (T) new az.r(b0.P6(b0Var));
                            return mutableSetupStateRepository;
                        case 255:
                            mutableSetupStateRepository = (T) new az.q(b0.P6(b0Var));
                            return mutableSetupStateRepository;
                        case 256:
                            iy.e measuresGroupRepositoryV215 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager15 = (ky.c) b0Var.f50270x0.get();
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV215, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager15, "measureListenerManager");
                            obj5 = new az.b(measuresGroupRepositoryV215, measureListenerManager15);
                            return obj5;
                        case ConstantsWs.WS_STATUS_ALREADYACTIVATED /* 257 */:
                            VasistasRepository vasistasRepository3 = (VasistasRepository) ((a) b0Var.X0).get();
                            kotlin.jvm.internal.u.j(vasistasRepository3, "vasistasRepository");
                            mutableSetupStateRepository = (T) new az.n(vasistasRepository3);
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGMAINTDATA /* 258 */:
                            iy.e measuresGroupRepositoryV216 = (iy.e) b0Var.L0.get();
                            ky.c measureListenerManager16 = (ky.c) b0Var.f50270x0.get();
                            kotlin.jvm.internal.u.j(measuresGroupRepositoryV216, "measuresGroupRepositoryV2");
                            kotlin.jvm.internal.u.j(measureListenerManager16, "measureListenerManager");
                            obj5 = new az.x(measuresGroupRepositoryV216, measureListenerManager16);
                            return obj5;
                        case ConstantsWs.WS_STATUS_TOOMANYASSOCIATIONS /* 259 */:
                            um.a F = b0Var.F();
                            xm.b cycleTrackingSettingsRepository = (xm.b) b0Var.O0.get();
                            ym.k c72 = b0.c7(b0Var);
                            kotlin.jvm.internal.u.j(cycleTrackingSettingsRepository, "cycleTrackingSettingsRepository");
                            obj3 = new az.o(F, cycleTrackingSettingsRepository, c72);
                            obj2 = obj3;
                            return obj2;
                        case ConstantsWs.WS_STATUS_WRONGDEVTYPE /* 260 */:
                            kn.e deviceManager3 = (kn.e) b0Var.f50251u.get();
                            v30.f getDetailedProgramByIdUseCase = (v30.f) b0Var.f50171g3.get();
                            a40.a c62 = b0.c6(b0Var);
                            fl.p a19 = aVar2.a();
                            kotlin.jvm.internal.u.j(deviceManager3, "deviceManager");
                            kotlin.jvm.internal.u.j(getDetailedProgramByIdUseCase, "getDetailedProgramByIdUseCase");
                            obj4 = new nu.a(deviceManager3, getDetailedProgramByIdUseCase, c62, a19);
                            return obj4;
                        case ConstantsWs.WS_STATUS_NOPRIMARYUSER /* 261 */:
                            kn.e deviceManager4 = (kn.e) b0Var.f50251u.get();
                            iu.a h52 = b0.h5(b0Var);
                            fl.p a21 = aVar2.a();
                            kotlin.jvm.internal.u.j(deviceManager4, "deviceManager");
                            obj3 = new nu.c(deviceManager4, h52, a21);
                            obj2 = obj3;
                            return obj2;
                        case ConstantsWs.WS_STATUS_USERISPRIMARY /* 262 */:
                            gu.b remoteRepository = (gu.b) b0Var.f50256u4.get();
                            kotlin.jvm.internal.u.j(remoteRepository, "remoteRepository");
                            mutableSetupStateRepository = (T) new fu.c(remoteRepository);
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGSESSIONTYPE /* 263 */:
                            mutableSetupStateRepository = (T) new gu.a(b0Var.q8());
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGEMAIL /* 264 */:
                            ax.h hVar = ax.h.f19725i;
                            if (hVar != null) {
                                mutableSetupStateRepository = (T) hVar.f();
                                ah.p.d(mutableSetupStateRepository);
                                return mutableSetupStateRepository;
                            }
                            kotlin.jvm.internal.u.s("instance");
                            throw null;
                        case ConstantsWs.WS_STATUS_TOOBIG /* 265 */:
                            y20.b k72 = b0.k7(b0Var);
                            t00.d networkSyncManager = (t00.d) b0Var.f50146c2.get();
                            kotlin.jvm.internal.u.j(networkSyncManager, "networkSyncManager");
                            obj6 = new x20.a(k72, networkSyncManager);
                            mutableSetupStateRepository = (T) obj6;
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGSECRET /* 266 */:
                            mutableSetupStateRepository = (T) new h70.c((o60.a) b0Var.K.get(), (kn.e) b0Var.f50251u.get());
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGFW /* 267 */:
                            mutableSetupStateRepository = (T) new ch0.a(bg.a.a());
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_ACCOUNTACTIVATIONERROR /* 268 */:
                            kn.e deviceManager5 = (kn.e) b0Var.f50251u.get();
                            qh0.r updateSettingStateRepository = (qh0.r) b0Var.B4.get();
                            qh0.i permissionsSettingStateRepository = (qh0.i) b0Var.D4.get();
                            qh0.h notificationsSettingStateRepository = (qh0.h) b0Var.E4.get();
                            qh0.a alarmSettingStateRepository = (qh0.a) b0Var.F4.get();
                            qh0.q unassignedMeasurementsSettingStateRepository = (qh0.q) b0Var.G4.get();
                            qh0.t wifiSetupSettingStateRepository = (qh0.t) b0Var.H4.get();
                            qh0.o sleepSettingStateRepository = (qh0.o) b0Var.I4.get();
                            qh0.g napSettingStateRepository = (qh0.g) b0Var.J4.get();
                            qh0.p trackerWearPositionSettingStateRepository = (qh0.p) b0Var.K4.get();
                            qh0.b explanationOfECGUseForHWA08Repository = (qh0.b) b0Var.L4.get();
                            qh0.u workoutCustomizationRepository = (qh0.u) b0Var.M4.get();
                            qh0.j screensOrderCustomizationRepository = (qh0.j) b0Var.N4.get();
                            qh0.e glanceToggleRepository = (qh0.e) b0Var.O4.get();
                            qh0.s wallHandleMountRepository = (qh0.s) b0Var.P4.get();
                            qh0.f modesSettingStateRepository = (qh0.f) b0Var.Q4.get();
                            qh0.n sleepApneaSettingStateRepository = (qh0.n) b0Var.R4.get();
                            qh0.v x3MeasurementIntervalTimeStateRepository = (qh0.v) b0Var.S4.get();
                            kotlin.jvm.internal.u.j(deviceManager5, "deviceManager");
                            kotlin.jvm.internal.u.j(updateSettingStateRepository, "updateSettingStateRepository");
                            kotlin.jvm.internal.u.j(permissionsSettingStateRepository, "permissionsSettingStateRepository");
                            kotlin.jvm.internal.u.j(notificationsSettingStateRepository, "notificationsSettingStateRepository");
                            kotlin.jvm.internal.u.j(alarmSettingStateRepository, "alarmSettingStateRepository");
                            kotlin.jvm.internal.u.j(unassignedMeasurementsSettingStateRepository, "unassignedMeasurementsSettingStateRepository");
                            kotlin.jvm.internal.u.j(wifiSetupSettingStateRepository, "wifiSetupSettingStateRepository");
                            kotlin.jvm.internal.u.j(sleepSettingStateRepository, "sleepSettingStateRepository");
                            kotlin.jvm.internal.u.j(napSettingStateRepository, "napSettingStateRepository");
                            kotlin.jvm.internal.u.j(trackerWearPositionSettingStateRepository, "trackerWearPositionSettingStateRepository");
                            kotlin.jvm.internal.u.j(explanationOfECGUseForHWA08Repository, "explanationOfECGUseForHWA08Repository");
                            kotlin.jvm.internal.u.j(workoutCustomizationRepository, "workoutCustomizationRepository");
                            kotlin.jvm.internal.u.j(screensOrderCustomizationRepository, "screensOrderCustomizationRepository");
                            kotlin.jvm.internal.u.j(glanceToggleRepository, "glanceToggleRepository");
                            kotlin.jvm.internal.u.j(wallHandleMountRepository, "wallHandleMountRepository");
                            kotlin.jvm.internal.u.j(modesSettingStateRepository, "modesSettingStateRepository");
                            kotlin.jvm.internal.u.j(sleepApneaSettingStateRepository, "sleepApneaSettingStateRepository");
                            kotlin.jvm.internal.u.j(x3MeasurementIntervalTimeStateRepository, "x3MeasurementIntervalTimeStateRepository");
                            return (T) new qh0.k(deviceManager5, alarmSettingStateRepository, explanationOfECGUseForHWA08Repository, glanceToggleRepository, modesSettingStateRepository, napSettingStateRepository, notificationsSettingStateRepository, permissionsSettingStateRepository, screensOrderCustomizationRepository, sleepApneaSettingStateRepository, sleepSettingStateRepository, trackerWearPositionSettingStateRepository, unassignedMeasurementsSettingStateRepository, updateSettingStateRepository, wallHandleMountRepository, wifiSetupSettingStateRepository, workoutCustomizationRepository, x3MeasurementIntervalTimeStateRepository);
                        case ConstantsWs.WS_STATUS_USERCREATEERROR /* 269 */:
                            il.a isB2BDeviceUseCase = (il.a) b0Var.f50207m3.get();
                            kotlin.jvm.internal.u.j(isB2BDeviceUseCase, "isB2BDeviceUseCase");
                            mutableSetupStateRepository = (T) new mh0.r(isB2BDeviceUseCase);
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_USERUPDATEERROR /* 270 */:
                            fl.p a22 = aVar2.a();
                            th0.i notificationPermissionHelper = (th0.i) b0Var.C4.get();
                            kotlin.jvm.internal.u.j(notificationPermissionHelper, "notificationPermissionHelper");
                            obj6 = new mh0.i(a22, notificationPermissionHelper);
                            mutableSetupStateRepository = (T) obj6;
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGBLINDCODE /* 271 */:
                            mutableSetupStateRepository = (T) new th0.i(gk0.c.a(b0Var.f50131a));
                            return mutableSetupStateRepository;
                        case 272:
                            mutableSetupStateRepository = (T) new mh0.h(aVar2.a());
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_NOPWDUPDATECODE /* 273 */:
                            mutableSetupStateRepository = (T) new mh0.b(b0.t5(b0Var));
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_MEASNOTSHARED /* 274 */:
                            mutableSetupStateRepository = (T) new mh0.p();
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGSESSIONDURATION /* 275 */:
                            il.a isB2BDeviceUseCase2 = (il.a) b0Var.f50207m3.get();
                            kotlin.jvm.internal.u.j(isB2BDeviceUseCase2, "isB2BDeviceUseCase");
                            mutableSetupStateRepository = (T) new mh0.u(isB2BDeviceUseCase2);
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGASSOCNAME /* 276 */:
                            mutableSetupStateRepository = (T) new mh0.n(b0.t5(b0Var));
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_UNAUTHORIZED /* 277 */:
                            mutableSetupStateRepository = (T) new mh0.g(b0.t5(b0Var));
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_FILEERROR /* 278 */:
                            mutableSetupStateRepository = (T) new Object();
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_NOHEIGHT /* 279 */:
                            r70.c userRepository4 = (r70.c) b0Var.T0.get();
                            kotlin.jvm.internal.u.j(userRepository4, "userRepository");
                            mutableSetupStateRepository = (T) new mh0.c(userRepository4);
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_ACCOUNTUPDATEERROR /* 280 */:
                            mutableSetupStateRepository = (T) new Object();
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_MEASUPDATEERROR /* 281 */:
                            Context a23 = gk0.c.a(b0Var.f50131a);
                            fl.p a24 = aVar2.a();
                            r70.c userRepository5 = (r70.c) b0Var.T0.get();
                            il.a isB2BDeviceUseCase3 = (il.a) b0Var.f50207m3.get();
                            kotlin.jvm.internal.u.j(userRepository5, "userRepository");
                            kotlin.jvm.internal.u.j(isB2BDeviceUseCase3, "isB2BDeviceUseCase");
                            obj4 = new mh0.k(a23, a24, userRepository5, isB2BDeviceUseCase3);
                            return obj4;
                        case ConstantsWs.WS_STATUS_ASSOCUPDATEERROR /* 282 */:
                            mutableSetupStateRepository = (T) new Object();
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGTOKEN /* 283 */:
                            r70.c userRepository6 = (r70.c) b0Var.T0.get();
                            vr.d featureTagsRepository2 = (vr.d) b0Var.f50246t0.get();
                            kotlin.jvm.internal.u.j(userRepository6, "userRepository");
                            kotlin.jvm.internal.u.j(featureTagsRepository2, "featureTagsRepository");
                            obj6 = new mh0.s(featureTagsRepository2, userRepository6);
                            mutableSetupStateRepository = (T) obj6;
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGAPPLI /* 284 */:
                            fl.p a25 = aVar2.a();
                            vr.d featureTagsRepository3 = (vr.d) b0Var.f50246t0.get();
                            r70.c userRepository7 = (r70.c) b0Var.T0.get();
                            il.a isB2BDeviceUseCase4 = (il.a) b0Var.f50207m3.get();
                            kotlin.jvm.internal.u.j(featureTagsRepository3, "featureTagsRepository");
                            kotlin.jvm.internal.u.j(userRepository7, "userRepository");
                            kotlin.jvm.internal.u.j(isB2BDeviceUseCase4, "isB2BDeviceUseCase");
                            obj4 = new mh0.e(a25, featureTagsRepository3, userRepository7, isB2BDeviceUseCase4);
                            return obj4;
                        case ConstantsWs.WS_STATUS_WRONGVERSION /* 285 */:
                            r70.c userRepository8 = (r70.c) b0Var.T0.get();
                            kotlin.jvm.internal.u.j(userRepository8, "userRepository");
                            mutableSetupStateRepository = (T) new mh0.l(userRepository8);
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGRELATION /* 286 */:
                            il.a isB2BDeviceUseCase5 = (il.a) b0Var.f50207m3.get();
                            kotlin.jvm.internal.u.j(isB2BDeviceUseCase5, "isB2BDeviceUseCase");
                            mutableSetupStateRepository = (T) new mh0.x(isB2BDeviceUseCase5);
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGAPPLICATIONTYPE /* 287 */:
                            mutableSetupStateRepository = (T) new dh0.d((oi0.b) b0Var.f50152d2.get(), b0Var.X8());
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_WRONGAPPLICATIONCTX /* 288 */:
                            ah.t tVar = b0Var.f50233r;
                            fy.v M8 = b0Var.M8();
                            tVar.getClass();
                            obj5 = new t60.c(M8);
                            return obj5;
                        case ConstantsWs.WS_STATUS_TOOMANYSHARINGS /* 289 */:
                            ah.t tVar2 = b0Var.f50233r;
                            t60.b B5 = b0.B5(b0Var);
                            tVar2.getClass();
                            obj5 = new t60.d(B5);
                            return obj5;
                        case ConstantsWs.WS_STATUS_WRONGCONTEXT /* 290 */:
                            com.withings.paywall.a billingClientWrapper = (com.withings.paywall.a) b0Var.X4.get();
                            n20.d s72 = b0.s7(b0Var);
                            kotlin.jvm.internal.u.j(billingClientWrapper, "billingClientWrapper");
                            obj6 = new com.withings.paywall.u(billingClientWrapper, s72);
                            mutableSetupStateRepository = (T) obj6;
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_IPUSHERROR /* 291 */:
                            mutableSetupStateRepository = (T) new com.withings.paywall.a(gk0.c.a(b0Var.f50131a));
                            return mutableSetupStateRepository;
                        case ConstantsWs.WS_STATUS_TWITTERROR /* 292 */:
                            com.withings.paywall.a billingClientWrapper2 = (com.withings.paywall.a) b0Var.X4.get();
                            kotlin.jvm.internal.u.j(billingClientWrapper2, "billingClientWrapper");
                            mutableSetupStateRepository = (T) new com.withings.paywall.d(billingClientWrapper2);
                            return mutableSetupStateRepository;
                        default:
                            throw new AssertionError(i11);
                    }
                } else {
                    throw new AssertionError(i11);
                }
            }
            return b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(im.a aVar, gk0.a aVar2, com.withings.wiscale2.account.password.b bVar, ay.a aVar3, a3.p pVar, kt.a aVar4, androidx.compose.material.i1 i1Var, bj0.d dVar, LeaderboardModule leaderboardModule, com.withings.wiscale2.measure.accountmeasure.ui.add.g0 g0Var, jx.a aVar5, ah.t tVar, ay.a aVar6, df.d dVar2, ah.x xVar, ah.b bVar2, VasistasModule vasistasModule, a3.b bVar3) {
        this.f50131a = aVar2;
        this.f50137b = aVar3;
        this.f50143c = i1Var;
        this.f50149d = bVar;
        this.f50155e = aVar5;
        this.f50161f = pVar;
        this.f50167g = leaderboardModule;
        this.f50173h = vasistasModule;
        this.f50179i = bVar3;
        this.f50185j = aVar4;
        this.f50191k = g0Var;
        this.f50197l = bVar2;
        this.f50203m = dVar2;
        this.f50209n = aVar;
        this.f50215o = aVar6;
        this.f50221p = dVar;
        this.f50227q = xVar;
        this.f50233r = tVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [mo.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.d] */
    public static n90.d A4(b0 b0Var) {
        b0Var.getClass();
        new ah.c0();
        return new n90.d(new Object(), new ks.t(new Object()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v80.g A5(b0 b0Var) {
        return new v80.g(b0Var.L0.get(), b0Var.f50270x0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static xb0.e A6(b0 b0Var) {
        return new xb0.e(b0Var.f50251u.get(), b0Var.E0.get(), DeviceScreenModule_ProvideGetMissingFeatureTagUseCaseFactory.provideGetMissingFeatureTagUseCase(), b0Var.f50246t0.get(), fl.p.f67672b.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static is.c A7(b0 b0Var) {
        b0Var.getClass();
        return new is.c(new ds.b(dl.a.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vm.n A8() {
        iy.e measuresGroupRepositoryV2 = this.L0.get();
        zx.j measureListenerManagerInterface = this.f50270x0.get();
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        kotlin.jvm.internal.u.j(measureListenerManagerInterface, "measureListenerManagerInterface");
        return new vm.n(measuresGroupRepositoryV2, measureListenerManagerInterface);
    }

    static ComputeGpsSummary B4(b0 b0Var) {
        b0Var.getClass();
        return LocationProviderModule_ProvideComputeGpsSummaryFactory.provideComputeGpsSummary(LocationProviderModule_ProvideHasEnoughGpsLocationsFactory.provideHasEnoughGpsLocations(LocationProviderModule_ProvideCountTotalGapDurationFactory.provideCountTotalGapDuration(new AndroidGpsDistanceComputer())), (ComputeGpsDistance) ((a) b0Var.f50151d1).get(), LocationProviderModule_ProvideFilterGpsLocationWithPauseFactory.provideFilterGpsLocationWithPause());
    }

    static t60.b B5(b0 b0Var) {
        return new t60.b(b0Var.L0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static xb0.f B6(b0 b0Var) {
        return new xb0.f(b0Var.f50251u.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hx.o B7(b0 b0Var) {
        ex.b noteRepository = b0Var.H0.get();
        b0Var.f50155e.getClass();
        kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
        return new hx.o(noteRepository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zb0.a B8() {
        PlatformFeatureRepository platformFeatureRepository = this.f50263w.get();
        kn.e deviceManager = this.f50251u.get();
        kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        return new zb0.a(deviceManager, platformFeatureRepository);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v1, types: [mo.a, java.lang.Object] */
    public static mo.a C4(b0 b0Var) {
        b0Var.getClass();
        new ah.c0();
        return new Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mv.d C5(b0 b0Var) {
        return new mv.d(b0Var.N8());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ah.d0 C6(b0 b0Var) {
        return new ah.d0(b0Var.f50144c0.get());
    }

    private fg0.a C8() {
        return new fg0.a(this.f50258v0.get(), this.f50217o1.get(), this.f50150d0.get(), this.f50212n2.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mv.e D5(b0 b0Var) {
        return new mv.e(b0Var.N8());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static xb0.g D6(b0 b0Var) {
        b0Var.getClass();
        return new xb0.g(fl.p.f67672b.a(), b0Var.K1.get());
    }

    static pj0.e D7(b0 b0Var) {
        return new pj0.e(b0Var.R8(), b0Var.f50144c0.get(), b0Var.f50222p0.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fy.j D8() {
        return new fy.j(Q8(), this.K0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ComputeSplits E4(b0 b0Var) {
        return LocationProviderModule_ProvideComputeSplitFactory.provideComputeSplit((ComputeGpsDistance) ((a) b0Var.f50151d1).get(), LocationProviderModule_ProvideFilterGpsLocationWithPauseFactory.provideFilterGpsLocationWithPause(), LocationProviderModule_ProvideGpsLocationFilterFactory.provideGpsLocationFilter(new AndroidGpsDistanceComputer()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GetLocationVasistas E5(b0 b0Var) {
        b0Var.getClass();
        return new GetLocationVasistas(new SaveGpsLocations(b0Var.Z0.get(), new GpsLocationEntityMapper()), new GpsLocationSerializer(), b0Var.f50133a1.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static sq.f E6(b0 b0Var) {
        return new sq.f(b0Var.j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SensitiveActionService E7(b0 b0Var) {
        mw.a.b(gk0.c.a(b0Var.f50131a));
        SensitiveActionService sensitiveActionService = SensitiveActionService.Companion.getSensitiveActionService();
        ah.p.d(sensitiveActionService);
        return sensitiveActionService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fy.k E8() {
        return new fy.k(Q8(), this.K0.get());
    }

    static vl.d F4(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        pl.a c11 = roomDaoProvider.c();
        ah.p.d(c11);
        ql.b contentFavoriteDataStore = b0Var.f50282z0.get();
        com.withings.wiscale2.data.s roomDaoProvider2 = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider2, "roomDaoProvider");
        mr.a k11 = roomDaoProvider2.k();
        ah.p.d(k11);
        kotlin.jvm.internal.u.j(contentFavoriteDataStore, "contentFavoriteDataStore");
        return new vl.d(c11, contentFavoriteDataStore, k11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d10.a F6(b0 b0Var) {
        return new d10.a(b0Var.S8());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static yl.d F7(b0 b0Var) {
        return new yl.d(b0Var.Q1.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fy.l F8() {
        return new fy.l(G8(), this.K0.get());
    }

    static vl.i G4(b0 b0Var) {
        return new vl.i(b0Var.q8());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d00.e G7(b0 b0Var) {
        c00.b missionRepository = b0Var.P1.get();
        kotlin.jvm.internal.u.j(missionRepository, "missionRepository");
        return new d00.e(missionRepository);
    }

    private dy.d G8() {
        return new dy.d(Q8(), this.L0.get(), this.K0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d H4(b0 b0Var) {
        return new d(gk0.c.a(b0Var.f50131a), b0Var.m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pi.i H6(b0 b0Var) {
        return new pi.i(new pb0.a(b0Var.f50144c0.get()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y30.a H7(b0 b0Var) {
        return new y30.a(b0Var.V8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fy.p H8() {
        return new fy.p(this.L0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u40.e I4(b0 b0Var) {
        return new u40.e(b0Var.q8());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fy.m I5(b0 b0Var) {
        return new fy.m(b0Var.G8(), b0Var.K0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static xu.a I6(b0 b0Var) {
        r00.f q82 = b0Var.q8();
        b0Var.f50221p.getClass();
        return new xu.a(new uu.c(q82));
    }

    static zy.c I7(b0 b0Var) {
        return new zy.c((VasistasRepository) ((a) b0Var.X0).get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public hx.h I8() {
        ex.b noteRepository = this.H0.get();
        this.f50155e.getClass();
        kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
        return new hx.h(noteRepository);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mv.a J4(b0 b0Var) {
        return new mv.a(b0Var.N8());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fy.n J5(b0 b0Var) {
        return new fy.n(b0Var.G8());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [r00.c] */
    static r00.c J6(b0 b0Var) {
        final s00.d webservices = b0Var.f50234r0.get();
        kotlin.jvm.internal.u.j(webservices, "webservices");
        return new SyncJobManager.LastUpdateApiProvider() { // from class: r00.c
            @Override // com.withings.webservices.legacy.sync.SyncJobManager.LastUpdateApiProvider
            public final LastUpdateApi getLastUpdateApi(String str) {
                s00.d webservices2 = s00.d.this;
                u.j(webservices2, "$webservices");
                return (LastUpdateApi) webservices2.c(LastUpdateApi.class, null, str, null, null, null, true);
            }
        };
    }

    private ri0.k J8() {
        return new ri0.k(J(), M8(), h9(), this.f50276y0.get(), Q8(), new fy.t(G8(), Q8()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hx.d K5(b0 b0Var) {
        ex.b noteRepository = b0Var.H0.get();
        b0Var.f50155e.getClass();
        kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
        return new hx.d(noteRepository);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LeaderboardSyncJobFactory K6(b0 b0Var) {
        return new LeaderboardSyncJobFactory(gk0.c.a(b0Var.f50131a), b0Var.D1.get());
    }

    static lj0.t K7(b0 b0Var) {
        return new lj0.t(b0Var.W0.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r6v5, types: [x80.a, java.lang.Object] */
    public qi0.e K8() {
        vf.c cVar = this.f50144c0.get();
        kn.e eVar = this.f50251u.get();
        fl.p a11 = fl.p.f67672b.a();
        ri0.j0 j0Var = new ri0.j0(this.f50144c0.get());
        lg.a o82 = o8();
        ri0.k J8 = J8();
        gk0.a aVar = this.f50131a;
        ri0.o oVar = new ri0.o(gk0.c.a(aVar));
        Context a12 = gk0.c.a(aVar);
        r20.a t82 = t8();
        this.f50137b.getClass();
        ri0.r rVar = new ri0.r(a12, new s20.d(t82));
        m20.c planRepository = this.f50247t1.get();
        kotlin.jvm.internal.u.j(planRepository, "planRepository");
        n20.a aVar2 = new n20.a(planRepository);
        m20.a planLocalLastUpdateRepository = this.f50253u1.get();
        kotlin.jvm.internal.u.j(planLocalLastUpdateRepository, "planLocalLastUpdateRepository");
        return new qi0.e(cVar, eVar, a11, j0Var, new qi0.a(o82, J8, oVar, rVar, new ri0.l(aVar2, new n20.g(planLocalLastUpdateRepository)), this.f50258v0.get()), new ri0.b(this.O.get(), new Object()), z8(), x8(), new ri0.g(this.E0.get()), new q70.f(d9()), new ri0.i(this.f50277y1.get(), this.f50283z1.get()), new qi0.j(this.f50258v0.get(), i9(), X8()), i9());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d00.d L5(b0 b0Var) {
        return new d00.d(b0Var.T0.get(), b0Var.P1.get(), b0Var.f50153d3.get());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [im.a, java.lang.Object] */
    static ag.f L6(b0 b0Var) {
        return new ag.f(b0Var.f50144c0.get(), b0Var.f50168g0.get(), new jg.a(new Object()), new GenerateAccountSession(b0Var.f50204m0.get()), new y90.b(gk0.c.a(b0Var.f50131a), b0Var.f50150d0.get(), b0Var.f50144c0.get(), b0Var.P8()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j00.e L7(b0 b0Var) {
        h00.a aVar = new h00.a(b0Var.f50283z1.get());
        b0Var.f50227q.getClass();
        return new j00.e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public hw.c L8() {
        return new hw.c(new iw.d(this.f50134a2.get(), this.f50140b2.get(), this.T0.get()));
    }

    static fy.c M4(b0 b0Var) {
        return new fy.c(b0Var.Q8(), new fy.q(b0Var.G8(), b0Var.K0.get()), b0Var.f50270x0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y60.a M5(b0 b0Var) {
        vr.e featureTagsRepository = b0Var.f50246t0.get();
        zb0.a B8 = b0Var.B8();
        kotlin.jvm.internal.u.j(featureTagsRepository, "featureTagsRepository");
        return new y60.a(featureTagsRepository, B8);
    }

    static x1 M6(b0 b0Var) {
        return new x1(gk0.c.a(b0Var.f50131a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pi.j M7(b0 b0Var) {
        PatientSessionRepository repository = (PatientSessionRepository) ((a) b0Var.Y0).get();
        kotlin.jvm.internal.u.j(repository, "repository");
        return new pi.j(repository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fy.v M8() {
        return new fy.v(Q8(), this.f50245t.get(), this.f50270x0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hx.e N5(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        lx.a w11 = roomDaoProvider.w();
        ah.p.d(w11);
        kx.j jVar = new kx.j(w11);
        b0Var.f50203m.getClass();
        return new hx.e(jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t80.c N6(b0 b0Var) {
        return new t80.c(b0Var.L0.get(), b0Var.f50270x0.get());
    }

    static bz.b N7(b0 b0Var) {
        return new bz.b((VasistasRepository) ((a) b0Var.X0).get());
    }

    private gv.a N8() {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) this.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        bv.a o11 = roomDaoProvider.o();
        ah.p.d(o11);
        return new gv.a(this.N1.get(), o11, this.f50156e0.get());
    }

    static DeviceScreenContentDao O4(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        DeviceScreenContentDao d11 = roomDaoProvider.d();
        ah.p.d(d11);
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ta0.a O6(b0 b0Var) {
        return new ta0.a(b0Var.f50251u.get(), bg.a.a(), b0Var.W0.get(), (lj0.n0) ((a) b0Var.E1).get(), new fy.i(b0Var.L0.get()), new ua0.c(b0Var.W0.get()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r12v0, types: [x80.a, java.lang.Object] */
    public qi0.g O8() {
        m70.i iVar = this.f50258v0.get();
        kn.e eVar = this.f50251u.get();
        fl.p a11 = fl.p.f67672b.a();
        ri0.h z82 = z8();
        lg.a o82 = o8();
        qi0.c x82 = x8();
        ri0.g gVar = new ri0.g(this.E0.get());
        gk0.a aVar = this.f50131a;
        ri0.o oVar = new ri0.o(gk0.c.a(aVar));
        ri0.b bVar = new ri0.b(this.O.get(), new Object());
        Context a12 = gk0.c.a(aVar);
        r20.a t82 = t8();
        this.f50137b.getClass();
        ri0.r rVar = new ri0.r(a12, new s20.d(t82));
        m20.c planRepository = this.f50247t1.get();
        kotlin.jvm.internal.u.j(planRepository, "planRepository");
        n20.a aVar2 = new n20.a(planRepository);
        m20.a planLocalLastUpdateRepository = this.f50253u1.get();
        kotlin.jvm.internal.u.j(planLocalLastUpdateRepository, "planLocalLastUpdateRepository");
        return new qi0.g(iVar, eVar, a11, z82, o82, x82, gVar, oVar, bVar, rVar, new ri0.l(aVar2, new n20.g(planLocalLastUpdateRepository)), new qi0.j(this.f50258v0.get(), i9(), X8()), J8());
    }

    static DeviceScreenDao P4(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        DeviceScreenDao e11 = roomDaoProvider.e();
        ah.p.d(e11);
        return e11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, aj0.a] */
    public static m60.a P5(b0 b0Var) {
        cj0.i Z8 = b0Var.Z8();
        ci0.a aVar = new ci0.a(new Object(), b0Var.J1.get());
        b0Var.f50215o.getClass();
        return new m60.a(Z8, aVar, new m60.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i00.c P6(b0 b0Var) {
        return new i00.c(b0Var.K0.get(), new GetNeuropathyDiagnostics(b0Var.f50285z3.get()), b0Var.L0.get(), b0Var.f50270x0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static iu.b P7(b0 b0Var) {
        hu.a taskContentRepository = b0Var.f50262v4.get();
        kotlin.jvm.internal.u.j(taskContentRepository, "taskContentRepository");
        return new iu.b(taskContentRepository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cg.l P8() {
        return new cg.l(this.f50144c0.get(), this.f50204m0.get(), this.f50168g0.get(), this.f50210n0.get());
    }

    static ri0.g Q4(b0 b0Var) {
        return new ri0.g(b0Var.E0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j00.c Q5(b0 b0Var) {
        h00.b repository = b0Var.N.get();
        b0Var.f50227q.getClass();
        kotlin.jvm.internal.u.j(repository, "repository");
        return new j00.c(repository);
    }

    static g Q6(b0 b0Var) {
        return new g(b0Var.O8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zx.v Q8() {
        sw.a measureDAO = this.f50264w0.get();
        kotlin.jvm.internal.u.j(measureDAO, "measureDAO");
        return new zx.v(measureDAO);
    }

    static DeviceScreensGroupDao R4(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        DeviceScreensGroupDao f11 = roomDaoProvider.f();
        ah.p.d(f11);
        return f11;
    }

    static SynchronizeDeviceScreens R7(b0 b0Var) {
        return new SynchronizeDeviceScreens(new GetDeviceScreens(b0Var.A0.get(), b0Var.B0.get(), b0Var.C0.get(), new GetDeviceScreensLastUpdate(b0Var.A0.get(), b0Var.B0.get(), b0Var.C0.get()), b0Var.D0.get()), new GetDeviceScreensContents(b0Var.B0.get(), b0Var.A0.get(), new GetDeviceScreensLastUpdate(b0Var.A0.get(), b0Var.B0.get(), b0Var.C0.get()), b0Var.D0.get()), new SendDeviceScreens(b0Var.A0.get(), b0Var.D0.get()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public pj0.d R8() {
        return new pj0.d(this.f50144c0.get(), this.f50222p0.get());
    }

    static sr.a S4(b0 b0Var) {
        return new sr.a(b0Var.f50263w.get(), PlatformFeatureModule_ProvidePlatformFeatureApiFactory.providePlatformFeatureApi(b0Var.q8()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hx.i S5(b0 b0Var) {
        ex.b repository = b0Var.H0.get();
        kotlin.jvm.internal.u.j(repository, "repository");
        return new hx.i(repository);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.withings.wiscale2.settings.k0 S6(b0 b0Var) {
        fl.e eVar;
        b0Var.getClass();
        eVar = fl.e.f67637h;
        if (eVar != null) {
            cg.l P8 = b0Var.P8();
            gk0.a aVar = b0Var.f50131a;
            return new com.withings.wiscale2.settings.k0(eVar, bg.a.a(), b0Var.f50152d2.get(), (AuthenticationService) ((a) b0Var.f50174h0).get(), P8, new rh.i(gk0.c.a(aVar), new y90.e(gk0.c.a(aVar))));
        }
        kotlin.jvm.internal.u.s("instance");
        throw null;
    }

    static SynchronizeLocationVasistas S7(b0 b0Var) {
        return new SynchronizeLocationVasistas(b0Var.T0.get(), new GetLastLocationVasistas(new GetLastGpsLocationSyncedDate(b0Var.Z0.get()), new GetLocationVasistas(new SaveGpsLocations(b0Var.Z0.get(), new GpsLocationEntityMapper()), new GpsLocationSerializer(), b0Var.f50133a1.get())), new SendLocationVasistas(new GetFirstAndLastGpsLocationNotSyncedDates(b0Var.Z0.get()), new GetGpsLocationsNotSynced(b0Var.Z0.get(), new GpsLocationEntityMapper()), new SaveGpsLocations(b0Var.Z0.get(), new GpsLocationEntityMapper()), new DeleteGpsLocations(b0Var.Z0.get()), new GpsLocationSerializer(), b0Var.f50133a1.get(), b0Var.f50269x.get(), new PartitionOneLocationPerSeconds()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public x00.b S8() {
        ww.b timelineManager = this.S0.get();
        z00.b bVar = new z00.b(new z00.c(this.S0.get()), new si0.b(this.T0.get()));
        kotlin.jvm.internal.u.j(timelineManager, "timelineManager");
        return new x00.b(timelineManager, bVar);
    }

    static sr.b T4(b0 b0Var) {
        return new sr.b(b0Var.f50263w.get(), PlatformFeatureModule_ProvidePlatformFeatureApiFactory.providePlatformFeatureApi(b0Var.q8()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s20.b T5(b0 b0Var) {
        r20.a t82 = b0Var.t8();
        b0Var.f50137b.getClass();
        return new s20.b(t82);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.android.billingclient.api.v] */
    static x20.e T7(b0 b0Var) {
        return new x20.e(b0Var.M0.get(), new RetrofitRemotePredictionRepository(b0Var.q8(), null, 2, null), new Object(), b0Var.V.get());
    }

    private a30.f T8() {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) this.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        a30.f F = roomDaoProvider.F();
        ah.p.d(F);
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pi.b U4(b0 b0Var) {
        PatientSessionRepository repository = (PatientSessionRepository) ((a) b0Var.Y0).get();
        kotlin.jvm.internal.u.j(repository, "repository");
        return new pi.b(repository);
    }

    static u30.a U5(b0 b0Var) {
        return new u30.a(b0Var.M1.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z00.d U6(b0 b0Var) {
        ww.b timelineManager = b0Var.S0.get();
        z00.c cVar = new z00.c(b0Var.S0.get());
        kotlin.jvm.internal.u.j(timelineManager, "timelineManager");
        return new z00.d(timelineManager, cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static yl.e U7(b0 b0Var) {
        return new yl.e(b0Var.Q1.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k30.h U8() {
        k30.d dVar = new k30.d(T8());
        k30.l lVar = new k30.l(q8(), null);
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) this.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        a30.o I = roomDaoProvider.I();
        ah.p.d(I);
        return new k30.h(dVar, lVar, new n30.e(new n30.b(I), new n30.f(q8())), new u30.c(gk0.c.a(this.f50131a)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h30.c V4(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        a30.a h11 = roomDaoProvider.h();
        ah.p.d(h11);
        com.withings.wiscale2.data.s roomDaoProvider2 = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider2, "roomDaoProvider");
        a30.j G = roomDaoProvider2.G();
        ah.p.d(G);
        return new h30.c(h11, G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u30.b V5(b0 b0Var) {
        return new u30.b(b0Var.f50164f2.get(), new ah.d0(b0Var.f50144c0.get()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jm.a V6(b0 b0Var) {
        return a.d.a(gk0.c.a(b0Var.f50131a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static or.i V7(b0 b0Var) {
        return new or.i(b0Var.y8(), new or.b(b0Var.y8()), new or.d(b0Var.y8()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o30.d V8() {
        a30.f T8 = T8();
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) this.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        a30.q J = roomDaoProvider.J();
        ah.p.d(J);
        com.withings.wiscale2.data.s roomDaoProvider2 = (com.withings.wiscale2.data.s) ((a) this.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider2, "roomDaoProvider");
        f60.a M = roomDaoProvider2.M();
        ah.p.d(M);
        return new o30.d(T8, J, M);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v1, types: [im.a, java.lang.Object] */
    public static jg.a W4(b0 b0Var) {
        b0Var.getClass();
        return new jg.a(new Object());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kg0.a W5(b0 b0Var) {
        return new kg0.a(b0Var.K1.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ri0.s W8() {
        u30.a aVar = new u30.a(this.M1.get());
        x30.h mostRecentEnrolledProgramLastUpdateUseCase = getMostRecentEnrolledProgramLastUpdateUseCase();
        j30.c enrolledRepository = enrolledRepository();
        return new ri0.s(aVar, mostRecentEnrolledProgramLastUpdateUseCase, (i30.b) enrolledRepository, U8(), fetchTasksProgramByIdUseCase(), b9(), new xt.c(q8(), null), new u30.c(gk0.c.a(this.f50131a)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gg0.a X4(b0 b0Var) {
        return new gg0.a(b0Var.C8(), b0Var.D8(), b0Var.H8(), new fy.n(b0Var.G8()), b0Var.F8(), b0Var.g9(), b0Var.M8(), b0Var.u8(), b0Var.a9(), b0Var.y(), b0Var.A8());
    }

    static oi.a X5(b0 b0Var) {
        return new oi.a(b0Var.f50156e0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cy.a X6(b0 b0Var) {
        return new cy.a(b0Var.f50270x0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.d] */
    public static ks.t X7(b0 b0Var) {
        b0Var.getClass();
        return new ks.t(new Object());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zx.t X8() {
        return new zx.t(this.f50251u.get(), this.f50258v0.get(), this.f50245t.get(), new fy.f(E8(), Q8()), new fy.s(E8(), Q8()), this.f50276y0.get(), this.f50264w0.get(), u8(), new d(gk0.c.a(this.f50131a), m()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gg0.c Y4(b0 b0Var) {
        return new gg0.c(b0Var.C8(), b0Var.D8(), b0Var.H8(), new fy.n(b0Var.G8()), b0Var.F8(), b0Var.g9(), b0Var.M8(), b0Var.u8(), b0Var.a9());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n20.b Y5(b0 b0Var) {
        n20.k j92 = b0Var.j9();
        m20.c planRepository = b0Var.f50247t1.get();
        kotlin.jvm.internal.u.j(planRepository, "planRepository");
        return new n20.b(j92, new n20.c(planRepository));
    }

    static yz.b Y6(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        tz.a v11 = roomDaoProvider.v();
        ah.p.d(v11);
        return new yz.b(b0Var.O1.get(), v11);
    }

    static com.withings.comm.trace.c Y7(b0 b0Var) {
        return new com.withings.comm.trace.c(gk0.c.a(b0Var.f50131a));
    }

    private ri0.b0 Y8() {
        return new ri0.b0(gk0.c.a(this.f50131a), new sq.f(j()), this.H0.get(), this.A1.get(), this.B1.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hg0.a Z4(b0 b0Var) {
        return new hg0.a(b0Var.C8(), b0Var.W0.get(), dagger.internal.a.a(b0Var.E1), b0Var.f50223p1.get(), b0Var.J1.get(), b0Var.K1.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mv.f Z5(b0 b0Var) {
        return new mv.f(b0Var.b9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, aj0.a] */
    public cj0.i Z8() {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) this.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        ei0.m K = roomDaoProvider.K();
        ah.p.d(K);
        return new cj0.i(this.J1.get(), K, new Object());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ig0.a a5(b0 b0Var) {
        return new ig0.a(b0Var.C8(), b0Var.W0.get(), dagger.internal.a.a(b0Var.E1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ox.e a6(b0 b0Var) {
        ex.b noteRepository = b0Var.H0.get();
        m70.i userManager = b0Var.f50258v0.get();
        b0Var.f50149d.getClass();
        kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        return new ox.e(noteRepository, userManager);
    }

    static m60.b a7(b0 b0Var) {
        b0Var.f50215o.getClass();
        return new m60.b(new m60.d());
    }

    private ny.d a9() {
        iy.d measuresGroupRemoteRepository = this.f50276y0.get();
        ny.a J = J();
        kotlin.jvm.internal.u.j(measuresGroupRemoteRepository, "measuresGroupRemoteRepository");
        return new ny.d(measuresGroupRemoteRepository, J);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vm.j b5(b0 b0Var) {
        gr.a factorRepository = b0Var.J0.get();
        kotlin.jvm.internal.u.j(factorRepository, "factorRepository");
        return new vm.j(factorRepository);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hx.k b6(b0 b0Var) {
        ex.b noteRepository = b0Var.H0.get();
        b0Var.f50155e.getClass();
        kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
        return new hx.k(noteRepository);
    }

    static nx.b b7(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        nx.b x11 = roomDaoProvider.x();
        ah.p.d(x11);
        return x11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q70.j b8(b0 b0Var) {
        return new q70.j(b0Var.i(), b0Var.T0.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public hv.b b9() {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) this.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        bv.a o11 = roomDaoProvider.o();
        ah.p.d(o11);
        cv.a libraryDataStore = this.N1.get();
        hv.a aVar = new hv.a(q8());
        kotlin.jvm.internal.u.j(libraryDataStore, "libraryDataStore");
        return new hv.b(o11, libraryDataStore, aVar);
    }

    static a40.a c6(b0 b0Var) {
        return new a40.a((l30.c) ((a) b0Var.f50175h1).get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ym.k c7(b0 b0Var) {
        iy.e measuresGroupRepositoryV2 = b0Var.L0.get();
        zx.j measureListenerManagerInterface = b0Var.f50270x0.get();
        hx.h I8 = b0Var.I8();
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        kotlin.jvm.internal.u.j(measureListenerManagerInterface, "measureListenerManagerInterface");
        return new ym.k(measuresGroupRepositoryV2, measureListenerManagerInterface, I8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public an.c c9() {
        ej.w a11 = bg.a.a();
        kn.e deviceManager = this.f50251u.get();
        fl.p a12 = fl.p.f67672b.a();
        RoomDeviceScreensRepository deviceScreensRepository = this.E0.get();
        ex.b noteRepository = this.H0.get();
        ex.a lastCycleTrackingSyncRepository = (ex.a) ((a) this.X).get();
        zb0.b t11 = t();
        vm.a0 P = P();
        vm.o M = M();
        iy.e measuresGroupRepository = this.L0.get();
        zx.j measureListenerManagerInterface = this.f50270x0.get();
        vm.f y11 = y();
        um.a F = F();
        kotlin.jvm.internal.u.j(deviceScreensRepository, "deviceScreensRepository");
        kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
        kotlin.jvm.internal.u.j(lastCycleTrackingSyncRepository, "lastCycleTrackingSyncRepository");
        kotlin.jvm.internal.u.j(measuresGroupRepository, "measuresGroupRepository");
        kotlin.jvm.internal.u.j(measureListenerManagerInterface, "measureListenerManagerInterface");
        an.b bVar = new an.b(deviceScreensRepository, noteRepository, lastCycleTrackingSyncRepository, t11, P, M, measuresGroupRepository, measureListenerManagerInterface, y11, F);
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        return new an.c(a11, deviceManager, a12, bVar);
    }

    static w30.b d6(b0 b0Var) {
        return new w30.b((l30.c) ((a) b0Var.f50175h1).get(), new x30.a(b0Var.M1.get()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y60.d d8(b0 b0Var) {
        u60.a featureActivationUseCase = b0Var.H3.get();
        zb0.a B8 = b0Var.B8();
        kotlin.jvm.internal.u.j(featureActivationUseCase, "featureActivationUseCase");
        return new y60.d(featureActivationUseCase, B8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q70.g d9() {
        return new q70.g(new m70.d(this.f50258v0.get(), new q70.j(i(), this.T0.get()), this.f50252u0.get()), i(), this.T0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mv.b e5(b0 b0Var) {
        return new mv.b(b0Var.N8());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static rt.a e6(b0 b0Var) {
        return new rt.a(b0Var.W1.get());
    }

    static PatientSessionDao e7(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        PatientSessionDao A = roomDaoProvider.A();
        ah.p.d(A);
        return A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j00.f e8(b0 b0Var) {
        h00.b repository = b0Var.N.get();
        b0Var.f50227q.getClass();
        kotlin.jvm.internal.u.j(repository, "repository");
        return new j00.f(repository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ri0.h0 e9() {
        Context a11 = gk0.c.a(this.f50131a);
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) this.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        bj0.f N = roomDaoProvider.N();
        ah.p.d(N);
        return new ri0.h0(a11, N, this.f50251u.get(), this.I1.get(), this.f50223p1.get(), this.J1.get(), this.T0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mv.c f5(b0 b0Var) {
        return new mv.c(b0Var.N8());
    }

    static lj0.j f6(b0 b0Var) {
        return new lj0.j(b0Var.W0.get(), b0Var.G1.get(), b0Var.F1.get(), b0Var.H1.get());
    }

    static j20.b f7(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        i20.a B = roomDaoProvider.B();
        ah.p.d(B);
        return new j20.b(B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public lg.o f9() {
        return new lg.o(this.f50235r1.get(), this.H.get(), this.J.get(), this.f50241s1.get());
    }

    static d00.a g5(b0 b0Var) {
        return new d00.a(b0Var.P1.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lj0.k g6(b0 b0Var) {
        return new lj0.k(b0Var.G1.get(), b0Var.W0.get());
    }

    static j20.e g7(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        i20.a B = roomDaoProvider.B();
        ah.p.d(B);
        return new j20.e(B, new j20.f(b0Var.q8(), null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cg.n g8(b0 b0Var) {
        return new cg.n(gk0.c.a(b0Var.f50131a));
    }

    private fy.b0 g9() {
        return new fy.b0(Q8());
    }

    static iu.a h5(b0 b0Var) {
        hu.a taskContentRepository = b0Var.f50262v4.get();
        kotlin.jvm.internal.u.j(taskContentRepository, "taskContentRepository");
        return new iu.a(taskContentRepository);
    }

    static f h6(b0 b0Var) {
        return new f(b0Var.K8());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zb0.c h7(b0 b0Var) {
        return new zb0.c(b0Var.N2.get(), b0Var.f50251u.get(), b0Var.f50263w.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.withings.wiscale2.vo2max.b h8(b0 b0Var) {
        return new com.withings.wiscale2.vo2max.b(gk0.c.a(b0Var.f50131a), b0Var.S8(), new d10.a(b0Var.S8()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fy.c0 h9() {
        return new fy.c0(new fy.a0(Q8()), g9(), this.f50245t.get(), this.f50270x0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j00.b i5(b0 b0Var) {
        h00.a aVar = new h00.a(b0Var.f50283z1.get());
        b0Var.f50227q.getClass();
        return new j00.b(aVar);
    }

    static PlatformFeatureDao i7(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        PlatformFeatureDao C = roomDaoProvider.C();
        ah.p.d(C);
        return C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nj0.e i8(b0 b0Var) {
        return new nj0.e(new com.withings.wiscale2.vo2max.b(gk0.c.a(b0Var.f50131a), b0Var.S8(), new d10.a(b0Var.S8())), b0Var.f50258v0.get(), b0Var.f50251u.get(), b0Var.M8(), b0Var.T(), new fy.n(b0Var.G8()), b0Var.F8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public qi0.i i9() {
        m70.i iVar = this.f50258v0.get();
        zx.t X8 = X8();
        ri0.k J8 = J8();
        ri0.b0 Y8 = Y8();
        gk0.a aVar = this.f50131a;
        RecognitionManager recognitionManager = RecognitionManager.get(gk0.c.a(aVar));
        kotlin.jvm.internal.u.i(recognitionManager, "get(...)");
        ri0.d dVar = new ri0.d(recognitionManager, this.C1.get(), this.T0.get());
        ri0.k0 k0Var = new ri0.k0(gk0.c.a(aVar), this.D1.get(), this.W0.get(), this.f50251u.get(), (lj0.n0) ((a) this.E1).get(), this.f50269x.get(), this.F1.get(), this.G1.get(), this.H1.get(), this.T0.get());
        ri0.h0 e92 = e9();
        ri0.m mVar = new ri0.m(this.f50139b1.get());
        ri0.e p82 = p8();
        ri0.l0 l0Var = new ri0.l0(gk0.c.a(aVar), this.K1.get(), this.L1.get());
        ri0.e0 h11 = h();
        ri0.s W8 = W8();
        ri0.p pVar = new ri0.p(gk0.c.a(aVar), new d00.a(this.P1.get()));
        ri0.c cVar = new ri0.c(this.R1.get());
        ri0.a aVar2 = new ri0.a(gk0.c.a(aVar), this.S1.get(), this.T1.get());
        ri0.q qVar = new ri0.q(gk0.c.a(aVar), this.f50217o1.get(), this.f50211n1.get());
        FoodManager foodManager = FoodManager.Companion.get();
        ah.p.d(foodManager);
        ri0.j jVar = new ri0.j(gk0.c.a(aVar), this.f50217o1.get(), foodManager, this.U1.get());
        ri0.u uVar = new ri0.u(gk0.c.a(aVar));
        ri0.d0 d0Var = new ri0.d0(dl.a.a(), this.V1.get(), this.T0.get());
        ri0.n nVar = new ri0.n(s8());
        LeaderboardSyncJobFactory leaderboardSyncJobFactory = new LeaderboardSyncJobFactory(gk0.c.a(aVar), this.D1.get());
        qt.b bVar = this.W1.get();
        qt.a aVar3 = this.Y1.get();
        qt.c cVar2 = this.Z1.get();
        n20.k j92 = j9();
        m20.c planRepository = this.f50247t1.get();
        kotlin.jvm.internal.u.j(planRepository, "planRepository");
        n20.b bVar2 = new n20.b(j92, new n20.c(planRepository));
        ot.b bVar3 = this.U.get();
        n20.k j93 = j9();
        m20.c planRepository2 = this.f50247t1.get();
        kotlin.jvm.internal.u.j(planRepository2, "planRepository");
        return new qi0.i(iVar, X8, J8, Y8, dVar, k0Var, e92, mVar, p82, l0Var, h11, W8, pVar, cVar, aVar2, qVar, jVar, uVar, d0Var, nVar, leaderboardSyncJobFactory, new ot.n(bVar, aVar3, cVar2, bVar2, bVar3, j93, new n20.c(planRepository2)), new y20.b(this.N0.get()), L8(), new kr.b(this.P0.get()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fy.d j5(b0 b0Var) {
        return new fy.d(b0Var.Q8(), b0Var.f50270x0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y90.e j6(b0 b0Var) {
        return new y90.e(gk0.c.a(b0Var.f50131a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qr.a j7(b0 b0Var) {
        return PlatformFeatureModule_ProvidePlatformFeatureApiFactory.providePlatformFeatureApi(b0Var.q8());
    }

    static u30.c j8(b0 b0Var) {
        return new u30.c(gk0.c.a(b0Var.f50131a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n20.k j9() {
        m20.c planRepository = this.f50247t1.get();
        kotlin.jvm.internal.u.j(planRepository, "planRepository");
        return new n20.k(planRepository);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fy.f k5(b0 b0Var) {
        return new fy.f(b0Var.E8(), b0Var.Q8());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static rh.i k6(b0 b0Var) {
        gk0.a aVar = b0Var.f50131a;
        return new rh.i(gk0.c.a(aVar), new y90.e(gk0.c.a(aVar)));
    }

    static y20.b k7(b0 b0Var) {
        return new y20.b(b0Var.N0.get());
    }

    static ri0.j l5(b0 b0Var) {
        FoodManager foodManager = FoodManager.Companion.get();
        ah.p.d(foodManager);
        return new ri0.j(gk0.c.a(b0Var.f50131a), b0Var.f50217o1.get(), foodManager, b0Var.U1.get());
    }

    static GpsLocationFilter l6(b0 b0Var) {
        b0Var.getClass();
        return LocationProviderModule_ProvideGpsLocationFilterFactory.provideGpsLocationFilter(new AndroidGpsDistanceComputer());
    }

    static vf.q l7(b0 b0Var) {
        Context a11 = gk0.c.a(b0Var.f50131a);
        AndroidKeyStoreCipher keyStoreCipher = b0Var.f50281z.get();
        kotlin.jvm.internal.u.j(keyStoreCipher, "keyStoreCipher");
        return new vf.q(a11, keyStoreCipher);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ri0.l0 l8(b0 b0Var) {
        return new ri0.l0(gk0.c.a(b0Var.f50131a), b0Var.K1.get(), b0Var.L1.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eg.a m4(b0 b0Var) {
        vf.c accountDataProvider = b0Var.f50144c0.get();
        kotlin.jvm.internal.u.j(accountDataProvider, "accountDataProvider");
        return new eg.a(accountDataProvider);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d90.a m5(b0 b0Var) {
        c90.b repository = b0Var.f50231q3.get();
        kotlin.jvm.internal.u.j(repository, "repository");
        return new d90.a(repository);
    }

    static sh0.a m6(b0 b0Var) {
        return new sh0.a(b0Var.Q8());
    }

    static xt.c m7(b0 b0Var) {
        return new xt.c(b0Var.q8(), null);
    }

    static rj0.e m8(b0 b0Var) {
        b0Var.getClass();
        return new rj0.e(b0Var.K1.get(), (ComputePace) ((a) b0Var.f50169g1).get(), (ComputeSpeed) ((a) b0Var.f50163f1).get());
    }

    static wf.a n4(b0 b0Var) {
        return new wf.a(b0Var.A.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x30.a n5(b0 b0Var) {
        return new x30.a(b0Var.M1.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fy.s n6(b0 b0Var) {
        return new fy.s(b0Var.E8(), b0Var.Q8());
    }

    static xt.b n7(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        a30.d E = roomDaoProvider.E();
        ah.p.d(E);
        return new xt.b(new xt.a(E), new xt.c(b0Var.q8(), null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, aj0.c] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, aj0.b] */
    public static cj0.l n8(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        bj0.f N = roomDaoProvider.N();
        ah.p.d(N);
        return new cj0.l(b0Var.f50223p1.get(), N, new aj0.d(new Object(), new Object()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r4v8, types: [hx.b, java.lang.Object] */
    public static vm.a o4(b0 b0Var) {
        um.a F = b0Var.F();
        iy.e measuresGroupRepositoryV2 = b0Var.L0.get();
        ym.d dVar = new ym.d();
        vm.n A8 = b0Var.A8();
        ny.d a92 = b0Var.a9();
        ny.b v82 = b0Var.v8();
        ny.a J = b0Var.J();
        iy.d measuresGroupRemoteRepository = b0Var.f50276y0.get();
        fy.b0 g92 = b0Var.g9();
        xm.b cycleTrackingSettingsRepository = b0Var.O0.get();
        an.c c92 = b0Var.c9();
        t20.a syncPredictionsUseCase = b0Var.f50280y4.get();
        v20.e predictionRepository = b0Var.N0.get();
        vm.f y11 = b0Var.y();
        vm.g w82 = b0Var.w8();
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        kotlin.jvm.internal.u.j(measuresGroupRemoteRepository, "measuresGroupRemoteRepository");
        kotlin.jvm.internal.u.j(cycleTrackingSettingsRepository, "cycleTrackingSettingsRepository");
        kotlin.jvm.internal.u.j(syncPredictionsUseCase, "syncPredictionsUseCase");
        kotlin.jvm.internal.u.j(predictionRepository, "predictionRepository");
        return new vm.a(F, measuresGroupRepositoryV2, dVar, new Object(), A8, a92, v82, J, measuresGroupRemoteRepository, g92, cycleTrackingSettingsRepository, c92, syncPredictionsUseCase, predictionRepository, y11, w82);
    }

    static x30.e o5(b0 b0Var) {
        return new x30.e(b0Var.f50164f2.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y60.b o6(b0 b0Var) {
        vr.e featureTagsRepository = b0Var.f50246t0.get();
        zb0.a B8 = b0Var.B8();
        kotlin.jvm.internal.u.j(featureTagsRepository, "featureTagsRepository");
        return new y60.b(featureTagsRepository, B8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public lg.a o8() {
        Context a11 = gk0.c.a(this.f50131a);
        vf.c cVar = this.f50144c0.get();
        l70.w wVar = this.H.get();
        h10.a aVar = this.J.get();
        return new lg.a(a11, this.f50241s1.get(), cVar, f9(), this.f50235r1.get(), aVar, wVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r2v0, types: [hx.b, java.lang.Object] */
    public static ym.b p4(b0 b0Var) {
        return new ym.b(new Object(), b0Var.a9(), b0Var.v8());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static is.b p5(b0 b0Var) {
        b0Var.getClass();
        return new is.b(new ds.b(dl.a.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HasEnoughGpsLocations p6(b0 b0Var) {
        b0Var.getClass();
        return LocationProviderModule_ProvideHasEnoughGpsLocationsFactory.provideHasEnoughGpsLocations(LocationProviderModule_ProvideCountTotalGapDurationFactory.provideCountTotalGapDuration(new AndroidGpsDistanceComputer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ri0.e p8() {
        return new ri0.e(this.f50205m1.get(), this.G.get(), this.V0.get(), isProgramRunningUseCase());
    }

    static y90.b q4(b0 b0Var) {
        return new y90.b(gk0.c.a(b0Var.f50131a), b0Var.f50150d0.get(), b0Var.f50144c0.get(), b0Var.P8());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pi.c q5(b0 b0Var) {
        PatientSessionRepository repository = (PatientSessionRepository) ((a) b0Var.Y0).get();
        kotlin.jvm.internal.u.j(repository, "repository");
        return new pi.c(repository);
    }

    static mx.a q6(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        mx.a m11 = roomDaoProvider.m();
        ah.p.d(m11);
        return m11;
    }

    static o30.g q7(b0 b0Var) {
        return new o30.g(b0Var.q8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r00.f q8() {
        return r00.g.a(this.f50234r0.get(), this.f50240s0.get());
    }

    static ri0.a r4(b0 b0Var) {
        return new ri0.a(gk0.c.a(b0Var.f50131a), b0Var.S1.get(), b0Var.T1.get());
    }

    static fw.a r6(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        fw.a n11 = roomDaoProvider.n();
        ah.p.d(n11);
        return n11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public tt.a r8() {
        c00.b missionRepository = this.P1.get();
        c00.b missionRepository2 = this.P1.get();
        kotlin.jvm.internal.u.j(missionRepository2, "missionRepository");
        tt.e eVar = new tt.e(missionRepository2);
        kotlin.jvm.internal.u.j(missionRepository, "missionRepository");
        return new tt.a(missionRepository, eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ey.a s4(b0 b0Var) {
        return new ey.a(new fy.x(new ey.b(b0Var.Q8())));
    }

    static n20.d s7(b0 b0Var) {
        m20.c planRepository = b0Var.f50247t1.get();
        kotlin.jvm.internal.u.j(planRepository, "planRepository");
        return new n20.d(planRepository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ng0.b s8() {
        return new ng0.b(dl.a.a(), this.F1.get(), this.f50263w.get(), this.T0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j00.a t4(b0 b0Var) {
        h00.a aVar = new h00.a(b0Var.f50283z1.get());
        b0Var.f50227q.getClass();
        return new j00.a(aVar);
    }

    static qh0.d t5(b0 b0Var) {
        return new qh0.d(b0Var.f50225p3.get());
    }

    static rf0.a t6(b0 b0Var) {
        return new rf0.a(b0Var.J1.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n20.f t7(b0 b0Var) {
        m20.c planRepository = b0Var.f50247t1.get();
        kotlin.jvm.internal.u.j(planRepository, "planRepository");
        return new n20.f(planRepository);
    }

    private r20.a t8() {
        return new r20.a(this.E.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g30.b u4(b0 b0Var) {
        return new g30.b(b0Var.q8());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static rq.f u5(b0 b0Var) {
        b0Var.getClass();
        return new rq.f(new rq.g(), b0Var.f50181i1.get(), b0Var.f50263w.get());
    }

    static gt.a u6(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        gt.a p11 = roomDaoProvider.p();
        ah.p.d(p11);
        return p11;
    }

    static qi0.h u7(b0 b0Var) {
        return new qi0.h(b0Var.o8(), b0Var.J8(), b0Var.Y8(), b0Var.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fy.a u8() {
        return new fy.a(Q8(), new fy.d(Q8(), this.f50270x0.get()), new ey.a(new fy.x(new ey.b(Q8()))), this.f50270x0.get());
    }

    static is.a v4(b0 b0Var) {
        fs.a dataStore = b0Var.Q.get();
        kotlin.jvm.internal.u.j(dataStore, "dataStore");
        return new is.a(dataStore);
    }

    static x30.f v5(b0 b0Var) {
        return new x30.f(b0Var.U8());
    }

    static lt.a v6(b0 b0Var) {
        ActivityAggregateManager activityAggregateManager = b0Var.F1.get();
        TargetRepository a11 = dl.a.a();
        m70.i userManager = b0Var.f50258v0.get();
        nt.b healthScoreSleepDataRepository = b0Var.X1.get();
        iy.e measuresGroupRepositoryV2 = b0Var.L0.get();
        rt.a aVar = new rt.a(b0Var.W1.get());
        b0Var.f50185j.getClass();
        kotlin.jvm.internal.u.j(activityAggregateManager, "activityAggregateManager");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(healthScoreSleepDataRepository, "healthScoreSleepDataRepository");
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        return new lt.a(activityAggregateManager, a11, userManager, healthScoreSleepDataRepository, measuresGroupRepositoryV2, aVar);
    }

    static RetrofitRemoteFactorRepository v7(b0 b0Var) {
        return new RetrofitRemoteFactorRepository(b0Var.q8(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ny.b v8() {
        iy.d measuresGroupRemoteRepository = this.f50276y0.get();
        zx.v Q8 = Q8();
        zx.j measureListenerManager = this.f50270x0.get();
        kotlin.jvm.internal.u.j(measuresGroupRemoteRepository, "measuresGroupRemoteRepository");
        kotlin.jvm.internal.u.j(measureListenerManager, "measureListenerManager");
        return new ny.b(measuresGroupRemoteRepository, Q8, measureListenerManager);
    }

    static s20.a w4(b0 b0Var) {
        r20.a t82 = b0Var.t8();
        b0Var.f50137b.getClass();
        return new s20.a(t82);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l2.d] */
    public static h70.b w5(b0 b0Var) {
        return new h70.b((ch.d) ((a) b0Var.Q0).get(), new Object());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static xb0.b w6(b0 b0Var) {
        return new xb0.b(b0Var.f50251u.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vm.v w7(b0 b0Var) {
        um.a F = b0Var.F();
        hx.h I8 = b0Var.I8();
        gr.a factorRepository = b0Var.J0.get();
        kotlin.jvm.internal.u.j(factorRepository, "factorRepository");
        return new vm.v(F, I8, factorRepository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vm.g w8() {
        ny.b v82 = v8();
        fy.b0 g92 = g9();
        um.a F = F();
        iy.e measuresGroupRepositoryV2 = this.L0.get();
        iy.d measuresGroupRemoteRepository = this.f50276y0.get();
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        kotlin.jvm.internal.u.j(measuresGroupRemoteRepository, "measuresGroupRemoteRepository");
        return new vm.g(F, g92, measuresGroupRemoteRepository, measuresGroupRepositoryV2, v82);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.d] */
    /* JADX WARN: Type inference failed for: r7v3, types: [mo.a, java.lang.Object] */
    public static es.c x5(b0 b0Var) {
        iy.e measuresGroupRepositoryV2 = b0Var.L0.get();
        om.b accountUnitsFlow = b0Var.J3.get();
        is.b bVar = new is.b(new ds.b(dl.a.a()));
        zx.j measureListenerManagerInterface = b0Var.f50270x0.get();
        new ah.c0();
        n90.d dVar = new n90.d(new Object(), new ks.t(new Object()));
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        kotlin.jvm.internal.u.j(accountUnitsFlow, "accountUnitsFlow");
        kotlin.jvm.internal.u.j(measureListenerManagerInterface, "measureListenerManagerInterface");
        return new es.c(measuresGroupRepositoryV2, accountUnitsFlow, bVar, measureListenerManagerInterface, dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static xb0.c x6(b0 b0Var) {
        return new xb0.c(b0Var.f50251u.get());
    }

    static RoomGpsLocationDao x7(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        RoomGpsLocationDao l5 = roomDaoProvider.l();
        ah.p.d(l5);
        return l5;
    }

    private qi0.c x8() {
        gk0.a aVar = this.f50131a;
        return new qi0.c(gk0.c.a(aVar), this.f50251u.get(), this.f50156e0.get(), new ri0.g0(gk0.c.a(aVar), this.f50251u.get(), this.f50228q0.get(), this.f50259v1.get(), new lj.c(q8())), new ri0.f(this.f50245t.get(), this.f50265w1.get(), this.f50251u.get()), (ug0.c) ((a) this.f50271x1).get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static yl.c y5(b0 b0Var) {
        return new yl.c(b0Var.Q1.get());
    }

    static ah.z y6(b0 b0Var) {
        return new ah.z(b0Var.f50144c0.get());
    }

    static yf.g y7(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        yf.g q11 = roomDaoProvider.q();
        ah.p.d(q11);
        return q11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public nr.e y8() {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) this.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        mr.a k11 = roomDaoProvider.k();
        ah.p.d(k11);
        return new nr.e(this.f50156e0.get(), k11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fy.i z5(b0 b0Var) {
        return new fy.i(b0Var.L0.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static xb0.d z6(b0 b0Var) {
        return new xb0.d(b0Var.f50251u.get(), b0Var.f50152d2.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hx.n z7(b0 b0Var) {
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) b0Var.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        lx.a w11 = roomDaoProvider.w();
        ah.p.d(w11);
        kx.j jVar = new kx.j(w11);
        b0Var.f50203m.getClass();
        return new hx.n(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ri0.h z8() {
        return new ri0.h(PlatformFeatureModule_ProvidePlatformFeatureApiFactory.providePlatformFeatureApi(q8()), this.f50263w.get(), this.P.get());
    }

    @Override // com.withings.notifications.ui.r0
    public final w00.a A() {
        x00.b S8 = S8();
        ch.d intentBuilder = (ch.d) ((a) this.Q0).get();
        kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
        return new w00.a((ch.d) ((a) this.Q0).get(), new com.withings.wiscale2.partner.ui.c2(S8, intentBuilder), S8());
    }

    @Override // com.withings.wiscale2.x1.a
    public final pj0.a B() {
        return new pj0.a(R8());
    }

    @Override // dk0.a.InterfaceC0843a
    public final Set<Boolean> C() {
        return com.google.common.collect.y.x();
    }

    @Override // zm.d
    public final ky.c D() {
        return this.f50270x0.get();
    }

    @Override // al.e
    public final com.withings.comm.trace.e E() {
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        kotlin.jvm.internal.u.i(a11, "get(...)");
        return a11;
    }

    @Override // zm.d
    public final um.a F() {
        zx.j measureListenerManagerInterface = this.f50270x0.get();
        iy.e measuresGroupRepositoryV2 = this.L0.get();
        v20.e predictionRepository = this.N0.get();
        gr.a factorRepository = this.J0.get();
        xm.b cycleTrackingSettingsRepository = this.O0.get();
        vm.n A8 = A8();
        er.a syncFactorUseCase = this.P0.get();
        ym.d dVar = new ym.d();
        gr.a factorRepository2 = this.J0.get();
        kotlin.jvm.internal.u.j(factorRepository2, "factorRepository");
        vm.j jVar = new vm.j(factorRepository2);
        kotlin.jvm.internal.u.j(measureListenerManagerInterface, "measureListenerManagerInterface");
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        kotlin.jvm.internal.u.j(predictionRepository, "predictionRepository");
        kotlin.jvm.internal.u.j(factorRepository, "factorRepository");
        kotlin.jvm.internal.u.j(cycleTrackingSettingsRepository, "cycleTrackingSettingsRepository");
        kotlin.jvm.internal.u.j(syncFactorUseCase, "syncFactorUseCase");
        return new um.a(cycleTrackingSettingsRepository, dVar, jVar, A8, syncFactorUseCase, factorRepository, measuresGroupRepositoryV2, measureListenerManagerInterface, predictionRepository);
    }

    @Override // og0.l.a
    public final e40.c G() {
        return new e40.c();
    }

    @Override // com.withings.wiscale2.m1
    public final void H(HealthmateApplication healthmateApplication) {
        H8();
        healthmateApplication.getClass();
        T();
        healthmateApplication.f47894c = new fy.m(G8(), this.K0.get());
        healthmateApplication.f47896d = new fy.i(this.L0.get());
        r20.a t82 = t8();
        ay.a aVar = this.f50137b;
        aVar.getClass();
        healthmateApplication.f47898e = new s20.a(t82);
        r20.a t83 = t8();
        aVar.getClass();
        healthmateApplication.f47900f = new s20.c(t83);
        healthmateApplication.f47902g = this.f50222p0.get();
        healthmateApplication.f47904h = this.G.get();
        healthmateApplication.f47906i = dagger.internal.a.a(this.V0);
        healthmateApplication.f47908j = dagger.internal.a.a(this.X0);
        healthmateApplication.f47910k = this.f50168g0.get();
        healthmateApplication.f47911l = dagger.internal.a.a(this.Y0);
        healthmateApplication.f47913m = dagger.internal.a.a(this.f50139b1);
        healthmateApplication.f47915n = dagger.internal.a.a(this.f50145c1);
        healthmateApplication.f47917o = dagger.internal.a.a(this.f50157e1);
        healthmateApplication.f47919p = dagger.internal.a.a(this.f50151d1);
        healthmateApplication.f47921q = dagger.internal.a.a(this.f50163f1);
        healthmateApplication.f47923r = dagger.internal.a.a(this.f50169g1);
        healthmateApplication.f47925s = dagger.internal.a.a(this.f50175h1);
        healthmateApplication.f47927t = this.f50181i1.get();
        healthmateApplication.f47929u = dagger.internal.a.a(this.K);
        healthmateApplication.f47931v = this.f50187j1.get();
        healthmateApplication.f47933w = this.f50193k1.get();
        healthmateApplication.f47935x = this.f50199l1.get();
        healthmateApplication.f47937y = this.f50205m1.get();
        healthmateApplication.f47939z = dagger.internal.a.a(this.f50176h2);
        healthmateApplication.getClass();
        x.a b10 = com.google.common.collect.x.b(32);
        b10.e("com.withings.wiscale2.partner.actions.AskPartnerSynchroWorker", this.f50182i2);
        b10.e("com.withings.wiscale2.vo2max.ComputeVo2Max", this.f50188j2);
        b10.e("com.withings.wiscale2.vo2max.DeleteVo2Max", this.f50194k2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeActivityWithHealthConnectWorker", this.f50218o2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeBasalMetabolicRateWithHealthConnectWorker", this.f50224p2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeBloodPressureWithHealthConnectWorker", this.f50230q2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeBodyTemperatureWithHealthConnectWorker", this.f50236r2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeBoneMassWithHealthConnectWorker", this.f50242s2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeContinuousHeartRateWithHealthConnectWorker", this.f50248t2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeDiscretHeartRateWithHealthConnectWorker", this.f50254u2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeDiscretSpo2WithHealthConnectWorker", this.f50260v2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeFatMassWithHealthConnectWorker", this.f50266w2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeFloorsClimbedWithHealthConnectWorker", this.f50272x2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeHeightWithHealthConnectWorker", this.f50278y2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMenstruationPeriodWithHealthConnectWorker", this.f50284z2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMuscleMassWithHealthConnectWorker", this.A2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeSleepWithHealthConnectWorker", this.B2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeStepsWithHealthConnectWorker", this.C2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeVo2maxWithHealthConnectWorker", this.D2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeWaterMassWithHealthConnectWorker", this.E2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeWeightWithHealthConnectWorker", this.F2);
        b10.e("com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeWeightWithHuaweiHealthWorker", this.G2);
        b10.e("com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker", this.H2);
        b10.e("com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit", this.I2);
        b10.e("com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth", this.J2);
        b10.e("com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker", this.K2);
        b10.e("com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker", this.L2);
        b10.e("com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker", this.M2);
        b10.e("com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker", this.O2);
        b10.e("com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker", this.P2);
        b10.e("com.withings.wiscale2.activity.model.builder.RecomputeAggregate", this.S2);
        b10.e("com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker", this.T2);
        healthmateApplication.A = f6.c.a(b10.a());
        healthmateApplication.B = dagger.internal.a.a(this.L);
        healthmateApplication.F = dagger.internal.a.a(this.M);
        healthmateApplication.G = dagger.internal.a.a(this.N);
        healthmateApplication.M = dagger.internal.a.a(this.U2);
        healthmateApplication.P = this.O.get();
        healthmateApplication.Q = dagger.internal.a.a(this.P);
        healthmateApplication.R = dagger.internal.a.a(this.f50257v);
        healthmateApplication.S = dagger.internal.a.a(this.f50263w);
        healthmateApplication.T = dagger.internal.a.a(this.V2);
        healthmateApplication.W = dagger.internal.a.a(this.W2);
        healthmateApplication.X = this.f50150d0.get();
        e.a traceFilesRepositoryMutex = this.f50259v1.get();
        kotlin.jvm.internal.u.j(traceFilesRepositoryMutex, "traceFilesRepositoryMutex");
        healthmateApplication.Y = traceFilesRepositoryMutex;
        healthmateApplication.Z = dagger.internal.a.a(this.f50152d2);
        healthmateApplication.f47912l0 = dagger.internal.a.a(this.H);
        healthmateApplication.f47914m0 = dagger.internal.a.a(this.Z);
        healthmateApplication.f47916n0 = dagger.internal.a.a(this.f50132a0);
        healthmateApplication.f47918o0 = dagger.internal.a.a(this.J);
        healthmateApplication.f47920p0 = dagger.internal.a.a(this.F1);
        healthmateApplication.f47922q0 = this.f50245t.get();
        healthmateApplication.f47924r0 = dagger.internal.a.a(this.f50258v0);
        healthmateApplication.f47926s0 = dagger.internal.a.a(this.f50144c0);
        healthmateApplication.f47928t0 = dagger.internal.a.a(this.f50217o1);
        healthmateApplication.f47930u0 = dagger.internal.a.a(this.f50212n2);
        healthmateApplication.f47932v0 = dagger.internal.a.a(this.f50156e0);
        healthmateApplication.f47934w0 = dagger.internal.a.a(this.f50216o0);
        healthmateApplication.f47936x0 = dagger.internal.a.a(this.f50251u);
        healthmateApplication.f47938y0 = dagger.internal.a.a(this.L0);
        healthmateApplication.f47940z0 = dagger.internal.a.a(this.W0);
        healthmateApplication.A0 = dagger.internal.a.a(this.X2);
        healthmateApplication.B0 = dagger.internal.a.a(this.R2);
        healthmateApplication.C0 = dagger.internal.a.a(this.Q2);
        healthmateApplication.D0 = dagger.internal.a.a(this.Y2);
        healthmateApplication.E0 = dagger.internal.a.a(this.J1);
        healthmateApplication.F0 = dagger.internal.a.a(this.K1);
        healthmateApplication.G0 = dagger.internal.a.a(this.f50223p1);
        healthmateApplication.H0 = dagger.internal.a.a(this.Z2);
        healthmateApplication.I0 = this.f50141b3.get();
        fs.a dataStore = this.Q.get();
        kotlin.jvm.internal.u.j(dataStore, "dataStore");
        healthmateApplication.J0 = new is.a(dataStore);
        healthmateApplication.K0 = new d00.d(this.T0.get(), this.P1.get(), this.f50153d3.get());
        healthmateApplication.L0 = dagger.internal.a.a(this.B1);
        healthmateApplication.M0 = dagger.internal.a.a(this.M1);
        healthmateApplication.N0 = dagger.internal.a.a(this.f50171g3);
        healthmateApplication.O0 = dagger.internal.a.a(this.f50159e3);
        healthmateApplication.P0 = r8();
        healthmateApplication.Q0 = this.f50153d3.get();
        healthmateApplication.R0 = dagger.internal.a.a(this.R);
        healthmateApplication.S0 = dagger.internal.a.a(this.f50177h3);
        healthmateApplication.T0 = dagger.internal.a.a(this.T);
        healthmateApplication.U0 = dagger.internal.a.a(this.U);
        healthmateApplication.V0 = dagger.internal.a.a(this.V);
        healthmateApplication.W0 = dagger.internal.a.a(this.W);
        healthmateApplication.X0 = dagger.internal.a.a(this.f50277y1);
        healthmateApplication.Y0 = dagger.internal.a.a(this.Q0);
        healthmateApplication.Z0 = dagger.internal.a.a(this.X);
        healthmateApplication.f47892a1 = dagger.internal.a.a(this.Y);
        healthmateApplication.f47893b1 = dagger.internal.a.a(this.f50183i3);
        healthmateApplication.f47895c1 = dagger.internal.a.a(this.f50189j3);
        healthmateApplication.f47897d1 = dagger.internal.a.a(this.f50195k3);
        healthmateApplication.f47899e1 = dagger.internal.a.a(this.f50271x1);
        healthmateApplication.f47901f1 = dagger.internal.a.a(this.f50201l3);
        healthmateApplication.f47903g1 = dagger.internal.a.a(this.f50213n3);
        healthmateApplication.f47905h1 = dagger.internal.a.a(this.f50219o3);
        healthmateApplication.f47907i1 = dagger.internal.a.a(this.S0);
        healthmateApplication.f47909j1 = dagger.internal.a.a(this.f50225p3);
    }

    @Override // fh0.a
    public final fh0.g I() {
        return this.f50249t3.get();
    }

    @Override // al.e
    public final ny.a J() {
        zx.v Q8 = Q8();
        zx.j measureListenerManager = this.f50270x0.get();
        kotlin.jvm.internal.u.j(measureListenerManager, "measureListenerManager");
        return new ny.a(Q8, measureListenerManager);
    }

    @Override // com.withings.devicescreens.device.SendDeviceScreensConversation.a
    public final GetMissingFeatureTagUseCase K() {
        return DeviceScreenModule_ProvideGetMissingFeatureTagUseCaseFactory.provideGetMissingFeatureTagUseCase();
    }

    @Override // c70.d
    public final c70.e L() {
        return this.U0.get();
    }

    @Override // zm.d
    public final vm.o M() {
        ex.b noteRepository = this.H0.get();
        um.a F = F();
        hx.h I8 = I8();
        gr.a factorRepository = this.J0.get();
        kotlin.jvm.internal.u.j(factorRepository, "factorRepository");
        vm.v vVar = new vm.v(F, I8, factorRepository);
        kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
        return new vm.o(noteRepository, new hx.h(noteRepository), vVar);
    }

    @Override // com.withings.devicescreens.device.SendDeviceScreensConversation.a
    public final fl.p N() {
        return fl.p.f67672b.a();
    }

    @Override // al.e
    public final fl.p O() {
        return fl.p.f67672b.a();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ox.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.health.connect.client.units.d, java.lang.Object] */
    @Override // zm.d
    public final vm.a0 P() {
        hx.h I8 = I8();
        this.f50149d.getClass();
        ?? obj = new Object();
        ?? obj2 = new Object();
        ex.b noteRepository = this.H0.get();
        ex.a lastCycleTrackingSyncRepository = (ex.a) ((a) this.X).get();
        kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
        kotlin.jvm.internal.u.j(lastCycleTrackingSyncRepository, "lastCycleTrackingSyncRepository");
        return new vm.a0(I8, obj, obj2, new hx.o(noteRepository), lastCycleTrackingSyncRepository);
    }

    @Override // og0.l.a
    public final e40.a Q() {
        return new e40.a(new e40.c());
    }

    @Override // og0.l.a
    public final d40.a R() {
        return new d40.a(gk0.c.a(this.f50131a));
    }

    @Override // com.withings.wiscale2.device.scale.conversation.ScaleInstallFinalizingConversation.b
    public final r70.c S() {
        return this.T0.get();
    }

    @Override // com.withings.wiscale2.vo2max.ComputeVo2Max.b
    public final fy.o T() {
        return new fy.o(this.L0.get());
    }

    @Override // nn.f.a
    public final vr.d U() {
        return this.f50246t0.get();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [zf.a, java.lang.Object] */
    @Override // mw.b
    public final fj0.h V() {
        gk0.a aVar = this.f50131a;
        Context a11 = gk0.c.a(aVar);
        Context a12 = gk0.c.a(aVar);
        zf.b bVar = new zf.b(gk0.c.a(aVar));
        ?? obj = new Object();
        yf.f healthmateSessionDao = this.f50168g0.get();
        kotlin.jvm.internal.u.j(healthmateSessionDao, "healthmateSessionDao");
        return new fj0.h(a11, new zf.c(a12, obj, bVar, new zf.d(healthmateSessionDao)));
    }

    @Override // dagger.hilt.android.internal.managers.c.a
    public final ek0.b W() {
        return new k(this.f50239s);
    }

    @Override // com.withings.common.device.conversation.FeatureTagsConversation.a, al.e, com.withings.notifications.ui.n
    public final kn.e a() {
        return this.f50251u.get();
    }

    @Override // xg0.a.InterfaceC1877a, vh0.b.a, vh0.c.a
    public final o2 b() {
        return this.f50228q0.get();
    }

    @Override // mz.j0, mz.p0
    public final jq.b c() {
        return this.R0.get();
    }

    @Override // com.withings.ecg.pdf.f.a, com.withings.wiscale2.device.common.feature.d.a
    public final ch.d d() {
        return (ch.d) ((a) this.Q0).get();
    }

    @Override // zm.d, com.withings.devicescreens.device.SendDeviceScreensConversation.a
    public final DeviceScreensRepository e() {
        return this.E0.get();
    }

    @Override // com.withings.wiscale2.legacyprograms.WellnessProgramJoinerEntryPoint
    public final j30.c enrolledRepository() {
        a30.f T8 = T8();
        com.withings.wiscale2.data.s roomDaoProvider = (com.withings.wiscale2.data.s) ((a) this.f50257v).get();
        kotlin.jvm.internal.u.j(roomDaoProvider, "roomDaoProvider");
        a30.l H = roomDaoProvider.H();
        ah.p.d(H);
        return new i30.b(new i30.a(T8, H), new i30.c(q8(), null), new x30.m(this.S.get()));
    }

    @Override // al.e, nn.f.a
    public final m70.i f() {
        return this.f50258v0.get();
    }

    @Override // com.withings.wiscale2.legacyprograms.WellnessProgramJoinerEntryPoint
    public final v30.b fetchTasksProgramByIdUseCase() {
        return new v30.b((l30.c) ((a) this.f50175h1).get());
    }

    @Override // com.withings.common.device.conversation.FeatureTagsConversation.a, com.withings.devicescreens.device.SendDeviceScreensConversation.a
    public final vr.d g() {
        return this.f50246t0.get();
    }

    @Override // com.withings.core.webcontent.HMWebViewDelegate.c, com.withings.wiscale2.x1.a, com.withings.wiscale2.track.data.SleepStatsFactory.SleepStatsFactoryEntryPoint
    public final dg.a getActiveSessionProvider() {
        vf.c accountManager = this.f50144c0.get();
        AccountSessionRepository accountSessionRepository = this.f50216o0.get();
        kotlin.jvm.internal.u.j(accountManager, "accountManager");
        kotlin.jvm.internal.u.j(accountSessionRepository, "accountSessionRepository");
        return new dg.c(accountManager, accountSessionRepository);
    }

    @Override // com.withings.wiscale2.legacyprograms.WellnessProgramJoinerEntryPoint
    public final x30.h getMostRecentEnrolledProgramLastUpdateUseCase() {
        return new x30.h((i30.b) enrolledRepository(), new x30.g(this.S.get()));
    }

    @Override // uc0.f, th0.f
    public final ri0.e0 h() {
        Context a11 = gk0.c.a(this.f50131a);
        com.withings.wiscale2.spo2.m mVar = new com.withings.wiscale2.spo2.m();
        ww.b timelineManager = this.S0.get();
        z00.c cVar = new z00.c(this.S0.get());
        kotlin.jvm.internal.u.j(timelineManager, "timelineManager");
        return new ri0.e0(a11, mVar, new z00.d(timelineManager, cVar), this.f50237r3.get());
    }

    @Override // com.withings.wiscale2.device.scale.conversation.ScaleInstallFinalizingConversation.b
    public final p70.a i() {
        return new p70.a(q8(), new pj0.e(R8(), this.f50144c0.get(), this.f50222p0.get()), null);
    }

    @Override // com.withings.wiscale2.legacyprograms.WellnessProgramJoinerEntryPoint
    public final x30.l isProgramRunningUseCase() {
        return new x30.l((i30.b) enrolledRepository());
    }

    @Override // com.withings.wiscale2.device.common.conversation.GetHeartSignalMeasurementsConversation.a
    public final sq.a j() {
        return new sq.a(this.f50251u.get(), this.B1.get(), this.f50181i1.get(), new fy.m(G8(), this.K0.get()), D8(), E8());
    }

    @Override // dagger.hilt.android.internal.managers.h.a
    public final ek0.d k() {
        return new p(this.f50239s);
    }

    @Override // zm.d
    public final ex.a l() {
        return (ex.a) ((a) this.X).get();
    }

    @Override // uc0.a.InterfaceC1702a
    public final e m() {
        m20.c planRepository = this.f50247t1.get();
        kotlin.jvm.internal.u.j(planRepository, "planRepository");
        n20.a aVar = new n20.a(planRepository);
        m20.a planLocalLastUpdateRepository = this.f50253u1.get();
        kotlin.jvm.internal.u.j(planLocalLastUpdateRepository, "planLocalLastUpdateRepository");
        return new e(aVar, new n20.g(planLocalLastUpdateRepository));
    }

    @Override // th0.c
    public final void n(LeaderboardNotificationActionReceiver leaderboardNotificationActionReceiver) {
        leaderboardNotificationActionReceiver.f58727c = this.D1.get();
        leaderboardNotificationActionReceiver.f58728d = this.T0.get();
    }

    @Override // ql.a
    public final ql.b o() {
        return this.f50282z0.get();
    }

    @Override // lb0.o
    public final void p(OnUpgradeReceiver onUpgradeReceiver) {
        onUpgradeReceiver.f50046c = this.f50258v0.get();
        onUpgradeReceiver.f50047d = this.f50144c0.get();
        onUpgradeReceiver.f50048e = this.O.get();
        onUpgradeReceiver.f50049f = this.f50231q3.get();
        this.W0.get();
        onUpgradeReceiver.f50050g = new lb0.m(new ds.b(dl.a.a()), this.Q.get());
        onUpgradeReceiver.f50051h = S8();
        onUpgradeReceiver.f50052i = this.P1.get();
        onUpgradeReceiver.f50053j = this.f50251u.get();
        onUpgradeReceiver.f50054k = this.R.get();
        onUpgradeReceiver.f50055l = this.Z.get();
    }

    @Override // com.withings.notifications.ui.n
    public final fl.p q() {
        return fl.p.f67672b.a();
    }

    @Override // zm.d
    public final ex.b r() {
        return this.H0.get();
    }

    @Override // zg0.a
    public final void s(LocaleChangedReceiver localeChangedReceiver) {
        localeChangedReceiver.f57994c = this.f50258v0.get();
        localeChangedReceiver.f57995d = this.f50144c0.get();
        localeChangedReceiver.f57996e = o8();
        localeChangedReceiver.f57997f = this.f50146c2.get();
    }

    @Override // zm.d
    public final zb0.b t() {
        PlatformFeatureRepository platformFeatureRepository = this.f50263w.get();
        kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
        return new zb0.b(platformFeatureRepository);
    }

    @Override // xg0.a.InterfaceC1877a
    public final xg0.b u() {
        return this.f50243s3.get();
    }

    @Override // com.withings.wiscale2.vo2max.ComputeVo2Max.b
    public final n20.j v() {
        m20.c planRepository = this.f50247t1.get();
        kotlin.jvm.internal.u.j(planRepository, "planRepository");
        return new n20.j(planRepository);
    }

    @Override // com.withings.tutorials.ui.screens.a.e
    public final qn.a w() {
        return new qn.a(fl.p.f67672b.a());
    }

    @Override // zm.d
    public final iy.e x() {
        return this.L0.get();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [hx.b, java.lang.Object] */
    @Override // zm.d
    public final vm.f y() {
        ny.a J = J();
        um.a F = F();
        fy.b0 g92 = g9();
        iy.e measuresGroupRepositoryV2 = this.L0.get();
        iy.d measuresGroupRemoteRepository = this.f50276y0.get();
        ny.d a92 = a9();
        vm.n A8 = A8();
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        kotlin.jvm.internal.u.j(measuresGroupRemoteRepository, "measuresGroupRemoteRepository");
        return new vm.f(J, g92, F, measuresGroupRepositoryV2, A8, new Object(), measuresGroupRemoteRepository, a92);
    }

    @Override // al.e
    public final iy.d z() {
        return this.f50276y0.get();
    }
}
