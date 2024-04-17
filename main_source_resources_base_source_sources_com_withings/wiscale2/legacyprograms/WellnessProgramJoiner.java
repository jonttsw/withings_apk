package com.withings.wiscale2.legacyprograms;

import ah.o;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.program.EligibilityDomain;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.user.User;
import com.withings.webservices.legacy.Webservices;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import oi0.f;
import x30.j;
/* compiled from: WellnessProgramJoiner.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 12\u00020\u0001:\u000212BC\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b/\u00100J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0014\u0010\u000eJ\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0015\u0010\u000eJ\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0016\u0010\bR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoiner;", "", "Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "wellnessProgram", "Lnm0/y;", "startUrlToJoinProgram", "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;)V", "joinProgram", "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;Lqm0/d;)Ljava/lang/Object;", "", NavigationArguments.PROGRAM_ID, "Lnm0/k;", "Ltu/b;", "executeCallToJoin-gIAlu-s", "(ILqm0/d;)Ljava/lang/Object;", "executeCallToJoin", "", "syncEnrolledPrograms", "(Lqm0/d;)Ljava/lang/Object;", "Landroid/content/Intent;", "getProgramUrlAndOpen", "joinWithProgramId", "join", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "Lx30/j;", "getProgramByIdUseCase", "Lx30/j;", "Lkn/e;", "deviceManager", "Lkn/e;", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoiner$Delegate;", "delegate", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoiner$Delegate;", "Lcom/withings/webservices/legacy/Webservices;", "webservices", "Lcom/withings/webservices/legacy/Webservices;", "Loi0/b;", "wsSyncManager", "Loi0/b;", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoinerEntryPoint;", "entryPoint", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoinerEntryPoint;", "<init>", "(Landroid/content/Context;Lcom/withings/user/User;Lx30/j;Lkn/e;Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoiner$Delegate;Lcom/withings/webservices/legacy/Webservices;Loi0/b;)V", "Companion", "Delegate", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramJoiner {
    private static final String LEADERBOARD_TARGET_VALUE = "withings-bd2://programs/leaderboard";
    private static final int LOCAL_PROGRAM_TYPE = 2;
    private final Context context;
    private final Delegate delegate;
    private final kn.e deviceManager;
    private final WellnessProgramJoinerEntryPoint entryPoint;
    private final j getProgramByIdUseCase;
    private final User user;
    private final Webservices webservices;
    private final oi0.b wsSyncManager;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WellnessProgramJoiner.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoiner$Companion;", "", "()V", "LEADERBOARD_TARGET_VALUE", "", "LOCAL_PROGRAM_TYPE", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: WellnessProgramJoiner.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoiner$Delegate;", "", "Lnm0/y;", "onJoinStarted", "()V", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "onJoinSuccess", "(Landroid/content/Intent;)V", "onJoinFailed", "onMissingRequiredDevice", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public interface Delegate {
        void onJoinFailed();

        void onJoinStarted();

        void onJoinSuccess(Intent intent);

        void onMissingRequiredDevice();
    }

    public WellnessProgramJoiner(Context context, User user, j getProgramByIdUseCase, kn.e deviceManager, Delegate delegate, Webservices webservices, oi0.b wsSyncManager) {
        u.j(context, "context");
        u.j(user, "user");
        u.j(getProgramByIdUseCase, "getProgramByIdUseCase");
        u.j(deviceManager, "deviceManager");
        u.j(delegate, "delegate");
        u.j(webservices, "webservices");
        u.j(wsSyncManager, "wsSyncManager");
        this.context = context;
        this.user = user;
        this.getProgramByIdUseCase = getProgramByIdUseCase;
        this.deviceManager = deviceManager;
        this.delegate = delegate;
        this.webservices = webservices;
        this.wsSyncManager = wsSyncManager;
        Context applicationContext = context.getApplicationContext();
        u.i(applicationContext, "getApplicationContext(...)");
        this.entryPoint = (WellnessProgramJoinerEntryPoint) o.c(applicationContext, WellnessProgramJoinerEntryPoint.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* renamed from: executeCallToJoin-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m45executeCallToJoingIAlus(int r6, qm0.d<? super nm0.k<tu.b>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$executeCallToJoin$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$executeCallToJoin$1 r0 = (com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$executeCallToJoin$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$executeCallToJoin$1 r0 = new com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$executeCallToJoin$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            nm0.l.b(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$executeCallToJoin$2 r2 = new com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$executeCallToJoin$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            nm0.k r7 = (nm0.k) r7
            java.lang.Object r6 = r7.c()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.legacyprograms.WellnessProgramJoiner.m45executeCallToJoingIAlus(int, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getProgramUrlAndOpen(int i11, qm0.d<? super Intent> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WellnessProgramJoiner$getProgramUrlAndOpen$2(this, i11, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object joinProgram(ProgramDomain.LegacyDomain legacyDomain, qm0.d<Object> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WellnessProgramJoiner$joinProgram$2(legacyDomain, this, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startUrlToJoinProgram(ProgramDomain.LegacyDomain legacyDomain) {
        String url;
        EligibilityDomain eligibility = legacyDomain.getEligibility();
        if (eligibility != null && (url = eligibility.getUrl()) != null) {
            Context context = this.context;
            context.startActivity(HMWebActivity.f35395c.c(context, "", url));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object syncEnrolledPrograms(qm0.d<? super Boolean> dVar) {
        return f.b(this.wsSyncManager, new b30.d(this.user.q(), this.entryPoint.enrolledRepository(), this.entryPoint.getMostRecentEnrolledProgramLastUpdateUseCase(), this.entryPoint.fetchTasksProgramByIdUseCase()), dVar);
    }

    public final Object join(ProgramDomain.LegacyDomain legacyDomain, qm0.d<Object> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WellnessProgramJoiner$join$2(legacyDomain, this, null), dVar);
    }

    public final Object joinWithProgramId(int i11, qm0.d<Object> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WellnessProgramJoiner$joinWithProgramId$2(i11, this, null), dVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ WellnessProgramJoiner(android.content.Context r11, com.withings.user.User r12, x30.j r13, kn.e r14, com.withings.wiscale2.legacyprograms.WellnessProgramJoiner.Delegate r15, com.withings.webservices.legacy.Webservices r16, oi0.b r17, int r18, kotlin.jvm.internal.m r19) {
        /*
            r10 = this;
            r0 = r18 & 32
            java.lang.String r1 = "get(...)"
            if (r0 == 0) goto Lf
            com.withings.webservices.legacy.Webservices r0 = com.withings.webservices.legacy.Webservices.get()
            kotlin.jvm.internal.u.i(r0, r1)
            r8 = r0
            goto L11
        Lf:
            r8 = r16
        L11:
            r0 = r18 & 64
            if (r0 == 0) goto L1e
            oi0.b r0 = oi0.b.h()
            kotlin.jvm.internal.u.i(r0, r1)
            r9 = r0
            goto L20
        L1e:
            r9 = r17
        L20:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.legacyprograms.WellnessProgramJoiner.<init>(android.content.Context, com.withings.user.User, x30.j, kn.e, com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$Delegate, com.withings.webservices.legacy.Webservices, oi0.b, int, kotlin.jvm.internal.m):void");
    }
}
