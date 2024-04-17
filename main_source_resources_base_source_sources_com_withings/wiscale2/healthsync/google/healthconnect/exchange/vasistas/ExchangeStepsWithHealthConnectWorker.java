package com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas;

import android.content.Context;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.StepsRecord;
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
/* compiled from: ExchangeStepsWithHealthConnectRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/vasistas/ExchangeStepsWithHealthConnectWorker;", "Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/vasistas/ExchangeVasistasWithHealthConnectWorker;", "Landroidx/health/connect/client/records/StepsRecord;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lig0/a;", "workerDependency", "Lfy/i;", "getLastMeasuresGroupForTypesUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lig0/a;Lfy/i;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExchangeStepsWithHealthConnectWorker extends ExchangeVasistasWithHealthConnectWorker<StepsRecord> {

    /* renamed from: m  reason: collision with root package name */
    private final ig0.a f56738m;

    /* renamed from: n  reason: collision with root package name */
    private final i f56739n;

    /* renamed from: o  reason: collision with root package name */
    private final PartnerCapabilities f56740o;

    /* renamed from: p  reason: collision with root package name */
    private final Vasistas.Category f56741p;

    /* renamed from: q  reason: collision with root package name */
    private final g f56742q;

    /* compiled from: ExchangeStepsWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<yf0.g> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56744b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f56744b = context;
        }

        @Override // ym0.a
        public final yf0.g invoke() {
            ExchangeStepsWithHealthConnectWorker exchangeStepsWithHealthConnectWorker = ExchangeStepsWithHealthConnectWorker.this;
            User user = exchangeStepsWithHealthConnectWorker.getUser();
            d u11 = exchangeStepsWithHealthConnectWorker.u();
            String packageName = this.f56744b.getPackageName();
            u.i(packageName, "getPackageName(...)");
            return new yf0.g(user, u11, packageName, exchangeStepsWithHealthConnectWorker.p(), exchangeStepsWithHealthConnectWorker.M());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeStepsWithHealthConnectWorker(Context context, WorkerParameters params, ig0.a workerDependency, i getLastMeasuresGroupForTypesUseCase) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        u.j(workerDependency, "workerDependency");
        u.j(getLastMeasuresGroupForTypesUseCase, "getLastMeasuresGroupForTypesUseCase");
        this.f56738m = workerDependency;
        this.f56739n = getLastMeasuresGroupForTypesUseCase;
        this.f56740o = PartnerCapabilities.f43544a;
        this.f56741p = Vasistas.Category.MOTION;
        this.f56742q = h.b(new a(context));
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker
    public final i K() {
        return this.f56739n;
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker
    public final a20.b<StepsRecord, fn0.d<? extends Record>, Vasistas> L() {
        return (yf0.g) this.f56742q.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker
    public final Vasistas.Category N() {
        return this.f56741p;
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker
    public final ig0.a O() {
        return this.f56738m;
    }

    @Override // a20.d
    public final PartnerCapabilities m() {
        return this.f56740o;
    }
}
