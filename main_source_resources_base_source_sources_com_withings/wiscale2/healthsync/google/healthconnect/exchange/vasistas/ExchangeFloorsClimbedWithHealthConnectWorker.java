package com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas;

import android.content.Context;
import androidx.health.connect.client.records.FloorsClimbedRecord;
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
import yf0.e;
/* compiled from: ExchangeFloorsClimbedWithHealthConnectRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/vasistas/ExchangeFloorsClimbedWithHealthConnectWorker;", "Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/vasistas/ExchangeVasistasWithHealthConnectWorker;", "Landroidx/health/connect/client/records/FloorsClimbedRecord;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lig0/a;", "workerDependency", "Lfy/i;", "getLastMeasuresGroupForTypesUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lig0/a;Lfy/i;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExchangeFloorsClimbedWithHealthConnectWorker extends ExchangeVasistasWithHealthConnectWorker<FloorsClimbedRecord> {

    /* renamed from: m  reason: collision with root package name */
    private final ig0.a f56731m;

    /* renamed from: n  reason: collision with root package name */
    private final i f56732n;

    /* renamed from: o  reason: collision with root package name */
    private final PartnerCapabilities f56733o;

    /* renamed from: p  reason: collision with root package name */
    private final Vasistas.Category f56734p;

    /* renamed from: q  reason: collision with root package name */
    private final g f56735q;

    /* compiled from: ExchangeFloorsClimbedWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<e> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56737b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f56737b = context;
        }

        @Override // ym0.a
        public final e invoke() {
            ExchangeFloorsClimbedWithHealthConnectWorker exchangeFloorsClimbedWithHealthConnectWorker = ExchangeFloorsClimbedWithHealthConnectWorker.this;
            User user = exchangeFloorsClimbedWithHealthConnectWorker.getUser();
            d u11 = exchangeFloorsClimbedWithHealthConnectWorker.u();
            String packageName = this.f56737b.getPackageName();
            u.i(packageName, "getPackageName(...)");
            return new e(user, u11, packageName, exchangeFloorsClimbedWithHealthConnectWorker.p());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeFloorsClimbedWithHealthConnectWorker(Context context, WorkerParameters params, ig0.a workerDependency, i getLastMeasuresGroupForTypesUseCase) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        u.j(workerDependency, "workerDependency");
        u.j(getLastMeasuresGroupForTypesUseCase, "getLastMeasuresGroupForTypesUseCase");
        this.f56731m = workerDependency;
        this.f56732n = getLastMeasuresGroupForTypesUseCase;
        this.f56733o = PartnerCapabilities.f43552i;
        this.f56734p = Vasistas.Category.ELEVATION;
        this.f56735q = h.b(new a(context));
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker
    public final i K() {
        return this.f56732n;
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker
    public final a20.b<FloorsClimbedRecord, fn0.d<? extends Record>, Vasistas> L() {
        return (a20.b) this.f56735q.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker
    public final Vasistas.Category N() {
        return this.f56734p;
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker
    public final ig0.a O() {
        return this.f56731m;
    }

    @Override // a20.d
    public final PartnerCapabilities m() {
        return this.f56733o;
    }
}
