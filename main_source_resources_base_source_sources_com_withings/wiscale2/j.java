package com.withings.wiscale2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.compose.material.r7;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.account.network.ws.SessionRemoteRepository;
import com.withings.account.ui.VerifyAuthenticationSensitiveActivity;
import com.withings.authentication.AuthenticationActivity;
import com.withings.authentication.mfa.ResolveMultiFactorActivity;
import com.withings.authentication.verifyauthentication.VerifyAuthenticationActivity;
import com.withings.clinicalstudy.repository.ClinicalStudySuggestionRepository;
import com.withings.coach.chatbot.ChatbotActivity;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.core.ui.NoteEditionActivity;
import com.withings.cycletracking.ui.CycleTrackingActivity;
import com.withings.details.height.HeightActivity;
import com.withings.details.height.HeightListActivity;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.device.details.automatic.activity.detection.AutomaticActivityDetection;
import com.withings.device.details.wsd.programs.webradio.WsdWebRadioActivity;
import com.withings.device.setup.android.setup.SetupConversation;
import com.withings.device.setup.android.setup.handcalibration.HandsCalibrationConversation;
import com.withings.device.setup.android.setup.init.InitConversation;
import com.withings.device.setup.ui.SetupChooseDeviceActivity;
import com.withings.device.setup.ui.activity.SetupActivity;
import com.withings.device.ws.DeviceRemoteRepository;
import com.withings.ecg.details.EcgListActivity;
import com.withings.ecg.details.EcgResultActivity;
import com.withings.ecg.details.WaitingSignalResultActivity;
import com.withings.ecg.live.LiveEcgActivity;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.ecg.pdf.PDFGenerationActivity;
import com.withings.ecg.webservices.EcgReviewRemoteRepository;
import com.withings.ecg.webservices.GetSignalDataSyncFactory;
import com.withings.ecg.webservices.SignalRemoteRepository;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.fever.ui.BodyTemperatureActivity;
import com.withings.fever.ui.temperatureList.TemperatureListActivity;
import com.withings.healthplus.explore.ui.activity.ExploreTabActivity;
import com.withings.healthscore.ui.exploredata.HealthScoreExploreDataActivity;
import com.withings.insight.android.entity.Insight;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import com.withings.leaderboard.ui.LeaderboardActivity;
import com.withings.leaderboard.ui.LeaderboardActivity_MembersInjector;
import com.withings.leaderboard.ui.LeaderboardViewModel_HiltModules_KeyModule_ProvideFactory;
import com.withings.leaderboard.ui.LeaderboardWeekViewModel;
import com.withings.leaderboard.ui.LeaderboardWeekViewModelFactory;
import com.withings.leaderboard.ui.ScanFriendCodeActivity;
import com.withings.leaderboard.ui.ScanFriendCodeActivity_ScanFriendCodeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.withings.leaderboard.ui.screen.viewmodels.LeaderBoardItemViewModel_HiltModules_KeyModule_ProvideFactory;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.location.di.LocationProviderModule_ProvideFilterGpsLocationWithPauseFactory;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSpeed;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.manualLogging.ui.feature.addNote.AddManualLogActivity;
import com.withings.manualLogging.ui.feature.addNote.cycle.CycleOnBoardingManualLoggingActivity;
import com.withings.measure.detail.ui.screen.MeasureDetailActivity;
import com.withings.measurements.ui.HealthVerticalActivity;
import com.withings.nervehealth.android.usecases.GetNeuropathyDiagnostics;
import com.withings.nervehealth.ui.NerveHealthActivity;
import com.withings.nervehealth.ui.NerveHealthMeasureListActivity;
import com.withings.nervehealthscore.NerveHealthNative;
import com.withings.note.model.NoteRepository;
import com.withings.notifications.preferences.core.model.NotificationPreferenceType;
import com.withings.notifications.ui.NotificationsActivity;
import com.withings.nutrisync.ui.VitaminCDatavizActivity;
import com.withings.overview.ui.StartTrackingActivity;
import com.withings.periodsbar.Period;
import com.withings.programs.ui.activity.ProgramOverviewActivity;
import com.withings.reminder.ringing.ReminderRingingActivity;
import com.withings.reminder.ringing.ReminderRingingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.withings.screen.di.DeviceScreenModule_ProvideGetMissingFeatureTagUseCaseFactory;
import com.withings.screen.repository.DeviceScreensRepository;
import com.withings.tutorials.ui.DeviceIntroductionActivity;
import com.withings.tutorials.ui.TutorialActivity;
import com.withings.tutorials.ui.screens.appssync.healthconnect.HealthConnectActivationActivity;
import com.withings.user.core.models.User;
import com.withings.vasistas.v2.repository.VasistasRepository;
import com.withings.webradio.network.WebRadiosRemoteRepository;
import com.withings.weight.core.model.LimbModel;
import com.withings.weight.legacy.WeightDetailActivity;
import com.withings.weight.presentation.ui.BodyCompositionActivity;
import com.withings.weight.presentation.ui.WeightActivity;
import com.withings.weight.presentation.ui.WeightExploreDataActivity;
import com.withings.weight.ui.SegmentalBodyCompositionActivity;
import com.withings.weight.ui.limbExplore.SegmentalLimbExploreActivity;
import com.withings.wiscale2.account.password.LinkForPasswordSentActivity;
import com.withings.wiscale2.account.password.PasswordExpiredActivity;
import com.withings.wiscale2.activity.ActivityActivity;
import com.withings.wiscale2.activity.logging.ui.EditWorkoutActivity;
import com.withings.wiscale2.activity.workout.category.ui.ChooseWorkoutCategoryActivity;
import com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutActivity;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.activity.workout.ui.detail.AllWorkoutsActivity;
import com.withings.wiscale2.activity.workout.ui.detail.PostWorkoutActivity;
import com.withings.wiscale2.activity.workout.ui.map.WorkoutMapActivity;
import com.withings.wiscale2.activity.workout.ui.performance.splits.WorkoutSplitsActivity;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.chat.ui.ChatActivity;
import com.withings.wiscale2.coretemperature.ui.ExploreCoreTemperatureActivity;
import com.withings.wiscale2.device.common.feature.activitygoal.SetFitnessAndStepsGoalActivity;
import com.withings.wiscale2.device.common.feature.afib.AfibActivationActivity;
import com.withings.wiscale2.device.common.feature.afib.AfibSettingsActivity;
import com.withings.wiscale2.device.common.feature.ecg.EcgActivationActivity;
import com.withings.wiscale2.device.common.feature.ecg.EcgSettingsActivity;
import com.withings.wiscale2.device.common.feature.ecg.e5;
import com.withings.wiscale2.device.common.feature.ecg.o4;
import com.withings.wiscale2.device.common.feature.ecg.p5;
import com.withings.wiscale2.device.common.feature.ecg.q5;
import com.withings.wiscale2.device.common.feature.ecg.t5;
import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.Hwa10EcgActivationActivity;
import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallCodeCheckViewModel;
import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel;
import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel;
import com.withings.wiscale2.device.common.feature.ecg.us.ui.EcgReviewActivity;
import com.withings.wiscale2.device.common.feature.highlowhr.HighLowHRActivationActivity;
import com.withings.wiscale2.device.common.feature.highlowhr.HighLowHRSettingsActivity;
import com.withings.wiscale2.device.common.feature.irregularHeartBeat.IrregularHeartBeatActivationActivity;
import com.withings.wiscale2.device.common.feature.irregularHeartBeat.IrregularHeartBeatSettingsActivity;
import com.withings.wiscale2.device.common.feature.respiratoryscan.RespiratoryScanActivationActivity;
import com.withings.wiscale2.device.common.feature.spo2.SpO2SettingsActivity;
import com.withings.wiscale2.device.common.feature.spo2.Spo2ActivationActivity;
import com.withings.wiscale2.device.common.feature.workout.WorkoutTutorialActivity;
import com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationSettingsActivity;
import com.withings.wiscale2.device.common.onboarding.SleepApneaOnboardingActivity;
import com.withings.wiscale2.device.common.screen.ui.ScreenSelectionActivity;
import com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel;
import com.withings.wiscale2.device.common.tutorial.navigation.NavigationTutorialActivity;
import com.withings.wiscale2.device.common.ui.DeviceInfoActivity;
import com.withings.wiscale2.device.common.ui.MedicalFeatureListActivity;
import com.withings.wiscale2.device.common.ui.RespiratoryScanSettingsActivity;
import com.withings.wiscale2.device.common.ui.geoloc.WeatherAirQualityActivity;
import com.withings.wiscale2.device.consumable.webservices.ConsumableRemoteRepository;
import com.withings.wiscale2.device.hwa03bs.ui.Hwa03PostInstallActivity;
import com.withings.wiscale2.device.hwa06.ui.Hwa06PostInstallActivity;
import com.withings.wiscale2.device.hwa08.postinstall.Hwa08PostInstallActivity;
import com.withings.wiscale2.device.wam03.ui.Wam03PostInstallActivity;
import com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.Wpa02CartridgeActivationActivity;
import com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.Wpa02ToiletInstallationActivity;
import com.withings.wiscale2.device.wpm.ui.Wpm0203Activity;
import com.withings.wiscale2.food.model.FoodDayDownloadDelegate;
import com.withings.wiscale2.food.model.FoodDayDownloadDelegateFactory;
import com.withings.wiscale2.food.model.FoodManager;
import com.withings.wiscale2.food.ui.display.FoodActivity;
import com.withings.wiscale2.food.ui.display.FoodActivity_MembersInjector;
import com.withings.wiscale2.food.ws.FoodRemoteRepository;
import com.withings.wiscale2.heart.HeartDetailActivity;
import com.withings.wiscale2.heart.HeartHistoryActivity;
import com.withings.wiscale2.heart.afib.AFibActivity;
import com.withings.wiscale2.heart.afib.AFibMeasuresListActivity;
import com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity;
import com.withings.wiscale2.heart.heartrate.HRMeasuresListActivity;
import com.withings.wiscale2.heart.heartrate.HeartRateDayActivity;
import com.withings.wiscale2.legacyprograms.BrowseProgramActivity;
import com.withings.wiscale2.legacyprograms.BrowseProgramActivity_MembersInjector;
import com.withings.wiscale2.legacyprograms.BrowseProgramViewModel;
import com.withings.wiscale2.legacyprograms.BrowseProgramViewModelFactory;
import com.withings.wiscale2.legacyprograms.WellnessProgramArchiveActivity;
import com.withings.wiscale2.legacyprograms.WellnessProgramArchiveActivity_MembersInjector;
import com.withings.wiscale2.legacyprograms.WellnessProgramDetailsActivity;
import com.withings.wiscale2.legacyprograms.WellnessProgramDetailsActivity_MembersInjector;
import com.withings.wiscale2.manuallogging.ui.addSleep.AddSleepTrackActivity;
import com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureActivity;
import com.withings.wiscale2.measure.goal.ui.WeightGoalActivity;
import com.withings.wiscale2.measure.list.MeasureListActivity;
import com.withings.wiscale2.partner.ui.PartnerActivity;
import com.withings.wiscale2.settings.SettingsActivity;
import com.withings.wiscale2.sleep.ui.edition.NightEditionActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SecondarySleepActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreDurationActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreInterruptionsActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreRecoveryActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreRegularityActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreSnoringActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreTimeToGetUpActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreTimeToSleepActivity;
import com.withings.wiscale2.spo2.SpO2MeasuresListActivity;
import com.withings.wiscale2.spo2.Spo2Activity;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.user.ui.CreateUserActivity;
import com.withings.wiscale2.user.ui.EditUserEmailActivity;
import com.withings.wiscale2.user.ui.EditUserMeasureActivity;
import com.withings.wiscale2.user.ui.profile.EditProfileActivity;
import com.withings.wiscale2.vascularage.VascularAgeActivity;
import com.withings.wiscale2.vascularage.VascularAgeActivityV1;
import com.withings.wiscale2.vo2max.view.Vo2maxActivity;
import com.withings.wiscale2.weight.list.WeightListActivity;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import fk0.a;
import java.util.Locale;
import org.joda.time.DateTime;
import qw.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class j extends n1 {
    private dagger.internal.d<com.withings.wiscale2.activity.workout.category.ui.g> A;
    private dagger.internal.d<com.withings.wiscale2.activity.workout.live.ui.d1> B;
    private dagger.internal.d<com.withings.wiscale2.coretemperature.ui.p> C;
    private dagger.internal.d<com.withings.wiscale2.device.common.feature.afib.i> D;
    private dagger.internal.d<com.withings.wiscale2.device.common.feature.afib.t> E;
    private dagger.internal.d<e5> F;
    private dagger.internal.d<q5> G;
    private dagger.internal.d<gc0.p0> H;
    private dagger.internal.d<hc0.q> I;
    private dagger.internal.d<ic0.c0> J;
    private dagger.internal.d<ic0.q> K;
    private dagger.internal.d<ac0.x> L;
    private dagger.internal.d<ac0.e> M;
    private dagger.internal.d<jc0.v> N;
    private dagger.internal.d<com.withings.wiscale2.device.common.feature.ecg.us.ui.q> O;
    private dagger.internal.d<com.withings.wiscale2.device.common.feature.highlowhr.j0> P;
    private dagger.internal.d<com.withings.wiscale2.device.common.feature.highlowhr.k> Q;
    private dagger.internal.d<com.withings.wiscale2.device.common.feature.irregularHeartBeat.j> R;
    private dagger.internal.d<com.withings.wiscale2.device.common.feature.irregularHeartBeat.t> S;
    private dagger.internal.d<com.withings.wiscale2.device.common.feature.respiratoryscan.m> T;
    private dagger.internal.d<com.withings.wiscale2.device.common.feature.spo2.s> U;
    private dagger.internal.d<com.withings.wiscale2.device.common.feature.spo2.r> V;
    private dagger.internal.d<com.withings.wiscale2.device.common.onboarding.e> W;
    private dagger.internal.d<com.withings.wiscale2.device.common.screen.ui.c2> X;
    private dagger.internal.d<NavigationTutorialActivity.b> Y;
    private dagger.internal.d<com.withings.wiscale2.device.common.ui.h0> Z;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f57870a;

    /* renamed from: a0  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.device.common.ui.y1> f57871a0;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f57872b;

    /* renamed from: b0  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.device.common.ui.j2> f57873b0;

    /* renamed from: c  reason: collision with root package name */
    private final l f57874c;

    /* renamed from: c0  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.device.common.ui.geoloc.g0> f57875c0;

    /* renamed from: d  reason: collision with root package name */
    private final j f57876d = this;

    /* renamed from: d0  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.k0> f57877d0;

    /* renamed from: e  reason: collision with root package name */
    private dagger.internal.d<com.withings.coach.chatbot.t0> f57878e;

    /* renamed from: e0  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.r> f57879e0;

    /* renamed from: f  reason: collision with root package name */
    private dagger.internal.d<gn.b> f57880f;

    /* renamed from: f0  reason: collision with root package name */
    private dagger.internal.d<Wpm0203Activity.e> f57881f0;

    /* renamed from: g  reason: collision with root package name */
    private dagger.internal.d<op.e> f57882g;

    /* renamed from: g0  reason: collision with root package name */
    private dagger.internal.d<FoodDayDownloadDelegateFactory> f57883g0;

    /* renamed from: h  reason: collision with root package name */
    private dagger.internal.d<po.a> f57884h;

    /* renamed from: h0  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.heart.heartrate.r0> f57885h0;

    /* renamed from: i  reason: collision with root package name */
    private dagger.internal.d<jo.b> f57886i;

    /* renamed from: i0  reason: collision with root package name */
    private dagger.internal.d<BrowseProgramViewModelFactory> f57887i0;

    /* renamed from: j  reason: collision with root package name */
    private dagger.internal.d<np.q0> f57888j;

    /* renamed from: j0  reason: collision with root package name */
    private dagger.internal.d<i10.o> f57889j0;

    /* renamed from: k  reason: collision with root package name */
    private dagger.internal.d<com.withings.ecg.details.v1> f57890k;

    /* renamed from: k0  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.user.ui.x> f57891k0;

    /* renamed from: l  reason: collision with root package name */
    private dagger.internal.d<com.withings.ecg.details.w0> f57892l;

    /* renamed from: l0  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.user.ui.profile.y0> f57893l0;

    /* renamed from: m  reason: collision with root package name */
    private dagger.internal.d<WaitingSignalResultActivity.d> f57894m;

    /* renamed from: m0  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.vascularage.m1> f57895m0;

    /* renamed from: n  reason: collision with root package name */
    private dagger.internal.d<com.withings.fever.ui.p0> f57896n;

    /* renamed from: o  reason: collision with root package name */
    private dagger.internal.d<com.withings.fever.ui.temperatureList.r> f57897o;

    /* renamed from: p  reason: collision with root package name */
    private dagger.internal.d<LeaderboardWeekViewModelFactory> f57898p;

    /* renamed from: q  reason: collision with root package name */
    private dagger.internal.d<com.withings.manualLogging.ui.feature.addNote.o1> f57899q;

    /* renamed from: r  reason: collision with root package name */
    private dagger.internal.d<n90.q> f57900r;

    /* renamed from: s  reason: collision with root package name */
    private dagger.internal.d<h90.a> f57901s;

    /* renamed from: t  reason: collision with root package name */
    private dagger.internal.d<n90.n> f57902t;

    /* renamed from: u  reason: collision with root package name */
    private dagger.internal.d<com.withings.weight.ui.a0> f57903u;

    /* renamed from: v  reason: collision with root package name */
    private dagger.internal.d<com.withings.weight.ui.limbExplore.b0> f57904v;

    /* renamed from: w  reason: collision with root package name */
    private dagger.internal.d<ch0.f> f57905w;

    /* renamed from: x  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.activity.g> f57906x;

    /* renamed from: y  reason: collision with root package name */
    private dagger.internal.d<ba0.d> f57907y;

    /* renamed from: z  reason: collision with root package name */
    private dagger.internal.d<com.withings.wiscale2.activity.logging.ui.t0> f57908z;

    /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
    /* loaded from: classes4.dex */
    private static final class a<T> implements dagger.internal.d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final com.withings.wiscale2.b0 f57909a;

        /* renamed from: b  reason: collision with root package name */
        private final j f57910b;

        /* renamed from: c  reason: collision with root package name */
        private final int f57911c;

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* renamed from: com.withings.wiscale2.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        final class C0750a implements com.withings.fever.ui.p0 {
            C0750a() {
            }

            @Override // com.withings.fever.ui.p0
            public final com.withings.fever.ui.o0 a(Long l5, DateTime dateTime) {
                Period.a aVar = Period.f43718c;
                a aVar2 = a.this;
                return new com.withings.fever.ui.o0(l5, (iy.e) aVar2.f57909a.L0.get(), new yr.a(), (ky.c) aVar2.f57909a.f50270x0.get(), (r70.c) aVar2.f57909a.T0.get(), j.T1(aVar2.f57910b), j.Z1(aVar2.f57910b), j.M1(aVar2.f57910b));
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class a0 implements com.withings.wiscale2.device.common.feature.ecg.us.ui.q {
            a0() {
            }

            @Override // com.withings.wiscale2.device.common.feature.ecg.us.ui.q
            public final com.withings.wiscale2.device.common.feature.ecg.us.ui.p a(long j5, long j11) {
                a aVar = a.this;
                return new com.withings.wiscale2.device.common.feature.ecg.us.ui.p((r70.c) aVar.f57909a.T0.get(), com.withings.wiscale2.b0.u5(aVar.f57909a), j5, j11, (EcgReviewRemoteRepository) aVar.f57909a.f50170g2.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class a1 implements com.withings.wiscale2.vascularage.m1 {
            a1() {
            }

            /* JADX WARN: Type inference failed for: r7v0, types: [ml.b, java.lang.Object] */
            @Override // com.withings.wiscale2.vascularage.m1
            public final com.withings.wiscale2.vascularage.r0 a(Long l5, boolean z5) {
                Period.a aVar = Period.f43718c;
                a aVar2 = a.this;
                r70.c cVar = (r70.c) aVar2.f57909a.T0.get();
                iy.e eVar = (iy.e) aVar2.f57909a.L0.get();
                v90.g T1 = j.T1(aVar2.f57910b);
                ?? obj = new Object();
                ks.t i22 = j.i2(aVar2.f57910b);
                aVar2.f57909a.f50197l.getClass();
                a80.c cVar2 = new a80.c();
                e40.a Q = aVar2.f57909a.Q();
                n20.f t72 = com.withings.wiscale2.b0.t7(aVar2.f57909a);
                LearnMoreManager Z1 = j.Z1(aVar2.f57910b);
                aVar2.f57910b.getClass();
                return new com.withings.wiscale2.vascularage.r0(l5, z5, cVar, eVar, T1, obj, i22, cVar2, Q, t72, Z1, new e40.b(new e40.c()));
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class b implements com.withings.fever.ui.temperatureList.r {
            b() {
            }

            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, g20.a] */
            @Override // com.withings.fever.ui.temperatureList.r
            public final com.withings.fever.ui.temperatureList.q a(Long l5) {
                fy.a u82;
                a aVar = a.this;
                r70.c cVar = (r70.c) aVar.f57909a.T0.get();
                iy.e eVar = (iy.e) aVar.f57909a.L0.get();
                ?? obj = new Object();
                u82 = aVar.f57909a.u8();
                return new com.withings.fever.ui.temperatureList.q(l5, cVar, eVar, obj, u82, (ky.c) aVar.f57909a.f50270x0.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class b0 implements com.withings.wiscale2.device.common.feature.highlowhr.j0 {
            b0() {
            }

            @Override // com.withings.wiscale2.device.common.feature.highlowhr.j0
            public final com.withings.wiscale2.device.common.feature.highlowhr.i0 a(long j5, Device device) {
                ng0.b s82;
                a aVar = a.this;
                s82 = aVar.f57909a.s8();
                return new com.withings.wiscale2.device.common.feature.highlowhr.i0(j5, device, (vr.d) aVar.f57909a.f50246t0.get(), s82, bg.a.a());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class b1 implements jo.b {
            b1() {
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, androidx.compose.ui.platform.k2] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, ie.a] */
            /* JADX WARN: Type inference failed for: r14v0, types: [df.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v0, types: [androidx.camera.core.impl.utils.k, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v0, types: [mo.a, java.lang.Object] */
            @Override // jo.b
            public final SetupConversation a(User user, r7 r7Var, xp.c cVar) {
                fl.p a11 = fl.p.f67672b.a();
                a aVar = a.this;
                return new SetupConversation(r7Var, a11, (jo.a) aVar.f57909a.f50267w3.get(), j.h2(aVar.f57910b), new Object(), new Object(), j.k2(aVar.f57910b), j.X1(aVar.f57910b), (po.a) aVar.f57910b.f57884h.get(), com.withings.wiscale2.b0.z6(aVar.f57909a), new Object(), new Object(), user, new Object(), cVar);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class c implements LeaderboardWeekViewModelFactory {
            c() {
            }

            @Override // com.withings.leaderboard.ui.LeaderboardWeekViewModelFactory
            public final LeaderboardWeekViewModel create(String str) {
                a aVar = a.this;
                return new LeaderboardWeekViewModel(str, com.withings.wiscale2.b0.K6(aVar.f57909a), (ActivityAggregateManager) aVar.f57909a.F1.get(), (t00.d) aVar.f57909a.f50146c2.get(), (r70.c) aVar.f57909a.T0.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class c0 implements com.withings.wiscale2.device.common.feature.highlowhr.k {
            c0() {
            }

            @Override // com.withings.wiscale2.device.common.feature.highlowhr.k
            public final com.withings.wiscale2.device.common.feature.highlowhr.a a(Device device, com.withings.user.User user) {
                ng0.b s82;
                a aVar = a.this;
                s82 = aVar.f57909a.s8();
                return new com.withings.wiscale2.device.common.feature.highlowhr.a(user, device, gk0.b.a(aVar.f57909a.f50131a), dl.a.a(), (kn.e) aVar.f57909a.f50251u.get(), bg.a.a(), fl.p.f67672b.a(), (com.withings.wiscale2.device.common.feature.u) aVar.f57909a.N2.get(), (PlatformFeatureRepository) aVar.f57909a.f50263w.get(), s82);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class c1 implements po.a {
            c1() {
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.d] */
            /* JADX WARN: Type inference failed for: r12v0, types: [yo.a, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, ah.g] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, androidx.camera.camera2.internal.v1] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, com.withings.measurements.ui.u1] */
            /* JADX WARN: Type inference failed for: r8v0, types: [im.a, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, b50.b] */
            @Override // po.a
            public final InitConversation a(ln.a aVar, User user) {
                a aVar2 = a.this;
                hp.a U1 = j.U1(aVar2.f57910b);
                ip.a V1 = j.V1(aVar2.f57910b);
                aVar2.f57910b.getClass();
                com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
                kotlin.jvm.internal.u.i(a11, "get(...)");
                gp.a aVar3 = new gp.a(a11);
                ?? obj = new Object();
                xb0.f B6 = com.withings.wiscale2.b0.B6(aVar2.f57909a);
                ro.a d22 = j.d2(aVar2.f57910b);
                ?? obj2 = new Object();
                ?? obj3 = new Object();
                ?? obj4 = new Object();
                xb0.c x62 = com.withings.wiscale2.b0.x6(aVar2.f57909a);
                ?? obj5 = new Object();
                ?? obj6 = new Object();
                xb0.g D6 = com.withings.wiscale2.b0.D6(aVar2.f57909a);
                so.a e22 = j.e2(aVar2.f57910b);
                fp.a f22 = j.f2(aVar2.f57910b);
                bp.a R1 = j.R1(aVar2.f57910b);
                xb0.b w62 = com.withings.wiscale2.b0.w6(aVar2.f57909a);
                xb0.e A6 = com.withings.wiscale2.b0.A6(aVar2.f57909a);
                wo.a P1 = j.P1(aVar2.f57910b);
                jp.a W1 = j.W1(aVar2.f57910b);
                aVar2.f57910b.getClass();
                return new InitConversation(U1, V1, aVar3, obj, B6, d22, obj2, obj3, obj4, x62, obj5, obj6, D6, e22, f22, R1, w62, A6, P1, W1, new zo.b(new Object()), new xo.a(), aVar, user);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class d implements com.withings.manualLogging.ui.feature.addNote.o1 {
            d() {
            }

            @Override // com.withings.manualLogging.ui.feature.addNote.o1
            public final com.withings.manualLogging.ui.feature.addNote.k1 a(long j5, long j11) {
                a aVar = a.this;
                return new com.withings.manualLogging.ui.feature.addNote.k1(j5, j11, com.withings.wiscale2.b0.K5(aVar.f57909a), com.withings.wiscale2.b0.a6(aVar.f57909a), com.withings.wiscale2.b0.S5(aVar.f57909a), com.withings.wiscale2.b0.B7(aVar.f57909a), (m70.i) aVar.f57909a.f50258v0.get(), (vf.c) aVar.f57909a.f50144c0.get(), com.withings.wiscale2.b0.H6(aVar.f57909a), com.withings.wiscale2.b0.q5(aVar.f57909a), com.withings.wiscale2.b0.U4(aVar.f57909a), com.withings.wiscale2.b0.M7(aVar.f57909a));
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class d0 implements com.withings.wiscale2.device.common.feature.irregularHeartBeat.j {
            d0() {
            }

            @Override // com.withings.wiscale2.device.common.feature.irregularHeartBeat.j
            public final com.withings.wiscale2.device.common.feature.irregularHeartBeat.i a(Device device) {
                a aVar = a.this;
                return new com.withings.wiscale2.device.common.feature.irregularHeartBeat.i(bg.a.a(), device, (PlatformFeatureRepository) aVar.f57909a.f50263w.get(), (com.withings.wiscale2.device.common.feature.u) aVar.f57909a.N2.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class d1 implements com.withings.ecg.details.v1 {
            d1() {
            }

            @Override // com.withings.ecg.details.v1
            public final com.withings.ecg.details.t1 a(Long l5, Long l6, Long l11, Long l12) {
                a aVar = a.this;
                return new com.withings.ecg.details.t1(l5, l6, l11, l12, gk0.c.a(aVar.f57909a.f50131a), (HeartSignalRepository) aVar.f57909a.f50181i1.get(), (NoteRepository) aVar.f57909a.B1.get(), (r70.c) aVar.f57909a.T0.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class e implements com.withings.weight.ui.a0 {
            e() {
            }

            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, v80.b] */
            @Override // com.withings.weight.ui.a0
            public final com.withings.weight.ui.v a(long j5, Long l5) {
                a aVar = a.this;
                return new com.withings.weight.ui.v((r70.c) aVar.f57909a.T0.get(), com.withings.wiscale2.b0.m5(aVar.f57909a), j.L1(aVar.f57910b), new Object(), com.withings.wiscale2.b0.V6(aVar.f57909a), j.A1(aVar.f57910b), (iy.e) aVar.f57909a.L0.get(), (ky.c) aVar.f57909a.f50270x0.get(), j5, l5);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class e0 implements com.withings.wiscale2.device.common.feature.irregularHeartBeat.t {
            e0() {
            }

            @Override // com.withings.wiscale2.device.common.feature.irregularHeartBeat.t
            public final com.withings.wiscale2.device.common.feature.irregularHeartBeat.s a(Device device) {
                a aVar = a.this;
                return new com.withings.wiscale2.device.common.feature.irregularHeartBeat.s(bg.a.a(), device, (PlatformFeatureRepository) aVar.f57909a.f50263w.get(), (com.withings.wiscale2.device.common.feature.u) aVar.f57909a.N2.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class e1 implements com.withings.ecg.details.w0 {
            e1() {
            }

            @Override // com.withings.ecg.details.w0
            public final com.withings.ecg.details.b0 a(long j5, long j11, boolean z5) {
                fy.k E8;
                dagger.internal.d dVar;
                a aVar = a.this;
                E8 = aVar.f57909a.E8();
                fy.d j52 = com.withings.wiscale2.b0.j5(aVar.f57909a);
                dVar = aVar.f57909a.R0;
                return new com.withings.ecg.details.b0(j5, j11, z5, gk0.c.a(aVar.f57909a.f50131a), (HeartSignalRepository) aVar.f57909a.f50181i1.get(), (NoteRepository) aVar.f57909a.B1.get(), E8, j52, (jq.b) dVar.get(), j.S1(aVar.f57910b), (t00.d) aVar.f57909a.f50146c2.get(), com.withings.wiscale2.b0.V6(aVar.f57909a), com.withings.wiscale2.b0.E6(aVar.f57909a), (r70.c) aVar.f57909a.T0.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class f implements com.withings.weight.ui.limbExplore.b0 {
            f() {
            }

            @Override // com.withings.weight.ui.limbExplore.b0
            public final com.withings.weight.ui.limbExplore.a0 a(long j5, LimbModel limbModel, DateTime dateTime, Period period) {
                a aVar = a.this;
                return new com.withings.weight.ui.limbExplore.a0(j5, limbModel, dateTime, period, com.withings.wiscale2.b0.V6(aVar.f57909a), gk0.b.a(aVar.f57909a.f50131a), j.T1(aVar.f57910b), com.withings.wiscale2.b0.N6(aVar.f57909a), j.B1(aVar.f57910b), (r70.c) aVar.f57909a.T0.get(), j.D1(aVar.f57910b), j.K1(aVar.f57910b));
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class f0 implements com.withings.wiscale2.device.common.feature.respiratoryscan.m {
            f0() {
            }

            @Override // com.withings.wiscale2.device.common.feature.respiratoryscan.m
            public final com.withings.wiscale2.device.common.feature.respiratoryscan.l a(Device device) {
                a aVar = a.this;
                return new com.withings.wiscale2.device.common.feature.respiratoryscan.l(device, (com.withings.wiscale2.device.common.feature.u) aVar.f57909a.N2.get(), (PlatformFeatureRepository) aVar.f57909a.f50263w.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class f1 implements WaitingSignalResultActivity.d {
            f1() {
            }

            @Override // com.withings.ecg.details.WaitingSignalResultActivity.d
            public final WaitingSignalResultActivity.c a(long j5, long j11) {
                a aVar = a.this;
                return new WaitingSignalResultActivity.c(gk0.b.a(aVar.f57909a.f50131a), (HeartSignalRepository) aVar.f57909a.f50181i1.get(), (NoteRepository) aVar.f57909a.B1.get(), (m70.i) aVar.f57909a.f50258v0.get(), j5, j11);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class g implements ch0.f {
            g() {
            }

            @Override // ch0.f
            public final ch0.d a(lb0.j jVar, u70.k kVar) {
                dagger.internal.d dVar;
                dagger.internal.d dVar2;
                dagger.internal.d dVar3;
                a aVar = a.this;
                vf.c cVar = (vf.c) aVar.f57909a.f50144c0.get();
                dVar = aVar.f57909a.f50235r1;
                AccountRemoteRepository accountRemoteRepository = (AccountRemoteRepository) dVar.get();
                u70.a aVar2 = (u70.a) aVar.f57909a.f50150d0.get();
                jg.a W4 = com.withings.wiscale2.b0.W4(aVar.f57909a);
                x60.a aVar3 = (x60.a) aVar.f57909a.R.get();
                dVar2 = aVar.f57909a.f50183i3;
                lb0.l lVar = (lb0.l) ((b0.a) dVar2).get();
                ej0.b e11 = ej0.b.e();
                kotlin.jvm.internal.u.i(e11, "get(...)");
                ug0.a Y1 = j.Y1(aVar.f57910b);
                th.t a22 = j.a2(aVar.f57910b);
                cg.l P8 = aVar.f57909a.P8();
                dVar3 = aVar.f57909a.A3;
                return new ch0.d(jVar, kVar, cVar, accountRemoteRepository, aVar2, W4, aVar3, lVar, e11, Y1, a22, P8, (th0.k) dVar3.get(), (m70.i) aVar.f57909a.f50258v0.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class g0 implements op.e {
            g0() {
            }

            @Override // op.e
            public final op.d a(int i11) {
                return new op.d(i11, j.g2(a.this.f57910b));
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class h implements com.withings.wiscale2.activity.g {
            h() {
            }

            @Override // com.withings.wiscale2.activity.g
            public final com.withings.wiscale2.activity.f create(com.withings.user.User user) {
                return new com.withings.wiscale2.activity.f(user, (ActivityAggregateManager) a.this.f57909a.F1.get(), dl.a.a());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class h0 implements com.withings.wiscale2.device.common.feature.spo2.s {
            h0() {
            }

            @Override // com.withings.wiscale2.device.common.feature.spo2.s
            public final com.withings.wiscale2.device.common.feature.spo2.t a(Device device) {
                a aVar = a.this;
                return new com.withings.wiscale2.device.common.feature.spo2.t(device, (com.withings.wiscale2.device.common.feature.u) aVar.f57909a.N2.get(), (PlatformFeatureRepository) aVar.f57909a.f50263w.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class i implements com.withings.wiscale2.activity.logging.ui.t0 {
            i() {
            }

            @Override // com.withings.wiscale2.activity.logging.ui.t0
            public final com.withings.wiscale2.activity.logging.ui.m0 a(com.withings.user.User user, Long l5, WorkoutCategory workoutCategory, Long l6) {
                dagger.internal.d dVar;
                a aVar = a.this;
                Context a11 = gk0.c.a(aVar.f57909a.f50131a);
                m70.i iVar = (m70.i) aVar.f57909a.f50258v0.get();
                l70.w wVar = (l70.w) aVar.f57909a.H.get();
                WorkoutManager workoutManager = (WorkoutManager) aVar.f57909a.f50223p1.get();
                WorkoutCategoryManager workoutCategoryManager = (WorkoutCategoryManager) aVar.f57909a.K1.get();
                lj0.h0 h0Var = (lj0.h0) aVar.f57909a.W0.get();
                dVar = aVar.f57909a.f50157e1;
                return new com.withings.wiscale2.activity.logging.ui.m0(user, l5, workoutCategory, l6, a11, iVar, wVar, workoutManager, workoutCategoryManager, h0Var, (ua0.a) ((b0.a) dVar).get(), com.withings.wiscale2.b0.V6(aVar.f57909a), (ba0.d) aVar.f57910b.f57907y.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class i0 implements com.withings.wiscale2.device.common.feature.spo2.r {
            i0() {
            }

            @Override // com.withings.wiscale2.device.common.feature.spo2.r
            public final com.withings.wiscale2.device.common.feature.spo2.q a(Device device) {
                dagger.internal.d dVar;
                a aVar = a.this;
                dVar = aVar.f57909a.f50145c1;
                return new com.withings.wiscale2.device.common.feature.spo2.q(device, (com.withings.wiscale2.device.common.feature.c) dVar.get(), (com.withings.wiscale2.device.common.feature.u) aVar.f57909a.N2.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* renamed from: com.withings.wiscale2.j$a$j  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        final class C0751j implements ba0.d {
            C0751j() {
            }

            @Override // ba0.d
            public final ba0.c a(com.withings.user.User user, Track track) {
                a aVar = a.this;
                return new ba0.c(user, track, (lj0.h0) aVar.f57909a.W0.get(), (t00.d) aVar.f57909a.f50146c2.get(), com.withings.wiscale2.b0.g6(aVar.f57909a));
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class j0 implements com.withings.wiscale2.device.common.onboarding.e {
            j0() {
            }

            @Override // com.withings.wiscale2.device.common.onboarding.e
            public final com.withings.wiscale2.device.common.onboarding.c a(Device device, boolean z5) {
                a aVar = a.this;
                return new com.withings.wiscale2.device.common.onboarding.c(device, z5, (kn.e) aVar.f57909a.f50251u.get(), (com.withings.wiscale2.device.common.feature.u) aVar.f57909a.N2.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class k implements com.withings.coach.chatbot.t0 {
            k() {
            }

            @Override // com.withings.coach.chatbot.t0
            public final com.withings.coach.chatbot.p0 a(Insight insight) {
                dagger.internal.d dVar;
                dagger.internal.d dVar2;
                a aVar = a.this;
                dVar = aVar.f57909a.f50205m1;
                gw.b bVar = (gw.b) dVar.get();
                dVar2 = aVar.f57909a.V0;
                ew.a aVar2 = (ew.a) dVar2.get();
                si.a aVar3 = androidx.camera.camera2.internal.s2.f2662b;
                if (aVar3 != null) {
                    return new com.withings.coach.chatbot.p0(insight, bVar, aVar2, aVar3, (ti.d) aVar.f57909a.G.get(), (r70.c) aVar.f57909a.T0.get(), gk0.b.a(aVar.f57909a.f50131a));
                }
                kotlin.jvm.internal.u.s("deepLinkHandlerProvider");
                throw null;
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class k0 implements com.withings.wiscale2.device.common.screen.ui.c2 {
            k0() {
            }

            @Override // com.withings.wiscale2.device.common.screen.ui.c2
            public final ScreenSelectionViewModel a(long j5, Device device, boolean z5) {
                a aVar = a.this;
                return new ScreenSelectionViewModel(gk0.b.a(aVar.f57909a.f50131a), j5, device, z5, (kn.e) aVar.f57909a.f50251u.get(), (t10.e) aVar.f57909a.f50217o1.get(), j.N1(aVar.f57910b), j.Q1(aVar.f57910b), (vr.d) aVar.f57909a.f50246t0.get(), (DeviceScreensRepository) aVar.f57909a.E0.get(), bg.a.a(), fl.p.f67672b.a());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class l implements com.withings.wiscale2.activity.workout.category.ui.g {
            l() {
            }

            @Override // com.withings.wiscale2.activity.workout.category.ui.g
            public final com.withings.wiscale2.activity.workout.category.ui.b a(long j5) {
                dagger.internal.d dVar;
                a aVar = a.this;
                Context a11 = gk0.c.a(aVar.f57909a.f50131a);
                dVar = aVar.f57909a.B3;
                return new com.withings.wiscale2.activity.workout.category.ui.b(j5, a11, (ax.h) dVar.get(), (WorkoutManager) aVar.f57909a.f50223p1.get(), com.withings.wiscale2.b0.l8(aVar.f57909a), (t00.d) aVar.f57909a.f50146c2.get(), (WorkoutCategoryManager) aVar.f57909a.K1.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class l0 implements NavigationTutorialActivity.b {
            l0() {
            }

            @Override // com.withings.wiscale2.device.common.tutorial.navigation.NavigationTutorialActivity.b
            public final NavigationTutorialActivity.a a(int i11, Device device) {
                a aVar = a.this;
                return new NavigationTutorialActivity.a(i11, device, (PlatformFeatureRepository) aVar.f57909a.f50263w.get(), (com.withings.wiscale2.device.common.feature.u) aVar.f57909a.N2.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class m implements com.withings.wiscale2.activity.workout.live.ui.d1 {
            m() {
            }

            @Override // com.withings.wiscale2.activity.workout.live.ui.d1
            public final com.withings.wiscale2.activity.workout.live.ui.z0 a(va0.d dVar, LiveWorkout liveWorkout) {
                dagger.internal.d dVar2;
                dagger.internal.d dVar3;
                a aVar = a.this;
                dVar2 = aVar.f57909a.B3;
                ta0.a O6 = com.withings.wiscale2.b0.O6(aVar.f57909a);
                dVar3 = aVar.f57909a.V2;
                return new com.withings.wiscale2.activity.workout.live.ui.z0(gk0.b.a(aVar.f57909a.f50131a), (u70.a) aVar.f57909a.f50150d0.get(), (kn.e) aVar.f57909a.f50251u.get(), (m70.i) aVar.f57909a.f50258v0.get(), bg.a.a(), (WorkoutCategoryManager) aVar.f57909a.K1.get(), (ax.h) dVar2.get(), fl.p.f67672b.a(), (lj0.h0) aVar.f57909a.W0.get(), O6, (ax.c) ((b0.a) dVar3).get(), dVar, liveWorkout);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class m0 implements com.withings.wiscale2.device.common.ui.h0 {
            @Override // com.withings.wiscale2.device.common.ui.h0
            public final com.withings.wiscale2.device.common.ui.g0 a(nn.i iVar) {
                return new com.withings.wiscale2.device.common.ui.g0(fl.p.f67672b.a(), iVar);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class n implements com.withings.wiscale2.coretemperature.ui.p {
            n() {
            }

            @Override // com.withings.wiscale2.coretemperature.ui.p
            public final com.withings.wiscale2.coretemperature.ui.n a(long j5) {
                return new com.withings.wiscale2.coretemperature.ui.n(j5, (VasistasRepository) ((b0.a) a.this.f57909a.X0).get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class n0 implements com.withings.wiscale2.device.common.ui.y1 {
            n0() {
            }

            @Override // com.withings.wiscale2.device.common.ui.y1
            public final com.withings.wiscale2.device.common.ui.x1 a(Device device) {
                a aVar = a.this;
                return new com.withings.wiscale2.device.common.ui.x1(device, (com.withings.wiscale2.device.common.feature.u) aVar.f57909a.N2.get(), (PlatformFeatureRepository) aVar.f57909a.f50263w.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class o implements com.withings.wiscale2.device.common.feature.afib.i {
            o() {
            }

            @Override // com.withings.wiscale2.device.common.feature.afib.i
            public final com.withings.wiscale2.device.common.feature.afib.h a(Device device) {
                ej.w a11 = bg.a.a();
                a aVar = a.this;
                return new com.withings.wiscale2.device.common.feature.afib.h(a11, device, (PlatformFeatureRepository) aVar.f57909a.f50263w.get(), (com.withings.wiscale2.device.common.feature.u) aVar.f57909a.N2.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class o0 implements com.withings.wiscale2.device.common.ui.j2 {
            o0() {
            }

            @Override // com.withings.wiscale2.device.common.ui.j2
            public final com.withings.wiscale2.device.common.ui.h2 a(Device device) {
                a aVar = a.this;
                return new com.withings.wiscale2.device.common.ui.h2(device, gk0.c.a(aVar.f57909a.f50131a), (PlatformFeatureRepository) aVar.f57909a.f50263w.get(), (com.withings.wiscale2.device.common.feature.u) aVar.f57909a.N2.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class p implements com.withings.wiscale2.device.common.feature.afib.t {
            p() {
            }

            @Override // com.withings.wiscale2.device.common.feature.afib.t
            public final com.withings.wiscale2.device.common.feature.afib.s a(Device device) {
                ej.w a11 = bg.a.a();
                a aVar = a.this;
                return new com.withings.wiscale2.device.common.feature.afib.s(a11, device, (PlatformFeatureRepository) aVar.f57909a.f50263w.get(), (com.withings.wiscale2.device.common.feature.u) aVar.f57909a.N2.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class p0 implements com.withings.wiscale2.device.common.ui.geoloc.g0 {
            p0() {
            }

            @Override // com.withings.wiscale2.device.common.ui.geoloc.g0
            public final com.withings.wiscale2.device.common.ui.geoloc.a0 a(Device device) {
                a aVar = a.this;
                return new com.withings.wiscale2.device.common.ui.geoloc.a0(gk0.c.a(aVar.f57909a.f50131a), device, (kn.e) aVar.f57909a.f50251u.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class q implements e5 {
            q() {
            }

            @Override // com.withings.wiscale2.device.common.feature.ecg.e5
            public final o4 a(Device device, com.withings.wiscale2.device.common.feature.d dVar, String str, Locale locale) {
                dagger.internal.d dVar2;
                a aVar = a.this;
                Application a11 = gk0.b.a(aVar.f57909a.f50131a);
                PlatformFeatureRepository platformFeatureRepository = (PlatformFeatureRepository) aVar.f57909a.f50263w.get();
                com.withings.wiscale2.device.common.feature.u uVar = (com.withings.wiscale2.device.common.feature.u) aVar.f57909a.N2.get();
                dVar2 = aVar.f57909a.f50145c1;
                return new o4(device, dVar, str, locale, a11, platformFeatureRepository, uVar, (com.withings.wiscale2.device.common.feature.c) dVar2.get(), com.withings.wiscale2.b0.u5(aVar.f57909a), (r70.c) aVar.f57909a.T0.get(), (EcgReviewRemoteRepository) aVar.f57909a.f50170g2.get(), (m70.i) aVar.f57909a.f50258v0.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class q0 implements com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.k0 {
            q0() {
            }

            @Override // com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.k0
            public final com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.b0 a(Device device) {
                dagger.internal.d dVar;
                a aVar = a.this;
                dVar = aVar.f57909a.C3;
                return new com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.b0(gk0.c.a(aVar.f57909a.f50131a), bg.a.a(), fl.p.f67672b.a(), (o60.g) aVar.f57909a.K.get(), (ConsumableRemoteRepository) dVar.get(), device);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class r implements q5 {
            r() {
            }

            @Override // com.withings.wiscale2.device.common.feature.ecg.q5
            public final p5 a(Device device) {
                ej.w a11 = bg.a.a();
                a aVar = a.this;
                return new p5(device, a11, (kn.e) aVar.f57909a.f50251u.get(), (vr.d) aVar.f57909a.f50246t0.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class r0 implements np.q0 {
            r0() {
            }

            @Override // np.q0
            public final np.p0 a(xi.b bVar, int i11) {
                dagger.internal.d dVar;
                fl.p a11 = fl.p.f67672b.a();
                a aVar = a.this;
                dVar = aVar.f57909a.f50273x3;
                return new np.p0(bVar, i11, a11, (jo.q0) dVar.get(), (jo.b) aVar.f57910b.f57886i.get(), bg.a.a(), (r70.c) aVar.f57909a.T0.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class s implements gc0.p0 {
            s() {
            }

            @Override // gc0.p0
            public final gc0.n0 a(long j5, long j11, boolean z5) {
                ej.w a11 = bg.a.a();
                a aVar = a.this;
                return new gc0.n0(a11, (kn.e) aVar.f57909a.f50251u.get(), (vr.d) aVar.f57909a.f50246t0.get(), (r70.c) aVar.f57909a.T0.get(), com.withings.wiscale2.b0.u5(aVar.f57909a), (EcgReviewRemoteRepository) aVar.f57909a.f50170g2.get(), j5, j11, z5);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class s0 implements com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.r {
            s0() {
            }

            @Override // com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.r
            public final com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.k a(Device device) {
                a aVar = a.this;
                return new com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.k(gk0.c.a(aVar.f57909a.f50131a), bg.a.a(), fl.p.f67672b.a(), (o60.g) aVar.f57909a.K.get(), device);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class t implements hc0.q {
            t() {
            }

            @Override // hc0.q
            public final hc0.o a(long j5, long j11) {
                return new hc0.o(j5, j11, (EcgReviewRemoteRepository) a.this.f57909a.f50170g2.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class t0 implements Wpm0203Activity.e {
            t0() {
            }

            @Override // com.withings.wiscale2.device.wpm.ui.Wpm0203Activity.e
            public final Wpm0203Activity.d a(u70.i iVar, DeviceModel deviceModel) {
                a aVar = a.this;
                return new Wpm0203Activity.d(iVar, deviceModel, gk0.c.a(aVar.f57909a.f50131a), (vf.c) aVar.f57909a.f50144c0.get(), (kn.e) aVar.f57909a.f50251u.get(), (m70.i) aVar.f57909a.f50258v0.get(), bg.a.a(), com.withings.wiscale2.b0.F6(aVar.f57909a), aVar.f57909a.o8(), (t00.d) aVar.f57909a.f50146c2.get(), fl.p.f67672b.a());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class u implements ic0.c0 {
            u() {
            }

            @Override // ic0.c0
            public final ic0.b0 a(long j5, long j11, t5 t5Var) {
                return new ic0.b0((vr.d) a.this.f57909a.f50246t0.get(), j5, j11, t5Var);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class u0 implements FoodDayDownloadDelegateFactory {
            u0() {
            }

            @Override // com.withings.wiscale2.food.model.FoodDayDownloadDelegateFactory
            public final FoodDayDownloadDelegate create(com.withings.user.User user, a.c cVar) {
                dagger.internal.d dVar;
                FoodManager foodManager = FoodManager.Companion.get();
                ah.p.d(foodManager);
                dVar = a.this.f57909a.U1;
                return new FoodDayDownloadDelegate(user, cVar, foodManager, (FoodRemoteRepository) dVar.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class v implements gn.b {
            v() {
            }

            @Override // gn.b
            public final com.withings.cycletracking.ui.viewmodel.c a(long j5, long j11) {
                dagger.internal.d dVar;
                a aVar = a.this;
                xw.b bVar = (xw.b) aVar.f57909a.K0.get();
                dVar = aVar.f57909a.J0;
                return new com.withings.cycletracking.ui.viewmodel.c(j5, j11, bVar, (gr.a) dVar.get(), aVar.f57909a.F());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class v0 implements com.withings.wiscale2.heart.heartrate.r0 {
            v0() {
            }

            @Override // com.withings.wiscale2.heart.heartrate.r0
            public final com.withings.wiscale2.heart.heartrate.e0 a(com.withings.user.User user, DateTime dateTime) {
                dagger.internal.d dVar;
                fy.l F8;
                a aVar = a.this;
                lj0.h0 h0Var = (lj0.h0) aVar.f57909a.W0.get();
                ei0.q qVar = (ei0.q) aVar.f57909a.J1.get();
                ActivityAggregateManager activityAggregateManager = (ActivityAggregateManager) aVar.f57909a.F1.get();
                kn.e eVar = (kn.e) aVar.f57909a.f50251u.get();
                dVar = aVar.f57909a.D3;
                fl.i iVar = (fl.i) dVar.get();
                F8 = aVar.f57909a.F8();
                mg0.c cVar = mg0.c.f82024g;
                if (cVar != null) {
                    return new com.withings.wiscale2.heart.heartrate.e0(user, dateTime, h0Var, qVar, activityAggregateManager, eVar, iVar, F8, cVar, j.H1(aVar.f57910b), com.withings.wiscale2.b0.g6(aVar.f57909a), (t00.d) aVar.f57909a.f50146c2.get(), (PlatformFeatureRepository) aVar.f57909a.f50263w.get());
                }
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class w implements ic0.q {
            w() {
            }

            @Override // ic0.q
            public final ic0.p a(long j5, long j11, boolean z5) {
                return new ic0.p((vr.d) a.this.f57909a.f50246t0.get(), j5, j11, z5);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class w0 implements BrowseProgramViewModelFactory {
            w0() {
            }

            @Override // com.withings.wiscale2.legacyprograms.BrowseProgramViewModelFactory
            public final BrowseProgramViewModel create(com.withings.user.User user) {
                dagger.internal.d dVar;
                a aVar = a.this;
                Context a11 = gk0.c.a(aVar.f57909a.f50131a);
                dVar = aVar.f57909a.M1;
                return new BrowseProgramViewModel(a11, user, (x30.c) dVar.get(), aVar.f57909a.enrolledRepository(), aVar.f57909a.getMostRecentEnrolledProgramLastUpdateUseCase(), aVar.f57909a.fetchTasksProgramByIdUseCase());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class x implements ac0.x {
            x() {
            }

            @Override // ac0.x
            public final VideoCallPhoneNumberViewModel a(long j5, long j11) {
                return new VideoCallPhoneNumberViewModel(j5, j11, (EcgReviewRemoteRepository) a.this.f57909a.f50170g2.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class x0 implements i10.o {
            x0() {
            }

            @Override // i10.o
            public final i10.m a(NotificationPreferenceType notificationPreferenceType) {
                a aVar = a.this;
                return new i10.m(notificationPreferenceType, (h10.a) aVar.f57909a.J.get(), (r70.c) aVar.f57909a.T0.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class y implements ac0.e {
            y() {
            }

            @Override // ac0.e
            public final VideoCallCodeCheckViewModel a(long j5, long j11, String str) {
                return new VideoCallCodeCheckViewModel(j5, j11, str, (EcgReviewRemoteRepository) a.this.f57909a.f50170g2.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class y0 implements com.withings.wiscale2.user.ui.x {
            y0() {
            }

            @Override // com.withings.wiscale2.user.ui.x
            public final com.withings.wiscale2.user.ui.w a(com.withings.user.User user, boolean z5) {
                a aVar = a.this;
                return new com.withings.wiscale2.user.ui.w(user, z5, gk0.c.a(aVar.f57909a.f50131a), (vf.c) aVar.f57909a.f50144c0.get(), (oi0.b) aVar.f57909a.f50152d2.get(), (m70.i) aVar.f57909a.f50258v0.get(), (kn.e) aVar.f57909a.f50251u.get(), fl.p.f67672b.a(), j.F1(aVar.f57910b), j.j2(aVar.f57910b), com.withings.wiscale2.b0.b8(aVar.f57909a), (l70.w) aVar.f57909a.H.get());
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class z implements jc0.v {
            z() {
            }

            @Override // jc0.v
            public final FirstEcgVideoInstructionViewModel a(long j5, long j11) {
                a aVar = a.this;
                return new FirstEcgVideoInstructionViewModel(gk0.c.a(aVar.f57909a.f50131a), (kn.e) aVar.f57909a.f50251u.get(), (vr.d) aVar.f57909a.f50246t0.get(), j5, j11);
            }
        }

        /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
        /* loaded from: classes4.dex */
        final class z0 implements com.withings.wiscale2.user.ui.profile.y0 {
            z0() {
            }

            @Override // com.withings.wiscale2.user.ui.profile.y0
            public final com.withings.wiscale2.user.ui.profile.s0 a(long j5, boolean z5, va0.d dVar) {
                dagger.internal.d dVar2;
                a aVar = a.this;
                Context a11 = gk0.c.a(aVar.f57909a.f50131a);
                vf.c cVar = (vf.c) aVar.f57909a.f50144c0.get();
                AccountSessionRepository accountSessionRepository = (AccountSessionRepository) aVar.f57909a.f50216o0.get();
                eg.a m42 = com.withings.wiscale2.b0.m4(aVar.f57909a);
                aa0.c J1 = j.J1(aVar.f57910b);
                aa0.a I1 = j.I1(aVar.f57910b);
                p70.a i11 = aVar.f57909a.i();
                q70.j b82 = com.withings.wiscale2.b0.b8(aVar.f57909a);
                q70.d c22 = j.c2(aVar.f57910b);
                fl.p a12 = fl.p.f67672b.a();
                dVar2 = aVar.f57909a.D3;
                return new com.withings.wiscale2.user.ui.profile.s0(j5, z5, dVar, a11, cVar, accountSessionRepository, m42, J1, I1, i11, b82, c22, a12, (fl.i) dVar2.get(), (r70.c) aVar.f57909a.T0.get(), (l70.w) aVar.f57909a.H.get(), (iy.e) aVar.f57909a.L0.get(), (ky.c) aVar.f57909a.f50270x0.get(), (r70.a) aVar.f57909a.E3.get(), j.l2(aVar.f57910b));
            }
        }

        a(com.withings.wiscale2.b0 b0Var, j jVar, int i11) {
            this.f57909a = b0Var;
            this.f57910b = jVar;
            this.f57911c = i11;
        }

        /* JADX WARN: Type inference failed for: r10v0, types: [df.d, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, ct.b] */
        /* JADX WARN: Type inference failed for: r4v0, types: [df.d, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ct.b] */
        /* JADX WARN: Type inference failed for: r6v0, types: [i90.a, java.lang.Object] */
        @Override // javax.inject.Provider
        public final T get() {
            j jVar = this.f57910b;
            int i11 = this.f57911c;
            switch (i11) {
                case 0:
                    return (T) new k();
                case 1:
                    return (T) new v();
                case 2:
                    return (T) new g0();
                case 3:
                    return (T) new r0();
                case 4:
                    return (T) new b1();
                case 5:
                    return (T) new c1();
                case 6:
                    return (T) new d1();
                case 7:
                    return (T) new e1();
                case 8:
                    return (T) new f1();
                case 9:
                    return (T) new C0750a();
                case 10:
                    return (T) new b();
                case 11:
                    return (T) new c();
                case 12:
                    return (T) new d();
                case 13:
                    return (T) new n90.q(jVar.f57870a, new Object(), new Object(), j.C1(jVar), j.E1(jVar), j.G1(jVar));
                case 14:
                    return (T) new n90.n(jVar.f57870a, new Object(), new Object(), new Object(), (h90.a) jVar.f57901s.get());
                case 15:
                    return (T) new h90.a(jVar.f57870a);
                case 16:
                    return (T) new e();
                case 17:
                    return (T) new f();
                case 18:
                    return (T) new g();
                case 19:
                    return (T) new h();
                case 20:
                    return (T) new i();
                case 21:
                    return (T) new C0751j();
                case 22:
                    return (T) new l();
                case 23:
                    return (T) new m();
                case 24:
                    return (T) new n();
                case 25:
                    return (T) new o();
                case 26:
                    return (T) new p();
                case 27:
                    return (T) new q();
                case 28:
                    return (T) new r();
                case 29:
                    return (T) new s();
                case 30:
                    return (T) new t();
                case 31:
                    return (T) new u();
                case 32:
                    return (T) new w();
                case 33:
                    return (T) new x();
                case 34:
                    return (T) new y();
                case 35:
                    return (T) new z();
                case 36:
                    return (T) new a0();
                case 37:
                    return (T) new b0();
                case 38:
                    return (T) new c0();
                case 39:
                    return (T) new d0();
                case 40:
                    return (T) new e0();
                case 41:
                    return (T) new f0();
                case 42:
                    return (T) new h0();
                case 43:
                    return (T) new i0();
                case 44:
                    return (T) new j0();
                case 45:
                    return (T) new k0();
                case 46:
                    return (T) new l0();
                case 47:
                    return (T) new Object();
                case 48:
                    return (T) new n0();
                case 49:
                    return (T) new o0();
                case 50:
                    return (T) new p0();
                case 51:
                    return (T) new q0();
                case 52:
                    return (T) new s0();
                case 53:
                    return (T) new t0();
                case 54:
                    return (T) new u0();
                case 55:
                    return (T) new v0();
                case 56:
                    return (T) new w0();
                case 57:
                    return (T) new x0();
                case 58:
                    return (T) new y0();
                case 59:
                    return (T) new z0();
                case 60:
                    return (T) new a1();
                default:
                    throw new AssertionError(i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(b0 b0Var, l lVar, Activity activity) {
        this.f57872b = b0Var;
        this.f57874c = lVar;
        this.f57870a = activity;
        this.f57878e = dagger.internal.f.b(new a(b0Var, this, 0));
        this.f57880f = dagger.internal.f.b(new a(b0Var, this, 1));
        this.f57882g = dagger.internal.f.b(new a(b0Var, this, 2));
        this.f57884h = dagger.internal.f.b(new a(b0Var, this, 5));
        this.f57886i = dagger.internal.f.b(new a(b0Var, this, 4));
        this.f57888j = dagger.internal.f.b(new a(b0Var, this, 3));
        this.f57890k = dagger.internal.f.b(new a(b0Var, this, 6));
        this.f57892l = dagger.internal.f.b(new a(b0Var, this, 7));
        this.f57894m = dagger.internal.f.b(new a(b0Var, this, 8));
        this.f57896n = dagger.internal.f.b(new a(b0Var, this, 9));
        this.f57897o = dagger.internal.f.b(new a(b0Var, this, 10));
        this.f57898p = dagger.internal.f.b(new a(b0Var, this, 11));
        this.f57899q = dagger.internal.f.b(new a(b0Var, this, 12));
        this.f57900r = dagger.internal.a.c(new a(b0Var, this, 13));
        this.f57901s = dagger.internal.a.c(new a(b0Var, this, 15));
        this.f57902t = dagger.internal.a.c(new a(b0Var, this, 14));
        this.f57903u = dagger.internal.f.b(new a(b0Var, this, 16));
        this.f57904v = dagger.internal.f.b(new a(b0Var, this, 17));
        this.f57905w = dagger.internal.f.b(new a(b0Var, this, 18));
        this.f57906x = dagger.internal.f.b(new a(b0Var, this, 19));
        this.f57907y = dagger.internal.f.b(new a(b0Var, this, 21));
        this.f57908z = dagger.internal.f.b(new a(b0Var, this, 20));
        this.A = dagger.internal.f.b(new a(b0Var, this, 22));
        this.B = dagger.internal.f.b(new a(b0Var, this, 23));
        this.C = dagger.internal.f.b(new a(b0Var, this, 24));
        this.D = dagger.internal.f.b(new a(b0Var, this, 25));
        this.E = dagger.internal.f.b(new a(b0Var, this, 26));
        this.F = dagger.internal.f.b(new a(b0Var, this, 27));
        this.G = dagger.internal.f.b(new a(b0Var, this, 28));
        this.H = dagger.internal.f.b(new a(b0Var, this, 29));
        this.I = dagger.internal.f.b(new a(b0Var, this, 30));
        this.J = dagger.internal.f.b(new a(b0Var, this, 31));
        this.K = dagger.internal.f.b(new a(b0Var, this, 32));
        this.L = dagger.internal.f.b(new a(b0Var, this, 33));
        this.M = dagger.internal.f.b(new a(b0Var, this, 34));
        this.N = dagger.internal.f.b(new a(b0Var, this, 35));
        this.O = dagger.internal.f.b(new a(b0Var, this, 36));
        this.P = dagger.internal.f.b(new a(b0Var, this, 37));
        this.Q = dagger.internal.f.b(new a(b0Var, this, 38));
        this.R = dagger.internal.f.b(new a(b0Var, this, 39));
        this.S = dagger.internal.f.b(new a(b0Var, this, 40));
        this.T = dagger.internal.f.b(new a(b0Var, this, 41));
        this.U = dagger.internal.f.b(new a(b0Var, this, 42));
        this.V = dagger.internal.f.b(new a(b0Var, this, 43));
        this.W = dagger.internal.f.b(new a(b0Var, this, 44));
        this.X = dagger.internal.f.b(new a(b0Var, this, 45));
        this.Y = dagger.internal.f.b(new a(b0Var, this, 46));
        this.Z = dagger.internal.f.b(new a(b0Var, this, 47));
        this.f57871a0 = dagger.internal.f.b(new a(b0Var, this, 48));
        this.f57873b0 = dagger.internal.f.b(new a(b0Var, this, 49));
        this.f57875c0 = dagger.internal.f.b(new a(b0Var, this, 50));
        this.f57877d0 = dagger.internal.f.b(new a(b0Var, this, 51));
        this.f57879e0 = dagger.internal.f.b(new a(b0Var, this, 52));
        this.f57881f0 = dagger.internal.f.b(new a(b0Var, this, 53));
        this.f57883g0 = dagger.internal.f.b(new a(b0Var, this, 54));
        this.f57885h0 = dagger.internal.f.b(new a(b0Var, this, 55));
        this.f57887i0 = dagger.internal.f.b(new a(b0Var, this, 56));
        this.f57889j0 = dagger.internal.f.b(new a(b0Var, this, 57));
        this.f57891k0 = dagger.internal.f.b(new a(b0Var, this, 58));
        this.f57893l0 = dagger.internal.f.b(new a(b0Var, this, 59));
        this.f57895m0 = dagger.internal.f.b(new a(b0Var, this, 60));
    }

    static com.withings.weight.ui.usecase.a A1(j jVar) {
        return new com.withings.weight.ui.usecase.a(b0.V6(jVar.f57872b));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [mo.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.d] */
    static v90.c B1(j jVar) {
        t80.c N6 = b0.N6(jVar.f57872b);
        new ah.c0();
        return new v90.c(N6, new Object(), new ks.t(new Object()));
    }

    static h90.b C1(j jVar) {
        return new h90.b(jVar.f57870a, new i90.d(jVar.f57870a));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ct.a] */
    static com.withings.weight.ui.limbExplore.a D1(j jVar) {
        return new com.withings.weight.ui.limbExplore.a(jVar.f57870a, new Object());
    }

    static h90.c E1(j jVar) {
        return new h90.c(jVar.f57870a, new i90.d(jVar.f57870a));
    }

    static q70.b F1(j jVar) {
        b0 b0Var = jVar.f57872b;
        return new q70.b(b0Var.i(), (r70.c) b0Var.T0.get());
    }

    static i90.c G1(j jVar) {
        return new i90.c(jVar.f57870a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fy.b H1(j jVar) {
        fy.a u82;
        b0 b0Var = jVar.f57872b;
        fy.d j5 = b0.j5(b0Var);
        ey.a s42 = b0.s4(b0Var);
        u82 = b0Var.u8();
        return new fy.b(j5, s42, u82, (zx.j) b0Var.f50270x0.get());
    }

    static aa0.a I1(j jVar) {
        q70.g d92;
        b0 b0Var = jVar.f57872b;
        vf.c cVar = (vf.c) b0Var.f50144c0.get();
        kn.e eVar = (kn.e) b0Var.f50251u.get();
        Context a11 = gk0.c.a(b0Var.f50131a);
        d92 = b0Var.d9();
        return new aa0.a(cVar, eVar, a11, d92, b0Var.i());
    }

    static aa0.c J1(j jVar) {
        dagger.internal.d dVar;
        b0 b0Var = jVar.f57872b;
        cg.l P8 = b0Var.P8();
        dVar = b0Var.f50235r1;
        return new aa0.c(P8, (AccountRemoteRepository) dVar.get());
    }

    static v90.f K1(j jVar) {
        b0 b0Var = jVar.f57872b;
        return new v90.f(gk0.c.a(b0Var.f50131a), new vy.a(b0.V6(b0Var)));
    }

    static v80.f L1(j jVar) {
        b0 b0Var = jVar.f57872b;
        return new v80.f(new v80.d((c90.a) b0Var.O.get(), new v80.c(gk0.c.a(b0Var.f50131a))));
    }

    static ox.c M1(j jVar) {
        dagger.internal.d dVar;
        dVar = jVar.f57872b.H0;
        return new ox.c((ex.b) dVar.get());
    }

    static tc0.e N1(j jVar) {
        jVar.getClass();
        return new tc0.e(new tc0.k(DeviceScreenModule_ProvideGetMissingFeatureTagUseCaseFactory.provideGetMissingFeatureTagUseCase()), new tc0.j(gk0.c.a(jVar.f57872b.f50131a)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static wb0.j O1(j jVar) {
        return new wb0.j(gk0.c.a(jVar.f57872b.f50131a), fl.p.f67672b.a());
    }

    static wo.a P1(j jVar) {
        return new wo.a((kn.e) jVar.f57872b.f50251u.get());
    }

    static tc0.i Q1(j jVar) {
        jVar.getClass();
        return new tc0.i(new tc0.k(DeviceScreenModule_ProvideGetMissingFeatureTagUseCaseFactory.provideGetMissingFeatureTagUseCase()), new tc0.j(gk0.c.a(jVar.f57872b.f50131a)));
    }

    static bp.a R1(j jVar) {
        return new bp.a((kn.e) jVar.f57872b.f50251u.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GetSignalDataSyncFactory S1(j jVar) {
        dagger.internal.d dVar;
        b0 b0Var = jVar.f57872b;
        dVar = b0Var.A1;
        return new GetSignalDataSyncFactory(gk0.c.a(b0Var.f50131a), (HeartSignalRepository) b0Var.f50181i1.get(), (SignalRemoteRepository) dVar.get());
    }

    static v90.g T1(j jVar) {
        return new v90.g((iy.e) jVar.f57872b.L0.get());
    }

    static hp.a U1(j jVar) {
        return new hp.a((kn.e) jVar.f57872b.f50251u.get());
    }

    static ip.a V1(j jVar) {
        return new ip.a((kn.e) jVar.f57872b.f50251u.get());
    }

    static jp.a W1(j jVar) {
        return new jp.a((kn.e) jVar.f57872b.f50251u.get());
    }

    static HandsCalibrationConversation.a X1(j jVar) {
        return new HandsCalibrationConversation.a((jo.a) jVar.f57872b.f50267w3.get());
    }

    static ug0.a Y1(j jVar) {
        b0 b0Var = jVar.f57872b;
        return new ug0.a(gk0.c.a(b0Var.f50131a), b0Var.S8(), b0.F6(b0Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LearnMoreManager Z1(j jVar) {
        jVar.getClass();
        return new LearnMoreManager(gk0.c.a(jVar.f57872b.f50131a));
    }

    static th.t a2(j jVar) {
        dagger.internal.d dVar;
        dVar = jVar.f57872b.f50204m0;
        return new th.t((SessionRemoteRepository) dVar.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [ah.b, java.lang.Object] */
    public static com.withings.measurements.ui.s1 b2(j jVar) {
        return new com.withings.measurements.ui.s1(new Object(), (ch.d) ((b0.a) jVar.f57872b.Q0).get());
    }

    static q70.d c2(j jVar) {
        return new q70.d(jVar.f57872b.i());
    }

    static ro.a d2(j jVar) {
        b0 b0Var = jVar.f57872b;
        return new ro.a((kn.e) b0Var.f50251u.get(), (vf.c) b0Var.f50144c0.get());
    }

    static so.a e2(j jVar) {
        return new so.a((kn.e) jVar.f57872b.f50251u.get());
    }

    static fp.a f2(j jVar) {
        return new fp.a((l70.w) jVar.f57872b.H.get());
    }

    static no.d g2(j jVar) {
        return new no.d(gk0.c.a(jVar.f57872b.f50131a), bg.a.a());
    }

    static lo.b h2(j jVar) {
        dagger.internal.d dVar;
        dVar = jVar.f57872b.f50279y3;
        return new lo.b(new lo.a((DeviceRemoteRepository) dVar.get()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.d] */
    static ks.t i2(j jVar) {
        jVar.getClass();
        return new ks.t(new Object());
    }

    static q70.l j2(j jVar) {
        b0 b0Var = jVar.f57872b;
        return new q70.l(b0Var.i(), (r70.c) b0Var.T0.get());
    }

    static lp.a k2(j jVar) {
        return new lp.a((jo.a) jVar.f57872b.f50267w3.get());
    }

    static ej0.c l2(j jVar) {
        zx.v Q8;
        b0 b0Var = jVar.f57872b;
        fy.v M8 = b0Var.M8();
        Q8 = b0Var.Q8();
        return new ej0.c(M8, new ej0.a(b0Var.X8(), (iy.e) b0Var.L0.get(), Q8, (t00.d) b0Var.f50146c2.get()));
    }

    private i00.c m2() {
        dagger.internal.d dVar;
        b0 b0Var = this.f57872b;
        dVar = b0Var.f50285z3;
        return new i00.c((xw.b) b0Var.K0.get(), new GetNeuropathyDiagnostics((NerveHealthNative) dVar.get()), (iy.e) b0Var.L0.get(), (ky.c) b0Var.f50270x0.get());
    }

    @Override // com.withings.ecg.live.f0
    public final void A(LiveEcgActivity liveEcgActivity) {
        b0 b0Var = this.f57872b;
        liveEcgActivity.f38604r = (vf.c) b0Var.f50144c0.get();
        liveEcgActivity.f38605s = b0.H6(b0Var);
    }

    @Override // com.withings.notifications.ui.q0
    public final void A0(NotificationsActivity notificationsActivity) {
        b0 b0Var = this.f57872b;
        notificationsActivity.f42841e = b0Var.A();
        notificationsActivity.f42842f = (ch.d) ((b0.a) b0Var.Q0).get();
    }

    @Override // com.withings.device.setup.ui.activity.k
    public final void B(SetupActivity setupActivity) {
        setupActivity.f37497e = this.f57882g.get();
        setupActivity.f37498f = this.f57888j.get();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, g20.a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, g20.a] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, g20.a] */
    @Override // com.withings.nervehealth.ui.o0
    public final void B0(NerveHealthMeasureListActivity nerveHealthMeasureListActivity) {
        dagger.internal.d dVar;
        fy.l F8;
        fy.l F82;
        b0 b0Var = this.f57872b;
        nerveHealthMeasureListActivity.f42386e = new com.withings.nervehealth.ui.usecases.q(gk0.c.a(b0Var.f50131a), m2(), new Object());
        Context a11 = gk0.c.a(b0Var.f50131a);
        dVar = b0Var.f50285z3;
        GetNeuropathyDiagnostics getNeuropathyDiagnostics = new GetNeuropathyDiagnostics((NerveHealthNative) dVar.get());
        F8 = b0Var.F8();
        nerveHealthMeasureListActivity.f42387f = new com.withings.nervehealth.ui.usecases.l(a11, getNeuropathyDiagnostics, F8, new Object());
        Context a12 = gk0.c.a(b0Var.f50131a);
        F82 = b0Var.F8();
        nerveHealthMeasureListActivity.f42388g = new com.withings.nervehealth.ui.usecases.f(a12, F82, new Object());
        m2();
        nerveHealthMeasureListActivity.f42389h = (vf.c) b0Var.f50144c0.get();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.d3
    public final void C(SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity) {
        sleepScoreInterruptionsActivity.f60667g = (ei0.q) this.f57872b.J1.get();
    }

    @Override // com.withings.wiscale2.m2
    public final void C0(MainActivity mainActivity) {
        b0 b0Var = this.f57872b;
        mainActivity.f47960l = (ch.d) ((b0.a) b0Var.Q0).get();
        mainActivity.f47961m = new ea0.k(b0.m4(b0Var));
        mainActivity.f47962n = this.f57905w.get();
        mainActivity.f47963o = (u70.a) b0Var.f50150d0.get();
    }

    @Override // com.withings.wiscale2.user.ui.g
    public final void D(EditUserEmailActivity editUserEmailActivity) {
        b0 b0Var = this.f57872b;
        editUserEmailActivity.f61782m = new q70.l(b0Var.i(), (r70.c) b0Var.T0.get());
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.y2
    public final void D0(SleepScoreDurationActivity sleepScoreDurationActivity) {
        sleepScoreDurationActivity.f60647g = (ei0.q) this.f57872b.J1.get();
    }

    @Override // com.withings.wiscale2.r2
    public final void E(ShareWithMyDoctorActivity shareWithMyDoctorActivity) {
        fy.l F8;
        F8 = this.f57872b.F8();
        shareWithMyDoctorActivity.f47977h = F8;
    }

    @Override // com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.a1
    public final void E0(Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity) {
        wpa02ToiletInstallationActivity.f55337f = this.f57879e0.get();
        wpa02ToiletInstallationActivity.f55339h = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    @Override // com.withings.measure.detail.ui.screen.p
    public final void F(MeasureDetailActivity measureDetailActivity) {
        measureDetailActivity.f41735e = b0.X6(this.f57872b);
    }

    @Override // com.withings.wiscale2.heart.afib.b
    public final void F0(AFibActivity aFibActivity) {
        aFibActivity.f57070k = this.f57872b.T();
    }

    @Override // com.withings.wiscale2.device.common.feature.spo2.n
    public final void G(Spo2ActivationActivity spo2ActivationActivity) {
        spo2ActivationActivity.f52510e = this.V.get();
    }

    @Override // com.withings.wiscale2.activity.workout.ui.detail.j1
    public final void G0(PostWorkoutActivity postWorkoutActivity) {
        dagger.internal.d dVar;
        dVar = this.f57872b.f50157e1;
        postWorkoutActivity.f49062e = (ua0.a) ((b0.a) dVar).get();
    }

    @Override // com.withings.wiscale2.device.common.feature.respiratoryscan.k
    public final void H(RespiratoryScanActivationActivity respiratoryScanActivationActivity) {
        respiratoryScanActivationActivity.f52423g = this.T.get();
    }

    @Override // com.withings.authentication.mfa.r
    public final void H0(ResolveMultiFactorActivity resolveMultiFactorActivity) {
        resolveMultiFactorActivity.f31565e = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, u00.b] */
    @Override // com.withings.nervehealth.ui.z
    public final void I(NerveHealthActivity nerveHealthActivity) {
        nerveHealthActivity.f42360i = (ch.d) ((b0.a) this.f57872b.Q0).get();
        Activity activity = this.f57870a;
        nerveHealthActivity.f42363l = new o00.h(activity);
        nerveHealthActivity.f42364m = new o00.b(activity);
        nerveHealthActivity.f42365n = new Object();
        nerveHealthActivity.f42366o = new o00.a(activity);
    }

    @Override // com.withings.ecg.details.y2
    public final void I0(WaitingSignalResultActivity waitingSignalResultActivity) {
        waitingSignalResultActivity.f38057g = (ch.d) ((b0.a) this.f57872b.Q0).get();
        waitingSignalResultActivity.f38058h = this.f57894m.get();
    }

    @Override // com.withings.wiscale2.heart.o
    public final void J(HeartHistoryActivity heartHistoryActivity) {
        heartHistoryActivity.f57028h = this.f57872b.T();
    }

    @Override // com.withings.wiscale2.spo2.u
    public final void J0(Spo2Activity spo2Activity) {
        b0 b0Var = this.f57872b;
        spo2Activity.f61623k = b0.J5(b0Var);
        spo2Activity.f61624l = (ActivityAggregateManager) b0Var.F1.get();
        spo2Activity.f61625m = (lj0.h0) b0Var.W0.get();
        spo2Activity.f61626n = (ei0.q) b0Var.J1.get();
    }

    @Override // com.withings.wiscale2.device.common.feature.ecg.us.hwa10.o
    public final void K(Hwa10EcgActivationActivity hwa10EcgActivationActivity) {
        hwa10EcgActivationActivity.f51786h = this.H.get();
        hwa10EcgActivationActivity.f51787i = this.I.get();
        hwa10EcgActivationActivity.f51788j = this.J.get();
        hwa10EcgActivationActivity.f51789k = this.K.get();
        hwa10EcgActivationActivity.f51790l = this.L.get();
        hwa10EcgActivationActivity.f51791m = this.M.get();
        hwa10EcgActivationActivity.f51792n = this.N.get();
        b0 b0Var = this.f57872b;
        hwa10EcgActivationActivity.f51793o = b0.C6(b0Var);
        hwa10EcgActivationActivity.f51794p = (ch.d) ((b0.a) b0Var.Q0).get();
        m70.i iVar = (m70.i) b0Var.f50258v0.get();
    }

    @Override // com.withings.wiscale2.sleep.ui.edition.g
    public final void K0(NightEditionActivity nightEditionActivity) {
        nightEditionActivity.f60437e = (ei0.q) this.f57872b.J1.get();
    }

    @Override // com.withings.ecg.details.m2
    public final void L(EcgResultActivity ecgResultActivity) {
        ecgResultActivity.f38026e = this.f57892l.get();
    }

    @Override // com.withings.authentication.x0
    public final void L0(AuthenticationActivity authenticationActivity) {
        b0 b0Var = this.f57872b;
        authenticationActivity.f31292e = (m70.i) b0Var.f50258v0.get();
        authenticationActivity.f31293f = (vf.c) b0Var.f50144c0.get();
        authenticationActivity.f31294g = (AccountSessionRepository) b0Var.f50216o0.get();
        authenticationActivity.f31295h = (ch.d) ((b0.a) b0Var.Q0).get();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.e0
    public final void M(SleepActivity sleepActivity) {
        sleepActivity.f60581o = (p60.c) this.f57872b.f50132a0.get();
    }

    @Override // com.withings.wiscale2.device.common.feature.workout.f
    public final void M0(WorkoutTutorialActivity workoutTutorialActivity) {
        workoutTutorialActivity.f52647k = (com.withings.wiscale2.device.common.feature.u) this.f57872b.N2.get();
    }

    @Override // com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.a0
    public final void N(Wpa02CartridgeActivationActivity wpa02CartridgeActivationActivity) {
        wpa02CartridgeActivationActivity.f55110e = this.f57877d0.get();
        wpa02CartridgeActivationActivity.f55111f = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    @Override // com.withings.nutrisync.ui.a0
    public final void N0(VitaminCDatavizActivity vitaminCDatavizActivity) {
        b0 b0Var = this.f57872b;
        vitaminCDatavizActivity.f43205e = (ch.d) ((b0.a) b0Var.Q0).get();
        vitaminCDatavizActivity.f43206f = (r70.c) b0Var.T0.get();
    }

    @Override // com.withings.ecg.pdf.l
    public final void O(PDFGenerationActivity pDFGenerationActivity) {
        dagger.internal.d dVar;
        b0 b0Var = this.f57872b;
        pDFGenerationActivity.f38724e = b0.I5(b0Var);
        dVar = b0Var.R0;
        pDFGenerationActivity.f38725f = (jq.b) dVar.get();
    }

    @Override // com.withings.wiscale2.activity.workout.ui.performance.splits.u
    public final void O0(WorkoutSplitsActivity workoutSplitsActivity) {
        dagger.internal.d dVar;
        b0 b0Var = this.f57872b;
        workoutSplitsActivity.f49961e = b0.E4(b0Var);
        dVar = b0Var.f50169g1;
        workoutSplitsActivity.f49962f = (ComputePace) ((b0.a) dVar).get();
        workoutSplitsActivity.f49963g = (GpsLocationRepository) b0Var.f50139b1.get();
    }

    @Override // dagger.hilt.android.internal.managers.ViewComponentManager.a
    public final ek0.e P() {
        return new c1(this.f57872b, this.f57874c, this.f57876d);
    }

    @Override // com.withings.manualLogging.ui.feature.addNote.cycle.f3
    public final void P0(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity) {
        cycleOnBoardingManualLoggingActivity.f40795h = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    @Override // com.withings.wiscale2.activity.logging.ui.l0
    public final void Q(EditWorkoutActivity editWorkoutActivity) {
        editWorkoutActivity.f48280e = this.f57908z.get();
    }

    @Override // com.withings.wiscale2.device.hwa06.ui.b0
    public final void Q0(Hwa06PostInstallActivity hwa06PostInstallActivity) {
        fy.p H8;
        dagger.internal.d dVar;
        b0 b0Var = this.f57872b;
        H8 = b0Var.H8();
        hwa06PostInstallActivity.f54323i = H8;
        dVar = b0Var.W2;
        hwa06PostInstallActivity.f54324j = (bx.a) dVar.get();
    }

    @Override // com.withings.wiscale2.device.common.feature.highlowhr.h0
    public final void R(HighLowHRSettingsActivity highLowHRSettingsActivity) {
        highLowHRSettingsActivity.f52199g = this.Q.get();
    }

    @Override // com.withings.wiscale2.heart.e
    public final void R0(HeartDetailActivity heartDetailActivity) {
        heartDetailActivity.f57013n = (sw.a) this.f57872b.f50264w0.get();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.u3
    public final void S(SleepScoreTimeToSleepActivity sleepScoreTimeToSleepActivity) {
        sleepScoreTimeToSleepActivity.f60847g = (ei0.q) this.f57872b.J1.get();
    }

    @Override // com.withings.wiscale2.heart.heartrate.g
    public final void S0(HRMeasuresListActivity hRMeasuresListActivity) {
        hRMeasuresListActivity.f57476k = this.f57885h0.get();
    }

    @Override // com.withings.wiscale2.user.ui.d
    public final void T(CreateUserActivity createUserActivity) {
        createUserActivity.f61761s = b0.S6(this.f57872b);
    }

    @Override // com.withings.wiscale2.settings.c5
    public final void T0(SettingsActivity settingsActivity) {
        settingsActivity.f59744e = this.f57889j0.get();
        settingsActivity.f59745f = (r70.c) this.f57872b.T0.get();
    }

    @Override // com.withings.wiscale2.device.common.feature.afib.d
    public final void U(AfibActivationActivity afibActivationActivity) {
        afibActivationActivity.f50976h = this.D.get();
    }

    @Override // com.withings.wiscale2.device.common.feature.ecg.us.ui.n
    public final void U0(EcgReviewActivity ecgReviewActivity) {
        ecgReviewActivity.f51986e = this.O.get();
        b0 b0Var = this.f57872b;
        ecgReviewActivity.f51987f = (ch.d) ((b0.a) b0Var.Q0).get();
        ecgReviewActivity.f51988g = (kn.e) b0Var.f50251u.get();
    }

    @Override // com.withings.wiscale2.device.common.feature.afib.p
    public final void V(AfibSettingsActivity afibSettingsActivity) {
        afibSettingsActivity.f50994g = this.E.get();
        afibSettingsActivity.f50996i = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.l3
    public final void V0(SleepScoreRegularityActivity sleepScoreRegularityActivity) {
        sleepScoreRegularityActivity.f60723g = (ei0.q) this.f57872b.J1.get();
    }

    @Override // com.withings.wiscale2.device.hwa08.postinstall.a0
    public final void W(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        fy.p H8;
        dagger.internal.d dVar;
        b0 b0Var = this.f57872b;
        H8 = b0Var.H8();
        hwa08PostInstallActivity.f54413l = H8;
        dVar = b0Var.W2;
        hwa08PostInstallActivity.f54414m = (bx.a) dVar.get();
    }

    @Override // com.withings.device.setup.ui.k
    public final void W0(SetupChooseDeviceActivity setupChooseDeviceActivity) {
        setupChooseDeviceActivity.f37485g = fl.p.f67672b.a();
        setupChooseDeviceActivity.f37486h = (kn.e) this.f57872b.f50251u.get();
    }

    @Override // com.withings.wiscale2.spo2.l
    public final void X(SpO2MeasuresListActivity spO2MeasuresListActivity) {
        fy.l F8;
        fy.a u82;
        b0 b0Var = this.f57872b;
        F8 = b0Var.F8();
        spO2MeasuresListActivity.f61604l = F8;
        fy.d j5 = b0.j5(b0Var);
        ey.a s42 = b0.s4(b0Var);
        u82 = b0Var.u8();
        spO2MeasuresListActivity.f61605m = new fy.b(j5, s42, u82, (zx.j) b0Var.f50270x0.get());
        spO2MeasuresListActivity.f61606n = (kn.e) b0Var.f50251u.get();
    }

    @Override // com.withings.wiscale2.device.common.feature.activitygoal.a0
    public final void X0(SetFitnessAndStepsGoalActivity setFitnessAndStepsGoalActivity) {
        b0 b0Var = this.f57872b;
        setFitnessAndStepsGoalActivity.f50901h = (m70.i) b0Var.f50258v0.get();
        setFitnessAndStepsGoalActivity.f50903j = (PlatformFeatureRepository) b0Var.f50263w.get();
        setFitnessAndStepsGoalActivity.f50904k = (com.withings.wiscale2.device.common.feature.u) b0Var.N2.get();
    }

    @Override // com.withings.wiscale2.activity.workout.category.ui.p
    public final void Y(ChooseWorkoutCategoryActivity chooseWorkoutCategoryActivity) {
        chooseWorkoutCategoryActivity.f48660h = this.A.get();
    }

    @Override // com.withings.wiscale2.device.common.notifications.ui.f
    public final void Y0(DeviceNotificationSettingsActivity deviceNotificationSettingsActivity) {
        deviceNotificationSettingsActivity.f52805e = b0.T5(this.f57872b);
    }

    @Override // com.withings.wiscale2.measure.list.u
    public final void Z(MeasureListActivity measureListActivity) {
        measureListActivity.f58502m = b0.J5(this.f57872b);
    }

    @Override // com.withings.wiscale2.device.common.feature.ecg.o5
    public final void Z0(EcgSettingsActivity ecgSettingsActivity) {
        ecgSettingsActivity.f51080f = this.G.get();
        ecgSettingsActivity.f51081g = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    @Override // fk0.a.InterfaceC0936a
    public final a.c a() {
        return fk0.b.a(u(), new e1(this.f57872b, this.f57874c));
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.u
    public final void a0(SecondarySleepActivity secondarySleepActivity) {
        b0 b0Var = this.f57872b;
        secondarySleepActivity.f60532e = new wb0.j(gk0.c.a(b0Var.f50131a), fl.p.f67672b.a());
        secondarySleepActivity.f60533f = b0Var.Z8();
    }

    @Override // com.withings.weight.ui.u
    public final void a1(SegmentalBodyCompositionActivity segmentalBodyCompositionActivity) {
        segmentalBodyCompositionActivity.f47595g = (ch.d) ((b0.a) this.f57872b.Q0).get();
        segmentalBodyCompositionActivity.f47596h = this.f57903u.get();
    }

    @Override // com.withings.wiscale2.user.ui.profile.f0
    public final void b(EditProfileActivity editProfileActivity) {
        editProfileActivity.f61845g = this.f57893l0.get();
    }

    @Override // com.withings.overview.ui.i
    public final void b0(StartTrackingActivity startTrackingActivity) {
        startTrackingActivity.f43345f = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    @Override // com.withings.wiscale2.account.password.p
    public final void b1(PasswordExpiredActivity passwordExpiredActivity) {
        dagger.internal.d dVar;
        b0 b0Var = this.f57872b;
        dVar = b0Var.f50235r1;
        passwordExpiredActivity.f48127g = (AccountRemoteRepository) dVar.get();
        passwordExpiredActivity.f48128h = b0Var.P8();
    }

    @Override // com.withings.wiscale2.device.common.onboarding.j
    public final void c(SleepApneaOnboardingActivity sleepApneaOnboardingActivity) {
        sleepApneaOnboardingActivity.f53062e = this.W.get();
    }

    @Override // com.withings.tutorials.ui.g0
    public final void c0(TutorialActivity tutorialActivity) {
        tutorialActivity.f44684j = (ch.d) ((b0.a) this.f57872b.Q0).get();
        tutorialActivity.f44685k = fl.p.f67672b.a();
    }

    @Override // com.withings.weight.presentation.ui.w0
    public final void c1(WeightExploreDataActivity weightExploreDataActivity) {
        weightExploreDataActivity.f47164f = this.f57902t.get();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.g3
    public final void d(SleepScoreRecoveryActivity sleepScoreRecoveryActivity) {
        sleepScoreRecoveryActivity.f60697g = (ei0.q) this.f57872b.J1.get();
    }

    @Override // com.withings.wiscale2.device.common.ui.u1
    public final void d0(MedicalFeatureListActivity medicalFeatureListActivity) {
        medicalFeatureListActivity.f53728i = this.f57871a0.get();
    }

    @Override // com.withings.device.details.wsd.programs.webradio.f
    public final void d1(WsdWebRadioActivity wsdWebRadioActivity) {
        dagger.internal.d dVar;
        dVar = this.f57872b.f50261v3;
        wsdWebRadioActivity.f37295t = (WebRadiosRemoteRepository) dVar.get();
    }

    @Override // com.withings.wiscale2.heart.heartrate.u
    public final void e(HeartRateDayActivity heartRateDayActivity) {
        heartRateDayActivity.f57509n = this.f57872b.getActiveSessionProvider();
    }

    @Override // com.withings.wiscale2.device.common.screen.ui.x1
    public final void e0(ScreenSelectionActivity screenSelectionActivity) {
        screenSelectionActivity.f53128h = this.X.get();
        screenSelectionActivity.f53129i = b0.w5(this.f57872b);
    }

    @Override // com.withings.wiscale2.device.common.feature.irregularHeartBeat.p
    public final void e1(IrregularHeartBeatSettingsActivity irregularHeartBeatSettingsActivity) {
        irregularHeartBeatSettingsActivity.f52346e = this.S.get();
    }

    @Override // com.withings.fever.ui.temperatureList.n
    public final void f(TemperatureListActivity temperatureListActivity) {
        temperatureListActivity.f39419f = this.f57897o.get();
    }

    @Override // com.withings.wiscale2.heart.afib.t
    public final void f0(AFibMeasuresListActivity aFibMeasuresListActivity) {
        aFibMeasuresListActivity.f57097k = this.f57872b.T();
    }

    @Override // com.withings.wiscale2.vascularage.v
    public final void f1(VascularAgeActivity vascularAgeActivity) {
        vascularAgeActivity.f62192e = this.f57895m0.get();
    }

    @Override // com.withings.wiscale2.coretemperature.ui.k
    public final void g(ExploreCoreTemperatureActivity exploreCoreTemperatureActivity) {
        exploreCoreTemperatureActivity.f50412e = this.C.get();
    }

    @Override // com.withings.healthplus.explore.ui.activity.n0
    public final void g0(ExploreTabActivity exploreTabActivity) {
        exploreTabActivity.f40242e = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    @Override // com.withings.fever.ui.l
    public final void g1(BodyTemperatureActivity bodyTemperatureActivity) {
        bodyTemperatureActivity.f39204g = this.f57896n.get();
        bodyTemperatureActivity.f39205h = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    @Override // com.withings.coach.chatbot.h0
    public final void h(ChatbotActivity chatbotActivity) {
        chatbotActivity.F = this.f57878e.get();
    }

    @Override // com.withings.manualLogging.ui.feature.addNote.v0
    public final void h0(AddManualLogActivity addManualLogActivity) {
        b0 b0Var = this.f57872b;
        b0.U4(b0Var);
        addManualLogActivity.getClass();
        b0.H6(b0Var);
        b0.M7(b0Var);
        b0.q5(b0Var);
        vf.c cVar = (vf.c) b0Var.f50144c0.get();
        addManualLogActivity.f40701h = (ch.d) ((b0.a) b0Var.Q0).get();
        addManualLogActivity.f40702i = this.f57899q.get();
    }

    @Override // com.withings.account.ui.f
    public final void h1(VerifyAuthenticationSensitiveActivity verifyAuthenticationSensitiveActivity) {
        b0.k6(this.f57872b);
        verifyAuthenticationSensitiveActivity.getClass();
    }

    @Override // com.withings.wiscale2.heart.bloodpressure.c0
    public final void i(BloodPressureMeasureListActivity bloodPressureMeasureListActivity) {
        fy.l F8;
        b0 b0Var = this.f57872b;
        F8 = b0Var.F8();
        bloodPressureMeasureListActivity.f57310k = F8;
        bloodPressureMeasureListActivity.f57311l = b0.J5(b0Var);
    }

    @Override // com.withings.programs.ui.activity.g
    public final void i0(ProgramOverviewActivity programOverviewActivity) {
        programOverviewActivity.f43744e = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q60.a] */
    @Override // com.withings.tutorials.ui.screens.appssync.healthconnect.m
    public final void i1(HealthConnectActivationActivity healthConnectActivationActivity) {
        healthConnectActivationActivity.f44873e = new Object();
        healthConnectActivationActivity.f44874f = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    @Override // com.withings.wiscale2.legacyprograms.BrowseProgramActivity_GeneratedInjector
    public final void injectBrowseProgramActivity(BrowseProgramActivity browseProgramActivity) {
        BrowseProgramActivity_MembersInjector.injectBrowseProgramViewModelFactory(browseProgramActivity, this.f57887i0.get());
    }

    @Override // com.withings.wiscale2.food.ui.display.FoodActivity_GeneratedInjector
    public final void injectFoodActivity(FoodActivity foodActivity) {
        FoodActivity_MembersInjector.injectFoodDayDownloadDelegateFactory(foodActivity, this.f57883g0.get());
    }

    @Override // com.withings.leaderboard.ui.LeaderboardActivity_GeneratedInjector
    public final void injectLeaderboardActivity(LeaderboardActivity leaderboardActivity) {
        dagger.internal.d dVar;
        b0 b0Var = this.f57872b;
        LeaderboardActivity_MembersInjector.injectLeaderboardSyncJobFactory(leaderboardActivity, b0.K6(b0Var));
        LeaderboardActivity_MembersInjector.injectNetworkSyncManager(leaderboardActivity, (t00.d) b0Var.f50146c2.get());
        LeaderboardActivity_MembersInjector.injectViewModelFactory(leaderboardActivity, this.f57898p.get());
        dVar = b0Var.D1;
        LeaderboardActivity_MembersInjector.injectLeaderboardRemoteRepository(leaderboardActivity, (LeaderboardRemoteRepository) dVar.get());
    }

    @Override // com.withings.wiscale2.legacyprograms.WellnessProgramArchiveActivity_GeneratedInjector
    public final void injectWellnessProgramArchiveActivity(WellnessProgramArchiveActivity wellnessProgramArchiveActivity) {
        WellnessProgramArchiveActivity_MembersInjector.injectGetAllEnrolledProgramByUserUseCase(wellnessProgramArchiveActivity, b0.n5(this.f57872b));
    }

    @Override // com.withings.wiscale2.legacyprograms.WellnessProgramDetailsActivity_GeneratedInjector
    public final void injectWellnessProgramDetailsActivity(WellnessProgramDetailsActivity wellnessProgramDetailsActivity) {
        b0 b0Var = this.f57872b;
        WellnessProgramDetailsActivity_MembersInjector.injectGetProgramByIdUseCase(wellnessProgramDetailsActivity, (x30.j) b0Var.f50164f2.get());
        WellnessProgramDetailsActivity_MembersInjector.injectIsProgramRunningUseCase(wellnessProgramDetailsActivity, b0Var.isProgramRunningUseCase());
        WellnessProgramDetailsActivity_MembersInjector.injectGetMostRecentEnrolledProgramLastUpdateUseCase(wellnessProgramDetailsActivity, b0Var.getMostRecentEnrolledProgramLastUpdateUseCase());
        WellnessProgramDetailsActivity_MembersInjector.injectEnrolledRepository(wellnessProgramDetailsActivity, b0Var.enrolledRepository());
    }

    @Override // com.withings.ecg.details.s1
    public final void j(EcgListActivity ecgListActivity) {
        ecgListActivity.f38015j = this.f57890k.get();
    }

    @Override // com.withings.wiscale2.activity.workout.ui.detail.q
    public final void j0(AllWorkoutsActivity allWorkoutsActivity) {
        dagger.internal.d dVar;
        b0 b0Var = this.f57872b;
        allWorkoutsActivity.f49013e = (GpsLocationRepository) b0Var.f50139b1.get();
        allWorkoutsActivity.f49014f = b0.p6(b0Var);
        dVar = b0Var.f50169g1;
        allWorkoutsActivity.f49015g = (ComputePace) ((b0.a) dVar).get();
        allWorkoutsActivity.f49016h = (ComputeSpeed) ((b0.a) b0Var.f50163f1).get();
    }

    @Override // com.withings.wiscale2.account.password.h
    public final void j1(LinkForPasswordSentActivity linkForPasswordSentActivity) {
        dagger.internal.d dVar;
        dVar = this.f57872b.f50235r1;
        linkForPasswordSentActivity.f48122g = (AccountRemoteRepository) dVar.get();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ct.a] */
    @Override // com.withings.healthscore.ui.exploredata.f
    public final void k(HealthScoreExploreDataActivity healthScoreExploreDataActivity) {
        Activity activity = this.f57870a;
        healthScoreExploreDataActivity.f40516f = new xv.a(activity, new xv.d(new ct.c(activity)), new Object());
    }

    @Override // com.withings.wiscale2.chat.ui.e
    public final void k0(ChatActivity chatActivity) {
        dagger.internal.d dVar;
        dagger.internal.d dVar2;
        b0 b0Var = this.f57872b;
        dVar = b0Var.A3;
        chatActivity.f50321g = (th0.k) dVar.get();
        dVar2 = b0Var.D1;
        chatActivity.f50322h = (LeaderboardRemoteRepository) dVar2.get();
        chatActivity.f50323i = (ActivityAggregateManager) b0Var.F1.get();
    }

    @Override // com.withings.wiscale2.weight.list.l
    public final void k1(WeightListActivity weightListActivity) {
        fy.a u82;
        b0 b0Var = this.f57872b;
        weightListActivity.f62905h = b0.X6(b0Var);
        weightListActivity.f62906i = b0.J5(b0Var);
        u82 = b0Var.u8();
        weightListActivity.f62907j = u82;
        weightListActivity.f62908k = dl.a.a();
    }

    @Override // com.withings.details.height.a
    public final void l(HeightActivity heightActivity) {
        heightActivity.f36509j = b0.J5(this.f57872b);
    }

    @Override // com.withings.wiscale2.manuallogging.ui.addSleep.m
    public final void l0(AddSleepTrackActivity addSleepTrackActivity) {
        b0 b0Var = this.f57872b;
        addSleepTrackActivity.f58022g = (ActivityAggregateManager) b0Var.F1.get();
        addSleepTrackActivity.f58023h = (ei0.q) b0Var.J1.get();
    }

    @Override // com.withings.wiscale2.device.common.tutorial.navigation.e
    public final void l1(NavigationTutorialActivity navigationTutorialActivity) {
        navigationTutorialActivity.f53633i = this.Y.get();
    }

    @Override // com.withings.wiscale2.device.hwa03bs.ui.d0
    public final void m(Hwa03PostInstallActivity hwa03PostInstallActivity) {
        fy.p H8;
        dagger.internal.d dVar;
        b0 b0Var = this.f57872b;
        H8 = b0Var.H8();
        hwa03PostInstallActivity.f54242i = H8;
        dVar = b0Var.W2;
        hwa03PostInstallActivity.f54243j = (bx.a) dVar.get();
    }

    @Override // com.withings.weight.legacy.k
    public final void m0(WeightDetailActivity weightDetailActivity) {
        weightDetailActivity.f47012j = b0.J5(this.f57872b);
    }

    @Override // com.withings.tutorials.ui.q
    public final void m1(DeviceIntroductionActivity deviceIntroductionActivity) {
        b0 b0Var = this.f57872b;
        deviceIntroductionActivity.f44596h = b0.w5(b0Var);
        deviceIntroductionActivity.f44597i = new h70.d((m70.i) b0Var.f50258v0.get());
        deviceIntroductionActivity.f44598j = (ch.d) ((b0.a) b0Var.Q0).get();
    }

    @Override // com.withings.wiscale2.user.ui.u
    public final void n(EditUserMeasureActivity editUserMeasureActivity) {
        editUserMeasureActivity.f61798k = this.f57891k0.get();
    }

    @Override // com.withings.wiscale2.partner.ui.y
    public final void n0(PartnerActivity partnerActivity) {
        b0 b0Var = this.f57872b;
        partnerActivity.f58867j = b0Var.S8();
        partnerActivity.f58868k = (ch.d) ((b0.a) b0Var.Q0).get();
    }

    @Override // com.withings.wiscale2.vo2max.view.g1
    public final void n1(Vo2maxActivity vo2maxActivity) {
        b0 b0Var = this.f57872b;
        vo2maxActivity.f62652e = b0.J5(b0Var);
        vo2maxActivity.f62653f = (p60.c) b0Var.f50132a0.get();
    }

    @Override // com.withings.wiscale2.device.common.ui.f2
    public final void o(RespiratoryScanSettingsActivity respiratoryScanSettingsActivity) {
        respiratoryScanSettingsActivity.f53741e = this.f57873b0.get();
    }

    @Override // com.withings.weight.presentation.ui.q0
    public final void o0(WeightActivity weightActivity) {
        new ah.c0();
        weightActivity.getClass();
        b0 b0Var = this.f57872b;
        weightActivity.f47148f = (ch.d) ((b0.a) b0Var.Q0).get();
        weightActivity.f47149g = this.f57900r.get();
        weightActivity.f47150h = b0.V6(b0Var);
    }

    @Override // com.withings.wiscale2.device.wpm.ui.a0
    public final void o1(Wpm0203Activity wpm0203Activity) {
        wpm0203Activity.f55619f = this.f57881f0.get();
    }

    @Override // com.withings.cycletracking.ui.w0
    public final void p(CycleTrackingActivity cycleTrackingActivity) {
        b0 b0Var = this.f57872b;
        cycleTrackingActivity.f35470e = (ch.d) ((b0.a) b0Var.Q0).get();
        cycleTrackingActivity.f35471f = (r70.c) b0Var.T0.get();
        cycleTrackingActivity.f35472g = this.f57880f.get();
    }

    @Override // com.withings.device.details.automatic.activity.detection.z
    public final void p0(AutomaticActivityDetection automaticActivityDetection) {
        automaticActivityDetection.f36661f = b0.C6(this.f57872b);
    }

    @Override // com.withings.wiscale2.device.common.feature.ecg.n4
    public final void p1(EcgActivationActivity ecgActivationActivity) {
        ecgActivationActivity.f51066h = this.F.get();
    }

    @Override // com.withings.weight.ui.limbExplore.l
    public final void q(SegmentalLimbExploreActivity segmentalLimbExploreActivity) {
        segmentalLimbExploreActivity.f47649i = this.f57904v.get();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.o3
    public final void q0(SleepScoreSnoringActivity sleepScoreSnoringActivity) {
        sleepScoreSnoringActivity.f60768g = (ei0.q) this.f57872b.J1.get();
    }

    @Override // fk0.c.InterfaceC0937c
    public final ek0.f q1() {
        return new e1(this.f57872b, this.f57874c);
    }

    @Override // com.withings.wiscale2.device.common.feature.highlowhr.t
    public final void r(HighLowHRActivationActivity highLowHRActivationActivity) {
        highLowHRActivationActivity.f52186i = this.P.get();
    }

    @Override // com.withings.core.ui.e
    public final void r0(NoteEditionActivity noteEditionActivity) {
        dagger.internal.d dVar;
        dVar = this.f57872b.f50255u3;
        noteEditionActivity.f35368l = (ClinicalStudySuggestionRepository) dVar.get();
        noteEditionActivity.f35369m = new pi.a();
    }

    @Override // dagger.hilt.android.internal.managers.f.a
    public final ek0.c r1() {
        return new n(this.f57872b, this.f57874c, this.f57876d);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ah.b, java.lang.Object] */
    @Override // com.withings.measurements.ui.n1
    public final void s(HealthVerticalActivity healthVerticalActivity) {
        b0 b0Var = this.f57872b;
        healthVerticalActivity.f41917g = (ch.d) ((b0.a) b0Var.Q0).get();
        healthVerticalActivity.f41918h = new com.withings.measurements.ui.s1(new Object(), (ch.d) ((b0.a) b0Var.Q0).get());
        healthVerticalActivity.f41919i = (cz.l) b0Var.W.get();
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.s3
    public final void s0(SleepScoreTimeToGetUpActivity sleepScoreTimeToGetUpActivity) {
        sleepScoreTimeToGetUpActivity.f60819g = (ei0.q) this.f57872b.J1.get();
    }

    @Override // com.withings.wiscale2.activity.workout.ui.map.k
    public final void s1(WorkoutMapActivity workoutMapActivity) {
        dagger.internal.d dVar;
        b0 b0Var = this.f57872b;
        workoutMapActivity.f49855n = (GpsLocationRepository) b0Var.f50139b1.get();
        dVar = b0Var.f50169g1;
        workoutMapActivity.f49856o = (ComputePace) ((b0.a) dVar).get();
        workoutMapActivity.f49857p = (ComputeSpeed) ((b0.a) b0Var.f50163f1).get();
        workoutMapActivity.f49858q = b0.p6(b0Var);
        workoutMapActivity.f49859r = LocationProviderModule_ProvideFilterGpsLocationWithPauseFactory.provideFilterGpsLocationWithPause();
    }

    @Override // com.withings.authentication.verifyauthentication.c0
    public final void t(VerifyAuthenticationActivity verifyAuthenticationActivity) {
        verifyAuthenticationActivity.f32634e = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    @Override // com.withings.wiscale2.device.common.feature.spo2.g
    public final void t0(SpO2SettingsActivity spO2SettingsActivity) {
        spO2SettingsActivity.f52497e = this.U.get();
        spO2SettingsActivity.f52498f = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    @Override // fk0.c.InterfaceC0937c
    public final com.google.common.collect.y u() {
        return com.google.common.collect.y.B("com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddCervicalMucusViewModel", "com.withings.manualLogging.ui.feature.addNote.mood.AddMoodViewModel", "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSexualActivityViewModel", "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSymptomsViewModel", "com.withings.tutorials.ui.screens.modes.athlete.AthleteModeViewModel", "com.withings.device.details.automatic.activity.detection.AutomaticActivityDetectionViewModel", "com.withings.badge.detail.BadgeDetailViewModel", "com.withings.badge.list.BadgesViewModel", "com.withings.weight.presentation.viewmodel.BodyCompViewModel", "com.withings.measurements.ui.BodyVerticalViewModel", "com.withings.healthplus.congrats.ui.viewmodel.BookmarkLayoutViewModel", "com.withings.wiscale2.account.password.ChangePasswordViewModel", "com.withings.authentication.accountConsent.ChineseDataProtectionViewModel", "com.withings.account.ui.vm.CodeInputViewModel", "com.withings.healthplus.congrats.ui.viewmodel.CompletionActivityViewModel", "com.withings.paywall.confirmation.ConfirmSubscriptionViewModel", "com.withings.contentfavorite.viewmodel.ContentFavoriteBadgeViewModel", "com.withings.contentfavorite.viewmodel.ContentFavoriteListViewModel", "com.withings.contentfavorite.viewmodel.ContentFavoriteViewModel", "com.withings.healthplus.contentscreens.ui.viewmodel.ContentScreenViewModel", "com.withings.healthplus.contentscreens.ui.viewmodel.ContentWorkoutPlayerViewModel", "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleDataStorageViewModel", "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel", "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleSymptomsViewModel", "com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel", "com.withings.cycletracking.ui.viewmodel.CycleTrackingHistoryViewModel", "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel", "com.withings.wiscale2.dashboard.DashboardViewModel", "com.withings.tutorials.ui.DeviceIntroductionViewModel", "com.withings.ecg.details.EcgInReviewViewModel", "com.withings.wiscale2.account.email.EmailModificationViewModel", "com.withings.healthplus.completion.program.ui.viewmodel.EndProgramViewModel", "com.withings.tutorials.ui.screens.explanations.ExplanationsViewModel", "com.withings.healthplus.explore.ui.viewmodel.ExploreTabViewModel", "com.withings.tutorials.ui.screens.modes.eyesclosed.EyesClosedModeViewModel", "com.withings.healthplus.contentscreens.ui.viewmodel.FavoriteViewModel", "com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel", "com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel", "com.withings.measurements.ui.verticals.HealthVerticalActivityViewModel", "com.withings.measurements.ui.HeartVerticalViewModel", "com.withings.wiscale2.home.homeV2.HomeViewModel", "com.withings.survey.viewModel.InAppSurveyViewModel", "com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel", LeaderBoardItemViewModel_HiltModules_KeyModule_ProvideFactory.provide(), LeaderboardViewModel_HiltModules_KeyModule_ProvideFactory.provide(), "com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel", "com.withings.account.ui.vm.LoadingSensitiveActionViewModel", "com.withings.wiscale2.accountV2.ui.LoggedOutViewModel", "com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel", "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.ManualLogEntryViewModel", "com.withings.measurements.ui.MeasurementsViewModel", "com.withings.authentication.mfa.resolve.MfaResolutionViewModel", "com.withings.missions.ui.viewmodels.MissionActivityViewModel", "com.withings.healthplus.completion.common.ui.viewmodel.MissionContentCompletionViewModel", "com.withings.account.ui.vm.MultiAccountSelectionViewModel", "com.withings.wiscale2.mydevices.MyDevicesViewModel", "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel", "com.withings.nervehealth.ui.NerveHealthViewModel", "com.withings.notifications.ui.viewmodels.NotificationActivityViewModel", "com.withings.notifications.ui.NotificationSectionViewModel", "com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel", "com.withings.healthplus.explore.ui.viewmodel.NutritionSheetViewModel", "com.withings.measurements.ui.NutritionVerticalViewModel", "com.withings.tutorials.ui.screens.modes.pacemaker.PacemakerModeViewModel", "com.withings.account.ui.vm.PasswordInputViewModel", "com.withings.authentication.pickerUser.PickUserViewModel", "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel", "com.withings.badge.profile.ProfileBadgeCarouselViewModel", "com.withings.healthplus.completion.program.ui.viewmodel.ProgramCompletionViewModel", "com.withings.healthplus.completion.common.ui.viewmodel.ProgramContentCompletionViewModel", "com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel", "com.withings.programs.viewmodel.ProgramOverviewViewModel", "com.withings.account.ui.vm.RecoveryTwoFaViewModel", ReminderRingingViewModel_HiltModules_KeyModule_ProvideFactory.provide(), "com.withings.account.ui.vm.ResolveTwoFaViewModel", "com.withings.authentication.mfa.ResolveTwoFactorViewModel", "com.withings.measurements.ui.RespiratoryVerticalViewModel", "com.withings.scalesmodes.ui.ScalesModeViewModel", ScanFriendCodeActivity_ScanFriendCodeViewModel_HiltModules_KeyModule_ProvideFactory.provide(), "com.withings.account.ui.vm.SeeOptionViewModel", "com.withings.tutorials.ui.screens.SegmentalBodyCompositionTutorialViewModel", "com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel", "com.withings.sharing.datasharing.sendinvitation.SelectTimeViewModel", "com.withings.sharing.datasharing.sendinvitation.SendInvitationViewModel", "com.withings.tutorials.ui.screens.SetHealthGoalViewModel", "com.withings.authentication.mfa.SettingsMfaViewModel", "com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel", "com.withings.authentication.mfa.recovery.settings.SettingsRecoveryCodeViewModel", "com.withings.wiscale2.settings.SettingsViewModel", "com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel", "com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel", "com.withings.device.setup.ui.activity.SetupViewModel", "com.withings.measurements.ui.SexualHealthVerticalViewModel", "com.withings.measurements.ui.SleepVerticalViewModel", "com.withings.overview.ui.StartTrackingViewModel", "com.withings.paywall.subscription.SubscriptionViewModel", "com.withings.healthplus.contentscreens.ui.viewmodel.SuggestWorkoutLaunchOnWatchViewModel", "com.withings.healthplus.contentscreens.ui.viewmodel.SwapViewModel", "com.withings.authentication.mfa.totp.TotpViewModel", "com.withings.wiscale2.settings.TracesLogsViewModel", "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel", "com.withings.tutorials.ui.TutorialViewModel", "com.withings.authentication.mfa.TwoFactorMultiAccountViewModel", "com.withings.wiscale2.settings.UnitsActivityViewModel", "com.withings.authentication.userCreation.UserCreationViewModel", "com.withings.account.ui.vm.VerifyGoogleAuthenticationSensitiveViewModel", "com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel", "com.withings.nutrisync.ui.viewmodel.VitaminCViewModel", "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel", "com.withings.tutorials.ui.screens.wallhandlemount.WallHandleMountViewModel", "com.withings.weight.presentation.ui.WeightExploreDataViewModel", "com.withings.weight.presentation.viewmodel.WeightViewModel", "com.withings.wiscale2.settings.WithingsAdvertisingViewModel", "com.withings.healthplus.explore.ui.viewmodel.WorkoutPlayerViewModel", "com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing.Wpa02CleansingModeViewModel");
    }

    @Override // com.withings.wiscale2.device.common.ui.geoloc.o
    public final void u0(WeatherAirQualityActivity weatherAirQualityActivity) {
        weatherAirQualityActivity.f53823f = this.f57875c0.get();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.f0
    public final void v(AddMeasureActivity addMeasureActivity) {
        addMeasureActivity.f58102g = (ch.d) ((b0.a) this.f57872b.Q0).get();
    }

    @Override // com.withings.wiscale2.activity.e
    public final void v0(ActivityActivity activityActivity) {
        activityActivity.f48233r = this.f57906x.get();
    }

    @Override // com.withings.wiscale2.vascularage.u
    public final void w(VascularAgeActivityV1 vascularAgeActivityV1) {
        vascularAgeActivityV1.f62204e = b0.J5(this.f57872b);
    }

    @Override // com.withings.wiscale2.measure.goal.ui.i
    public final void w0(WeightGoalActivity weightGoalActivity) {
        com.withings.wiscale2.measure.goal.ui.j.a(weightGoalActivity, b0.z5(this.f57872b));
    }

    @Override // com.withings.wiscale2.device.common.feature.irregularHeartBeat.f
    public final void x(IrregularHeartBeatActivationActivity irregularHeartBeatActivationActivity) {
        irregularHeartBeatActivationActivity.f52327e = this.R.get();
    }

    @Override // com.withings.wiscale2.device.common.ui.f0
    public final void x0(DeviceInfoActivity deviceInfoActivity) {
        deviceInfoActivity.f53681g = this.Z.get();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, u00.b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ct.a] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.withings.wiscale2.spo2.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, com.withings.wiscale2.measure.accountmeasure.ui.add.g0] */
    @Override // com.withings.weight.presentation.ui.t
    public final void y(BodyCompositionActivity bodyCompositionActivity) {
        b0 b0Var = this.f57872b;
        b0.V6(b0Var);
        bodyCompositionActivity.getClass();
        bodyCompositionActivity.f47117e = new n90.m(this.f57870a, new Object(), new Object(), new Object(), new Object());
        bodyCompositionActivity.f47118f = (ch.d) ((b0.a) b0Var.Q0).get();
    }

    @Override // com.withings.wiscale2.device.wam03.ui.c0
    public final void y0(Wam03PostInstallActivity wam03PostInstallActivity) {
        fy.p H8;
        dagger.internal.d dVar;
        b0 b0Var = this.f57872b;
        H8 = b0Var.H8();
        wam03PostInstallActivity.f54973i = H8;
        dVar = b0Var.W2;
        wam03PostInstallActivity.f54974j = (bx.a) dVar.get();
    }

    @Override // com.withings.details.height.f0
    public final void z(HeightListActivity heightListActivity) {
        fy.a u82;
        b0 b0Var = this.f57872b;
        heightListActivity.f36523e = b0.X6(b0Var);
        u82 = b0Var.u8();
        heightListActivity.f36524f = u82;
        heightListActivity.f36525g = b0.J5(b0Var);
    }

    @Override // com.withings.wiscale2.activity.workout.live.ui.w
    public final void z0(LiveWorkoutActivity liveWorkoutActivity) {
        dagger.internal.d dVar;
        b0 b0Var = this.f57872b;
        dVar = b0Var.V2;
        liveWorkoutActivity.f48792e = (ax.c) ((b0.a) dVar).get();
        b0.O6(b0Var);
        liveWorkoutActivity.f48802o = this.B.get();
    }

    @Override // com.withings.reminder.ringing.ReminderRingingActivity_GeneratedInjector
    public final void injectReminderRingingActivity(ReminderRingingActivity reminderRingingActivity) {
    }

    @Override // com.withings.leaderboard.ui.ScanFriendCodeActivity_GeneratedInjector
    public final void injectScanFriendCodeActivity(ScanFriendCodeActivity scanFriendCodeActivity) {
    }
}
