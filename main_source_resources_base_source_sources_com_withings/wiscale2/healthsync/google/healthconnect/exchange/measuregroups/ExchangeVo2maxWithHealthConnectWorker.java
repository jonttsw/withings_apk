package com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups;

import android.content.Context;
import androidx.health.connect.client.records.Vo2MaxRecord;
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
import wf0.j0;
/* compiled from: ExchangeVo2maxWithHealthConnectRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/measuregroups/ExchangeVo2maxWithHealthConnectWorker;", "Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/measuregroups/ExchangeMeasuresGroupWithHealthConnectWorker;", "Landroidx/health/connect/client/records/Vo2MaxRecord;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Lgg0/c;", "workerDependency", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lgg0/c;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExchangeVo2maxWithHealthConnectWorker extends ExchangeMeasuresGroupWithHealthConnectWorker<Vo2MaxRecord> {

    /* renamed from: n  reason: collision with root package name */
    private final gg0.c f56574n;

    /* renamed from: o  reason: collision with root package name */
    private final PartnerCapabilities f56575o;

    /* renamed from: p  reason: collision with root package name */
    private final g f56576p;

    /* compiled from: ExchangeVo2maxWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<j0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56578b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f56578b = context;
        }

        @Override // ym0.a
        public final j0 invoke() {
            ExchangeVo2maxWithHealthConnectWorker exchangeVo2maxWithHealthConnectWorker = ExchangeVo2maxWithHealthConnectWorker.this;
            User user = exchangeVo2maxWithHealthConnectWorker.getUser();
            d u11 = exchangeVo2maxWithHealthConnectWorker.u();
            String packageName = this.f56578b.getPackageName();
            u.i(packageName, "getPackageName(...)");
            return new j0(user, u11, packageName, exchangeVo2maxWithHealthConnectWorker.p());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeVo2maxWithHealthConnectWorker(Context context, WorkerParameters parameters, gg0.c workerDependency) {
        super(context, parameters);
        u.j(context, "context");
        u.j(parameters, "parameters");
        u.j(workerDependency, "workerDependency");
        this.f56574n = workerDependency;
        this.f56575o = PartnerCapabilities.f43553j;
        this.f56576p = h.b(new a(context));
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final a20.b R() {
        return (j0) this.f56576p.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final gg0.c U() {
        return this.f56574n;
    }

    @Override // a20.d
    public final PartnerCapabilities m() {
        return this.f56575o;
    }
}
