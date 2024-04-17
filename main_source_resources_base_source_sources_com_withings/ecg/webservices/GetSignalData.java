package com.withings.ecg.webservices;

import android.content.Context;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
/* compiled from: GetSignalData.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/withings/ecg/webservices/GetSignalData;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lnm0/y;", "run", "()V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "heartSignal", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "Lcom/withings/ecg/model/HeartSignalRepository;", "heartSignalRepository", "Lcom/withings/ecg/model/HeartSignalRepository;", "Lcom/withings/ecg/webservices/SignalRemoteRepository;", "signalRemoteRepository", "Lcom/withings/ecg/webservices/SignalRemoteRepository;", "<init>", "(Landroid/content/Context;Lcom/withings/ecg/model/HeartSignalMeasurement;Lcom/withings/ecg/model/HeartSignalRepository;Lcom/withings/ecg/webservices/SignalRemoteRepository;)V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetSignalData extends BaseSyncAction {
    public static final int $stable = 8;
    private final Context context;
    private final HeartSignalMeasurement heartSignal;
    private final HeartSignalRepository heartSignalRepository;
    private final SignalRemoteRepository signalRemoteRepository;

    public GetSignalData(Context context, HeartSignalMeasurement heartSignal, HeartSignalRepository heartSignalRepository, SignalRemoteRepository signalRemoteRepository) {
        u.j(context, "context");
        u.j(heartSignal, "heartSignal");
        u.j(heartSignalRepository, "heartSignalRepository");
        u.j(signalRemoteRepository, "signalRemoteRepository");
        this.context = context;
        this.heartSignal = heartSignal;
        this.heartSignalRepository = heartSignalRepository;
        this.signalRemoteRepository = signalRemoteRepository;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        BuildersKt__BuildersKt.runBlocking$default(null, new GetSignalData$run$1(this, null), 1, null);
    }
}
