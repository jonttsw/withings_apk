package com.withings.coach.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.insight.android.entity.Insight;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import ew.a;
import gw.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import nm0.k;
import nm0.l;
import nm0.y;
/* compiled from: SendScenarios.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/withings/coach/webservices/SendScenarios;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lnm0/y;", "run", "()V", "", NavigationArguments.USER_ID, "J", "", "Lcom/withings/insight/android/entity/Insight;", "insightsToSync", "Ljava/util/List;", "Lgw/b;", "repository", "Lgw/b;", "Lew/a;", "remoteRepository", "Lew/a;", "", NavigationArguments.PROGRAM_ID, "I", "<init>", "(JLjava/util/List;Lgw/b;Lew/a;I)V", "coach_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SendScenarios extends BaseSyncAction {
    private final List<Insight> insightsToSync;
    private final int programId;
    private final a remoteRepository;
    private final b repository;
    private final long userId;

    public SendScenarios(long j5, List<Insight> insightsToSync, b repository, a remoteRepository, int i11) {
        u.j(insightsToSync, "insightsToSync");
        u.j(repository, "repository");
        u.j(remoteRepository, "remoteRepository");
        this.userId = j5;
        this.insightsToSync = insightsToSync;
        this.repository = repository;
        this.remoteRepository = remoteRepository;
        this.programId = i11;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        Object a11;
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new SendScenarios$run$1$1(this, null), 1, null);
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        Throwable b10 = k.b(a11);
        if (b10 != null) {
            x70.b.t(this, b10.getMessage(), b10);
        }
    }
}
