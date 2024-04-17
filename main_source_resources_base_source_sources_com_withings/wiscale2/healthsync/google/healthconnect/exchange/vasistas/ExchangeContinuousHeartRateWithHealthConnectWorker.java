package com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas;

import android.content.Context;
import androidx.health.connect.client.records.HeartRateRecord;
import androidx.health.connect.client.records.Record;
import androidx.work.WorkerParameters;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import fy.i;
import kg0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import yf0.f;
/* compiled from: ExchangeContinuousHeartRateWithHealthConnectRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/vasistas/ExchangeContinuousHeartRateWithHealthConnectWorker;", "Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/vasistas/ExchangeVasistasWithHealthConnectWorker;", "Landroidx/health/connect/client/records/HeartRateRecord;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lig0/a;", "workerDependency", "Lfy/i;", "getLastMeasuresGroupForTypesUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lig0/a;Lfy/i;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExchangeContinuousHeartRateWithHealthConnectWorker extends ExchangeVasistasWithHealthConnectWorker<HeartRateRecord> {

    /* renamed from: m  reason: collision with root package name */
    private final ig0.a f56724m;

    /* renamed from: n  reason: collision with root package name */
    private final i f56725n;

    /* renamed from: o  reason: collision with root package name */
    private final Vasistas.Category f56726o;

    /* renamed from: p  reason: collision with root package name */
    private final PartnerCapabilities f56727p;

    /* renamed from: q  reason: collision with root package name */
    private final g f56728q;

    /* compiled from: ExchangeContinuousHeartRateWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<f> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56730b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f56730b = context;
        }

        @Override // ym0.a
        public final f invoke() {
            ExchangeContinuousHeartRateWithHealthConnectWorker exchangeContinuousHeartRateWithHealthConnectWorker = ExchangeContinuousHeartRateWithHealthConnectWorker.this;
            User user = exchangeContinuousHeartRateWithHealthConnectWorker.getUser();
            d u11 = exchangeContinuousHeartRateWithHealthConnectWorker.u();
            String packageName = this.f56730b.getPackageName();
            u.i(packageName, "getPackageName(...)");
            return new f(user, u11, packageName, exchangeContinuousHeartRateWithHealthConnectWorker.p());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeContinuousHeartRateWithHealthConnectWorker(Context context, WorkerParameters params, ig0.a workerDependency, i getLastMeasuresGroupForTypesUseCase) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        u.j(workerDependency, "workerDependency");
        u.j(getLastMeasuresGroupForTypesUseCase, "getLastMeasuresGroupForTypesUseCase");
        this.f56724m = workerDependency;
        this.f56725n = getLastMeasuresGroupForTypesUseCase;
        this.f56726o = Vasistas.Category.BODY;
        this.f56727p = PartnerCapabilities.f43559p;
        this.f56728q = h.b(new a(context));
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker
    public final i K() {
        return this.f56725n;
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker
    public final a20.b<HeartRateRecord, fn0.d<? extends Record>, Vasistas> L() {
        return (f) this.f56728q.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker
    public final Vasistas.Category N() {
        return this.f56726o;
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker
    public final ig0.a O() {
        return this.f56724m;
    }

    @Override // a20.d
    public final PartnerCapabilities m() {
        return this.f56727p;
    }
}
