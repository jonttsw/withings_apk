package com.withings.library.healthscore;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.healthscore.domain.health.CalculateHealthScoreUseCase;
import com.withings.library.healthscore.utils.HealthScoreInputsProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: HealthScoreServiceImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/withings/library/healthscore/HealthScoreServiceImpl;", "Lcom/withings/library/healthscore/HealthScoreService;", "", NavigationArguments.USER_ID, "dateOfScoreInMillis", "Lcom/withings/library/healthscore/models/HSResult;", "Lcom/withings/library/healthscore/models/HealthScores;", "getScores", "(JJLqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/healthscore/domain/health/CalculateHealthScoreUseCase;", "calculateHealthScoreUseCase", "Lcom/withings/library/healthscore/domain/health/CalculateHealthScoreUseCase;", "Lcom/withings/library/healthscore/utils/HealthScoreInputsProvider;", "healthScoreInputsProvider", "Lcom/withings/library/healthscore/utils/HealthScoreInputsProvider;", "<init>", "(Lcom/withings/library/healthscore/domain/health/CalculateHealthScoreUseCase;Lcom/withings/library/healthscore/utils/HealthScoreInputsProvider;)V", "Companion", "HealthScore_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HealthScoreServiceImpl implements HealthScoreService {
    public static final Companion Companion = new Companion(null);
    private static final int WEEKS_TO_PROCESS = 12;
    private static final int WEEKS_TO_PROCESS_FOR_HEART = 24;
    private final CalculateHealthScoreUseCase calculateHealthScoreUseCase;
    private final HealthScoreInputsProvider healthScoreInputsProvider;

    /* compiled from: HealthScoreServiceImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/withings/library/healthscore/HealthScoreServiceImpl$Companion;", "", "()V", "WEEKS_TO_PROCESS", "", "WEEKS_TO_PROCESS_FOR_HEART", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public HealthScoreServiceImpl(CalculateHealthScoreUseCase calculateHealthScoreUseCase, HealthScoreInputsProvider healthScoreInputsProvider) {
        u.j(calculateHealthScoreUseCase, "calculateHealthScoreUseCase");
        u.j(healthScoreInputsProvider, "healthScoreInputsProvider");
        this.calculateHealthScoreUseCase = calculateHealthScoreUseCase;
        this.healthScoreInputsProvider = healthScoreInputsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @Override // com.withings.library.healthscore.HealthScoreService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getScores(long r9, long r11, qm0.d<? super com.withings.library.healthscore.models.HSResult<com.withings.library.healthscore.models.HealthScores>> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.withings.library.healthscore.HealthScoreServiceImpl$getScores$1
            if (r0 == 0) goto L14
            r0 = r13
            com.withings.library.healthscore.HealthScoreServiceImpl$getScores$1 r0 = (com.withings.library.healthscore.HealthScoreServiceImpl$getScores$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.withings.library.healthscore.HealthScoreServiceImpl$getScores$1 r0 = new com.withings.library.healthscore.HealthScoreServiceImpl$getScores$1
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            java.lang.Object r9 = r7.L$1
            kotlinx.datetime.Instant r9 = (kotlinx.datetime.Instant) r9
            java.lang.Object r10 = r7.L$0
            com.withings.library.healthscore.HealthScoreServiceImpl r10 = (com.withings.library.healthscore.HealthScoreServiceImpl) r10
            nm0.l.b(r13)     // Catch: java.lang.Exception -> L31
            goto L5b
        L31:
            r9 = move-exception
            goto L68
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            nm0.l.b(r13)
            kotlinx.datetime.Instant$Companion r13 = kotlinx.datetime.Instant.Companion     // Catch: java.lang.Exception -> L31
            kotlinx.datetime.Instant r11 = r13.fromEpochMilliseconds(r11)     // Catch: java.lang.Exception -> L31
            com.withings.library.healthscore.utils.HealthScoreInputsProvider r1 = r8.healthScoreInputsProvider     // Catch: java.lang.Exception -> L31
            r7.L$0 = r8     // Catch: java.lang.Exception -> L31
            r7.L$1 = r11     // Catch: java.lang.Exception -> L31
            r7.label = r2     // Catch: java.lang.Exception -> L31
            r5 = 12
            r6 = 24
            r2 = r9
            r4 = r11
            java.lang.Object r13 = r1.provide(r2, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L31
            if (r13 != r0) goto L59
            return r0
        L59:
            r10 = r8
            r9 = r11
        L5b:
            com.withings.library.healthscore.models.internal.HealthScoreInputs r13 = (com.withings.library.healthscore.models.internal.HealthScoreInputs) r13     // Catch: java.lang.Exception -> L31
            com.withings.library.healthscore.domain.health.CalculateHealthScoreUseCase r10 = r10.calculateHealthScoreUseCase     // Catch: java.lang.Exception -> L31
            r11 = 12
            r12 = 24
            com.withings.library.healthscore.models.HSResult r9 = r10.getHealthScore(r13, r9, r11, r12)     // Catch: java.lang.Exception -> L31
            goto L6e
        L68:
            com.withings.library.healthscore.models.HSResult$Failure r10 = new com.withings.library.healthscore.models.HSResult$Failure
            r10.<init>(r9)
            r9 = r10
        L6e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.healthscore.HealthScoreServiceImpl.getScores(long, long, qm0.d):java.lang.Object");
    }
}
