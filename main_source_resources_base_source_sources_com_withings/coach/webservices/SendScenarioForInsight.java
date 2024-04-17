package com.withings.coach.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.insight.android.entity.Insight;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import ew.a;
import gw.b;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import nm0.k;
/* compiled from: SendScenarioForInsight.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/withings/coach/webservices/SendScenarioForInsight;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lnm0/y;", "run", "()V", "", NavigationArguments.USER_ID, "J", "Lgw/b;", "repository", "Lgw/b;", "Lew/a;", "remoteRepository", "Lew/a;", "", NavigationArguments.PROGRAM_ID, "I", "Lcom/withings/insight/android/entity/Insight;", "insightToUpdate", "Lcom/withings/insight/android/entity/Insight;", "<init>", "(JLgw/b;Lew/a;ILcom/withings/insight/android/entity/Insight;)V", "coach_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SendScenarioForInsight extends BaseSyncAction {
    private final Insight insightToUpdate;
    private final int programId;
    private final a remoteRepository;
    private final b repository;
    private final long userId;

    public SendScenarioForInsight(long j5, b repository, a remoteRepository, int i11, Insight insightToUpdate) {
        u.j(repository, "repository");
        u.j(remoteRepository, "remoteRepository");
        u.j(insightToUpdate, "insightToUpdate");
        this.userId = j5;
        this.repository = repository;
        this.remoteRepository = remoteRepository;
        this.programId = i11;
        this.insightToUpdate = insightToUpdate;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        Object runBlocking$default;
        Long insightId = this.insightToUpdate.getInsightId();
        if (insightId != null) {
            if (insightId.longValue() <= 0) {
                insightId = null;
            }
            if (insightId != null) {
                runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new SendScenarioForInsight$run$2$1(this, null), 1, null);
                Throwable b10 = k.b(((k) runBlocking$default).c());
                if (b10 != null) {
                    x70.b.t(this, b10.getMessage(), b10);
                }
            }
        }
    }
}
