package com.withings.ecg.webservices;

import android.content.Context;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.sync.ActionSyncJob;
import com.withings.webservices.legacy.sync.SyncJob;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: GetSignalData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/withings/ecg/webservices/GetSignalDataSyncFactory;", "", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "heartSignalRepository", "Lcom/withings/ecg/model/HeartSignalRepository;", "signalRemoteRepository", "Lcom/withings/ecg/webservices/SignalRemoteRepository;", "(Landroid/content/Context;Lcom/withings/ecg/model/HeartSignalRepository;Lcom/withings/ecg/webservices/SignalRemoteRepository;)V", "create", "Lcom/withings/webservices/legacy/sync/SyncJob;", "heartSignal", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetSignalDataSyncFactory {
    public static final int $stable = 8;
    private final Context context;
    private final HeartSignalRepository heartSignalRepository;
    private final SignalRemoteRepository signalRemoteRepository;

    @Inject
    public GetSignalDataSyncFactory(Context context, HeartSignalRepository heartSignalRepository, SignalRemoteRepository signalRemoteRepository) {
        u.j(context, "context");
        u.j(heartSignalRepository, "heartSignalRepository");
        u.j(signalRemoteRepository, "signalRemoteRepository");
        this.context = context;
        this.heartSignalRepository = heartSignalRepository;
        this.signalRemoteRepository = signalRemoteRepository;
    }

    public final SyncJob create(HeartSignalMeasurement heartSignal) {
        u.j(heartSignal, "heartSignal");
        return new ActionSyncJob(new GetSignalData(this.context, heartSignal, this.heartSignalRepository, this.signalRemoteRepository));
    }
}
