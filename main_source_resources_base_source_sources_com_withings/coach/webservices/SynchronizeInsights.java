package com.withings.coach.webservices;

import androidx.camera.camera2.internal.s2;
import com.withings.insight.android.entity.Insight;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import ew.a;
import gw.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import nm0.k;
import nm0.y;
import ti.d;
import x30.l;
/* compiled from: SynchronizeInsights.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/withings/coach/webservices/SynchronizeInsights;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "", "needsLastUpdate", "()Z", "Lnm0/y;", "run", "()V", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "Lgw/b;", "insightRepository", "Lgw/b;", "Lti/d;", "insightStateRepository", "Lti/d;", "Lew/a;", "insightRemoteRepository", "Lew/a;", "Lx30/l;", "isProgramRunningUseCase", "Lx30/l;", "forceRefresh", "Z", "", "Lcom/withings/insight/android/entity/Insight;", "notSyncedScenarios", "Ljava/util/List;", "<init>", "(Lcom/withings/user/User;Lgw/b;Lti/d;Lew/a;Lx30/l;Z)V", "coach_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SynchronizeInsights extends BaseSyncAction {
    private final boolean forceRefresh;
    private final a insightRemoteRepository;
    private final b insightRepository;
    private final d insightStateRepository;
    private final l isProgramRunningUseCase;
    private List<Insight> notSyncedScenarios;
    private final User user;

    public SynchronizeInsights(User user, b insightRepository, d insightStateRepository, a insightRemoteRepository, l isProgramRunningUseCase, boolean z5) {
        u.j(user, "user");
        u.j(insightRepository, "insightRepository");
        u.j(insightStateRepository, "insightStateRepository");
        u.j(insightRemoteRepository, "insightRemoteRepository");
        u.j(isProgramRunningUseCase, "isProgramRunningUseCase");
        this.user = user;
        this.insightRepository = insightRepository;
        this.insightStateRepository = insightStateRepository;
        this.insightRemoteRepository = insightRemoteRepository;
        this.isProgramRunningUseCase = isProgramRunningUseCase;
        this.forceRefresh = z5;
        this.notSyncedScenarios = i0.f76187a;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction
    public boolean needsLastUpdate() {
        return true;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        int i11;
        Object a11;
        if (s2.j()) {
            i11 = 35;
        } else {
            i11 = 38;
        }
        int i12 = i11;
        this.notSyncedScenarios = this.insightRepository.d(this.user.q());
        if (this.isProgramRunningUseCase.b(i12, this.user.q())) {
            try {
                run(new SendScenarios(this.user.q(), this.notSyncedScenarios, this.insightRepository, this.insightRemoteRepository, i12));
            } catch (Throwable th2) {
                a11 = nm0.l.a(th2);
            }
        }
        run(new GetInsight(this.user.q(), this.insightRepository, this.insightRemoteRepository, this.insightStateRepository, this.forceRefresh));
        a11 = y.f85009a;
        Throwable b10 = k.b(a11);
        if (b10 != null) {
            x70.b.t(this, b10.getMessage(), new Object[0]);
        }
    }
}
