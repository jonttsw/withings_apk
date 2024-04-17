package com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups;

import android.content.Context;
import androidx.health.connect.client.records.BodyWaterMassRecord;
import androidx.work.WorkerParameters;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import com.withings.user.User;
import kg0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import wf0.k0;
/* compiled from: ExchangeWaterMassWithHealthConnectRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/measuregroups/ExchangeWaterMassWithHealthConnectWorker;", "Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/measuregroups/ExchangeMeasuresGroupWithHealthConnectWorker;", "Landroidx/health/connect/client/records/BodyWaterMassRecord;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Lgg0/c;", "workerDependency", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lgg0/c;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExchangeWaterMassWithHealthConnectWorker extends ExchangeMeasuresGroupWithHealthConnectWorker<BodyWaterMassRecord> {

    /* renamed from: n  reason: collision with root package name */
    private final gg0.c f56579n;

    /* renamed from: o  reason: collision with root package name */
    private final PartnerCapabilities f56580o;

    /* renamed from: p  reason: collision with root package name */
    private final g f56581p;

    /* compiled from: ExchangeWaterMassWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<k0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56583b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f56583b = context;
        }

        @Override // ym0.a
        public final k0 invoke() {
            ExchangeWaterMassWithHealthConnectWorker exchangeWaterMassWithHealthConnectWorker = ExchangeWaterMassWithHealthConnectWorker.this;
            User user = exchangeWaterMassWithHealthConnectWorker.getUser();
            d u11 = exchangeWaterMassWithHealthConnectWorker.u();
            String packageName = this.f56583b.getPackageName();
            u.i(packageName, "getPackageName(...)");
            return new k0(exchangeWaterMassWithHealthConnectWorker.U().f(), user, exchangeWaterMassWithHealthConnectWorker.p(), u11, packageName);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeWaterMassWithHealthConnectWorker(Context context, WorkerParameters parameters, gg0.c workerDependency) {
        super(context, parameters);
        u.j(context, "context");
        u.j(parameters, "parameters");
        u.j(workerDependency, "workerDependency");
        this.f56579n = workerDependency;
        this.f56580o = PartnerCapabilities.f43557n;
        this.f56581p = h.b(new a(context));
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final a20.b R() {
        return (k0) this.f56581p.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final gg0.c U() {
        return this.f56579n;
    }

    @Override // a20.d
    public final PartnerCapabilities m() {
        return this.f56580o;
    }
}
