package com.withings.coach.webservices;

import com.withings.insight.android.entity.Insight;
import com.withings.insight.android.entity.WsModelsMapperKt;
import com.withings.insight.core.model.InsightContainer;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import com.withings.webservices.legacy.withings.model.timeline.InsightItemData;
import ew.a;
import gw.b;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import nm0.k;
import nm0.l;
import nm0.y;
/* compiled from: GetInsightByConversationId.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/withings/coach/webservices/GetInsightByConversationId;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lcom/withings/insight/android/entity/Insight;", InsightItemData.WS_TYPE, "Lnm0/y;", "addInsightAndSendFirebaseEvent", "(Lcom/withings/insight/android/entity/Insight;)V", "run", "()V", "", "callUserId", "J", "Lgw/b;", "repository", "Lgw/b;", "Lew/a;", "remoteRepository", "Lew/a;", "callConversationId", "<init>", "(JLgw/b;Lew/a;J)V", "coach_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetInsightByConversationId extends BaseSyncAction {
    private final long callConversationId;
    private final long callUserId;
    private final a remoteRepository;
    private final b repository;

    public GetInsightByConversationId(long j5, b repository, a remoteRepository, long j11) {
        u.j(repository, "repository");
        u.j(remoteRepository, "remoteRepository");
        this.callUserId = j5;
        this.repository = repository;
        this.remoteRepository = remoteRepository;
        this.callConversationId = j11;
    }

    private final void addInsightAndSendFirebaseEvent(Insight insight) {
        this.repository.h(insight);
        ri.a.a(insight.getCrmId());
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        Object obj;
        Long insightId;
        Object runBlocking$default;
        Insight entity;
        y yVar = null;
        try {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new GetInsightByConversationId$run$1$container$1(this, null), 1, null);
            com.withings.insight.core.model.Insight insight = ((InsightContainer) runBlocking$default).getInsight();
            if (insight != null && (entity = WsModelsMapperKt.toEntity(insight)) != null) {
                entity.setConversationId(Long.valueOf(this.callConversationId));
                entity.setUserId(this.callUserId);
                entity.setSynced(true);
                long j5 = 1000;
                entity.setModified(entity.getModified() * j5);
                entity.setCreated(entity.getCreated() * j5);
                obj = entity;
            } else {
                obj = null;
            }
        } catch (Throwable th2) {
            obj = l.a(th2);
        }
        if (true ^ (obj instanceof k.a)) {
            Insight insight2 = (Insight) obj;
            if (insight2 != null && (insightId = insight2.getInsightId()) != null) {
                if (this.repository.b(insightId.longValue()) != null) {
                    this.repository.e(insight2);
                    yVar = y.f85009a;
                }
                if (yVar == null) {
                    addInsightAndSendFirebaseEvent(insight2);
                }
            } else if (insight2 != null) {
                this.repository.g(insight2);
            }
        }
        Throwable b10 = k.b(obj);
        if (b10 != null) {
            x70.b.t(this, b10.getMessage(), b10);
        }
    }
}
