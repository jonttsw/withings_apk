package com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups;

import android.content.Context;
import androidx.health.connect.client.records.MenstruationPeriodRecord;
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
import wf0.f0;
/* compiled from: ExchangeMenstruationPeriodWithHealthConnectRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/measuregroups/ExchangeMenstruationPeriodWithHealthConnectWorker;", "Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/measuregroups/ExchangeCycleMeasuresGroupWithHealthConnectWorker;", "Landroidx/health/connect/client/records/MenstruationPeriodRecord;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Lgg0/a;", "workerDependency", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lgg0/a;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExchangeMenstruationPeriodWithHealthConnectWorker extends ExchangeCycleMeasuresGroupWithHealthConnectWorker<MenstruationPeriodRecord> {

    /* renamed from: r  reason: collision with root package name */
    private final gg0.a f56561r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f56562s;

    /* renamed from: t  reason: collision with root package name */
    private final PartnerCapabilities f56563t;

    /* renamed from: u  reason: collision with root package name */
    private final g f56564u;

    /* renamed from: v  reason: collision with root package name */
    private final g f56565v;

    /* compiled from: ExchangeMenstruationPeriodWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<f0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56567b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f56567b = context;
        }

        @Override // ym0.a
        public final f0 invoke() {
            ExchangeMenstruationPeriodWithHealthConnectWorker exchangeMenstruationPeriodWithHealthConnectWorker = ExchangeMenstruationPeriodWithHealthConnectWorker.this;
            User user = exchangeMenstruationPeriodWithHealthConnectWorker.getUser();
            d u11 = exchangeMenstruationPeriodWithHealthConnectWorker.u();
            String packageName = this.f56567b.getPackageName();
            u.i(packageName, "getPackageName(...)");
            return new f0(user, u11, packageName, exchangeMenstruationPeriodWithHealthConnectWorker.p(), exchangeMenstruationPeriodWithHealthConnectWorker.d0());
        }
    }

    /* compiled from: ExchangeMenstruationPeriodWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f56568a = new w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "add_period_from_health_connect";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeMenstruationPeriodWithHealthConnectWorker(Context context, WorkerParameters parameters, gg0.a workerDependency) {
        super(context, parameters, workerDependency);
        u.j(context, "context");
        u.j(parameters, "parameters");
        u.j(workerDependency, "workerDependency");
        this.f56561r = workerDependency;
        this.f56562s = true;
        this.f56563t = PartnerCapabilities.f43561r;
        this.f56564u = h.b(b.f56568a);
        this.f56565v = h.b(new a(context));
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final a20.b R() {
        return (f0) this.f56565v.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker, com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final boolean S() {
        return this.f56562s;
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker, com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final String T() {
        return (String) this.f56564u.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeCycleMeasuresGroupWithHealthConnectWorker, com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final gg0.c U() {
        return this.f56561r;
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeCycleMeasuresGroupWithHealthConnectWorker
    public final gg0.a e0() {
        return this.f56561r;
    }

    @Override // a20.d
    public final PartnerCapabilities m() {
        return this.f56563t;
    }
}
