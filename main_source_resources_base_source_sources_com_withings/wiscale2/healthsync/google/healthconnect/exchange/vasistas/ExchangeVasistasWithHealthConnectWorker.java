package com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.health.connect.client.records.Record;
import androidx.work.WorkerParameters;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.healthsync.ExchangeWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import lj0.c0;
import lj0.k0;
import lj0.n0;
import nm0.g;
import nm0.h;
import nm0.y;
import org.joda.time.DateTime;
import u10.i;
import u10.q;
/* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00040\u00032\u00020\u00062\u00020\u0007:\u0001\u000eB\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/vasistas/ExchangeVasistasWithHealthConnectWorker;", "Landroidx/health/connect/client/records/Record;", "PartnerType", "Lcom/withings/wiscale2/healthsync/ExchangeWorker;", "Lu10/q;", "Lcom/withings/vasistas/model/Vasistas;", "La20/d;", "Lvf0/a;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class ExchangeVasistasWithHealthConnectWorker<PartnerType extends Record> extends ExchangeWorker<q<Vasistas, PartnerType>> implements a20.d, vf0.a {

    /* renamed from: h  reason: collision with root package name */
    private final g f56745h;

    /* renamed from: i  reason: collision with root package name */
    private final ym0.q<Vasistas.Category, DateTime, DateTime, List<Vasistas>> f56746i;

    /* renamed from: j  reason: collision with root package name */
    private final g f56747j;

    /* renamed from: k  reason: collision with root package name */
    private final g f56748k;

    /* renamed from: l  reason: collision with root package name */
    private final g f56749l;

    /* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    public final class a implements i<List<? extends Vasistas>> {
        public a() {
        }

        @Override // u10.i
        public final Object a(List list, qm0.d dVar) {
            ExchangeVasistasWithHealthConnectWorker<PartnerType> exchangeVasistasWithHealthConnectWorker;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                exchangeVasistasWithHealthConnectWorker = ExchangeVasistasWithHealthConnectWorker.this;
                if (!hasNext) {
                    break;
                }
                Object next = it.next();
                if (((Vasistas) next).getCategory() == exchangeVasistasWithHealthConnectWorker.N()) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    DateTime end = ((Vasistas) it2.next()).getEnd();
                    while (it2.hasNext()) {
                        DateTime end2 = ((Vasistas) it2.next()).getEnd();
                        if (end.compareTo(end2) < 0) {
                            end = end2;
                        }
                    }
                    ExchangeVasistasWithHealthConnectWorker.I(exchangeVasistasWithHealthConnectWorker).a(exchangeVasistasWithHealthConnectWorker.getUser().q(), arrayList2, exchangeVasistasWithHealthConnectWorker.N(), null);
                    Integer num = ig0.b.f().get(exchangeVasistasWithHealthConnectWorker.N());
                    int i11 = 1;
                    if (num != null) {
                        exchangeVasistasWithHealthConnectWorker.F(num.intValue(), 1, end);
                    }
                    long j5 = 121;
                    int value = exchangeVasistasWithHealthConnectWorker.N().getValue();
                    long q11 = exchangeVasistasWithHealthConnectWorker.getUser().q();
                    Integer num2 = new Integer(121);
                    if (num2.intValue() == 91) {
                        i11 = 0;
                    } else if (x.z(x.W(Integer.valueOf((int) ConstantsWs.DEVICE_MODEL_STEP_COUNTER_GOOGLE), Integer.valueOf((int) ConstantsWs.DEVICE_MODEL_STEP_COUNTER_SHEALTH), Integer.valueOf((int) ConstantsWs.DEVICE_MODEL_STEP_COUNTER_ANDROID_GOOGLE_HEALTH_PLATFORM), 1054), num2)) {
                        i11 = 3;
                    }
                    k0 k0Var = new k0(j5, value, i11, q11, end.getMillis());
                    n0 n0Var = exchangeVasistasWithHealthConnectWorker.O().c().get();
                    u.i(n0Var, "get(...)");
                    n0Var.c(k0Var);
                } else {
                    throw new NoSuchElementException();
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeVasistasWithHealthConnectWorker<PartnerType> f56751a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f56752b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, ExchangeVasistasWithHealthConnectWorker exchangeVasistasWithHealthConnectWorker) {
            super(0);
            this.f56751a = exchangeVasistasWithHealthConnectWorker;
            this.f56752b = context;
        }

        @Override // ym0.a
        public final Object invoke() {
            return new com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.a(this.f56752b, this.f56751a);
        }
    }

    /* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.q<Vasistas.Category, DateTime, DateTime, List<Vasistas>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeVasistasWithHealthConnectWorker<PartnerType> f56753a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ExchangeVasistasWithHealthConnectWorker<PartnerType> exchangeVasistasWithHealthConnectWorker) {
            super(3);
            this.f56753a = exchangeVasistasWithHealthConnectWorker;
        }

        @Override // ym0.q
        public final List<Vasistas> invoke(Vasistas.Category category, DateTime dateTime, DateTime dateTime2) {
            Vasistas.Category category2 = category;
            DateTime startDate = dateTime;
            u.j(category2, "category");
            u.j(startDate, "startDate");
            ExchangeVasistasWithHealthConnectWorker<PartnerType> exchangeVasistasWithHealthConnectWorker = this.f56753a;
            return exchangeVasistasWithHealthConnectWorker.O().b().o(exchangeVasistasWithHealthConnectWorker.getUser().q(), category2, startDate, dateTime2);
        }
    }

    /* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<kg0.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f56754a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExchangeVasistasWithHealthConnectWorker<PartnerType> f56755b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, ExchangeVasistasWithHealthConnectWorker<PartnerType> exchangeVasistasWithHealthConnectWorker) {
            super(0);
            this.f56754a = context;
            this.f56755b = exchangeVasistasWithHealthConnectWorker;
        }

        @Override // ym0.a
        public final kg0.d invoke() {
            PackageManager packageManager = this.f56754a.getPackageManager();
            u.i(packageManager, "getPackageManager(...)");
            this.f56755b.getClass();
            return new kg0.d(packageManager);
        }
    }

    /* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.a<li0.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeVasistasWithHealthConnectWorker<PartnerType> f56756a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ExchangeVasistasWithHealthConnectWorker<PartnerType> exchangeVasistasWithHealthConnectWorker) {
            super(0);
            this.f56756a = exchangeVasistasWithHealthConnectWorker;
        }

        @Override // ym0.a
        public final li0.b invoke() {
            ExchangeVasistasWithHealthConnectWorker<PartnerType> exchangeVasistasWithHealthConnectWorker = this.f56756a;
            li0.b bVar = new li0.b(exchangeVasistasWithHealthConnectWorker.K(), exchangeVasistasWithHealthConnectWorker.getUser(), 121);
            bVar.f();
            return bVar;
        }
    }

    /* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<c0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeVasistasWithHealthConnectWorker<PartnerType> f56757a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ExchangeVasistasWithHealthConnectWorker<PartnerType> exchangeVasistasWithHealthConnectWorker) {
            super(0);
            this.f56757a = exchangeVasistasWithHealthConnectWorker;
        }

        @Override // ym0.a
        public final c0 invoke() {
            return new c0(this.f56757a.O().b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeVasistasWithHealthConnectWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        u.j(context, "context");
        u.j(parameters, "parameters");
        this.f56745h = h.b(new f(this));
        this.f56746i = new c(this);
        this.f56747j = h.b(new e(this));
        this.f56748k = h.b(new d(context, this));
        this.f56749l = h.b(new b(context, this));
    }

    public static final c0 I(ExchangeVasistasWithHealthConnectWorker exchangeVasistasWithHealthConnectWorker) {
        return (c0) exchangeVasistasWithHealthConnectWorker.f56745h.getValue();
    }

    public abstract fy.i K();

    public abstract a20.b<PartnerType, fn0.d<? extends Record>, Vasistas> L();

    /* JADX INFO: Access modifiers changed from: protected */
    public final li0.b M() {
        return (li0.b) this.f56747j.getValue();
    }

    public abstract Vasistas.Category N();

    public abstract ig0.a O();

    @Override // u10.n0
    public final u10.g h() {
        return (q) this.f56749l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kg0.d u() {
        return (kg0.d) this.f56748k.getValue();
    }

    @Override // com.withings.wiscale2.healthsync.ExchangeWorker
    public final fg0.a z() {
        return O().a();
    }
}
