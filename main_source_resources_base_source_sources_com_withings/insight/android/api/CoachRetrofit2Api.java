package com.withings.insight.android.api;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.insight.core.model.InsightContainer;
import com.withings.insight.core.model.UpdateScenarioResponse;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: CoachRetrofit2Api.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJL\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u0016\u001a\u00020\rH§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/withings/insight/android/api/CoachRetrofit2Api;", "", "", NavigationArguments.USER_ID, "", "force", "Lcom/withings/insight/core/model/InsightContainer;", "getInsight", "(JZLqm0/d;)Ljava/lang/Object;", "id", "getByConversationId", "(JJLqm0/d;)Ljava/lang/Object;", NavigationArguments.PROGRAM_ID, "", "scenario", "read", "opened", "Lcom/withings/insight/core/model/UpdateScenarioResponse;", "updateCoach", "(JJJLjava/lang/String;ZZLqm0/d;)Ljava/lang/Object;", "type", "data", "crmId", "Lnm0/y;", "triggerAction", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface CoachRetrofit2Api {
    @e
    @o("v2/insight?action=getbyconversationid")
    Object getByConversationId(@c("userid") long j5, @c("conversationid") long j11, d<? super InsightContainer> dVar);

    @e
    @o("v2/insight?action=getcoach")
    Object getInsight(@c("userid") long j5, @c("force") boolean z5, d<? super InsightContainer> dVar);

    @e
    @o("v2/coach?action=trigger")
    Object triggerAction(@c("userid") long j5, @c("type") String str, @c("data") String str2, @c("crmid") String str3, d<? super y> dVar);

    @e
    @o("v2/insight?action=updatecoach")
    Object updateCoach(@c("userid") long j5, @c("programid") long j11, @c("insightid") long j12, @c("scenario") String str, @c("is_read") boolean z5, @c("is_opened") boolean z11, d<? super UpdateScenarioResponse> dVar);
}
