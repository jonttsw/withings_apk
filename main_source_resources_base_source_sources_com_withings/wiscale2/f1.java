package com.withings.wiscale2;

import android.content.Context;
import com.google.common.collect.x;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.account.network.ws.SessionRemoteRepository;
import com.withings.account.ui.vm.CodeInputViewModel;
import com.withings.account.ui.vm.LoadingSensitiveActionViewModel;
import com.withings.account.ui.vm.MultiAccountSelectionViewModel;
import com.withings.account.ui.vm.PasswordInputViewModel;
import com.withings.account.ui.vm.RecoveryTwoFaViewModel;
import com.withings.account.ui.vm.ResolveTwoFaViewModel;
import com.withings.account.ui.vm.SeeOptionViewModel;
import com.withings.account.ui.vm.VerifyGoogleAuthenticationSensitiveViewModel;
import com.withings.authentication.accountConsent.AccountConsentViewModel;
import com.withings.authentication.accountConsent.AccountLoginConsentViewModel;
import com.withings.authentication.accountConsent.ChineseDataProtectionViewModel;
import com.withings.authentication.deactivation.AccountReactivationViewModel;
import com.withings.authentication.mfa.ResolveTwoFactorViewModel;
import com.withings.authentication.mfa.SettingsMfaViewModel;
import com.withings.authentication.mfa.TwoFactorMultiAccountViewModel;
import com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel;
import com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel;
import com.withings.authentication.mfa.recovery.settings.SettingsRecoveryCodeViewModel;
import com.withings.authentication.mfa.resolve.MfaResolutionViewModel;
import com.withings.authentication.mfa.totp.TotpViewModel;
import com.withings.authentication.pickerUser.PickUserViewModel;
import com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel;
import com.withings.authentication.tryToLogin.mail.TryToLoginViewModel;
import com.withings.authentication.userCreation.UserCreationViewModel;
import com.withings.badge.detail.BadgeDetailViewModel;
import com.withings.badge.list.BadgesViewModel;
import com.withings.badge.profile.ProfileBadgeCarouselViewModel;
import com.withings.contentfavorite.viewmodel.ContentFavoriteBadgeViewModel;
import com.withings.contentfavorite.viewmodel.ContentFavoriteListViewModel;
import com.withings.contentfavorite.viewmodel.ContentFavoriteViewModel;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel;
import com.withings.cycletracking.ui.viewmodel.CycleTrackingHistoryViewModel;
import com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel;
import com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel;
import com.withings.device.details.automatic.activity.detection.AutomaticActivityDetectionViewModel;
import com.withings.device.setup.ui.activity.SetupViewModel;
import com.withings.device.setup.ui.select.uc.LoadOnDemandModuleUseCase;
import com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel;
import com.withings.ecg.details.EcgInReviewViewModel;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.ecg.webservices.EcgReviewRemoteRepository;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.healthplus.completion.common.ui.viewmodel.MissionContentCompletionViewModel;
import com.withings.healthplus.completion.common.ui.viewmodel.ProgramContentCompletionViewModel;
import com.withings.healthplus.completion.program.ui.viewmodel.EndProgramViewModel;
import com.withings.healthplus.completion.program.ui.viewmodel.ProgramCompletionViewModel;
import com.withings.healthplus.congrats.ui.viewmodel.BookmarkLayoutViewModel;
import com.withings.healthplus.congrats.ui.viewmodel.CompletionActivityViewModel;
import com.withings.healthplus.contentscreens.ui.viewmodel.ContentScreenViewModel;
import com.withings.healthplus.contentscreens.ui.viewmodel.ContentWorkoutPlayerViewModel;
import com.withings.healthplus.contentscreens.ui.viewmodel.FavoriteViewModel;
import com.withings.healthplus.contentscreens.ui.viewmodel.SuggestWorkoutLaunchOnWatchViewModel;
import com.withings.healthplus.contentscreens.ui.viewmodel.SwapViewModel;
import com.withings.healthplus.explore.ui.viewmodel.ExploreTabViewModel;
import com.withings.healthplus.explore.ui.viewmodel.NutritionSheetViewModel;
import com.withings.healthplus.explore.ui.viewmodel.WorkoutPlayerViewModel;
import com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel;
import com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel;
import com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel;
import com.withings.leaderboard.domain.GetLeaderBoardItemUseCase;
import com.withings.leaderboard.domain.GetUserPositionRankingUseCase;
import com.withings.leaderboard.domain.LeaderboardManager;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import com.withings.leaderboard.ui.LeaderboardViewModel;
import com.withings.leaderboard.ui.ScanFriendCodeActivity;
import com.withings.leaderboard.ui.screen.viewmodels.LeaderBoardItemViewModel;
import com.withings.leaderboard.utils.FilterLeaderBoardEntryUseCase;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.authentication.login.AuthenticationService;
import com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel;
import com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddCervicalMucusViewModel;
import com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSexualActivityViewModel;
import com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSymptomsViewModel;
import com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleDataStorageViewModel;
import com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleSymptomsViewModel;
import com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.ManualLogEntryViewModel;
import com.withings.manualLogging.ui.feature.addNote.mood.AddMoodViewModel;
import com.withings.measurement.model.MeasurementsVertical;
import com.withings.measurements.ui.ActivityVerticalViewModel;
import com.withings.measurements.ui.BodyVerticalViewModel;
import com.withings.measurements.ui.HeartVerticalViewModel;
import com.withings.measurements.ui.MeasurementsViewModel;
import com.withings.measurements.ui.NutritionVerticalViewModel;
import com.withings.measurements.ui.RespiratoryVerticalViewModel;
import com.withings.measurements.ui.SexualHealthVerticalViewModel;
import com.withings.measurements.ui.SleepVerticalViewModel;
import com.withings.measurements.ui.verticals.HealthVerticalActivityViewModel;
import com.withings.missions.ui.viewmodels.MissionActivityViewModel;
import com.withings.nervehealth.ui.NerveHealthViewModel;
import com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel;
import com.withings.notifications.ui.NotificationSectionViewModel;
import com.withings.notifications.ui.viewmodels.NotificationActivityViewModel;
import com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel;
import com.withings.nutrisync.ui.viewmodel.VitaminCViewModel;
import com.withings.overview.ui.StartTrackingViewModel;
import com.withings.paywall.confirmation.ConfirmSubscriptionViewModel;
import com.withings.paywall.subscription.SubscriptionViewModel;
import com.withings.programs.viewmodel.AchieveViewModel;
import com.withings.programs.viewmodel.ProgramOverviewViewModel;
import com.withings.reminder.di.RemindersBinderModule_ProvideReminderRepositoryFactory;
import com.withings.reminder.ringing.ReminderRingingViewModel;
import com.withings.scalesmodes.ui.ScalesModeViewModel;
import com.withings.sharing.datasharing.acceptinvitation.AcceptInvitationViewModel;
import com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel;
import com.withings.sharing.datasharing.sendinvitation.SelectTimeViewModel;
import com.withings.sharing.datasharing.sendinvitation.SendInvitationViewModel;
import com.withings.survey.viewModel.InAppSurveyViewModel;
import com.withings.tutorials.ui.DeviceIntroductionViewModel;
import com.withings.tutorials.ui.TutorialViewModel;
import com.withings.tutorials.ui.screens.SegmentalBodyCompositionTutorialViewModel;
import com.withings.tutorials.ui.screens.SetHealthGoalViewModel;
import com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel;
import com.withings.tutorials.ui.screens.explanations.ExplanationsViewModel;
import com.withings.tutorials.ui.screens.modes.athlete.AthleteModeViewModel;
import com.withings.tutorials.ui.screens.modes.eyesclosed.EyesClosedModeViewModel;
import com.withings.tutorials.ui.screens.modes.pacemaker.PacemakerModeViewModel;
import com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel;
import com.withings.tutorials.ui.screens.wallhandlemount.WallHandleMountViewModel;
import com.withings.webservices.legacy.Webservices;
import com.withings.weight.presentation.ui.WeightExploreDataViewModel;
import com.withings.weight.presentation.viewmodel.BodyCompViewModel;
import com.withings.weight.presentation.viewmodel.WeightViewModel;
import com.withings.wiscale2.account.email.EmailModificationViewModel;
import com.withings.wiscale2.account.password.ChangePasswordViewModel;
import com.withings.wiscale2.accountV2.ui.LoggedOutViewModel;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.dashboard.DashboardViewModel;
import com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel;
import com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing.Wpa02CleansingModeViewModel;
import com.withings.wiscale2.home.homeV2.HomeViewModel;
import com.withings.wiscale2.mydevices.MyDevicesViewModel;
import com.withings.wiscale2.settings.SettingsViewModel;
import com.withings.wiscale2.settings.TracesLogsViewModel;
import com.withings.wiscale2.settings.UnitsActivityViewModel;
import com.withings.wiscale2.settings.WithingsAdvertisingViewModel;
import com.withings.workout.category.model.WorkoutCategoryManager;
import fl.p;
import java.util.Map;
import javax.inject.Provider;
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
final class f1 extends t1 {
    private dagger.internal.d<ContentFavoriteViewModel> A;
    private dagger.internal.d<ProgramDetailViewModel> A0;
    private dagger.internal.d<ContentScreenViewModel> B;
    private dagger.internal.d<ProgramOverviewViewModel> B0;
    private dagger.internal.d<ContentWorkoutPlayerViewModel> C;
    private dagger.internal.d<RecoveryTwoFaViewModel> C0;
    private dagger.internal.d<CycleDataStorageViewModel> D;
    private dagger.internal.d<ReminderRingingViewModel> D0;
    private dagger.internal.d<CycleManualLoggingViewModel> E;
    private dagger.internal.d<ResolveTwoFaViewModel> E0;
    private dagger.internal.d<CycleSymptomsViewModel> F;
    private dagger.internal.d<ResolveTwoFactorViewModel> F0;
    private dagger.internal.d<CycleTrackingFactorsViewModel> G;
    private dagger.internal.d<RespiratoryVerticalViewModel> G0;
    private dagger.internal.d<CycleTrackingHistoryViewModel> H;
    private dagger.internal.d<ScalesModeViewModel> H0;
    private dagger.internal.d<CycleTrackingViewModel> I;
    private dagger.internal.d<ScanFriendCodeActivity.ScanFriendCodeViewModel> I0;
    private dagger.internal.d<DashboardViewModel> J;
    private dagger.internal.d<SeeOptionViewModel> J0;
    private dagger.internal.d<DeviceIntroductionViewModel> K;
    private dagger.internal.d<SegmentalBodyCompositionTutorialViewModel> K0;
    private dagger.internal.d<EcgInReviewViewModel> L;
    private dagger.internal.d<SelectDataViewModel> L0;
    private dagger.internal.d<EmailModificationViewModel> M;
    private dagger.internal.d<SelectTimeViewModel> M0;
    private dagger.internal.d<EndProgramViewModel> N;
    private dagger.internal.d<SendInvitationViewModel> N0;
    private dagger.internal.d<ExplanationsViewModel> O;
    private dagger.internal.d<SetHealthGoalViewModel> O0;
    private dagger.internal.d<ExploreTabViewModel> P;
    private dagger.internal.d<SettingsMfaViewModel> P0;
    private dagger.internal.d<EyesClosedModeViewModel> Q;
    private dagger.internal.d<SettingsPhoneAuthViewModel> Q0;
    private dagger.internal.d<FavoriteViewModel> R;
    private dagger.internal.d<SettingsRecoveryCodeViewModel> R0;
    private dagger.internal.d<GoogleAuthProviderViewModel> S;
    private dagger.internal.d<SettingsViewModel> S0;
    private dagger.internal.d<HealthScoreExploreDataViewModel> T;
    private dagger.internal.d<SetupChooseDeviceViewModel> T0;
    private dagger.internal.d<HealthVerticalActivityViewModel> U;
    private dagger.internal.d<SetupScaleForMultipleUsersViewModel> U0;
    private dagger.internal.d<HeartVerticalViewModel> V;
    private dagger.internal.d<SetupViewModel> V0;
    private dagger.internal.d<HomeViewModel> W;
    private dagger.internal.d<SexualHealthVerticalViewModel> W0;
    private dagger.internal.d<InAppSurveyViewModel> X;
    private dagger.internal.d<SleepVerticalViewModel> X0;
    private dagger.internal.d<JoinProgramViewModel> Y;
    private dagger.internal.d<StartTrackingViewModel> Y0;
    private dagger.internal.d<LeaderBoardItemViewModel> Z;
    private dagger.internal.d<SubscriptionViewModel> Z0;

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.u0 f56028a;

    /* renamed from: a0  reason: collision with root package name */
    private dagger.internal.d<LeaderboardViewModel> f56029a0;

    /* renamed from: a1  reason: collision with root package name */
    private dagger.internal.d<SuggestWorkoutLaunchOnWatchViewModel> f56030a1;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f56031b;

    /* renamed from: b0  reason: collision with root package name */
    private dagger.internal.d<LibraryCategoryScreenViewModel> f56032b0;

    /* renamed from: b1  reason: collision with root package name */
    private dagger.internal.d<SwapViewModel> f56033b1;

    /* renamed from: c  reason: collision with root package name */
    private dagger.internal.d<AcceptInvitationViewModel> f56034c;

    /* renamed from: c0  reason: collision with root package name */
    private dagger.internal.d<LoadingSensitiveActionViewModel> f56035c0;

    /* renamed from: c1  reason: collision with root package name */
    private dagger.internal.d<TotpViewModel> f56036c1;

    /* renamed from: d  reason: collision with root package name */
    private dagger.internal.d<AccountConsentViewModel> f56037d;

    /* renamed from: d0  reason: collision with root package name */
    private dagger.internal.d<LoggedOutViewModel> f56038d0;

    /* renamed from: d1  reason: collision with root package name */
    private dagger.internal.d<TracesLogsViewModel> f56039d1;

    /* renamed from: e  reason: collision with root package name */
    private dagger.internal.d<AccountLoginConsentViewModel> f56040e;

    /* renamed from: e0  reason: collision with root package name */
    private dagger.internal.d<LoginRecoveryCodeViewModel> f56041e0;

    /* renamed from: e1  reason: collision with root package name */
    private dagger.internal.d<TryToLoginViewModel> f56042e1;

    /* renamed from: f  reason: collision with root package name */
    private dagger.internal.d<AccountReactivationViewModel> f56043f;

    /* renamed from: f0  reason: collision with root package name */
    private dagger.internal.d<ManualLogEntryViewModel> f56044f0;

    /* renamed from: f1  reason: collision with root package name */
    private dagger.internal.d<TutorialViewModel> f56045f1;

    /* renamed from: g  reason: collision with root package name */
    private dagger.internal.d<AchieveViewModel> f56046g;

    /* renamed from: g0  reason: collision with root package name */
    private dagger.internal.d<MeasurementsViewModel> f56047g0;

    /* renamed from: g1  reason: collision with root package name */
    private dagger.internal.d<TwoFactorMultiAccountViewModel> f56048g1;

    /* renamed from: h  reason: collision with root package name */
    private dagger.internal.d<ActivityVerticalViewModel> f56049h;

    /* renamed from: h0  reason: collision with root package name */
    private dagger.internal.d<MfaResolutionViewModel> f56050h0;

    /* renamed from: h1  reason: collision with root package name */
    private dagger.internal.d<UnitsActivityViewModel> f56051h1;

    /* renamed from: i  reason: collision with root package name */
    private dagger.internal.d<AddCervicalMucusViewModel> f56052i;

    /* renamed from: i0  reason: collision with root package name */
    private dagger.internal.d<MissionActivityViewModel> f56053i0;

    /* renamed from: i1  reason: collision with root package name */
    private dagger.internal.d<UserCreationViewModel> f56054i1;

    /* renamed from: j  reason: collision with root package name */
    private dagger.internal.d<AddMoodViewModel> f56055j;

    /* renamed from: j0  reason: collision with root package name */
    private dagger.internal.d<MissionContentCompletionViewModel> f56056j0;

    /* renamed from: j1  reason: collision with root package name */
    private dagger.internal.d<VerifyGoogleAuthenticationSensitiveViewModel> f56057j1;

    /* renamed from: k  reason: collision with root package name */
    private dagger.internal.d<AddSexualActivityViewModel> f56058k;

    /* renamed from: k0  reason: collision with root package name */
    private dagger.internal.d<MultiAccountSelectionViewModel> f56059k0;

    /* renamed from: k1  reason: collision with root package name */
    private dagger.internal.d<VerticalCalendarPeriodLogViewModel> f56060k1;

    /* renamed from: l  reason: collision with root package name */
    private dagger.internal.d<AddSymptomsViewModel> f56061l;

    /* renamed from: l0  reason: collision with root package name */
    private dagger.internal.d<MyDevicesViewModel> f56062l0;

    /* renamed from: l1  reason: collision with root package name */
    private dagger.internal.d<VitaminCViewModel> f56063l1;

    /* renamed from: m  reason: collision with root package name */
    private dagger.internal.d<AthleteModeViewModel> f56064m;

    /* renamed from: m0  reason: collision with root package name */
    private dagger.internal.d<NerveHealthGuidedScanViewModel> f56065m0;

    /* renamed from: m1  reason: collision with root package name */
    private dagger.internal.d<WBS08EcgActivationViewModel> f56066m1;

    /* renamed from: n  reason: collision with root package name */
    private dagger.internal.d<AutomaticActivityDetectionViewModel> f56067n;

    /* renamed from: n0  reason: collision with root package name */
    private dagger.internal.d<NerveHealthViewModel> f56068n0;

    /* renamed from: n1  reason: collision with root package name */
    private dagger.internal.d<WallHandleMountViewModel> f56069n1;

    /* renamed from: o  reason: collision with root package name */
    private dagger.internal.d<BadgeDetailViewModel> f56070o;

    /* renamed from: o0  reason: collision with root package name */
    private dagger.internal.d<NotificationActivityViewModel> f56071o0;

    /* renamed from: o1  reason: collision with root package name */
    private dagger.internal.d<WeightExploreDataViewModel> f56072o1;

    /* renamed from: p  reason: collision with root package name */
    private dagger.internal.d<BadgesViewModel> f56073p;

    /* renamed from: p0  reason: collision with root package name */
    private dagger.internal.d<NotificationSectionViewModel> f56074p0;

    /* renamed from: p1  reason: collision with root package name */
    private dagger.internal.d<WeightViewModel> f56075p1;

    /* renamed from: q  reason: collision with root package name */
    private dagger.internal.d<BodyCompViewModel> f56076q;

    /* renamed from: q0  reason: collision with root package name */
    private dagger.internal.d<NutriSyncMeasureListViewModel> f56077q0;

    /* renamed from: q1  reason: collision with root package name */
    private dagger.internal.d<WithingsAdvertisingViewModel> f56078q1;

    /* renamed from: r  reason: collision with root package name */
    private dagger.internal.d<BodyVerticalViewModel> f56079r;

    /* renamed from: r0  reason: collision with root package name */
    private dagger.internal.d<NutritionSheetViewModel> f56080r0;

    /* renamed from: r1  reason: collision with root package name */
    private dagger.internal.d<WorkoutPlayerViewModel> f56081r1;

    /* renamed from: s  reason: collision with root package name */
    private dagger.internal.d<BookmarkLayoutViewModel> f56082s;

    /* renamed from: s0  reason: collision with root package name */
    private dagger.internal.d<NutritionVerticalViewModel> f56083s0;

    /* renamed from: s1  reason: collision with root package name */
    private dagger.internal.d<Wpa02CleansingModeViewModel> f56084s1;

    /* renamed from: t  reason: collision with root package name */
    private dagger.internal.d<ChangePasswordViewModel> f56085t;

    /* renamed from: t0  reason: collision with root package name */
    private dagger.internal.d<PacemakerModeViewModel> f56086t0;

    /* renamed from: u  reason: collision with root package name */
    private dagger.internal.d<ChineseDataProtectionViewModel> f56087u;

    /* renamed from: u0  reason: collision with root package name */
    private dagger.internal.d<PasswordInputViewModel> f56088u0;

    /* renamed from: v  reason: collision with root package name */
    private dagger.internal.d<CodeInputViewModel> f56089v;

    /* renamed from: v0  reason: collision with root package name */
    private dagger.internal.d<PickUserViewModel> f56090v0;

    /* renamed from: w  reason: collision with root package name */
    private dagger.internal.d<CompletionActivityViewModel> f56091w;

    /* renamed from: w0  reason: collision with root package name */
    private dagger.internal.d<PregnancyModeViewModel> f56092w0;

    /* renamed from: x  reason: collision with root package name */
    private dagger.internal.d<ConfirmSubscriptionViewModel> f56093x;

    /* renamed from: x0  reason: collision with root package name */
    private dagger.internal.d<ProfileBadgeCarouselViewModel> f56094x0;

    /* renamed from: y  reason: collision with root package name */
    private dagger.internal.d<ContentFavoriteBadgeViewModel> f56095y;

    /* renamed from: y0  reason: collision with root package name */
    private dagger.internal.d<ProgramCompletionViewModel> f56096y0;

    /* renamed from: z  reason: collision with root package name */
    private dagger.internal.d<ContentFavoriteListViewModel> f56097z;

    /* renamed from: z0  reason: collision with root package name */
    private dagger.internal.d<ProgramContentCompletionViewModel> f56098z0;

    /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
    /* loaded from: classes4.dex */
    private static final class a<T> implements dagger.internal.d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final b0 f56099a;

        /* renamed from: b  reason: collision with root package name */
        private final f1 f56100b;

        /* renamed from: c  reason: collision with root package name */
        private final int f56101c;

        a(b0 b0Var, f1 f1Var, int i11) {
            this.f56099a = b0Var;
            this.f56100b = f1Var;
            this.f56101c = i11;
        }

        /* JADX WARN: Type inference failed for: r10v27, types: [oz.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v0, types: [oz.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v18, types: [oz.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v17, types: [oz.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, hz.j] */
        /* JADX WARN: Type inference failed for: r13v0, types: [hz.l, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object, hz.k] */
        /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Object, hz.i] */
        /* JADX WARN: Type inference failed for: r14v0, types: [hz.a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, hz.h] */
        /* JADX WARN: Type inference failed for: r14v8, types: [oz.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object, com.android.billingclient.api.v] */
        /* JADX WARN: Type inference failed for: r15v14, types: [hz.n, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r16v1, types: [oz.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r16v11, types: [java.lang.Object, hz.g] */
        /* JADX WARN: Type inference failed for: r18v2, types: [hz.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r19v1, types: [hz.d, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r19v8, types: [com.withings.nervehealth.ui.usecases.ComputeNerveHealthNormalityZoneUseCase, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r21v2, types: [ox.a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r22v10, types: [java.lang.Object, bj0.d] */
        /* JADX WARN: Type inference failed for: r22v9, types: [oz.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r23v2, types: [androidx.health.connect.client.units.d, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v141, types: [d60.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v254, types: [java.lang.Object, ah.x] */
        /* JADX WARN: Type inference failed for: r2v36, types: [ml.b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, bj0.d] */
        /* JADX WARN: Type inference failed for: r43v1, types: [oz.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r45v1, types: [java.lang.Object, hz.f] */
        /* JADX WARN: Type inference failed for: r46v1, types: [hz.b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r47v1, types: [hz.m, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r48v2, types: [hz.e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v112, types: [w80.b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v15, types: [ah.e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v16, types: [ah.e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object, n60.a] */
        /* JADX WARN: Type inference failed for: r4v83, types: [java.lang.Object, l2.d] */
        /* JADX WARN: Type inference failed for: r5v25, types: [bi.a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v2, types: [bi.a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v47, types: [ml.b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, xv.e] */
        @Override // javax.inject.Provider
        public final T get() {
            dagger.internal.d dVar;
            dagger.internal.d dVar2;
            dagger.internal.d dVar3;
            dagger.internal.d dVar4;
            dagger.internal.d dVar5;
            dagger.internal.d dVar6;
            dagger.internal.d dVar7;
            dagger.internal.d dVar8;
            dagger.internal.d dVar9;
            dagger.internal.d dVar10;
            dagger.internal.d dVar11;
            dagger.internal.d dVar12;
            dagger.internal.d dVar13;
            dagger.internal.d dVar14;
            dagger.internal.d dVar15;
            hx.h I8;
            fy.l F8;
            vm.g w82;
            an.c c92;
            vm.n A8;
            dagger.internal.d dVar16;
            dagger.internal.d dVar17;
            an.c c93;
            dagger.internal.d dVar18;
            fl.e eVar;
            dagger.internal.d dVar19;
            dagger.internal.d dVar20;
            dagger.internal.d dVar21;
            q70.g d92;
            lg.o f92;
            dagger.internal.d dVar22;
            dagger.internal.d dVar23;
            dagger.internal.d dVar24;
            fl.e eVar2;
            dagger.internal.d dVar25;
            dagger.internal.d dVar26;
            dagger.internal.d dVar27;
            dagger.internal.d dVar28;
            dagger.internal.d dVar29;
            dagger.internal.d dVar30;
            fy.c0 h92;
            dagger.internal.d dVar31;
            q70.g d93;
            dagger.internal.d dVar32;
            zb0.a B8;
            dagger.internal.d dVar33;
            ny.b v82;
            dagger.internal.d dVar34;
            dagger.internal.d dVar35;
            dagger.internal.d dVar36;
            dagger.internal.d dVar37;
            dagger.internal.d dVar38;
            dagger.internal.d dVar39;
            dagger.internal.d dVar40;
            dagger.internal.d dVar41;
            dagger.internal.d dVar42;
            dagger.internal.d dVar43;
            dagger.internal.d dVar44;
            dagger.internal.d dVar45;
            dagger.internal.d dVar46;
            dagger.internal.d dVar47;
            dagger.internal.d dVar48;
            dagger.internal.d dVar49;
            dagger.internal.d dVar50;
            dagger.internal.d dVar51;
            dagger.internal.d dVar52;
            vm.n A82;
            dagger.internal.d dVar53;
            dagger.internal.d dVar54;
            dagger.internal.d dVar55;
            dagger.internal.d dVar56;
            dagger.internal.d dVar57;
            dagger.internal.d dVar58;
            dagger.internal.d dVar59;
            int i11 = this.f56101c;
            int i12 = i11 / 100;
            p.a aVar = fl.p.f67672b;
            b0 b0Var = this.f56099a;
            f1 f1Var = this.f56100b;
            if (i12 != 0) {
                if (i12 == 1) {
                    switch (i11) {
                        case 100:
                            return (T) new StartTrackingViewModel(new o10.a(), f1.v0(f1Var), f1Var.f56028a);
                        case 101:
                            dVar46 = b0Var.Y4;
                            dVar47 = b0Var.Z4;
                            return (T) new SubscriptionViewModel((com.withings.paywall.t) dVar46.get(), (com.withings.paywall.c) dVar47.get(), (t00.d) b0Var.f50146c2.get());
                        case 102:
                            androidx.lifecycle.u0 u0Var = f1Var.f56028a;
                            dVar48 = b0Var.W2;
                            return (T) new SuggestWorkoutLaunchOnWatchViewModel(u0Var, (bx.a) dVar48.get());
                        case 103:
                            androidx.lifecycle.u0 u0Var2 = f1Var.f56028a;
                            dVar49 = b0Var.f50250t4;
                            nu.a aVar2 = (nu.a) dVar49.get();
                            dVar50 = b0Var.f50268w4;
                            return (T) new SwapViewModel(u0Var2, aVar2, (nu.c) dVar50.get(), b0.P7(b0Var), b0.G7(b0Var), b0.H7(b0Var));
                        case 104:
                            dVar51 = b0Var.f50235r1;
                            return (T) new TotpViewModel((AccountRemoteRepository) dVar51.get(), f1.y(f1Var));
                        case 105:
                            return (T) new TracesLogsViewModel(gk0.c.a(b0Var.f50131a));
                        case 106:
                            return (T) new TryToLoginViewModel((vf.c) b0Var.f50144c0.get(), (AccountSessionRepository) b0Var.f50216o0.get(), b0.W4(b0Var), f1.x(f1Var), f1.F0(f1Var), f1.s0(f1Var), f1.t0(f1Var), f1.u0(f1Var), f1.j(f1Var), b0Var.o8(), (t00.d) b0Var.f50146c2.get(), f1Var.N0(), b0.g8(b0Var));
                        case 107:
                            dVar52 = b0Var.H3;
                            return (T) new TutorialViewModel((u60.a) dVar52.get(), (m70.i) b0Var.f50258v0.get(), new Object());
                        case 108:
                            return (T) new TwoFactorMultiAccountViewModel((AccountSessionRepository) b0Var.f50216o0.get());
                        case 109:
                            return (T) new UnitsActivityViewModel(gk0.c.a(b0Var.f50131a), (l70.w) b0Var.H.get(), (m70.i) b0Var.f50258v0.get(), b0.b8(b0Var));
                        case 110:
                            return (T) new UserCreationViewModel(gk0.c.a(b0Var.f50131a), (m70.i) b0Var.f50258v0.get(), (vf.c) b0Var.f50144c0.get(), (AccountSessionRepository) b0Var.f50216o0.get(), (t00.d) b0Var.f50146c2.get(), f1.d(f1Var), f1.e(f1Var), b0.b8(b0Var), (l70.w) b0Var.H.get(), b0.g8(b0Var));
                        case 111:
                            return (T) new VerifyGoogleAuthenticationSensitiveViewModel(f1.G0(f1Var), b0.k6(b0Var));
                        case 112:
                            androidx.lifecycle.u0 u0Var3 = f1Var.f56028a;
                            vm.v w72 = b0.w7(b0Var);
                            A82 = b0Var.A8();
                            return (T) new VerticalCalendarPeriodLogViewModel(u0Var3, w72, A82, b0Var.F(), b0.o4(b0Var), b0.b5(b0Var));
                        case 113:
                            return (T) new VitaminCViewModel(f1Var.f56028a, (xw.b) b0Var.K0.get(), f1.n0(f1Var));
                        case 114:
                            return (T) new WBS08EcgActivationViewModel((PlatformFeatureRepository) b0Var.f50263w.get(), b0.h7(b0Var), (r70.c) b0Var.T0.get(), b0.u5(b0Var), (EcgReviewRemoteRepository) b0Var.f50170g2.get(), (m70.i) b0Var.f50258v0.get(), f1Var.f56028a);
                        case 115:
                            dVar53 = b0Var.H3;
                            return (T) new WallHandleMountViewModel((u60.a) dVar53.get(), (m70.i) b0Var.f50258v0.get());
                        case 116:
                            return (T) new WeightExploreDataViewModel(f1Var.f56028a, (m70.i) b0Var.f50258v0.get(), b0.V6(b0Var), gk0.b.a(b0Var.f50131a), f1.r0(f1Var), f1.a0(f1Var), f1.q(f1Var), new ah.c0());
                        case 117:
                            return (T) new WeightViewModel(f1Var.f56028a, (m70.i) b0Var.f50258v0.get(), new Object(), f1.a0(f1Var), (iy.e) b0Var.L0.get(), (ky.c) b0Var.f50270x0.get(), (xw.b) b0Var.K0.get(), f1.r0(f1Var), b0.C4(b0Var), f1.L0(f1Var), f1.q(f1Var), f1.k(f1Var), f1.l(f1Var), b0.X6(b0Var), f1.n0(f1Var), (j90.h) b0Var.L.get(), new n90.b(new Object()), new Object(), b0.X7(b0Var));
                        case 118:
                            dVar54 = b0Var.f50241s1;
                            return (T) new WithingsAdvertisingViewModel((r70.c) b0Var.T0.get(), (tf.b) dVar54.get());
                        case 119:
                            dVar55 = b0Var.f50274x4;
                            yw.a liveHrListener = (yw.a) dVar55.get();
                            androidx.lifecycle.u0 savedStateHandle = f1Var.f56028a;
                            m70.i userManager = (m70.i) b0Var.f50258v0.get();
                            dVar56 = b0Var.W2;
                            bx.a sharedLiveWorkoutInfo = (bx.a) dVar56.get();
                            dVar57 = b0Var.B3;
                            ax.h liveWorkoutManager = (ax.h) dVar57.get();
                            dVar58 = b0Var.Z2;
                            ax.i liveWorkoutRepository = (ax.i) dVar58.get();
                            dVar59 = b0Var.V2;
                            ax.c liveWorkoutCommandSender = (ax.c) ((b0.a) dVar59).get();
                            ta0.a O6 = b0.O6(b0Var);
                            kotlin.jvm.internal.u.j(liveHrListener, "liveHrListener");
                            kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
                            kotlin.jvm.internal.u.j(userManager, "userManager");
                            kotlin.jvm.internal.u.j(sharedLiveWorkoutInfo, "sharedLiveWorkoutInfo");
                            kotlin.jvm.internal.u.j(liveWorkoutManager, "liveWorkoutManager");
                            kotlin.jvm.internal.u.j(liveWorkoutRepository, "liveWorkoutRepository");
                            kotlin.jvm.internal.u.j(liveWorkoutCommandSender, "liveWorkoutCommandSender");
                            T t11 = (T) new ou.f(savedStateHandle, liveHrListener, O6, liveWorkoutCommandSender, liveWorkoutManager, liveWorkoutRepository, sharedLiveWorkoutInfo, userManager);
                            if (((String) savedStateHandle.c(NavigationArguments.VIDEO_URL)) == null) {
                                throw new Exception("videoUrl shouldn't be null");
                            }
                            return t11;
                        case 120:
                            return (T) new Wpa02CleansingModeViewModel(gk0.c.a(b0Var.f50131a), bg.a.a(), aVar.a(), f1Var.f56028a, (xw.b) b0Var.K0.get());
                        default:
                            throw new AssertionError(i11);
                    }
                }
                throw new AssertionError(i11);
            }
            switch (i11) {
                case 0:
                    return (T) new AcceptInvitationViewModel(b0.I4(b0Var));
                case 1:
                    return (T) new AccountConsentViewModel();
                case 2:
                    return (T) new AccountLoginConsentViewModel((vf.c) b0Var.f50144c0.get(), b0Var.o8(), (t00.d) b0Var.f50146c2.get());
                case 3:
                    return (T) new AccountReactivationViewModel((vf.c) b0Var.f50144c0.get(), f1.z0(f1Var));
                case 4:
                    Context a11 = gk0.c.a(b0Var.f50131a);
                    xw.b bVar = (xw.b) b0Var.K0.get();
                    dVar = b0Var.M1;
                    return (T) new AchieveViewModel(a11, bVar, (x30.c) dVar.get(), b0.x5(b0Var), f1Var.f56028a, b0.Y5(b0Var), f1.q(f1Var), f1.G(f1Var), b0.V5(b0Var), (ch.d) ((b0.a) b0Var.Q0).get(), (m70.i) b0Var.f50258v0.get(), b0.Z5(b0Var), (l70.w) b0Var.H.get());
                case 5:
                    dVar2 = b0Var.f50244s4;
                    return (T) new ActivityVerticalViewModel((iz.c) dVar2.get(), b0.e6(b0Var), f1Var.f56028a, b0.Y5(b0Var), f1.O(f1Var), new Object(), f1.c0(f1Var), new Object(), new Object());
                case 6:
                    return (T) new AddCervicalMucusViewModel(gk0.c.a(b0Var.f50131a), f1Var.f56028a, b0.b6(b0Var));
                case 7:
                    return (T) new AddMoodViewModel(b0.z7(b0Var), f1Var.f56028a);
                case 8:
                    return (T) new AddSexualActivityViewModel(f1Var.f56028a, b0.b6(b0Var));
                case 9:
                    return (T) new AddSymptomsViewModel(gk0.c.a(b0Var.f50131a), f1Var.f56028a, b0.b6(b0Var));
                case 10:
                    return (T) new AthleteModeViewModel(b0.o6(b0Var), b0.d8(b0Var), f1Var.f56028a);
                case 11:
                    androidx.lifecycle.u0 u0Var4 = f1Var.f56028a;
                    dVar3 = b0Var.U2;
                    return (T) new AutomaticActivityDetectionViewModel(u0Var4, (com.withings.device.details.automatic.activity.detection.d) dVar3.get(), (WorkoutCategoryManager) b0Var.K1.get());
                case 12:
                    androidx.lifecycle.u0 u0Var5 = f1Var.f56028a;
                    dVar4 = b0Var.S1;
                    return (T) new BadgeDetailViewModel(u0Var5, (zh.a) dVar4.get());
                case 13:
                    return (T) new BadgesViewModel(gk0.b.a(b0Var.f50131a), f1.b0(f1Var), f1.S(f1Var), new Object(), f1Var.f56028a);
                case 14:
                    return (T) new BodyCompViewModel(gk0.c.a(b0Var.f50131a), f1Var.f56028a, new Object(), f1.a0(f1Var), b0.z5(b0Var), (xw.b) b0Var.K0.get(), f1.o0(f1Var), f1.n0(f1Var), b0.A4(b0Var), f1.t(f1Var), f1.r(f1Var), f1.m(f1Var), f1.q(f1Var), f1.u(f1Var), f1.n(f1Var), f1.s(f1Var), b0.X6(b0Var), (m70.i) b0Var.f50258v0.get(), (j90.c) b0Var.M.get(), b0.A5(b0Var), f1.g(f1Var), f1.H(f1Var), new Object(), f1.R(f1Var), f1.o(f1Var), b0.X7(b0Var), b0.b8(b0Var), (kn.e) b0Var.f50251u.get(), (vr.d) b0Var.f50246t0.get(), b0.V6(b0Var), (l70.w) b0Var.H.get());
                case 15:
                    dVar5 = b0Var.f50244s4;
                    return (T) new BodyVerticalViewModel((iz.c) dVar5.get(), b0.e6(b0Var), b0.Y5(b0Var), f1.O(f1Var), f1Var.f56028a, new Object(), f1.c0(f1Var), new Object(), new Object());
                case 16:
                    return (T) new BookmarkLayoutViewModel(f1Var.f56028a, f1.f(f1Var), f1.A(f1Var), (xw.b) b0Var.K0.get(), f1.Z(f1Var));
                case 17:
                    dVar6 = b0Var.f50235r1;
                    return (T) new ChangePasswordViewModel((AccountRemoteRepository) dVar6.get(), (vf.c) b0Var.f50144c0.get());
                case 18:
                    return (T) new ChineseDataProtectionViewModel();
                case 19:
                    return (T) new CodeInputViewModel(f1.H0(f1Var));
                case 20:
                    return (T) new CompletionActivityViewModel(f1Var.f56028a, (xw.b) b0Var.K0.get(), b0.V7(b0Var));
                case 21:
                    return (T) new ConfirmSubscriptionViewModel(f1Var.f56028a);
                case 22:
                    return (T) new ContentFavoriteBadgeViewModel(f1Var.f56028a, f1.M(f1Var), new Object());
                case 23:
                    androidx.lifecycle.u0 u0Var6 = f1Var.f56028a;
                    dVar7 = b0Var.R1;
                    return (T) new ContentFavoriteListViewModel(u0Var6, (rl.c) dVar7.get(), new Object(), f1.I(f1Var));
                case 24:
                    dVar8 = b0Var.W2;
                    return (T) new ContentFavoriteViewModel((bx.a) dVar8.get());
                case 25:
                    androidx.lifecycle.u0 u0Var7 = f1Var.f56028a;
                    dVar9 = b0Var.f50250t4;
                    dVar10 = b0Var.f50268w4;
                    return (T) new ContentScreenViewModel(u0Var7, (nu.a) dVar9.get(), (nu.c) dVar10.get());
                case 26:
                    dVar11 = b0Var.f50274x4;
                    yw.a aVar3 = (yw.a) dVar11.get();
                    androidx.lifecycle.u0 u0Var8 = f1Var.f56028a;
                    m70.i iVar = (m70.i) b0Var.f50258v0.get();
                    dVar12 = b0Var.W2;
                    bx.a aVar4 = (bx.a) dVar12.get();
                    dVar13 = b0Var.B3;
                    ax.h hVar = (ax.h) dVar13.get();
                    dVar14 = b0Var.Z2;
                    ax.i iVar2 = (ax.i) dVar14.get();
                    dVar15 = b0Var.V2;
                    return (T) new ContentWorkoutPlayerViewModel(u0Var8, aVar3, b0.O6(b0Var), (ax.c) ((b0.a) dVar15).get(), hVar, iVar2, aVar4, iVar);
                case 27:
                    I8 = b0Var.I8();
                    ox.e a62 = b0.a6(b0Var);
                    androidx.lifecycle.u0 u0Var9 = f1Var.f56028a;
                    um.a F = b0Var.F();
                    b0Var.f50149d.getClass();
                    ?? obj = new Object();
                    F8 = b0Var.F8();
                    b0Var.f50149d.getClass();
                    w82 = b0Var.w8();
                    vm.f y11 = b0Var.y();
                    c92 = b0Var.c9();
                    return (T) new CycleDataStorageViewModel(I8, a62, u0Var9, F, obj, F8, new Object(), b0.B7(b0Var), (ex.a) ((b0.a) b0Var.X).get(), w82, y11, c92);
                case 28:
                    androidx.lifecycle.u0 u0Var10 = f1Var.f56028a;
                    Context a12 = gk0.c.a(b0Var.f50131a);
                    A8 = b0Var.A8();
                    um.a F2 = b0Var.F();
                    xw.b bVar2 = (xw.b) b0Var.K0.get();
                    dVar16 = b0Var.D3;
                    fl.i iVar3 = (fl.i) dVar16.get();
                    dVar17 = b0Var.H3;
                    n60.a b10 = dl.a.b();
                    ym.b p42 = b0.p4(b0Var);
                    vm.f y12 = b0Var.y();
                    c93 = b0Var.c9();
                    return (T) new CycleManualLoggingViewModel(u0Var10, a12, A8, F2, bVar2, iVar3, (u60.a) dVar17.get(), b10, p42, y12, c93);
                case 29:
                    return (T) new CycleSymptomsViewModel(f1Var.f56028a, b0.b6(b0Var));
                case 30:
                    androidx.lifecycle.u0 u0Var11 = f1Var.f56028a;
                    dVar18 = b0Var.J0;
                    return (T) new CycleTrackingFactorsViewModel(u0Var11, (gr.a) dVar18.get(), (xw.b) b0Var.K0.get(), b0Var.F(), f1.L(f1Var));
                case 31:
                    return (T) new CycleTrackingHistoryViewModel(b0.w7(b0Var), f1Var.f56028a);
                case 32:
                    return (T) new CycleTrackingViewModel(gk0.c.a(b0Var.f50131a), b0.w7(b0Var), f1Var.f56028a, b0Var.F(), b0Var.M(), (xw.b) b0Var.K0.get(), b0.o4(b0Var), f1.n0(f1Var), b0.V6(b0Var), bg.b.a(), b0.b5(b0Var), (xm.b) b0Var.O0.get());
                case 33:
                    Context a13 = gk0.c.a(b0Var.f50131a);
                    m70.i iVar4 = (m70.i) b0Var.f50258v0.get();
                    oi0.b bVar3 = (oi0.b) b0Var.f50152d2.get();
                    kn.e eVar3 = (kn.e) b0Var.f50251u.get();
                    eVar = fl.e.f67637h;
                    if (eVar != null) {
                        return (T) new DashboardViewModel(a13, iVar4, bVar3, eVar3, eVar, aVar.a(), f1.B(f1Var));
                    }
                    kotlin.jvm.internal.u.s("instance");
                    throw null;
                case 34:
                    fl.p a14 = aVar.a();
                    vr.d dVar60 = (vr.d) b0Var.f50246t0.get();
                    androidx.lifecycle.u0 u0Var12 = f1Var.f56028a;
                    m70.i iVar5 = (m70.i) b0Var.f50258v0.get();
                    kn.e eVar4 = (kn.e) b0Var.f50251u.get();
                    il.a aVar5 = (il.a) b0Var.f50207m3.get();
                    dVar19 = b0Var.f50286z4;
                    return (T) new DeviceIntroductionViewModel(a14, dVar60, u0Var12, iVar5, eVar4, aVar5, (h70.c) dVar19.get());
                case 35:
                    return (T) new EcgInReviewViewModel((r70.c) b0Var.T0.get(), b0.u5(b0Var), (EcgReviewRemoteRepository) b0Var.f50170g2.get(), (kn.e) b0Var.f50251u.get(), (HeartSignalRepository) b0Var.f50181i1.get(), b0.E6(b0Var), f1Var.f56028a);
                case 36:
                    Context a15 = gk0.c.a(b0Var.f50131a);
                    vf.c cVar = (vf.c) b0Var.f50144c0.get();
                    lg.a o82 = b0Var.o8();
                    t00.d dVar61 = (t00.d) b0Var.f50146c2.get();
                    dVar20 = b0Var.f50235r1;
                    return (T) new EmailModificationViewModel(a15, cVar, o82, dVar61, (AccountRemoteRepository) dVar20.get());
                case 37:
                    return (T) new EndProgramViewModel(f1Var.f56028a, f1.K(f1Var), f1.W(f1Var), (xw.b) b0Var.K0.get());
                case 38:
                    return (T) new ExplanationsViewModel((p60.c) b0Var.f50132a0.get());
                case 39:
                    or.a f11 = f1.f(f1Var);
                    or.c A = f1.A(f1Var);
                    dVar21 = b0Var.W2;
                    return (T) new ExploreTabViewModel(f11, A, (bx.a) dVar21.get());
                case 40:
                    return (T) new EyesClosedModeViewModel(b0.o6(b0Var), b0.d8(b0Var), f1Var.f56028a);
                case 41:
                    return (T) new FavoriteViewModel(f1Var.f56028a, f1.f(f1Var), f1.A(f1Var), f1.Z(f1Var), b0.V7(b0Var));
                case 42:
                    th.e j5 = f1.j(f1Var);
                    vf.f F3 = f1.F(f1Var);
                    lg.d z5 = f1.z(f1Var);
                    lg.a o83 = b0Var.o8();
                    d92 = b0Var.d9();
                    cg.g g02 = f1.g0(f1Var);
                    y90.e j62 = b0.j6(b0Var);
                    f92 = b0Var.f9();
                    return (T) new GoogleAuthProviderViewModel(gk0.c.a(b0Var.f50131a), (vf.c) b0Var.f50144c0.get(), (AccountSessionRepository) b0Var.f50216o0.get(), j5, F3, z5, o83, d92, (t00.d) b0Var.f50146c2.get(), g02, j62, f92, b0.k6(b0Var));
                case 43:
                    return (T) new HealthScoreExploreDataViewModel(f1Var.f56028a, f1.P(f1Var), new Object(), gk0.b.a(b0Var.f50131a));
                case 44:
                    dVar22 = b0Var.f50244s4;
                    return (T) new HealthVerticalActivityViewModel(f1Var.f56028a, (xw.b) b0Var.K0.get(), (r70.a) b0Var.E3.get(), (iz.c) dVar22.get());
                case 45:
                    dVar23 = b0Var.f50244s4;
                    return (T) new HeartVerticalViewModel((iz.c) dVar23.get(), b0.e6(b0Var), b0.Y5(b0Var), f1.O(f1Var), f1Var.f56028a, new Object(), f1.c0(f1Var), new Object(), new Object(), new Object(), new Object());
                case 46:
                    Context a16 = gk0.c.a(b0Var.f50131a);
                    vg0.e j02 = f1.j0(f1Var);
                    vg0.b i02 = f1.i0(f1Var);
                    vg0.f k02 = f1.k0(f1Var);
                    x00.b S8 = b0Var.S8();
                    GetUserPositionRankingUseCase d02 = f1.d0(f1Var);
                    aw.a X = f1.X(f1Var);
                    aw.d Y = f1.Y(f1Var);
                    aw.i e02 = f1.e0(f1Var);
                    aw.j f02 = f1.f0(f1Var);
                    r70.c cVar2 = (r70.c) b0Var.T0.get();
                    fl.p a17 = aVar.a();
                    dVar24 = b0Var.A4;
                    ch0.a aVar6 = (ch0.a) dVar24.get();
                    t00.d dVar62 = (t00.d) b0Var.f50146c2.get();
                    or.a f12 = f1.f(f1Var);
                    or.c A2 = f1.A(f1Var);
                    d00.d L5 = b0.L5(b0Var);
                    or.g N = f1.N(f1Var);
                    ni.a G = f1.G(f1Var);
                    qg0.a aVar7 = (qg0.a) b0Var.Y.get();
                    eVar2 = fl.e.f67637h;
                    if (eVar2 != null) {
                        kn.e eVar5 = (kn.e) b0Var.f50251u.get();
                        dVar25 = b0Var.f50189j3;
                        return (T) new HomeViewModel(a16, j02, i02, k02, S8, d02, X, Y, e02, f02, cVar2, a17, aVar6, dVar62, f12, A2, L5, N, G, aVar7, eVar2, eVar5, (ch0.g) ((b0.a) dVar25).get(), f1.D0(f1Var));
                    }
                    kotlin.jvm.internal.u.s("instance");
                    throw null;
                case 47:
                    return (T) new InAppSurveyViewModel(f1.C(f1Var), new Object(), f1.J0(f1Var), f1.I0(f1Var), f1Var.f56028a, (xw.b) b0Var.K0.get(), f1.m0(f1Var));
                case 48:
                    return (T) new JoinProgramViewModel(b0.I6(b0Var));
                case 49:
                    return (T) new LeaderBoardItemViewModel(f1.Q(f1Var));
                case 50:
                    dVar26 = b0Var.D1;
                    return (T) new LeaderboardViewModel((LeaderboardRemoteRepository) dVar26.get(), (ActivityAggregateManager) b0Var.F1.get());
                case 51:
                    return (T) new LibraryCategoryScreenViewModel(f1Var.f56028a, b0.J4(b0Var), b0.e5(b0Var), b0.f5(b0Var), b0.D5(b0Var), b0.C5(b0Var));
                case 52:
                    return (T) new LoadingSensitiveActionViewModel(f1.l0(f1Var), (vf.c) b0Var.f50144c0.get());
                case 53:
                    return (T) new LoggedOutViewModel(gk0.b.a(b0Var.f50131a), b0.S6(b0Var));
                case 54:
                    return (T) new LoginRecoveryCodeViewModel((vf.c) b0Var.f50144c0.get(), (AccountSessionRepository) b0Var.f50216o0.get(), f1.w(f1Var), bg.c.a(), f1.E(f1Var), (t00.d) b0Var.f50146c2.get(), b0Var.o8());
                case 55:
                    return (T) new ManualLogEntryViewModel(gk0.c.a(b0Var.f50131a), f1Var.f56028a, b0.c7(b0Var));
                case 56:
                    n20.b Y5 = b0.Y5(b0Var);
                    kn.e eVar6 = (kn.e) b0Var.f50251u.get();
                    rt.a e62 = b0.e6(b0Var);
                    ?? obj2 = new Object();
                    dVar27 = b0Var.f50244s4;
                    return (T) new MeasurementsViewModel(Y5, eVar6, e62, obj2, (iz.c) dVar27.get(), (r70.c) b0Var.T0.get(), f1.w0(f1Var), (t00.d) b0Var.f50146c2.get(), f1.O(f1Var), new Object(), f1.D0(f1Var));
                case 57:
                    vf.c cVar3 = (vf.c) b0Var.f50144c0.get();
                    dVar28 = b0Var.f50235r1;
                    return (T) new MfaResolutionViewModel(cVar3, (AccountRemoteRepository) dVar28.get(), (AccountSessionRepository) b0Var.f50216o0.get(), (t00.d) b0Var.f50146c2.get(), b0Var.o8(), f1.A0(f1Var), b0.S6(b0Var));
                case 58:
                    return (T) new MissionActivityViewModel((ch.d) ((b0.a) b0Var.Q0).get(), f1.f(f1Var), f1.A(f1Var), b0.L5(b0Var), f1.G(f1Var), f1.N(f1Var), gk0.c.a(b0Var.f50131a));
                case 59:
                    return (T) new MissionContentCompletionViewModel(f1Var.f56028a, (xw.b) b0Var.K0.get(), (tt.c) ((b0.a) b0Var.f50159e3).get(), b0Var.r8());
                case 60:
                    return (T) new MultiAccountSelectionViewModel(f1.B0(f1Var), f1.E0(f1Var));
                case 61:
                    Context a18 = gk0.c.a(b0Var.f50131a);
                    kn.e eVar7 = (kn.e) b0Var.f50251u.get();
                    r70.c cVar4 = (r70.c) b0Var.T0.get();
                    dVar29 = b0Var.T4;
                    qh0.k kVar = (qh0.k) dVar29.get();
                    fl.p a19 = aVar.a();
                    ej.w a21 = bg.a.a();
                    dVar30 = b0Var.A4;
                    return (T) new MyDevicesViewModel(a18, eVar7, cVar4, kVar, a19, a21, (ch0.a) dVar30.get());
                case 62:
                    cy.a X6 = b0.X6(b0Var);
                    com.withings.nervehealth.ui.guidedscan.e0 x02 = f1.x0(f1Var);
                    j00.e L7 = b0.L7(b0Var);
                    j00.a t42 = b0.t4(b0Var);
                    j00.b i52 = b0.i5(b0Var);
                    h92 = b0Var.h9();
                    return (T) new NerveHealthGuidedScanViewModel((m70.i) b0Var.f50258v0.get(), X6, x02, L7, t42, i52, h92, f1.y0(f1Var), f1.U(f1Var), f1.J(f1Var), f1Var.f56028a);
                case 63:
                    return (T) new NerveHealthViewModel(gk0.b.a(b0Var.f50131a), f1Var.f56028a, (m70.i) b0Var.f50258v0.get(), f1.n0(f1Var), b0.Q5(b0Var), b0.X6(b0Var), f1.p0(f1Var), f1.p(f1Var), f1.y0(f1Var), new Object(), f1.U(f1Var), f1.V(f1Var), b0.e8(b0Var), new Object());
                case 64:
                    return (T) new NotificationActivityViewModel(b0.U6(b0Var), b0Var.S8(), f1Var.f56028a);
                case 65:
                    return (T) new NotificationSectionViewModel(b0Var.S8());
                case 66:
                    return (T) new NutriSyncMeasureListViewModel(f1Var.f56028a, f1.T(f1Var));
                case 67:
                    return (T) new NutritionSheetViewModel(f1Var.f56028a);
                case 68:
                    dVar31 = b0Var.f50244s4;
                    return (T) new NutritionVerticalViewModel((iz.c) dVar31.get(), b0.e6(b0Var), b0.Y5(b0Var), f1.O(f1Var), f1Var.f56028a, new Object(), f1.c0(f1Var), new Object(), new Object(), new Object(), new Object());
                case 69:
                    return (T) new PacemakerModeViewModel(b0.o6(b0Var), b0.d8(b0Var), f1Var.f56028a);
                case 70:
                    return (T) new PasswordInputViewModel(f1.H0(f1Var));
                case 71:
                    lg.a o84 = b0Var.o8();
                    d93 = b0Var.d9();
                    return (T) new PickUserViewModel(gk0.b.a(b0Var.f50131a), (m70.i) b0Var.f50258v0.get(), (vf.c) b0Var.f50144c0.get(), (t00.d) b0Var.f50146c2.get(), o84, d93);
                case 72:
                    androidx.lifecycle.u0 u0Var13 = f1Var.f56028a;
                    xw.b bVar4 = (xw.b) b0Var.K0.get();
                    dVar32 = b0Var.U4;
                    y60.c cVar5 = (y60.c) dVar32.get();
                    y60.a M5 = b0.M5(b0Var);
                    B8 = b0Var.B8();
                    y60.d d82 = b0.d8(b0Var);
                    y60.b o62 = b0.o6(b0Var);
                    xu.a I6 = b0.I6(b0Var);
                    z30.a h11 = f1.h(f1Var);
                    dVar33 = b0Var.V4;
                    w60.a aVar8 = (w60.a) dVar33.get();
                    v82 = b0Var.v8();
                    iy.e eVar8 = (iy.e) b0Var.L0.get();
                    dVar34 = b0Var.W4;
                    return (T) new PregnancyModeViewModel(u0Var13, bVar4, cVar5, M5, B8, d82, o62, I6, h11, aVar8, v82, eVar8, (w60.b) dVar34.get());
                case 73:
                    dVar35 = b0Var.S1;
                    return (T) new ProfileBadgeCarouselViewModel(gk0.b.a(b0Var.f50131a), (m70.i) b0Var.f50258v0.get(), (zh.a) dVar35.get(), new Object());
                case 74:
                    return (T) new ProgramCompletionViewModel(f1.D(f1Var), (xw.b) b0Var.K0.get());
                case 75:
                    return (T) new ProgramContentCompletionViewModel(f1Var.f56028a, (xw.b) b0Var.K0.get(), (tt.c) ((b0.a) b0Var.f50159e3).get(), b0Var.r8());
                case 76:
                    return (T) new ProgramDetailViewModel(gk0.c.a(b0Var.f50131a), f1.G(f1Var), (v30.f) b0Var.f50171g3.get(), f1.N(f1Var), f1Var.f56028a, f1.i(f1Var));
                case 77:
                    return (T) new ProgramOverviewViewModel((kn.e) b0Var.f50251u.get(), (x30.j) b0Var.f50164f2.get(), f1Var.f56028a, f1.G(f1Var), aVar.a());
                case 78:
                    return (T) new RecoveryTwoFaViewModel(f1.K0(f1Var));
                case 79:
                    return (T) new ReminderRingingViewModel(RemindersBinderModule_ProvideReminderRepositoryFactory.provideReminderRepository());
                case 80:
                    return (T) new ResolveTwoFaViewModel(f1.K0(f1Var));
                case 81:
                    dVar36 = b0Var.f50235r1;
                    return (T) new ResolveTwoFactorViewModel((AccountRemoteRepository) dVar36.get());
                case 82:
                    dVar37 = b0Var.f50244s4;
                    return (T) new RespiratoryVerticalViewModel((iz.c) dVar37.get(), b0.e6(b0Var), b0.Y5(b0Var), f1.O(f1Var), f1Var.f56028a, new Object(), f1.c0(f1Var));
                case 83:
                    return (T) new ScalesModeViewModel(f1Var.f56028a, (vr.d) b0Var.f50246t0.get(), b0.M5(b0Var), (ch.d) ((b0.a) b0Var.Q0).get());
                case 84:
                    dVar38 = b0Var.D1;
                    return (T) new ScanFriendCodeActivity.ScanFriendCodeViewModel((r70.c) b0Var.T0.get(), (LeaderboardRemoteRepository) dVar38.get(), b0.K6(b0Var), (t00.d) b0Var.f50146c2.get());
                case 85:
                    return (T) new SeeOptionViewModel(f1.H0(f1Var));
                case 86:
                    return (T) new SegmentalBodyCompositionTutorialViewModel((r70.c) b0Var.T0.get(), b0.b8(b0Var));
                case 87:
                    return (T) new SelectDataViewModel();
                case 88:
                    return (T) new SelectTimeViewModel();
                case 89:
                    return (T) new SendInvitationViewModel(b0.I4(b0Var), (r70.c) b0Var.T0.get());
                case 90:
                    return (T) new SetHealthGoalViewModel((r70.c) b0Var.T0.get(), b0.A7(b0Var), b0.p5(b0Var));
                case 91:
                    dVar39 = b0Var.f50235r1;
                    return (T) new SettingsMfaViewModel((AccountRemoteRepository) dVar39.get());
                case 92:
                    ?? obj3 = new Object();
                    dVar40 = b0Var.f50235r1;
                    return (T) new SettingsPhoneAuthViewModel(obj3, (AccountRemoteRepository) dVar40.get(), f1.v(f1Var));
                case 93:
                    dVar41 = b0Var.f50235r1;
                    return (T) new SettingsRecoveryCodeViewModel((AccountRemoteRepository) dVar41.get());
                case 94:
                    Context a22 = gk0.c.a(b0Var.f50131a);
                    m70.i iVar6 = (m70.i) b0Var.f50258v0.get();
                    vf.c cVar6 = (vf.c) b0Var.f50144c0.get();
                    com.withings.wiscale2.settings.f0 h02 = f1.h0(f1Var);
                    oi0.b bVar5 = (oi0.b) b0Var.f50152d2.get();
                    lg.a o85 = b0Var.o8();
                    t00.d dVar63 = (t00.d) b0Var.f50146c2.get();
                    com.withings.wiscale2.settings.k0 S6 = b0.S6(b0Var);
                    dVar42 = b0Var.f50235r1;
                    return (T) new SettingsViewModel(a22, iVar6, cVar6, h02, bVar5, o85, dVar63, S6, (AccountRemoteRepository) dVar42.get());
                case 95:
                    return (T) new SetupChooseDeviceViewModel(gk0.c.a(b0Var.f50131a), (kn.e) b0Var.f50251u.get(), aVar.a(), f1.q0(f1Var), new rp.a(aVar.a()));
                case ConstantsWs.MEASURE_TYPE_HORIZONTAL_RADIUS /* 96 */:
                    dVar43 = b0Var.F3;
                    return (T) new SetupScaleForMultipleUsersViewModel((com.withings.device.details.scale.b) dVar43.get(), (m70.i) b0Var.f50258v0.get(), b0Var.T());
                case 97:
                    return (T) new SetupViewModel();
                case 98:
                    dVar44 = b0Var.f50244s4;
                    iz.c measurementItemsByVerticalRepository = (iz.c) dVar44.get();
                    rt.a e63 = b0.e6(b0Var);
                    n20.b Y52 = b0.Y5(b0Var);
                    oz.g O = f1.O(f1Var);
                    androidx.lifecycle.u0 savedStateHandle2 = f1Var.f56028a;
                    ?? obj4 = new Object();
                    rt.c c02 = f1.c0(f1Var);
                    kotlin.jvm.internal.u.j(measurementItemsByVerticalRepository, "measurementItemsByVerticalRepository");
                    kotlin.jvm.internal.u.j(savedStateHandle2, "savedStateHandle");
                    return (T) new com.withings.measurements.ui.o1(measurementItemsByVerticalRepository, e63, c02, savedStateHandle2, MeasurementsVertical.f41868g, Y52, O, obj4);
                case 99:
                    dVar45 = b0Var.f50244s4;
                    return (T) new SleepVerticalViewModel((iz.c) dVar45.get(), b0.e6(b0Var), b0.Y5(b0Var), f1.O(f1Var), f1Var.f56028a, new Object(), f1.c0(f1Var), new Object(), new Object());
                default:
                    throw new AssertionError(i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(b0 b0Var, l lVar, androidx.lifecycle.u0 u0Var) {
        this.f56031b = b0Var;
        this.f56028a = u0Var;
        this.f56034c = new a(b0Var, this, 0);
        this.f56037d = new a(b0Var, this, 1);
        this.f56040e = new a(b0Var, this, 2);
        this.f56043f = new a(b0Var, this, 3);
        this.f56046g = new a(b0Var, this, 4);
        this.f56049h = new a(b0Var, this, 5);
        this.f56052i = new a(b0Var, this, 6);
        this.f56055j = new a(b0Var, this, 7);
        this.f56058k = new a(b0Var, this, 8);
        this.f56061l = new a(b0Var, this, 9);
        this.f56064m = new a(b0Var, this, 10);
        this.f56067n = new a(b0Var, this, 11);
        this.f56070o = new a(b0Var, this, 12);
        this.f56073p = new a(b0Var, this, 13);
        this.f56076q = new a(b0Var, this, 14);
        this.f56079r = new a(b0Var, this, 15);
        this.f56082s = new a(b0Var, this, 16);
        this.f56085t = new a(b0Var, this, 17);
        this.f56087u = new a(b0Var, this, 18);
        this.f56089v = new a(b0Var, this, 19);
        this.f56091w = new a(b0Var, this, 20);
        this.f56093x = new a(b0Var, this, 21);
        this.f56095y = new a(b0Var, this, 22);
        this.f56097z = new a(b0Var, this, 23);
        this.A = new a(b0Var, this, 24);
        this.B = new a(b0Var, this, 25);
        this.C = new a(b0Var, this, 26);
        this.D = new a(b0Var, this, 27);
        this.E = new a(b0Var, this, 28);
        this.F = new a(b0Var, this, 29);
        this.G = new a(b0Var, this, 30);
        this.H = new a(b0Var, this, 31);
        this.I = new a(b0Var, this, 32);
        this.J = new a(b0Var, this, 33);
        this.K = new a(b0Var, this, 34);
        this.L = new a(b0Var, this, 35);
        this.M = new a(b0Var, this, 36);
        this.N = new a(b0Var, this, 37);
        this.O = new a(b0Var, this, 38);
        this.P = new a(b0Var, this, 39);
        this.Q = new a(b0Var, this, 40);
        this.R = new a(b0Var, this, 41);
        this.S = new a(b0Var, this, 42);
        this.T = new a(b0Var, this, 43);
        this.U = new a(b0Var, this, 44);
        this.V = new a(b0Var, this, 45);
        this.W = new a(b0Var, this, 46);
        this.X = new a(b0Var, this, 47);
        this.Y = new a(b0Var, this, 48);
        this.Z = new a(b0Var, this, 49);
        this.f56029a0 = new a(b0Var, this, 50);
        this.f56032b0 = new a(b0Var, this, 51);
        this.f56035c0 = new a(b0Var, this, 52);
        this.f56038d0 = new a(b0Var, this, 53);
        this.f56041e0 = new a(b0Var, this, 54);
        this.f56044f0 = new a(b0Var, this, 55);
        this.f56047g0 = new a(b0Var, this, 56);
        this.f56050h0 = new a(b0Var, this, 57);
        this.f56053i0 = new a(b0Var, this, 58);
        this.f56056j0 = new a(b0Var, this, 59);
        this.f56059k0 = new a(b0Var, this, 60);
        this.f56062l0 = new a(b0Var, this, 61);
        this.f56065m0 = new a(b0Var, this, 62);
        this.f56068n0 = new a(b0Var, this, 63);
        this.f56071o0 = new a(b0Var, this, 64);
        this.f56074p0 = new a(b0Var, this, 65);
        this.f56077q0 = new a(b0Var, this, 66);
        this.f56080r0 = new a(b0Var, this, 67);
        this.f56083s0 = new a(b0Var, this, 68);
        this.f56086t0 = new a(b0Var, this, 69);
        this.f56088u0 = new a(b0Var, this, 70);
        this.f56090v0 = new a(b0Var, this, 71);
        this.f56092w0 = new a(b0Var, this, 72);
        this.f56094x0 = new a(b0Var, this, 73);
        this.f56096y0 = new a(b0Var, this, 74);
        this.f56098z0 = new a(b0Var, this, 75);
        this.A0 = new a(b0Var, this, 76);
        this.B0 = new a(b0Var, this, 77);
        this.C0 = new a(b0Var, this, 78);
        this.D0 = new a(b0Var, this, 79);
        this.E0 = new a(b0Var, this, 80);
        this.F0 = new a(b0Var, this, 81);
        this.G0 = new a(b0Var, this, 82);
        this.H0 = new a(b0Var, this, 83);
        this.I0 = new a(b0Var, this, 84);
        this.J0 = new a(b0Var, this, 85);
        this.K0 = new a(b0Var, this, 86);
        this.L0 = new a(b0Var, this, 87);
        this.M0 = new a(b0Var, this, 88);
        this.N0 = new a(b0Var, this, 89);
        this.O0 = new a(b0Var, this, 90);
        this.P0 = new a(b0Var, this, 91);
        this.Q0 = new a(b0Var, this, 92);
        this.R0 = new a(b0Var, this, 93);
        this.S0 = new a(b0Var, this, 94);
        this.T0 = new a(b0Var, this, 95);
        this.U0 = new a(b0Var, this, 96);
        this.V0 = new a(b0Var, this, 97);
        this.W0 = new a(b0Var, this, 98);
        this.X0 = new a(b0Var, this, 99);
        this.Y0 = new a(b0Var, this, 100);
        this.Z0 = new a(b0Var, this, 101);
        this.f56030a1 = new a(b0Var, this, 102);
        this.f56033b1 = new a(b0Var, this, 103);
        this.f56036c1 = new a(b0Var, this, 104);
        this.f56039d1 = new a(b0Var, this, 105);
        this.f56042e1 = new a(b0Var, this, 106);
        this.f56045f1 = new a(b0Var, this, 107);
        this.f56048g1 = new a(b0Var, this, 108);
        this.f56051h1 = new a(b0Var, this, 109);
        this.f56054i1 = new a(b0Var, this, 110);
        this.f56057j1 = new a(b0Var, this, 111);
        this.f56060k1 = new a(b0Var, this, 112);
        this.f56063l1 = new a(b0Var, this, 113);
        this.f56066m1 = new a(b0Var, this, 114);
        this.f56069n1 = new a(b0Var, this, 115);
        this.f56072o1 = new a(b0Var, this, 116);
        this.f56075p1 = new a(b0Var, this, 117);
        this.f56078q1 = new a(b0Var, this, 118);
        this.f56081r1 = new a(b0Var, this, 119);
        this.f56084s1 = new a(b0Var, this, 120);
    }

    static or.c A(f1 f1Var) {
        nr.e y82;
        y82 = f1Var.f56031b.y8();
        return new or.c(y82);
    }

    static th.y A0(f1 f1Var) {
        dagger.internal.d dVar;
        b0 b0Var = f1Var.f56031b;
        dVar = b0Var.f50204m0;
        return new th.y((vf.c) b0Var.f50144c0.get(), (AccountSessionRepository) b0Var.f50216o0.get(), (SessionRemoteRepository) dVar.get());
    }

    static wg0.a B(f1 f1Var) {
        return new wg0.a(b0.m4(f1Var.f56031b));
    }

    static gg.b B0(f1 f1Var) {
        dagger.internal.d dVar;
        b0 b0Var = f1Var.f56031b;
        dVar = b0Var.f50235r1;
        return new gg.b(gk0.c.a(b0Var.f50131a), (yf.d) b0Var.f50168g0.get(), new lg.e((AccountRemoteRepository) dVar.get()), new lg.g(b0Var.i()));
    }

    static d60.a C(f1 f1Var) {
        return new d60.a(f1Var.O0());
    }

    static v30.c D(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new v30.c(new v30.j((i30.b) b0Var.enrolledRepository(), b0Var.getMostRecentEnrolledProgramLastUpdateUseCase(), b0Var.fetchTasksProgramByIdUseCase()));
    }

    static oz.i D0(f1 f1Var) {
        return new oz.i((cz.b0) f1Var.f56031b.Y3.get());
    }

    static th.r E(f1 f1Var) {
        dagger.internal.d dVar;
        dVar = f1Var.f56031b.f50235r1;
        return new th.r((AccountRemoteRepository) dVar.get());
    }

    static gg.c E0(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new gg.c((yf.f) b0Var.f50168g0.get(), (tf.c) b0Var.D.get(), b0.g8(b0Var));
    }

    static vf.f F(f1 f1Var) {
        dagger.internal.d dVar;
        b0 b0Var = f1Var.f56031b;
        jg.a W4 = b0.W4(b0Var);
        dVar = b0Var.f50235r1;
        return new vf.f((vf.c) b0Var.f50144c0.get(), (AccountSessionRepository) b0Var.f50216o0.get(), W4, (AccountRemoteRepository) dVar.get(), f1Var.N0());
    }

    static th.z F0(f1 f1Var) {
        dagger.internal.d dVar;
        dVar = f1Var.f56031b.f50235r1;
        return new th.z((AccountRemoteRepository) dVar.get());
    }

    static ni.a G(f1 f1Var) {
        dagger.internal.d dVar;
        dVar = f1Var.f56031b.L3;
        return new ni.a((mi.a) dVar.get());
    }

    static hg.c G0(f1 f1Var) {
        return new hg.c(b0.E7(f1Var.f56031b));
    }

    static n90.r H(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new n90.r(gk0.c.a(b0Var.f50131a), b0.A4(b0Var), new vy.a(b0.V6(f1Var.f56031b)));
    }

    static hg.d H0(f1 f1Var) {
        return new hg.d(b0.E7(f1Var.f56031b));
    }

    static yl.a I(f1 f1Var) {
        dagger.internal.d dVar;
        dVar = f1Var.f56031b.Q1;
        return new yl.a((vl.f) dVar.get());
    }

    static d60.d I0(f1 f1Var) {
        return new d60.d(f1Var.O0());
    }

    static com.withings.nervehealth.ui.usecases.g J(f1 f1Var) {
        return new com.withings.nervehealth.ui.usecases.g(fl.p.f67672b.a(), (kn.e) f1Var.f56031b.f50251u.get());
    }

    static d60.e J0(f1 f1Var) {
        return new d60.e(f1Var.O0());
    }

    static b40.b K(f1 f1Var) {
        return new b40.b(b0.V4(f1Var.f56031b));
    }

    static hg.e K0(f1 f1Var) {
        return new hg.e(b0.E7(f1Var.f56031b));
    }

    static fn.a L(f1 f1Var) {
        return new fn.a(gk0.c.a(f1Var.f56031b.f50131a));
    }

    static n90.v L0(f1 f1Var) {
        return new n90.v(gk0.c.a(f1Var.f56031b.f50131a), new ah.c0());
    }

    static or.f M(f1 f1Var) {
        nr.e y82;
        y82 = f1Var.f56031b.y8();
        return new or.f(y82);
    }

    private n90.g M0() {
        b0 b0Var = this.f56031b;
        return new n90.g(gk0.c.a(b0Var.f50131a), b0.V6(b0Var));
    }

    static or.g N(f1 f1Var) {
        nr.e y82;
        y82 = f1Var.f56031b.y8();
        return new or.g(y82);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public uf.a N0() {
        b0 b0Var = this.f56031b;
        return new uf.a((tf.a) b0Var.B.get(), (tf.c) b0Var.D.get(), (AccountSessionRepository) b0Var.f50216o0.get());
    }

    static oz.g O(f1 f1Var) {
        dagger.internal.d dVar;
        dVar = f1Var.f56031b.f50134a2;
        return new oz.g((iw.a) dVar.get());
    }

    private b60.a O0() {
        b0 b0Var = this.f56031b;
        return new b60.a(gk0.c.a(b0Var.f50131a), (Webservices) b0Var.f50156e0.get());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ah.d, java.lang.Object] */
    static xv.b P(f1 f1Var) {
        f1Var.getClass();
        return new xv.b((qt.b) f1Var.f56031b.W1.get(), new Object());
    }

    static GetLeaderBoardItemUseCase Q(f1 f1Var) {
        f1Var.getClass();
        LeaderboardManager leaderboardManager = LeaderboardManager.Companion.get();
        ah.p.d(leaderboardManager);
        return new GetLeaderBoardItemUseCase(leaderboardManager, (m70.i) f1Var.f56031b.f50258v0.get(), new FilterLeaderBoardEntryUseCase());
    }

    static n90.s R(f1 f1Var) {
        return new n90.s(new v90.f(gk0.c.a(f1Var.f56031b.f50131a), new vy.a(b0.V6(f1Var.f56031b))));
    }

    static di.a S(f1 f1Var) {
        dagger.internal.d dVar;
        dVar = f1Var.f56031b.S1;
        return new di.a((zh.a) dVar.get());
    }

    static n10.a T(f1 f1Var) {
        return new n10.a(gk0.c.a(f1Var.f56031b.f50131a));
    }

    static i00.a U(f1 f1Var) {
        return new i00.a(fl.p.f67672b.a(), (kn.e) f1Var.f56031b.f50251u.get());
    }

    static i00.b V(f1 f1Var) {
        return new i00.b(fl.p.f67672b.a(), (kn.e) f1Var.f56031b.f50251u.get());
    }

    static b40.c W(f1 f1Var) {
        return new b40.c(b0.V4(f1Var.f56031b));
    }

    static aw.a X(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new aw.a((r70.c) b0Var.T0.get(), b0.P5(b0Var));
    }

    static aw.d Y(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new aw.d((r70.c) b0Var.T0.get(), (ActivityAggregateManager) b0Var.F1.get(), dl.a.a());
    }

    static or.h Z(f1 f1Var) {
        nr.e y82;
        y82 = f1Var.f56031b.y8();
        return new or.h(y82);
    }

    static v90.g a0(f1 f1Var) {
        return new v90.g((iy.e) f1Var.f56031b.L0.get());
    }

    static di.b b0(f1 f1Var) {
        dagger.internal.d dVar;
        dVar = f1Var.f56031b.S1;
        return new di.b((zh.a) dVar.get());
    }

    static rt.c c0(f1 f1Var) {
        dagger.internal.d dVar;
        b0 b0Var = f1Var.f56031b;
        dVar = b0Var.Y1;
        return new rt.c((qt.b) b0Var.W1.get(), (qt.a) dVar.get());
    }

    static th.a d(f1 f1Var) {
        dagger.internal.d dVar;
        dagger.internal.d dVar2;
        lg.o f92;
        dagger.internal.d dVar3;
        q70.g d92;
        lg.o f93;
        b0 b0Var = f1Var.f56031b;
        Context a11 = gk0.c.a(b0Var.f50131a);
        h10.a aVar = (h10.a) b0Var.J.get();
        vf.c cVar = (vf.c) b0Var.f50144c0.get();
        l70.w wVar = (l70.w) b0Var.H.get();
        dVar = b0Var.f50235r1;
        AccountRemoteRepository accountRemoteRepository = (AccountRemoteRepository) dVar.get();
        dVar2 = b0Var.f50241s1;
        f92 = b0Var.f9();
        lg.c cVar2 = new lg.c(a11, (tf.b) dVar2.get(), cVar, f92, accountRemoteRepository, aVar, wVar);
        dVar3 = b0Var.f50235r1;
        d92 = b0Var.d9();
        b0 b0Var2 = f1Var.f56031b;
        q70.b bVar = new q70.b(b0Var2.i(), (r70.c) b0Var2.T0.get());
        q70.l lVar = new q70.l(b0Var2.i(), (r70.c) b0Var2.T0.get());
        f93 = b0Var.f9();
        return new th.a((vf.c) b0Var.f50144c0.get(), (m70.i) b0Var.f50258v0.get(), cVar2, (AccountRemoteRepository) dVar3.get(), (t00.d) b0Var.f50146c2.get(), d92, bVar, lVar, f93);
    }

    static GetUserPositionRankingUseCase d0(f1 f1Var) {
        f1Var.getClass();
        LeaderboardManager leaderboardManager = LeaderboardManager.Companion.get();
        ah.p.d(leaderboardManager);
        return new GetUserPositionRankingUseCase(new GetLeaderBoardItemUseCase(leaderboardManager, (m70.i) f1Var.f56031b.f50258v0.get(), new FilterLeaderBoardEntryUseCase()));
    }

    static cg.e e(f1 f1Var) {
        dagger.internal.d dVar;
        q70.g d92;
        dagger.internal.d dVar2;
        lg.o f92;
        b0 b0Var = f1Var.f56031b;
        dVar = b0Var.f50235r1;
        d92 = b0Var.d9();
        dVar2 = b0Var.f50241s1;
        f92 = b0Var.f9();
        b0 b0Var2 = f1Var.f56031b;
        return new cg.e(gk0.c.a(b0Var.f50131a), (AuthenticationService) ((b0.a) b0Var.f50174h0).get(), (vf.c) b0Var.f50144c0.get(), b0.g8(b0Var), (m70.i) b0Var.f50258v0.get(), (l70.w) b0Var.H.get(), (h10.a) b0Var.J.get(), (AccountRemoteRepository) dVar.get(), d92, (tf.b) dVar2.get(), f92, new q70.b(b0Var2.i(), (r70.c) b0Var2.T0.get()), new q70.l(b0Var2.i(), (r70.c) b0Var2.T0.get()));
    }

    static aw.i e0(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new aw.i((r70.c) b0Var.T0.get(), (iy.e) b0Var.L0.get(), (ky.c) b0Var.f50270x0.get(), dl.a.a());
    }

    static or.a f(f1 f1Var) {
        nr.e y82;
        y82 = f1Var.f56031b.y8();
        return new or.a(y82);
    }

    static aw.j f0(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new aw.j((r70.c) b0Var.T0.get(), b0.n8(b0Var));
    }

    static com.withings.weight.presentation.ui.b g(f1 f1Var) {
        f1Var.getClass();
        return new com.withings.weight.presentation.ui.b(gk0.c.a(f1Var.f56031b.f50131a));
    }

    static cg.g g0(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new cg.g((AuthenticationService) ((b0.a) b0Var.f50174h0).get(), b0.g8(b0Var), f1Var.N0());
    }

    static z30.a h(f1 f1Var) {
        return new z30.a(b0.u4(f1Var.f56031b));
    }

    static com.withings.wiscale2.settings.f0 h0(f1 f1Var) {
        return new com.withings.wiscale2.settings.f0(b0.m4(f1Var.f56031b));
    }

    static v30.a i(f1 f1Var) {
        g30.b u42 = b0.u4(f1Var.f56031b);
        b0 b0Var = f1Var.f56031b;
        return new v30.a(u42, new v30.j((i30.b) b0Var.enrolledRepository(), b0Var.getMostRecentEnrolledProgramLastUpdateUseCase(), b0Var.fetchTasksProgramByIdUseCase()));
    }

    static vg0.b i0(f1 f1Var) {
        dagger.internal.d dVar;
        b0 b0Var = f1Var.f56031b;
        dVar = b0Var.f50244s4;
        return new vg0.b((r70.c) b0Var.T0.get(), (r70.a) b0Var.E3.get(), (iz.c) dVar.get());
    }

    static th.e j(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new th.e((vf.c) b0Var.f50144c0.get(), (AccountSessionRepository) b0Var.f50216o0.get());
    }

    static vg0.e j0(f1 f1Var) {
        dagger.internal.d dVar;
        dVar = f1Var.f56031b.f50244s4;
        return new vg0.e((iz.c) dVar.get());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [w80.b, java.lang.Object] */
    static n90.a k(f1 f1Var) {
        return new n90.a(gk0.c.a(f1Var.f56031b.f50131a), f1Var.M0(), new Object());
    }

    static vg0.f k0(f1 f1Var) {
        f1Var.getClass();
        b0 b0Var = f1Var.f56031b;
        return new vg0.f(gk0.c.a(b0Var.f50131a), (m70.i) b0Var.f50258v0.get());
    }

    static n90.c l(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new n90.c(gk0.c.a(b0Var.f50131a), b0.V6(b0Var));
    }

    static hg.b l0(f1 f1Var) {
        return new hg.b(b0.E7(f1Var.f56031b));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.withings.weight.android.usecases.ComputeLeanMassStateUseCase, java.lang.Object] */
    static n90.e m(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new n90.e(gk0.c.a(b0Var.f50131a), f1Var.M0(), new Object(), b0.V6(b0Var));
    }

    static d60.b m0(f1 f1Var) {
        return new d60.b(f1Var.O0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.weight.android.usecases.ComputeLeanMassStateUseCase, java.lang.Object] */
    static n90.f n(f1 f1Var) {
        f1Var.getClass();
        return new n90.f(new Object());
    }

    static LearnMoreManager n0(f1 f1Var) {
        f1Var.getClass();
        return new LearnMoreManager(gk0.c.a(f1Var.f56031b.f50131a));
    }

    static v90.c o(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new v90.c(b0.N6(b0Var), b0.C4(b0Var), b0.X7(b0Var));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.withings.wiscale2.device.hwa03bs.ui.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.camera.core.impl.utils.k, java.lang.Object] */
    static g90.a o0(f1 f1Var) {
        return new g90.a(new Object(), new Object(), b0.J5(f1Var.f56031b));
    }

    static com.withings.nervehealth.ui.usecases.a p(f1 f1Var) {
        return new com.withings.nervehealth.ui.usecases.a(gk0.c.a(f1Var.f56031b.f50131a));
    }

    static i00.e p0(f1 f1Var) {
        return new i00.e(b0.P6(f1Var.f56031b));
    }

    static n90.h q(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new n90.h(gk0.c.a(b0Var.f50131a), b0.V6(b0Var), new ah.c0(), b0.A4(b0Var));
    }

    static LoadOnDemandModuleUseCase q0(f1 f1Var) {
        return new LoadOnDemandModuleUseCase(gk0.c.a(f1Var.f56031b.f50131a));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [w80.c, java.lang.Object] */
    static n90.i r(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new n90.i(gk0.c.a(b0Var.f50131a), f1Var.M0(), new Object(), b0.V6(b0Var));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.withings.wiscale2.device.hwa03bs.ui.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.camera.core.impl.utils.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [w80.a, java.lang.Object] */
    static g90.b r0(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new g90.b(gk0.c.a(b0Var.f50131a), (xw.b) b0Var.K0.get(), b0.J5(b0Var), new Object(), new Object(), new Object());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w80.c, java.lang.Object] */
    static n90.j s(f1 f1Var) {
        f1Var.getClass();
        return new n90.j(new Object());
    }

    static cg.i s0(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new cg.i((AuthenticationService) ((b0.a) b0Var.f50174h0).get(), b0.g8(b0Var), f1Var.N0());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.withings.weight.android.usecases.ComputeWaterMassStateUseCase, java.lang.Object] */
    static n90.k t(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new n90.k(gk0.c.a(b0Var.f50131a), f1Var.M0(), new Object(), b0.V6(b0Var));
    }

    static th.t t0(f1 f1Var) {
        dagger.internal.d dVar;
        dVar = f1Var.f56031b.f50204m0;
        return new th.t((SessionRemoteRepository) dVar.get());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.weight.android.usecases.ComputeWaterMassStateUseCase, java.lang.Object] */
    static n90.l u(f1 f1Var) {
        f1Var.getClass();
        return new n90.l(new Object());
    }

    static cg.j u0(f1 f1Var) {
        b0 b0Var = f1Var.f56031b;
        return new cg.j((AuthenticationService) ((b0.a) b0Var.f50174h0).get(), b0.g8(b0Var), f1Var.N0());
    }

    static th.f v(f1 f1Var) {
        dagger.internal.d dVar;
        dagger.internal.d dVar2;
        b0 b0Var = f1Var.f56031b;
        dVar = b0Var.f50204m0;
        dVar2 = b0Var.f50235r1;
        return new th.f((vf.c) b0Var.f50144c0.get(), (AccountSessionRepository) b0Var.f50216o0.get(), (SessionRemoteRepository) dVar.get(), (AccountRemoteRepository) dVar2.get());
    }

    static s10.b v0(f1 f1Var) {
        return new s10.b(fl.p.f67672b.a(), (kn.e) f1Var.f56031b.f50251u.get());
    }

    static th.l w(f1 f1Var) {
        dagger.internal.d dVar;
        b0 b0Var = f1Var.f56031b;
        dVar = b0Var.f50204m0;
        return new th.l((AccountSessionRepository) b0Var.f50216o0.get(), (SessionRemoteRepository) dVar.get());
    }

    static lz.m w0(f1 f1Var) {
        return new lz.m(gk0.c.a(f1Var.f56031b.f50131a));
    }

    static th.m x(f1 f1Var) {
        dagger.internal.d dVar;
        b0 b0Var = f1Var.f56031b;
        uf.a N0 = f1Var.N0();
        jg.a W4 = b0.W4(b0Var);
        dVar = b0Var.f50235r1;
        return new th.m((vf.c) b0Var.f50144c0.get(), N0, W4, (AccountRemoteRepository) dVar.get());
    }

    static com.withings.nervehealth.ui.guidedscan.e0 x0(f1 f1Var) {
        return new com.withings.nervehealth.ui.guidedscan.e0(gk0.c.a(f1Var.f56031b.f50131a));
    }

    static th.q y(f1 f1Var) {
        dagger.internal.d dVar;
        dVar = f1Var.f56031b.f50235r1;
        return new th.q((AccountRemoteRepository) dVar.get());
    }

    static i00.f y0(f1 f1Var) {
        return new i00.f((PlatformFeatureRepository) f1Var.f56031b.f50263w.get());
    }

    static lg.d z(f1 f1Var) {
        dagger.internal.d dVar;
        b0 b0Var = f1Var.f56031b;
        jg.a W4 = b0.W4(b0Var);
        dVar = b0Var.f50235r1;
        return new lg.d((vf.c) b0Var.f50144c0.get(), W4, (AccountRemoteRepository) dVar.get());
    }

    static th.u z0(f1 f1Var) {
        dagger.internal.d dVar;
        b0 b0Var = f1Var.f56031b;
        dVar = b0Var.f50235r1;
        return new th.u((AccountRemoteRepository) dVar.get(), (t00.d) b0Var.f50146c2.get(), b0Var.o8());
    }

    @Override // fk0.c.d
    public final Map<String, Provider<androidx.lifecycle.g1>> a() {
        x.a b10 = com.google.common.collect.x.b(121);
        b10.e("com.withings.sharing.datasharing.acceptinvitation.AcceptInvitationViewModel", this.f56034c);
        b10.e("com.withings.authentication.accountConsent.AccountConsentViewModel", this.f56037d);
        b10.e("com.withings.authentication.accountConsent.AccountLoginConsentViewModel", this.f56040e);
        b10.e("com.withings.authentication.deactivation.AccountReactivationViewModel", this.f56043f);
        b10.e("com.withings.programs.viewmodel.AchieveViewModel", this.f56046g);
        b10.e("com.withings.measurements.ui.ActivityVerticalViewModel", this.f56049h);
        b10.e("com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddCervicalMucusViewModel", this.f56052i);
        b10.e("com.withings.manualLogging.ui.feature.addNote.mood.AddMoodViewModel", this.f56055j);
        b10.e("com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSexualActivityViewModel", this.f56058k);
        b10.e("com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSymptomsViewModel", this.f56061l);
        b10.e("com.withings.tutorials.ui.screens.modes.athlete.AthleteModeViewModel", this.f56064m);
        b10.e("com.withings.device.details.automatic.activity.detection.AutomaticActivityDetectionViewModel", this.f56067n);
        b10.e("com.withings.badge.detail.BadgeDetailViewModel", this.f56070o);
        b10.e("com.withings.badge.list.BadgesViewModel", this.f56073p);
        b10.e("com.withings.weight.presentation.viewmodel.BodyCompViewModel", this.f56076q);
        b10.e("com.withings.measurements.ui.BodyVerticalViewModel", this.f56079r);
        b10.e("com.withings.healthplus.congrats.ui.viewmodel.BookmarkLayoutViewModel", this.f56082s);
        b10.e("com.withings.wiscale2.account.password.ChangePasswordViewModel", this.f56085t);
        b10.e("com.withings.authentication.accountConsent.ChineseDataProtectionViewModel", this.f56087u);
        b10.e("com.withings.account.ui.vm.CodeInputViewModel", this.f56089v);
        b10.e("com.withings.healthplus.congrats.ui.viewmodel.CompletionActivityViewModel", this.f56091w);
        b10.e("com.withings.paywall.confirmation.ConfirmSubscriptionViewModel", this.f56093x);
        b10.e("com.withings.contentfavorite.viewmodel.ContentFavoriteBadgeViewModel", this.f56095y);
        b10.e("com.withings.contentfavorite.viewmodel.ContentFavoriteListViewModel", this.f56097z);
        b10.e("com.withings.contentfavorite.viewmodel.ContentFavoriteViewModel", this.A);
        b10.e("com.withings.healthplus.contentscreens.ui.viewmodel.ContentScreenViewModel", this.B);
        b10.e("com.withings.healthplus.contentscreens.ui.viewmodel.ContentWorkoutPlayerViewModel", this.C);
        b10.e("com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleDataStorageViewModel", this.D);
        b10.e("com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel", this.E);
        b10.e("com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleSymptomsViewModel", this.F);
        b10.e("com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel", this.G);
        b10.e("com.withings.cycletracking.ui.viewmodel.CycleTrackingHistoryViewModel", this.H);
        b10.e("com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel", this.I);
        b10.e("com.withings.wiscale2.dashboard.DashboardViewModel", this.J);
        b10.e("com.withings.tutorials.ui.DeviceIntroductionViewModel", this.K);
        b10.e("com.withings.ecg.details.EcgInReviewViewModel", this.L);
        b10.e("com.withings.wiscale2.account.email.EmailModificationViewModel", this.M);
        b10.e("com.withings.healthplus.completion.program.ui.viewmodel.EndProgramViewModel", this.N);
        b10.e("com.withings.tutorials.ui.screens.explanations.ExplanationsViewModel", this.O);
        b10.e("com.withings.healthplus.explore.ui.viewmodel.ExploreTabViewModel", this.P);
        b10.e("com.withings.tutorials.ui.screens.modes.eyesclosed.EyesClosedModeViewModel", this.Q);
        b10.e("com.withings.healthplus.contentscreens.ui.viewmodel.FavoriteViewModel", this.R);
        b10.e("com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel", this.S);
        b10.e("com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel", this.T);
        b10.e("com.withings.measurements.ui.verticals.HealthVerticalActivityViewModel", this.U);
        b10.e("com.withings.measurements.ui.HeartVerticalViewModel", this.V);
        b10.e("com.withings.wiscale2.home.homeV2.HomeViewModel", this.W);
        b10.e("com.withings.survey.viewModel.InAppSurveyViewModel", this.X);
        b10.e("com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel", this.Y);
        b10.e("com.withings.leaderboard.ui.screen.viewmodels.LeaderBoardItemViewModel", this.Z);
        b10.e("com.withings.leaderboard.ui.LeaderboardViewModel", this.f56029a0);
        b10.e("com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel", this.f56032b0);
        b10.e("com.withings.account.ui.vm.LoadingSensitiveActionViewModel", this.f56035c0);
        b10.e("com.withings.wiscale2.accountV2.ui.LoggedOutViewModel", this.f56038d0);
        b10.e("com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel", this.f56041e0);
        b10.e("com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.ManualLogEntryViewModel", this.f56044f0);
        b10.e("com.withings.measurements.ui.MeasurementsViewModel", this.f56047g0);
        b10.e("com.withings.authentication.mfa.resolve.MfaResolutionViewModel", this.f56050h0);
        b10.e("com.withings.missions.ui.viewmodels.MissionActivityViewModel", this.f56053i0);
        b10.e("com.withings.healthplus.completion.common.ui.viewmodel.MissionContentCompletionViewModel", this.f56056j0);
        b10.e("com.withings.account.ui.vm.MultiAccountSelectionViewModel", this.f56059k0);
        b10.e("com.withings.wiscale2.mydevices.MyDevicesViewModel", this.f56062l0);
        b10.e("com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel", this.f56065m0);
        b10.e("com.withings.nervehealth.ui.NerveHealthViewModel", this.f56068n0);
        b10.e("com.withings.notifications.ui.viewmodels.NotificationActivityViewModel", this.f56071o0);
        b10.e("com.withings.notifications.ui.NotificationSectionViewModel", this.f56074p0);
        b10.e("com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel", this.f56077q0);
        b10.e("com.withings.healthplus.explore.ui.viewmodel.NutritionSheetViewModel", this.f56080r0);
        b10.e("com.withings.measurements.ui.NutritionVerticalViewModel", this.f56083s0);
        b10.e("com.withings.tutorials.ui.screens.modes.pacemaker.PacemakerModeViewModel", this.f56086t0);
        b10.e("com.withings.account.ui.vm.PasswordInputViewModel", this.f56088u0);
        b10.e("com.withings.authentication.pickerUser.PickUserViewModel", this.f56090v0);
        b10.e("com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel", this.f56092w0);
        b10.e("com.withings.badge.profile.ProfileBadgeCarouselViewModel", this.f56094x0);
        b10.e("com.withings.healthplus.completion.program.ui.viewmodel.ProgramCompletionViewModel", this.f56096y0);
        b10.e("com.withings.healthplus.completion.common.ui.viewmodel.ProgramContentCompletionViewModel", this.f56098z0);
        b10.e("com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel", this.A0);
        b10.e("com.withings.programs.viewmodel.ProgramOverviewViewModel", this.B0);
        b10.e("com.withings.account.ui.vm.RecoveryTwoFaViewModel", this.C0);
        b10.e("com.withings.reminder.ringing.ReminderRingingViewModel", this.D0);
        b10.e("com.withings.account.ui.vm.ResolveTwoFaViewModel", this.E0);
        b10.e("com.withings.authentication.mfa.ResolveTwoFactorViewModel", this.F0);
        b10.e("com.withings.measurements.ui.RespiratoryVerticalViewModel", this.G0);
        b10.e("com.withings.scalesmodes.ui.ScalesModeViewModel", this.H0);
        b10.e("com.withings.leaderboard.ui.ScanFriendCodeActivity$ScanFriendCodeViewModel", this.I0);
        b10.e("com.withings.account.ui.vm.SeeOptionViewModel", this.J0);
        b10.e("com.withings.tutorials.ui.screens.SegmentalBodyCompositionTutorialViewModel", this.K0);
        b10.e("com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel", this.L0);
        b10.e("com.withings.sharing.datasharing.sendinvitation.SelectTimeViewModel", this.M0);
        b10.e("com.withings.sharing.datasharing.sendinvitation.SendInvitationViewModel", this.N0);
        b10.e("com.withings.tutorials.ui.screens.SetHealthGoalViewModel", this.O0);
        b10.e("com.withings.authentication.mfa.SettingsMfaViewModel", this.P0);
        b10.e("com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel", this.Q0);
        b10.e("com.withings.authentication.mfa.recovery.settings.SettingsRecoveryCodeViewModel", this.R0);
        b10.e("com.withings.wiscale2.settings.SettingsViewModel", this.S0);
        b10.e("com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel", this.T0);
        b10.e("com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel", this.U0);
        b10.e("com.withings.device.setup.ui.activity.SetupViewModel", this.V0);
        b10.e("com.withings.measurements.ui.SexualHealthVerticalViewModel", this.W0);
        b10.e("com.withings.measurements.ui.SleepVerticalViewModel", this.X0);
        b10.e("com.withings.overview.ui.StartTrackingViewModel", this.Y0);
        b10.e("com.withings.paywall.subscription.SubscriptionViewModel", this.Z0);
        b10.e("com.withings.healthplus.contentscreens.ui.viewmodel.SuggestWorkoutLaunchOnWatchViewModel", this.f56030a1);
        b10.e("com.withings.healthplus.contentscreens.ui.viewmodel.SwapViewModel", this.f56033b1);
        b10.e("com.withings.authentication.mfa.totp.TotpViewModel", this.f56036c1);
        b10.e("com.withings.wiscale2.settings.TracesLogsViewModel", this.f56039d1);
        b10.e("com.withings.authentication.tryToLogin.mail.TryToLoginViewModel", this.f56042e1);
        b10.e("com.withings.tutorials.ui.TutorialViewModel", this.f56045f1);
        b10.e("com.withings.authentication.mfa.TwoFactorMultiAccountViewModel", this.f56048g1);
        b10.e("com.withings.wiscale2.settings.UnitsActivityViewModel", this.f56051h1);
        b10.e("com.withings.authentication.userCreation.UserCreationViewModel", this.f56054i1);
        b10.e("com.withings.account.ui.vm.VerifyGoogleAuthenticationSensitiveViewModel", this.f56057j1);
        b10.e("com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel", this.f56060k1);
        b10.e("com.withings.nutrisync.ui.viewmodel.VitaminCViewModel", this.f56063l1);
        b10.e("com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel", this.f56066m1);
        b10.e("com.withings.tutorials.ui.screens.wallhandlemount.WallHandleMountViewModel", this.f56069n1);
        b10.e("com.withings.weight.presentation.ui.WeightExploreDataViewModel", this.f56072o1);
        b10.e("com.withings.weight.presentation.viewmodel.WeightViewModel", this.f56075p1);
        b10.e("com.withings.wiscale2.settings.WithingsAdvertisingViewModel", this.f56078q1);
        b10.e("com.withings.healthplus.explore.ui.viewmodel.WorkoutPlayerViewModel", this.f56081r1);
        b10.e("com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing.Wpa02CleansingModeViewModel", this.f56084s1);
        return b10.a();
    }

    @Override // fk0.c.d
    public final Map<String, Object> b() {
        return com.google.common.collect.x.j();
    }
}
