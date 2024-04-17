package com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import nm0.j;
import u10.i;
/* compiled from: ExchangeSleepWithHealthConnectRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/tracks/ExchangeSleepWithHealthConnectWorker;", "Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/tracks/ExchangeTracksWithHealthConnectWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Lhg0/a;", "workerDependency", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lhg0/a;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExchangeSleepWithHealthConnectWorker extends ExchangeTracksWithHealthConnectWorker {

    /* renamed from: o  reason: collision with root package name */
    private final hg0.a f56655o;

    /* renamed from: p  reason: collision with root package name */
    private final PartnerCapabilities f56656p;

    /* renamed from: q  reason: collision with root package name */
    private final Vasistas.Category f56657q;

    /* renamed from: r  reason: collision with root package name */
    private final g f56658r;

    /* renamed from: s  reason: collision with root package name */
    private final g f56659s;

    /* compiled from: ExchangeSleepWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<xf0.e> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56661b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f56661b = context;
        }

        @Override // ym0.a
        public final xf0.e invoke() {
            ExchangeSleepWithHealthConnectWorker exchangeSleepWithHealthConnectWorker = ExchangeSleepWithHealthConnectWorker.this;
            User user = exchangeSleepWithHealthConnectWorker.getUser();
            kg0.d u11 = exchangeSleepWithHealthConnectWorker.u();
            String packageName = this.f56661b.getPackageName();
            u.i(packageName, "getPackageName(...)");
            return new xf0.e(user, u11, packageName, exchangeSleepWithHealthConnectWorker.p());
        }
    }

    /* compiled from: ExchangeSleepWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.b> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.b invoke() {
            return new com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.b(ExchangeSleepWithHealthConnectWorker.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeSleepWithHealthConnectWorker(Context context, WorkerParameters parameters, hg0.a workerDependency) {
        super(context, parameters);
        u.j(context, "context");
        u.j(parameters, "parameters");
        u.j(workerDependency, "workerDependency");
        this.f56655o = workerDependency;
        this.f56656p = PartnerCapabilities.f43548e;
        this.f56657q = Vasistas.Category.BED;
        this.f56658r = h.b(new a(context));
        this.f56659s = h.b(new b());
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker
    public final a20.b O() {
        return (xf0.e) this.f56658r.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker
    public final i<List<j<Track, List<Vasistas>>>> P() {
        return (i) this.f56659s.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker
    public final Vasistas.Category Q() {
        return this.f56657q;
    }

    @Override // com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker
    public final hg0.a R() {
        return this.f56655o;
    }

    @Override // a20.d
    public final PartnerCapabilities m() {
        return this.f56656p;
    }
}
