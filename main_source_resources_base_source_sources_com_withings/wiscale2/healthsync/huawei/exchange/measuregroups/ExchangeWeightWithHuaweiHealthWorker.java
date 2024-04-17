package com.withings.wiscale2.healthsync.huawei.exchange.measuregroups;

import a20.b;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.huawei.hms.hihealth.data.SampleSet;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import com.withings.user.User;
import gg0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ky.d;
import nm0.g;
import nm0.h;
import x10.a;
/* compiled from: ExchangeWeightWithHuaweiHealthRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/healthsync/huawei/exchange/measuregroups/ExchangeWeightWithHuaweiHealthWorker;", "Lcom/withings/wiscale2/healthsync/huawei/exchange/measuregroups/ExchangeMeasuresGroupWithHuaweiHealthWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Lgg0/c;", "workerDependency", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lgg0/c;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExchangeWeightWithHuaweiHealthWorker extends ExchangeMeasuresGroupWithHuaweiHealthWorker {

    /* renamed from: l  reason: collision with root package name */
    private final c f56814l;

    /* renamed from: m  reason: collision with root package name */
    private final PartnerCapabilities f56815m;

    /* renamed from: n  reason: collision with root package name */
    private final g f56816n;

    /* compiled from: ExchangeWeightWithHuaweiHealthRequest.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<dg0.c> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56818b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f56818b = context;
        }

        @Override // ym0.a
        public final dg0.c invoke() {
            User user = ExchangeWeightWithHuaweiHealthWorker.this.getUser();
            String packageName = this.f56818b.getPackageName();
            u.i(packageName, "getPackageName(...)");
            return new dg0.c(user, packageName);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeWeightWithHuaweiHealthWorker(Context context, WorkerParameters parameters, c workerDependency) {
        super(context, parameters);
        u.j(context, "context");
        u.j(parameters, "parameters");
        u.j(workerDependency, "workerDependency");
        this.f56814l = workerDependency;
        this.f56815m = PartnerCapabilities.f43545b;
        this.f56816n = h.b(new a(context));
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final b<SampleSet, a.d, d> R() {
        return (dg0.c) this.f56816n.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker
    public final c U() {
        return this.f56814l;
    }

    @Override // a20.d
    public final PartnerCapabilities m() {
        return this.f56815m;
    }
}
