package com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups;

import android.content.Context;
import androidx.health.connect.client.records.HeartRateRecord;
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
import wf0.y;
/* compiled from: ExchangeDiscretHeartRateWithHealthConnectRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/measuregroups/ExchangeDiscretHeartRateWithHealthConnectWorker;", "Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/measuregroups/ExchangeMeasuresGroupWithHealthConnectWorker;", "Landroidx/health/connect/client/records/HeartRateRecord;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Lgg0/c;", "workerDependency", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lgg0/c;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExchangeDiscretHeartRateWithHealthConnectWorker extends ExchangeMeasuresGroupWithHealthConnectWorker<HeartRateRecord> {

    /* renamed from: n  reason: collision with root package name */
    private final gg0.c f56512n;

    /* renamed from: o  reason: collision with root package name */
    private final PartnerCapabilities f56513o;

    /* renamed from: p  reason: collision with root package name */
    private final g f56514p;

    /* compiled from: ExchangeDiscretHeartRateWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56516b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f56516b = context;
        }

        @Override // ym0.a
        public final y invoke() {
            ExchangeDiscretHeartRateWithHealthConnectWorker exchangeDiscretHeartRateWithHealthConnectWorker = ExchangeDiscretHeartRateWithHealthConnectWorker.this;
            User user = exchangeDiscretHeartRateWithHealthConnectWorker.getUser();
            d u11 = exchangeDiscretHeartRateWithHealthConnectWorker.u();
            String packageName = this.f56516b.getPackageName();
            u.i(packageName, "getPackageName(...)");
            return new y(user, u11, packageName, exchangeDiscretHeartRateWithHealthConnectWorker.p());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeDiscretHeartRateWithHealthConnectWorker(Context context, WorkerParameters parameters, gg0.c workerDependency) {
        super(context, parameters);
        u.j(context, "context");
        u.j(parameters, "parameters");
        u.j(workerDependency, "workerDependency");
        this.f56512n = workerDependency;
        this.f56513o = PartnerCapabilities.f43559p;
        this.f56514p = h.b(new a(context));
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final a20.b R() {
        return (y) this.f56514p.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final gg0.c U() {
        return this.f56512n;
    }

    @Override // a20.d
    public final PartnerCapabilities m() {
        return this.f56513o;
    }
}
