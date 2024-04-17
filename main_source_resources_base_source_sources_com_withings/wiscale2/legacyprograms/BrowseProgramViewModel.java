package com.withings.wiscale2.legacyprograms;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.enrolled.EnrolledIteration;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.user.User;
import dp0.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import x30.h;
/* compiled from: BrowseProgramActivity.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B=\b\u0007\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b3\u00104J\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00020,8\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/BrowseProgramViewModel;", "Landroidx/lifecycle/g1;", "", "Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "filterHyResultProgram", "(Ljava/util/List;)Ljava/util/List;", "filterOnGoingLeaderBoardProgram", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "filterOnGoingEnrolledPrograms", "", NavigationArguments.PROGRAM_ID, "Lnm0/y;", "archiveProgram", "(I)V", "", "syncContext", "synchronizeEnrolledPrograms", "(Ljava/lang/String;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "getUser", "()Lcom/withings/user/User;", "Lx30/c;", "getAllProgramsByUserUseCase", "Lx30/c;", "Lj30/c;", "enrolledRepository", "Lj30/c;", "Lx30/h;", "getMostRecentEnrolledProgramLastUpdateUseCase", "Lx30/h;", "Lv30/b;", "fetchTasksProgramByIdUseCase", "Lv30/b;", "Landroidx/lifecycle/k0;", "", "refreshLiveData", "Landroidx/lifecycle/k0;", "getRefreshLiveData", "()Landroidx/lifecycle/k0;", "Landroidx/lifecycle/LiveData;", "wellnessPrograms", "Landroidx/lifecycle/LiveData;", "", "remainingProgramsItems", "getRemainingProgramsItems", "()Landroidx/lifecycle/LiveData;", "<init>", "(Landroid/content/Context;Lcom/withings/user/User;Lx30/c;Lj30/c;Lx30/h;Lv30/b;)V", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BrowseProgramViewModel extends g1 {
    public static final String HCONV_EXTENSION = "hconv";
    public static final String HY_RESULT_TARGET_VALUE = "withings-bd2://programs/hyresult";
    public static final String LEADERBOARD_TARGET_VALUE = "withings-bd2://programs/leaderboard";
    private final Context context;
    private final j30.c enrolledRepository;
    private final v30.b fetchTasksProgramByIdUseCase;
    private final x30.c getAllProgramsByUserUseCase;
    private final h getMostRecentEnrolledProgramLastUpdateUseCase;
    private final k0<Boolean> refreshLiveData;
    private final LiveData<List<Object>> remainingProgramsItems;
    private final User user;
    private final LiveData<List<ProgramDomain.LegacyDomain>> wellnessPrograms;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BrowseProgramActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/BrowseProgramViewModel$Companion;", "", "()V", "HCONV_EXTENSION", "", "HY_RESULT_TARGET_VALUE", "LEADERBOARD_TARGET_VALUE", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public BrowseProgramViewModel(Context context, User user, x30.c getAllProgramsByUserUseCase, j30.c enrolledRepository, h getMostRecentEnrolledProgramLastUpdateUseCase, v30.b fetchTasksProgramByIdUseCase) {
        u.j(context, "context");
        u.j(user, "user");
        u.j(getAllProgramsByUserUseCase, "getAllProgramsByUserUseCase");
        u.j(enrolledRepository, "enrolledRepository");
        u.j(getMostRecentEnrolledProgramLastUpdateUseCase, "getMostRecentEnrolledProgramLastUpdateUseCase");
        u.j(fetchTasksProgramByIdUseCase, "fetchTasksProgramByIdUseCase");
        this.context = context;
        this.user = user;
        this.getAllProgramsByUserUseCase = getAllProgramsByUserUseCase;
        this.enrolledRepository = enrolledRepository;
        this.getMostRecentEnrolledProgramLastUpdateUseCase = getMostRecentEnrolledProgramLastUpdateUseCase;
        this.fetchTasksProgramByIdUseCase = fetchTasksProgramByIdUseCase;
        k0<Boolean> b10 = xw.d.b(Boolean.TRUE);
        this.refreshLiveData = b10;
        j0 c11 = e1.c(b10, new BrowseProgramViewModel$wellnessPrograms$1(this));
        this.wellnessPrograms = c11;
        this.remainingProgramsItems = e1.c(c11, new BrowseProgramViewModel$remainingProgramsItems$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ProgramDomain.LegacyDomain> filterHyResultProgram(List<ProgramDomain.LegacyDomain> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!j.r(((ProgramDomain.LegacyDomain) obj).getTargetValue(), HY_RESULT_TARGET_VALUE, false)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ProgramDomain.LegacyDomain> filterOnGoingEnrolledPrograms(List<ProgramDomain.LegacyDomain> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            List<EnrolledIteration> iterations = ((ProgramDomain.LegacyDomain) obj).getEnrolled().getIterations();
            if (iterations != null) {
                List<EnrolledIteration> list2 = iterations;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (EnrolledIteration enrolledIteration : list2) {
                        if (!enrolledIteration.isFinishedOrArchived()) {
                            break;
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007d -> B:22:0x0080). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008a -> B:26:0x008b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object filterOnGoingLeaderBoardProgram(java.util.List<com.withings.programs.model.program.ProgramDomain.LegacyDomain> r9, qm0.d<? super java.util.List<com.withings.programs.model.program.ProgramDomain.LegacyDomain>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.withings.wiscale2.legacyprograms.BrowseProgramViewModel$filterOnGoingLeaderBoardProgram$1
            if (r0 == 0) goto L13
            r0 = r10
            com.withings.wiscale2.legacyprograms.BrowseProgramViewModel$filterOnGoingLeaderBoardProgram$1 r0 = (com.withings.wiscale2.legacyprograms.BrowseProgramViewModel$filterOnGoingLeaderBoardProgram$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.wiscale2.legacyprograms.BrowseProgramViewModel$filterOnGoingLeaderBoardProgram$1 r0 = new com.withings.wiscale2.legacyprograms.BrowseProgramViewModel$filterOnGoingLeaderBoardProgram$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r9 = r0.L$3
            java.lang.Object r2 = r0.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.L$1
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.L$0
            com.withings.wiscale2.legacyprograms.BrowseProgramViewModel r6 = (com.withings.wiscale2.legacyprograms.BrowseProgramViewModel) r6
            nm0.l.b(r10)
            goto L80
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            nm0.l.b(r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
            r6 = r8
            r2 = r9
            r5 = r10
        L4f:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L91
            java.lang.Object r9 = r2.next()
            r10 = r9
            com.withings.programs.model.program.ProgramDomain$LegacyDomain r10 = (com.withings.programs.model.program.ProgramDomain.LegacyDomain) r10
            java.lang.String r10 = r10.getTargetValue()
            java.lang.String r7 = "withings-bd2://programs/leaderboard"
            boolean r10 = dp0.j.r(r10, r7, r3)
            if (r10 == 0) goto L8a
            com.withings.leaderboard.repositories.data.LeaderboardProgramPrefs r10 = new com.withings.leaderboard.repositories.data.LeaderboardProgramPrefs
            android.content.Context r7 = r6.context
            r10.<init>(r7)
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r9
            r0.label = r4
            java.lang.Object r10 = r10.isLeaderboardActivate(r0)
            if (r10 != r1) goto L80
            return r1
        L80:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8a
            r10 = r4
            goto L8b
        L8a:
            r10 = r3
        L8b:
            if (r10 != 0) goto L4f
            r5.add(r9)
            goto L4f
        L91:
            java.util.List r5 = (java.util.List) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.legacyprograms.BrowseProgramViewModel.filterOnGoingLeaderBoardProgram(java.util.List, qm0.d):java.lang.Object");
    }

    public final void archiveProgram(int i11) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new BrowseProgramViewModel$archiveProgram$1(this, i11, null), 2, null);
    }

    public final k0<Boolean> getRefreshLiveData() {
        return this.refreshLiveData;
    }

    public final LiveData<List<Object>> getRemainingProgramsItems() {
        return this.remainingProgramsItems;
    }

    public final User getUser() {
        return this.user;
    }

    public final void synchronizeEnrolledPrograms(String syncContext) {
        u.j(syncContext, "syncContext");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new BrowseProgramViewModel$synchronizeEnrolledPrograms$1(this, syncContext, null), 2, null);
    }
}
