package com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups;

import android.content.Context;
import androidx.health.connect.client.records.Record;
import androidx.work.WorkerParameters;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ky.d;
import nm0.g;
import nm0.h;
import nm0.y;
import u10.i;
/* compiled from: ExchangeMenstruationPeriodWithHealthConnectRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/measuregroups/ExchangeCycleMeasuresGroupWithHealthConnectWorker;", "Landroidx/health/connect/client/records/Record;", "PartnerType", "Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/measuregroups/ExchangeMeasuresGroupWithHealthConnectWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Lgg0/a;", "workerDependency", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lgg0/a;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class ExchangeCycleMeasuresGroupWithHealthConnectWorker<PartnerType extends Record> extends ExchangeMeasuresGroupWithHealthConnectWorker<PartnerType> {

    /* renamed from: n  reason: collision with root package name */
    private final gg0.a f56505n;

    /* renamed from: o  reason: collision with root package name */
    private final hx.b f56506o;

    /* renamed from: p  reason: collision with root package name */
    private final g f56507p;

    /* renamed from: q  reason: collision with root package name */
    private final b f56508q;

    /* compiled from: ExchangeMenstruationPeriodWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeCycleMeasuresGroupWithHealthConnectWorker<PartnerType> f56509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56510b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ExchangeCycleMeasuresGroupWithHealthConnectWorker<PartnerType> exchangeCycleMeasuresGroupWithHealthConnectWorker, Context context) {
            super(0);
            this.f56509a = exchangeCycleMeasuresGroupWithHealthConnectWorker;
            this.f56510b = context;
        }

        @Override // ym0.a
        public final com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.b invoke() {
            ExchangeCycleMeasuresGroupWithHealthConnectWorker<PartnerType> exchangeCycleMeasuresGroupWithHealthConnectWorker = this.f56509a;
            User user = exchangeCycleMeasuresGroupWithHealthConnectWorker.getUser();
            String packageName = this.f56510b.getPackageName();
            u.i(packageName, "getPackageName(...)");
            return new com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.b(user, packageName, exchangeCycleMeasuresGroupWithHealthConnectWorker.x(), x.V(((ExchangeMenstruationPeriodWithHealthConnectWorker) exchangeCycleMeasuresGroupWithHealthConnectWorker).m()), exchangeCycleMeasuresGroupWithHealthConnectWorker.U().d(), exchangeCycleMeasuresGroupWithHealthConnectWorker.U().k(), exchangeCycleMeasuresGroupWithHealthConnectWorker.d0());
        }
    }

    /* compiled from: ExchangeMenstruationPeriodWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    public static final class b implements i<List<? extends d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeCycleMeasuresGroupWithHealthConnectWorker<PartnerType> f56511a;

        b(ExchangeCycleMeasuresGroupWithHealthConnectWorker<PartnerType> exchangeCycleMeasuresGroupWithHealthConnectWorker) {
            this.f56511a = exchangeCycleMeasuresGroupWithHealthConnectWorker;
        }

        @Override // u10.i
        public final Object a(List list, qm0.d dVar) {
            List list2 = list;
            ExchangeCycleMeasuresGroupWithHealthConnectWorker<PartnerType> exchangeCycleMeasuresGroupWithHealthConnectWorker = this.f56511a;
            Object a11 = exchangeCycleMeasuresGroupWithHealthConnectWorker.U().j().a(exchangeCycleMeasuresGroupWithHealthConnectWorker.getUser().q(), list2, true, dVar);
            if (a11 != CoroutineSingletons.f76214a) {
                return y.f85009a;
            }
            return a11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [hx.b, java.lang.Object] */
    public ExchangeCycleMeasuresGroupWithHealthConnectWorker(Context context, WorkerParameters parameters, gg0.a workerDependency) {
        super(context, parameters);
        u.j(context, "context");
        u.j(parameters, "parameters");
        u.j(workerDependency, "workerDependency");
        this.f56505n = workerDependency;
        this.f56506o = new Object();
        this.f56507p = h.b(new a(this, context));
        this.f56508q = new b(this);
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final i<List<d>> N() {
        return this.f56508q;
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker, com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    /* renamed from: a0 */
    public final zf0.b M() {
        return (zf0.b) this.f56507p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final hx.b d0() {
        return this.f56506o;
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    /* renamed from: e0 */
    public gg0.a U() {
        return this.f56505n;
    }
}
