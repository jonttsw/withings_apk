package com.withings.coach.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.insight.android.entity.Insight;
import com.withings.webservices.legacy.lastupdate.LastUpdate;
import com.withings.webservices.legacy.lastupdate.LastUpdateCheckerKt;
import com.withings.webservices.legacy.lastupdate.UserLastUpdate;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import com.withings.webservices.legacy.withings.model.timeline.InsightItemData;
import ew.a;
import gw.b;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.Dispatchers;
import nm0.k;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import ti.d;
/* compiled from: GetInsight.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/withings/coach/webservices/GetInsight;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lnm0/y;", "syncNewInsight", "()V", "Lcom/withings/insight/android/entity/Insight;", InsightItemData.WS_TYPE, "addInsightAndSendFirebaseEvent", "(Lcom/withings/insight/android/entity/Insight;)V", "run", "", NavigationArguments.USER_ID, "J", "getUserId", "()J", "Lgw/b;", "repository", "Lgw/b;", "Lew/a;", "remoteRepository", "Lew/a;", "Lti/d;", "insightStateRepository", "Lti/d;", "", "forceRefresh", "Z", "<init>", "(JLgw/b;Lew/a;Lti/d;Z)V", "coach_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetInsight extends BaseSyncAction {
    private final boolean forceRefresh;
    private final d insightStateRepository;
    private final a remoteRepository;
    private final b repository;
    private final long userId;

    public GetInsight(long j5, b repository, a remoteRepository, d insightStateRepository, boolean z5) {
        u.j(repository, "repository");
        u.j(remoteRepository, "remoteRepository");
        u.j(insightStateRepository, "insightStateRepository");
        this.userId = j5;
        this.repository = repository;
        this.remoteRepository = remoteRepository;
        this.insightStateRepository = insightStateRepository;
        this.forceRefresh = z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addInsightAndSendFirebaseEvent(Insight insight) {
        this.repository.h(insight);
        ri.a.a(insight.getCrmId());
    }

    private final void syncNewInsight() {
        BuildersKt__BuildersKt.runBlocking$default(null, new GetInsight$syncNewInsight$1(this, null), 1, null);
    }

    public final long getUserId() {
        return this.userId;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        Object a11;
        long j5;
        UserLastUpdate user;
        DateTime insightCoach;
        try {
            Long l5 = (Long) BuildersKt.runBlocking(Dispatchers.getIO(), new GetInsight$run$1$localMostRecent$1(this, null));
            if (l5 != null) {
                j5 = l5.longValue();
            } else {
                j5 = 0;
            }
            LastUpdate lastUpdate = getLastUpdate();
            if (lastUpdate != null && (user = lastUpdate.getUser(this.userId)) != null && (insightCoach = user.getInsightCoach()) != null && LastUpdateCheckerKt.shouldMakeCallForLastUpdate(insightCoach, j5)) {
                syncNewInsight();
            }
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
